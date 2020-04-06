package nl.sudohenk.xtext.generator;

import nl.sudohenk.xtext.stateDef.MessageEnum;
import nl.sudohenk.xtext.stateDef.MessageStruct;
import nl.sudohenk.xtext.stateDef.MessageStructEntry;
import nl.sudohenk.xtext.stateDef.MessageStructureDatatype;
import nl.sudohenk.xtext.stateDef.StateMachine;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;

import nl.sudohenk.xtext.generator.util.BinaryLinkedList;
import nl.sudohenk.xtext.stateDef.Message;

public class MessageGenerator {
	
	private StateMachine sm;
	
	public MessageGenerator(StateMachine sm) {
		super();
		this.sm = sm;
	}
	
	/**
	 * Returns the given struct type
	 * @param structEntry the structEntry as defined in the DSL
	 * @return the type of the struct entry.
	 * @throws Exception Cannot find the type.
	 */
	private StructEntryType getStructEntryType(MessageStructEntry structEntry) throws Exception {
		StructEntryType type = null;
		
		if(structEntry.getDataType() != null) {
			// DATATYPE
			if(structEntry.getDataType().startsWith("uint")) {
				type = StructEntryType.UINT;
			} else {
				type = StructEntryType.OPAQUE;
			}
		} else {
			// ENUM or reference to other STRUCT
			Optional<MessageEnum> enumRef = sm.getGlobalEnums().stream().filter(e -> e.getName().equals(structEntry.getRefType())).findFirst();
			if(enumRef.isPresent()) {
				type = StructEntryType.ENUM;
			}
			Optional<MessageStruct> structRef = sm.getGlobalStructs().stream().filter(e -> e.getName().equals(structEntry.getRefType())).findFirst();
			if(structRef.isPresent()) {
				type = StructEntryType.STRUCT;
			}
			
			// Should not happen
			if(structEntry.getRefType().startsWith("uint")) {
				structEntry.setDataType(structEntry.getRefType());
				structEntry.setRefType(null);
				type = StructEntryType.UINT;
			}
			
			if(type == null) {
				throw new Exception("Could not find Structure type for " + structEntry.getName());
			}
		}
		
		return type;
	}


	/**
	 * Return the max amount of bytes the struct can hold, given the specification.
	 * @param structEntry the struct.
	 * @return
	 * @throws Exception 
	 */
	private int getMaxBytesForStruct(MessageStructEntry structEntry) throws Exception {
		StructEntryType type = getStructEntryType(structEntry);
		
		switch (type) {
			case UINT:
				return (int) Constants.GEN_DATA_TYPE_TO_BYTE_COUNT.get(structEntry.getDataType());
			case OPAQUE:
				// TODO length field
				if(structEntry.getByteSize() != null) {
					return structEntry.getByteSize().getSize();
				}
				return structEntry.getByteRange().getEnd();
			case ENUM:
				return 1;
			case STRUCT:
				MessageStruct structRef = sm.getGlobalStructs().stream().filter(e -> e.getName().equals(structEntry.getRefType())).findFirst().get();
				int totalStructSize = 0;
				for(MessageStructEntry subStructEntry : structRef.getStructEntries()) {
					totalStructSize += getMaxBytesForStruct(subStructEntry);
				}
				return totalStructSize;
		}
		return 0;		
	}
	
	/**
	 * Get the integer representation of the given Enum and String representation of that enum.
	 * @param msgEnum The enumeration to use
	 * @param strRep the string representation of the value
	 * @return the integer value
	 */
	private List<Byte> getEnumValueForStringRepresentation(MessageEnum msgEnum, String strRep) {
		List<Byte> buf = new BinaryLinkedList();
		int enumIntValue = 255;
		if(strRep != null) {
			enumIntValue = msgEnum.getValues().get(msgEnum.getNames().indexOf(strRep));
		}
		int maxValue = msgEnum.getValues().stream().mapToInt(v -> v).max().getAsInt();
		int bytesRequiredForLength = Utils.getRequiredBytesForDecimalValue(maxValue);
		
		byte[] enumBytes = ByteBuffer.allocate(4).putInt(enumIntValue).array();
		byte[] subEnumBytes = Arrays.copyOfRange(enumBytes, enumBytes.length-bytesRequiredForLength, enumBytes.length);

		for(int i = 0; i < subEnumBytes.length; i++) {
			buf.add(subEnumBytes[i]);
		}
		
		return buf;
	}
	
