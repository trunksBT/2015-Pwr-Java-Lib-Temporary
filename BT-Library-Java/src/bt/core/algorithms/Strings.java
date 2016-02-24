package bt.core.algorithms;

public class Strings {
	public static boolean parenthesisOK(String chain) {
		if( chain != null) {
			int licz = 0;
			int i = 0;
			
			while( i < chain.length() && licz >= 0 ) {
				if(chain.charAt(i) == '(')
					licz++;
				else if( chain.charAt(i) == ')') 
					licz--;
				i++;
			}
			
			return licz ==0;
		}
		else
			throw new NullPointerException();
	}
}