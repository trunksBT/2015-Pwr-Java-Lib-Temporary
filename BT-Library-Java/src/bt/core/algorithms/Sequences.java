package bt.core.algorithms;

public class Sequences {
	public static boolean isNotAscending( int[] seq ) {
		if( seq != null) {
			int i = -1;
			boolean methodPred = true;
			int lastProperIdx = seq.length - 2;
	
			while( methodPred & ++i < lastProperIdx ) {
				if(seq[i] >= seq[i+1])
					methodPred &= true;
				else
					methodPred &= false;
				
			
			}
			return methodPred;
		}else
			throw new NullPointerException();
	}
	
	public static int amountOfZeroOnBegin( int[] seq ) {
		if( seq != null) {
			int licz = 0;
			int idx = seq.length;
			
			while( idx-- >0 )
				licz = seq[idx] != 0 ? 0 : licz + 1;
			
			return licz;
		}else
			throw new NullPointerException();
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
