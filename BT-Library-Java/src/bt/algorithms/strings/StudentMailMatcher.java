package bt.algorithms.strings;

public class StudentMailMatcher implements MailMatcher{
	public final int STUDENT_IDX_SIZE = 6; // 209826
	public final int SERWER_ADDRES_1_SIZE = 7; // student
	public final int SERWER_ADDRES_2_SIZE = 3; // pwr
	public final int SERWER_ADDRES_3_EDU_SIZE = 3; // edu
	public final int SERWER_ADDRES_3_WROC_SIZE = 4; // wroc
	public final int SERWER_ADDRES_4_SIZE = 2; // pl
	public static final StudentMailMatcher INSTANCE = new StudentMailMatcher();
	
	private StudentMailMatcher() {}

	@Override
	public boolean apply(String inChain) {
		String upCased = StringUtils.upCase(inChain);
		int chainSize = upCased.length();
		boolean result = true;
		char curr;
		int studentIdxSize = 0;
		int serwerAddres1Size = 0;
		int serwerAddres2Size = 0;
		int serwerAddres3Size = 0;
		int serwerAddres4Size = 0;
		int it = -1;
		
		// *************** AccountName ****************************
		///////////////////////////////////////////////////////////
		
		// NotEmpty
		if((curr = upCased.charAt(++it)) == '@')
				result&= false;

		// ConsistedFromNumbers
		while( (curr = upCased.charAt(it++)) != '@' && result)
		{
			if(!Character.isLetter(curr)) {
				result&= true;
				studentIdxSize++;
			}else
				result&= false;
		}

		// ConsistedFrom6Numbers
		if( studentIdxSize != STUDENT_IDX_SIZE)
			result = false;	
		
		// *************** SerwerAdress1 ****************************
		/////////////////////////////////////////////////////////////
		
		// NotEmpty
		if((curr = upCased.charAt(it)) == '.' && result)
				result&= false;
		
		// ConsistedFromChars
		while( (curr = upCased.charAt(it++)) != '.' && result)
		{
			if(Character.isLetter(curr)) {
				result&= true;
				serwerAddres1Size++;
			}else
				result&= false;
		}
		
		// ConsistedFrom7Letters
		if( serwerAddres1Size != SERWER_ADDRES_1_SIZE && result)
			result = false;

		// *************** SerwerAdress2 **************************
		///////////////////////////////////////////////////////////
		
		// NotEmpty
		if((curr = upCased.charAt(it)) == '.' && result)
				result&= false;
		
		// ConsistedFromChars
		while( (curr = upCased.charAt(it++)) != '.' && result)
		{
			if(Character.isLetter(curr)) {
				result&= true;
				serwerAddres2Size++;
			}else
				result&= false;
		}
		
		// ConsistedFrom3Letters
		if( serwerAddres2Size != SERWER_ADDRES_2_SIZE && result)
			result = false;
		
		
		// *************** SerwerAdress3 **************************
		///////////////////////////////////////////////////////////
		
		// NotEmpty
		if((curr = upCased.charAt(it)) == '.' && result)
					result&= false;
			
		// ConsistedFromChars_EDU
		if (upCased.charAt(it) == 'E' && result ) {
			while( (curr = upCased.charAt(it++)) != '.' && result)
			{
				if(Character.isLetter(curr)) {
					result&= true;
					serwerAddres3Size++;
				}else
					result&= false;
			}
			
		// ConsistedFrom3Letters_EDU
			if( serwerAddres3Size != SERWER_ADDRES_3_EDU_SIZE && result)
				result = false;
		}else if(upCased.charAt(it) == 'W' && result ) {	
			// ConsistedFromChars_WROC
			while( (curr = upCased.charAt(it++)) != '.' && result)
			{
				if(Character.isLetter(curr)) {
					result&= true;
					serwerAddres3Size++;
				}else
					result&= false;
			}
			
			// ConsistedFrom3Letters_WROC
			if( serwerAddres3Size != SERWER_ADDRES_3_WROC_SIZE && result)
				result = false;
		}else
			result &= false;
		
		// *************** SerwerAdress4 **************************
		///////////////////////////////////////////////////////////
		
		// NotEmpty
		if((curr = upCased.charAt(it)) == '.' && result)
				result&= false;
		
		// ConsistedFromChars
		while( it < chainSize &&(curr = upCased.charAt(it++)) != '\0' && result)
		{
			if(Character.isLetter(curr)) {
				result&= true;
				serwerAddres4Size++;
			}else
				result&= false;
		}
		
		// ConsistedFrom3Letters
		if( serwerAddres4Size != SERWER_ADDRES_4_SIZE && result)
			result = false;
		
		return result;
	}
}
