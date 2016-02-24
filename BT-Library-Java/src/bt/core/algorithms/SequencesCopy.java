package bt.core.algorithms;

public class SequencesCopy {
	public static boolean isNotAscending(int[] seq) {
		int i = -1;
		int lastProperIdx = seq.length -2;
		boolean isNotAsc = true;
		
		while( ++i < lastProperIdx && isNotAsc ) {
			if(seq[i]>=seq[i+1])
				isNotAsc &= true;
			else
				isNotAsc &= false;
		}
		
		return isNotAsc;
	}
}
