package bt.algorithms.strings;

public class TeacherMailMatcher implements MailMatcher{
	public final int STUDENT_IDX_SIZE = 6; // 209826
	public final String ADDRES_SERWER_EDU = "STUDENT.PWR.EDU.PL";
	public final String ADDRES_SERWER_WROC = "STUDENT.PWR.WROC.PL";
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
		int studentIdxSize = 0;
		int it = -1;
		
		// *************** AccountName ****************************
		///////////////////////////////////////////////////////////
		
		// NotEmpty
		if((curr = upCased.charAt(++it)) == '@')
				result&= false;

		// ConsistedFromNumbers
		while( (curr = upCased.charAt(it++)) != '@' && it < chainSize && result)
		{
			if(Character.isDigit(curr)) {
				result&= true;
				studentIdxSize++;
			}else
				result&= false;
		}

		// ConsistedFrom6Numbers
		if( studentIdxSize != STUDENT_IDX_SIZE)
			result = false;	
		
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