	private List<Byte> getLengthForVariableField(List<Byte> byteValue, MessageStructEntry structEntry) {
		List<Byte> buf = new BinaryLinkedList();
		int bytesRequiredForLength = Utils.getRequiredBytesForDecimalValue(structEntry.getByteRange().getEnd());
		
		byte[] lengthBytes = ByteBuffer.allocate(4).putInt(byteValue.size()).array();
		byte[] subLengthBytes = Arrays.copyOfRange(lengthBytes, lengthBytes.length-bytesRequiredForLength, lengthBytes.length);

		for(int i = 0; i < subLengthBytes.length; i++) {
			buf.add(subLengthBytes[i]);
		}
		
		return buf;
	}
	
	
	/**
	 * Method that generates the bytes for the given structure entry (and its assignment value if given)
	 * @param structEntry
	 * @param assignment
	 * @param root
	 * @return
	 * @throws Exception
	 */
	private List<Byte> generateBytesForStructEntry(MessageStructEntry structEntry, MessageStructureDatatype assignment) throws Exception {
		List<Byte> buf = new BinaryLinkedList();
		
		StructEntryType type = getStructEntryType(structEntry);

		switch (type) {
			case UINT:
				if(assignment != null && !structEntry.getName().equals("length")) {
					String hexValue = assignment.getHexVal();
					buf.addAll(Utils.convertHexStrToBytes(hexValue, getMaxBytesForStruct(structEntry)));
				} else {
					buf.addAll(Utils.convertHexStrToBytes("0x00", getMaxBytesForStruct(structEntry)));
				}
				break;
			case OPAQUE:
				List<Byte> opaqueByteValue = null;
				if(assignment != null) {
					String hexValue = assignment.getHexVal();
					opaqueByteValue = Utils.convertHexStrToBytes(hexValue);
				} else {
					opaqueByteValue = Utils.getBytesOfSize(getMaxBytesForStruct(structEntry));
				}
				if(structEntry.getByteRange() != null) {
					List<Byte> byteValueLength = getLengthForVariableField(opaqueByteValue, structEntry);
					// Insert length field before the actual value
					buf.addAll(byteValueLength);
				}
				buf.addAll(opaqueByteValue);
				break;
			case ENUM:
				List<Byte> enumByteValue = new BinaryLinkedList();		
				MessageEnum enumObj = sm.getGlobalEnums().stream().filter(e -> e.getName().equals(structEntry.getRefType())).findFirst().get();
				if(assignment != null) {
					String enumStrRep = assignment.getEnumVal();
					enumByteValue.addAll(getEnumValueForStringRepresentation(enumObj, enumStrRep));
				} else {
					enumByteValue.addAll(getEnumValueForStringRepresentation(enumObj, null));
				}
				if(structEntry.getByteRange() != null) {
					List<Byte> byteValueLength = getLengthForVariableField(enumByteValue, structEntry);
					// Insert length field before the actual value
					buf.addAll(byteValueLength);
				}
				buf.addAll(enumByteValue);
				break;
			case STRUCT:
				MessageStruct subStruct = sm.getGlobalStructs().stream().filter(e -> e.getName().equals(structEntry.getRefType())).findFirst().get();
				List<Byte> structByteValue = new BinaryLinkedList();
				
				if(assignment != null) {
					if(assignment.getArrayVal() != null && assignment.getArrayVal().size() > 0) {
						// array
						for(MessageStructureDatatype assignedArrayVal : assignment.getArrayVal()) {
							for(MessageStructEntry subStructEntry : subStruct.getStructEntries()) {
								MessageStructureDatatype subStructAssignment = assignedArrayVal.getStructVal().getValues().remove(0);
								structByteValue.addAll(generateBytesForStructEntry(subStructEntry, subStructAssignment));
							}
						}
					} else {
						// normal struct value
						for(MessageStructEntry subStructEntry : subStruct.getStructEntries()) {
							MessageStructureDatatype subStructAssignment = assignment.getStructVal().getValues().remove(0);
							structByteValue.addAll(generateBytesForStructEntry(subStructEntry, subStructAssignment));
						}
					}
				} else {
					for(MessageStructEntry subStructEntry : subStruct.getStructEntries()) {
						structByteValue.addAll(generateBytesForStructEntry(subStructEntry, null));
					}
				}
					
				if(structEntry.getByteRange() != null) {
					// This is a range of the given struct
					List<Byte> byteValueLength = getLengthForVariableField(structByteValue, structEntry);
					// Insert length field before the actual value
					buf.addAll(byteValueLength);
				}
				
				buf.addAll(structByteValue);
				break;
		}
		
		return buf;
	}
	
	private void setLengthFieldForStructureEntry(List<Byte> buf, int bufOffset, MessageStructEntry structEntry) throws Exception {
		StructEntryType type = getStructEntryType(structEntry);
		
		switch (type) {
			case UINT:
				if(structEntry.getName().equals("length")) {
					int maxBytes = getMaxBytesForStruct(structEntry);
					int lengthVal = buf.size()-bufOffset-maxBytes;
					
					byte[] lengthBytes = ByteBuffer.allocate(4).putInt(lengthVal).array();
					byte[] subLengthBytes = Arrays.copyOfRange(lengthBytes, lengthBytes.length-maxBytes, lengthBytes.length);

					for(int i = 0; i < subLengthBytes.length; i++) {
						buf.set(bufOffset+i, subLengthBytes[i]);
					}
					
				}
				break;
			case STRUCT:
				MessageStruct subStruct = sm.getGlobalStructs().stream().filter(e -> e.getName().equals(structEntry.getRefType())).findFirst().get();
				for(MessageStructEntry subStructEntry : subStruct.getStructEntries()) {
					setLengthFieldForStructureEntry(buf, bufOffset, subStructEntry);
					bufOffset += getMaxBytesForStruct(subStructEntry);
				}
				break;
			default:
				break;
		}
	}


	/**
	 * Method that generates an InputStream of bytes based on the specs of the StateMachine and given Message.
	 * @param message the message to create a binary form of.
	 * @return an InputStream containing the bytes that represent the message.
	 * @throws Exception 
	 */
	public InputStream generateBytesForMessage(Message message) throws Exception {
		List<Byte> buf = new BinaryLinkedList();
		
		// Build binary buffer
		for(MessageStructEntry structEntry : message.getStructEntries()) {
			MessageStructureDatatype assignment = null;
			if(structEntry.getDataAssignment() != null && structEntry.getDataAssignment().size() > 0) {
				assignment = structEntry.getDataAssignment().remove(0);
			}
			buf.addAll(generateBytesForStructEntry(structEntry, assignment));
		}
		
		// Fill in the correct length fields
		int bufOffset = 0;
		for(MessageStructEntry structEntry : message.getStructEntries()) {
			setLengthFieldForStructureEntry(buf, bufOffset, structEntry);
			bufOffset += getMaxBytesForStruct(structEntry);
		}
		
		return new ByteArrayInputStream(Utils.convertToPrimitive(buf));
	}
}
