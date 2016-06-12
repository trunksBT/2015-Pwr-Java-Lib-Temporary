package bt.algorithms.strings;

public class StudentMailMatcher implements MailMatcher{
	public final int STUDENT_IDX_SIZE = 6;
	public final int SERWER_ADDRES_1_SIZE = 7;
	public final int SERWER_ADDRES_2_SIZE = 3;
	public final int SERWER_ADDRES_3_SIZE = 3;
	public final int SERWER_ADDRES_4_SIZE = 2;
	public static final StudentMailMatcher INSTANCE = new StudentMailMatcher();
	
	private StudentMailMatcher() {}

	@Override
	public boolean apply(String inChain) {
		String upCased = StringUtils.upCase(inChain);
		boolean result = true;
		char curr;
		int studentIdxSize = 0;
		int serwerAddres1Size = 0;
		int it = -1;
		
		// isAccountNameNotEmpty
		if((curr = upCased.charAt(++it)) == '@')
				result&= false;

		// isAccountNameConsistedFromChars
		while( (curr = upCased.charAt(it++)) != '@' && result)
		{
			if(!Character.isLetter(curr)) {
				result&= true;
				studentIdxSize++;
			}else
				result&= false;
		}

		// isAccountNameConsistedFrom6Numbers
		if( studentIdxSize != STUDENT_IDX_SIZE)
			result = false;	
		
		// isSerwerAdressNotEmpty
		if((curr = upCased.charAt(it)) == '.' && result)
				result&= false;
		
		// isSerwerAdressConsistedFromChars
		while( (curr = upCased.charAt(it++)) != '.' && result)
		{
			if(Character.isLetter(curr)) {
				result&= true;
				serwerAddres1Size++;
			}else
				result&= false;
		}
		
		// isSerwerAdressConsistedFrom3Letters
		if( serwerAddres1Size != SERWER_ADDRES_1_SIZE && result)
			result = false;
		
		
		return result;
	}
}
