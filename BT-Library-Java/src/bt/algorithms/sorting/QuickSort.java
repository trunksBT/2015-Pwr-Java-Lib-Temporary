package bt.algorithms.sorting;

import bt.algorithms.interfaces.Comparator;
import bt.algorithms.interfaces.ListSorter;
import bt.collections.interfaces.List;

public class QuickSort implements ListSorter{
	private final Comparator order;
	
	public QuickSort(Comparator order) {
		this.order = order;
	}

	public List sort(List tape) {
		quicksort(tape,0, tape.size()-1);
		return tape;
	}
	
	private void quicksort(List tape, int idxStart, int idxEnd) {
		if( idxEnd> idxStart) {
			int idxSplit = partition(tape, idxStart, idxEnd);
			quicksort(tape, idxStart, idxSplit-1);
			quicksort(tape, idxSplit + 1, idxEnd);
		}
	}
	private int partition(List tape, int idxLeft, int idxOfPivot) {	
		Object pivot = tape.get(idxOfPivot); // last elem
		int idxHigherOfPivot = idxLeft -1;
		int idxLowerOfPivot = idxOfPivot;
		while(idxHigherOfPivot<idxLowerOfPivot) {
			while( order.compare(tape.get(++idxHigherOfPivot),pivot)<0);
			while( (idxLowerOfPivot>idxLeft) 
					&& order.compare(tape.get(--idxLowerOfPivot),pivot)>0);
			if(idxHigherOfPivot<idxLowerOfPivot)
				swap(tape, idxHigherOfPivot, idxLowerOfPivot);
		}
		swap(tape, idxHigherOfPivot, idxOfPivot);
		return idxHigherOfPivot;
	}
	
	private void swap( List tape, int leftIdx, int rightIdx) {
		Object oldLeft = tape.get(leftIdx);
		tape.set(leftIdx,tape.get(rightIdx));
		tape.set(rightIdx,oldLeft);
	}
}