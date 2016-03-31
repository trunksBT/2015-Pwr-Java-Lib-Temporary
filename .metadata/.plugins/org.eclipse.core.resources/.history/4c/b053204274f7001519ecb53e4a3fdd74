package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class BubbleSortOptimal2 implements ListSorter{
	private final Comparator comparator;
	
	public BubbleSortOptimal2(Comparator comparator) {
		this.comparator = comparator;
	}

	@Override
	public List sort(List tape) {
		int lastSwap = tape.size() - 1;
		while(lastSwap > 0) {
			int end = lastSwap;
			lastSwap = 0;
			
			for(int leftIdx = 0; leftIdx < end; ++leftIdx) {
				if( comparator.compare(tape.get(leftIdx), tape.get(leftIdx+1))> 0) {
					Object temp = tape.get(leftIdx);
					while( leftIdx< end && comparator.compare(temp, tape.get(leftIdx+1)) > 0) {
						tape.set(leftIdx, tape.get(leftIdx+1));
						leftIdx++;
					}
					lastSwap = leftIdx;
					tape.set(leftIdx, temp);
				}
			}
		}
		return tape;
	}

}
