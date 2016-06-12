package bt.algorithms.strings;

public class TeacherMailMatcher implements MailMatcher{
	final int MIN_NAME1_LENGTH= 1; // ala
	final int MIN_NAME2_LENGTH= 1; // nowak
	final int MAX_NAME_LENGTH =75; // 64-accountName, 11 serwerName
	final int MIN_LENGTH =15; // 64-accountName, 11 serwerName
	final String ADDRES_SERWER_EDU = "PWR.EDU.PL";
	final String ADDRES_SERWER_WROC = "PWR.WROC.PL";
	public static final TeacherMailMatcher INSTANCE = new TeacherMailMatcher();
	
	private TeacherMailMatcher() {}

	@Override
	public boolean apply(String inChain) {
		if( inChain == null )
			return false;
	
		String upCased = StringUtils.upCase(inChain);
		String addresSubstring;
		int chainLength = upCased.length();
		boolean result = true;
		char curr;
		int name1Length = 0;
		int name2Length = 0;
		int it = -1;
		
		if(chainLength > MAX_NAME_LENGTH || chainLength < MIN_LENGTH)
			return false;
		
		// *************** AccountName1 ****************************
		///////////////////////////////////////////////////////////
		
		// NotEmpty
		if((curr = upCased.charAt(++it)) == '.' && result)
				result&= false;

		// ConsistedFromNumbers
		while( (curr = upCased.charAt(it++)) != '.' && it < chainLength && result)
			if(Character.isLetter(curr) && !Character.isSpaceChar(curr)) {
				result&= true;
				name1Length++;
			}else
				return false;
		
		// ConsistedFromMin1Letter
		if( name1Length < MIN_NAME1_LENGTH && result)
			return false;

		// *************** AccountName2 ****************************
		///////////////////////////////////////////////////////////
		
		// NotEmpty
		if((curr = upCased.charAt(it)) == '.' && result )
			return false;

		// ConsistedFromNumbers
		while( (curr = upCased.charAt(it++)) != '@' && it < chainLength && result)
			if(Character.isLetter(curr) && !Character.isSpaceChar(curr)) {
				result&= true;
				name2Length++;
			}else
				return false;
		
		// ConsistedFromMin1Letter
		if( name2Length < MIN_NAME2_LENGTH && result)
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
