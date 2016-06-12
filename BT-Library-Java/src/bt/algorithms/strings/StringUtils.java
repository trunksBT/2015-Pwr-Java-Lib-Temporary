package bt.algorithms.strings;

public class StringUtils {

	public static String upCase(String inChain) {
		StringBuilder retVal = new StringBuilder();
		for( int i = 0 ; i< inChain.length(); i++)
			retVal.append(Character.toUpperCase(inChain.charAt(i)));
		return retVal.toString();
	}

}
