package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class BubbleSortPrimitive2 implements ListSorter{
	private final Comparator comparator;
	
	public BubbleSortPrimitive2(Comparator comparator) {
		this.comparator = comparator;
	}
	
	@Override
	public List sort(List tape) {
		int size = tape.size();
		
		for(int pass = 1; pass< size; ++pass) {
			for(int leftIdx = 0; leftIdx < (size-pass); ++leftIdx) {
				int rightIdx = leftIdx +1;
				if( comparator.compare(tape.get(leftIdx), tape.get(rightIdx)) > 0)
					swap(tape, leftIdx, rightIdx);
			}
		}
		return tape;
	}
	
	private void swap(List list, int idxOfLeft, int idxOfRight) {
		Object temp = list.get(idxOfLeft);
		list.set(idxOfLeft, list.get(idxOfRight));
		list.set(idxOfRight,temp);
	}
}