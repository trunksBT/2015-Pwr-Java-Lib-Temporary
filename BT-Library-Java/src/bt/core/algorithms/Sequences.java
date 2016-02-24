package bt.core.algorithms;

public class Sequences {
	public static boolean isNotAscending( int[] seq ) {
		int i = -1;
		boolean methodPred = true;
		int lastProperIdx = seq.length - 2;

		while( ++i < lastProperIdx && methodPred) {
			if(seq[i] >= seq[i+1])
				methodPred &= true;
			else
				methodPred &= false;
		}		
		return methodPred;
	}
	
	public static int amountOfZeroOnBegin( int[] chain ) {
		int licz = 0;
		int idx = chain.length;
		
		while( idx-- >0 )
			licz = chain[idx] != 0 ? 0 : licz + 1;
		
		return licz;
	}
	
	
		
//		
//		public static boolean isNotAscending( int[] chain ,int n) {
//			int i = 0;
//			int size = chain.length; // n to byl rozmiar
//
//			while(i < size-1 && chain[i] <= chain[i+1])
//				i++;
//	//
//			return i >= size-1;
//		}
}
