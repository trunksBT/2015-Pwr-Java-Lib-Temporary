package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class QuickSort2 implements ListSorter {
	private final Comparator order;
	public QuickSort2(Comparator order) {
		this.order = order;
	}
	@Override
	public List sort(List tape) {
		quickSort(0, tape.size()-1, tape);
		return tape;
	}
	private void quickSort(int idxStart, int idxEnd, List tape) {
		if(idxEnd> idxStart) {
			int partition = partition(idxStart, idxEnd, tape);
			quickSort(idxStart, partition-1, tape);
			quickSort(partition+1, idxEnd, tape);
		}
	}
	private int partition(int idxStart, int idxEnd, List tape) {
		Object pivot = tape.get(idxEnd);
		int idxHigher = -1;// than pivot
		int idxLower = idxEnd; // than pivot
		while(idxHigher<idxLower) {
			while( order.compare(tape.get(++idxHigher), pivot)<0);
			while( idxLower>idxStart && order.compare(tape.get(--idxLower), pivot) >0);
			if( idxHigher< idxLower )
				swap(idxHigher, idxLower, tape);
		}
		swap(idxHigher, idxEnd, tape);
		return idxHigher;
	}
	private void swap(int idxHigher, int idxLower, List tape) {
		Object oldVal = tape.get(idxHigher);
		tape.set(idxHigher, tape.get(idxLower));
		tape.set(idxLower, oldVal);		
	}
}
