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
		if(tape == null)
			return null;
		quickSort(tape, 0, tape.size() -1);
		return tape;
	}
	
	private void quickSort(List tape, int idxStart, int idxEnd) {
		if(idxEnd > idxStart) {
			int idxOfPivot = partition(tape, idxStart, idxEnd);
			quickSort(tape, idxStart, idxOfPivot-1);
			quickSort(tape, idxOfPivot+1, idxEnd);
		}
	}
	
	private int partition(List tape, int idxStart, int idxEnd) {
		Object pivot = tape.get(idxEnd);
		int idxOfHigherThanPivot = idxStart -1;
		int idxOfLowerThanPivot = idxEnd;
		while(idxOfHigherThanPivot < idxOfLowerThanPivot) {
			while(order.compare(tape.get(++idxOfHigherThanPivot), pivot) < 0);
			while(idxOfLowerThanPivot > idxStart &&
					order.compare(tape.get(--idxOfLowerThanPivot), pivot) > 0);
			if(idxOfHigherThanPivot < idxOfLowerThanPivot) {
				swap(tape, idxOfHigherThanPivot, idxOfLowerThanPivot);
			}
		}
		swap(tape, idxOfHigherThanPivot, idxEnd);
		return idxOfHigherThanPivot;
	}
	
	private void swap(List tape, int idxLeft, int idxRight) {
		if(idxLeft != idxRight) {
			Object oldLeft = tape.get(idxLeft);
			tape.set(idxLeft, tape.get(idxRight));
			tape.set(idxRight, oldLeft);
		}
	}
}
