package bt.algorithms.strings;

public class StudentMailMatcher implements MailMatcher{
	final int STUDENT_IDX_LENGTH = 6; // 209826
	final String ADDRES_SERWER_EDU = "STUDENT.PWR.EDU.PL";
	final String ADDRES_SERWER_WROC = "STUDENT.PWR.WROC.PL";
	final int MIN_LENGTH =25; // 6-accountName, 19 serwerName
	public static final StudentMailMatcher INSTANCE = new StudentMailMatcher();
	
	private StudentMailMatcher() {}

	@Override
	public boolean apply(String inChain) {
		if( inChain == null )
			return false;
	
		String upCased = StringUtils.upCase(inChain);
		String addresSubstring;
		int chainLength = upCased.length();
		boolean result = true;
		char curr;
		int studentIdxLength = 0;
		int it = -1;

		if(chainLength < MIN_LENGTH)
			return false;
				
		// *************** AccountName ****************************
		///////////////////////////////////////////////////////////	

		// NotEmpty
		if((curr = upCased.charAt(++it)) == '@')
				return false;

		// ConsistedFromNumbers
		while( (curr = upCased.charAt(it++)) != '@' && it < chainLength && result)
			if(Character.isDigit(curr)) {
				result&= true;
				studentIdxLength++;
			}else
				return false;

		// ConsistedFrom6Numbers
		if( studentIdxLength != STUDENT_IDX_LENGTH)
			return false;
		
		// *************** SerwerAdress ****************************
		/////////////////////////////////////////////////////////////
		
		if((addresSubstring = upCased.substring(it, chainLength)).equals(ADDRES_SERWER_EDU))
			result&= true;
		else if ( addresSubstring.equals(ADDRES_SERWER_WROC))
			result&= true;
		else
			return false;
				
		return result;
	}
}
