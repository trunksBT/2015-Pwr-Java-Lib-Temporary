package bt.algorithms.strings;

public class StudentMailMatcher implements MailMatcher{
	public static final StudentMailMatcher INSTANCE = new StudentMailMatcher();
	
	private StudentMailMatcher() {}

	@Override
	public boolean apply(String inChain) {
		StringBuilder uppCased = new StringBuilder(inChain);
//		uppCased
		boolean result = true;
		char curr;
		int it = -1;
		
		if((curr = inChain.charAt(++it)) == '@')
				result&= false;
		
		while( (curr = inChain.charAt(it++)) != '@')
		{
			result&= !Character.isLetter(curr);
		}

		
		return result;
	}
}
