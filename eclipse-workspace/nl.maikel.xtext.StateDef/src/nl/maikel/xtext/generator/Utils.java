package nl.sudohenk.xtext.generator;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.sudohenk.xtext.generator.util.BinaryLinkedList;
import nl.sudohenk.xtext.stateDef.Message;
import nl.sudohenk.xtext.stateDef.MessageByteRange;
import nl.sudohenk.xtext.stateDef.MessageStructEntry;

public class Utils {

	/**
	 * Convert an object list to a primitive byte array.
	 * @param list the List object containing the objects.
	 * @return byte[]
	 */
	public static byte[] convertToPrimitive(List<Byte> list) {
		byte[] result = new byte[list.size()];
		for(int i = 0; i < list.size(); i++) {
		    result[i] = list.get(i).byteValue();
		}
		return result;
	}
	
	/**
	 * Convert a hex representation to a Byte list
	 * @param hex   MUST start with 0x..   (e.g. 0xFF, or 0xFFFF)
	 * @param byteSize the size of the byte array that must be returned
	 * @return
	 */
	public static List<Byte> convertHexStrToBytes(String hex, int byteSize) {
		List<Byte> list = convertHexStrToBytes(hex);
		
		if(list.size() > byteSize) {
			list = list.subList(list.size()-byteSize, list.size());
		} else if(list.size() < byteSize) {
			for(int i = 0; i < (byteSize-list.size()+1); i++) {
				list.add(0, (byte)0x00);
			}
		}
		
		return list;
	}
	
	
	
	public static List<Byte> convertHexStrToBytes(String hex) {
		List<Byte> list = new BinaryLinkedList();
		String rawHex = hex.substring(2);
		
		if(rawHex.length() == 0) {
			return list;
		}
		
		int expectedSize = rawHex.length()/2;
		for(byte b : new BigInteger(rawHex, 16).toByteArray()) {
			list.add(b);
		}
		
		if(list.size() < expectedSize) {
			for(int i = 0; i < (expectedSize-list.size()+1); i++) {
				list.add(0, (byte)0x00);
			}
		}
		
		return list;
	}
	
	/**
	 * Return a byte list of size byteSize
	 * @param byteSize the size of the list
	 * @return a list containing FF bytes.
	 */
	public static List<Byte> getBytesOfSize(int byteSize) {
		List<Byte> list = new BinaryLinkedList();
		for(int i = 0; i < byteSize; i++) {
			list.add((byte)0xFF);
		}
		return list;
	}
	
	public static String getFileNameForMessage(Message message) {
		return Constants.MESSAGE_FOLDER_LOCATION+message.getName()+Constants.MESSAGE_FILE_EXTENSION;
	}
	
	public static String getFileNameForPcapMessage(Message message) {
		return Constants.MESSAGE_FOLDER_LOCATION+message.getName()+Constants.PCAP_FILE_EXTENSION;
	}

	public static int getRequiredBytesForDecimalValue(int maxDecimalValue) {
		return (int) Math.ceil((Math.log(maxDecimalValue) / Math.log(2))/8);
	}
}
