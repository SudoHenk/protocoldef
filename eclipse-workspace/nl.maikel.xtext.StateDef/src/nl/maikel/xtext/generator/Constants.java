package nl.sudohenk.xtext.generator;

import java.util.HashMap;

public class Constants {
	public final static String TRACE_FOLDER_LOCATION = "traces/";
	public final static String MESSAGE_FOLDER_LOCATION = TRACE_FOLDER_LOCATION+"msgs/";
	public final static String DOT_FILE_EXTENSION = ".dot";
	public final static String PNG_FILE_EXTENSION = ".png";
	public final static String MESSAGE_FILE_EXTENSION = ".msg";
	public final static String PCAP_FILE_EXTENSION = ".pcap";
	public final static String TRACE_FILE_EXTENSION = ".trace";
	
	public final static HashMap GEN_DATA_TYPE_TO_BYTE_COUNT = new HashMap<String, Integer>() {{
        put("uint8", 1);
        put("uint16", 2);
        put("uint24", 3);
        put("uint32", 4);
    }};
}
