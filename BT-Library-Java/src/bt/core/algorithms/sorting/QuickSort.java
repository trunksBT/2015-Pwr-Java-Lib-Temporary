package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class QuickSort implements ListSorter{
	private final Comparator order;
	
	public QuickSort(Comparator order) {
		this.order = order;
	}

	public List sort(List tape) {
		quicksort(tape,0, tape.size()-1);
		return tape;
	}
	
	private void quicksort(List tape, int startIdx, int endIdx) {
		if( endIdx> startIdx) {
			int partition = partition(tape, startIdx, endIdx);
			quicksort(tape, startIdx, partition-1);
			quicksort(tape, partition + 1, endIdx);
		}
	}
	private int partition(List tape, int idxLeft, int idxOfPivot) {	
		Object pivot = tape.get(idxOfPivot); // last elem
		int idxHigherThanPivot = idxLeft -1;
		int idxLowerThanPivot = idxOfPivot;
		while(idxHigherThanPivot<idxLowerThanPivot) {
			while( order.compare(tape.get(++idxHigherThanPivot),pivot)<0);
			while( (idxLowerThanPivot>idxLeft) && order.compare(tape.get(--idxLowerThanPivot),pivot)>0);
			if(!(idxHigherThanPivot>=idxLowerThanPivot))
				swap(tape, idxHigherThanPivot, idxLowerThanPivot);
		}
		swap(tape, idxHigherThanPivot, idxOfPivot);
		return idxHigherThanPivot;
	}
	
	private void swap( List tape, int leftIdx, int rightIdx) {
		Object oldLeft = tape.get(leftIdx);
		tape.set(leftIdx,tape.get(rightIdx));
		tape.set(rightIdx,oldLeft);
	}
}
