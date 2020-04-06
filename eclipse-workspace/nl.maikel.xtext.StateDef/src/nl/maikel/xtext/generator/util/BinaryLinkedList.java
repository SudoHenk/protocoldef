package nl.sudohenk.xtext.generator.util;

import java.util.LinkedList;

public class BinaryLinkedList extends LinkedList<Byte> {
	
	@Override
    public String toString() { 
		StringBuilder sb = new StringBuilder();
	    for (Object o : this.toArray()) {
	    	Byte b = (byte)o;
	        sb.append(String.format("%02X ", b));
	    }
	    return sb.toString();
    }
}
