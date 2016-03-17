package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class BubbleSortOptimal implements ListSorter{
	private final Comparator comparator;
	
	public BubbleSortOptimal(Comparator comparator) {
		this.comparator = comparator;
	}

	@Override
	public List sort(List tape) {
		int lastSwap = tape.size() - 1;
		while(lastSwap > 0) {
			int end = lastSwap; // idx of last performed elem
			lastSwap = 0;
			
			// analyze while any changes
			for(int leftIdx = 0; leftIdx < end; ++leftIdx) {
				// if found any 2-el descending subSeq
				if( comparator.compare(tape.get(leftIdx), tape.get(leftIdx+1))> 0) {
					Object temp = tape.get(leftIdx); // save 1-el of this subSeq
					
					// shift list left, while not found 2-el asc subSeq
					while( leftIdx< end && comparator.compare(temp, tape.get(leftIdx+1)) > 0) {
						tape.set(leftIdx, tape.get(leftIdx+1));
						leftIdx++;
					}
					lastSwap = leftIdx; // idx of s of ascending 2-el subSeq
					tape.set(leftIdx, temp); // bubbleUp On Begin
				}
			}
		}
		return tape;
	}

}
