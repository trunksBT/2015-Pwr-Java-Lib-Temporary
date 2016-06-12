package bt.algorithms.strings;

public class TeacherMailMatcher implements MailMatcher{
	public final int MIN_NAME1_SIZE= 1; // ala
	public final int MIN_NAME2_SIZE= 1; // ala
	public final String ADDRES_SERWER_EDU = "PWR.EDU.PL";
	public final String ADDRES_SERWER_WROC = "PWR.WROC.PL";
	public static final TeacherMailMatcher INSTANCE = new TeacherMailMatcher();
	
	private TeacherMailMatcher() {}

	@Override
	public boolean apply(String inChain) {
		if( inChain == null )
			return false;
	
		String upCased = StringUtils.upCase(inChain);
		String addresSubstring;
		int chainSize = upCased.length();
		boolean result = true;
		char curr;
		int name1Size = 0;
		int name2Size = 0;
		int it = -1;
		
		// *************** AccountName1 ****************************
		///////////////////////////////////////////////////////////
		
		// NotEmpty
		if((curr = upCased.charAt(++it)) == '.')
				result&= false;

		// ConsistedFromNumbers
		while( (curr = upCased.charAt(it++)) != '.' && it < chainSize && result)
		{
			if(Character.isLetter(curr) && !Character.isSpaceChar(curr)) {
				result&= true;
				name1Size++;
			}else
				result&= false;
		}
		
		// ConsistedFromMin1Letter
		if( name1Size < MIN_NAME1_SIZE)
			result&= false;

		// *************** AccountName2 ****************************
		///////////////////////////////////////////////////////////
		
		// NotEmpty
		if((curr = upCased.charAt(it)) == '.')
				result&= false;

		// ConsistedFromNumbers
		while( (curr = upCased.charAt(it++)) != '@' && it < chainSize && result)
		{
			if(Character.isLetter(curr) && !Character.isSpaceChar(curr)) {
				result&= true;
				name2Size++;
			}else
				result&= false;
		}
		
		// ConsistedFromMin1Letter
		if( name2Size < MIN_NAME2_SIZE)
			result&= false;
		
		// *************** SerwerAdress ****************************
		/////////////////////////////////////////////////////////////
		
		if((addresSubstring = upCased.substring(it, chainSize)).equals(ADDRES_SERWER_EDU))
			result&= true;
		else if ( addresSubstring.equals(ADDRES_SERWER_WROC))
			result&= true;
		else
			result&= false;
		
		
		return result;
	}
}
