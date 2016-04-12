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
		System.out.println(tape+",["+startIdx+endIdx+"]");
		if( endIdx> startIdx) {
			int partition = partition(tape, startIdx, endIdx);
			System.out.println(tape+",["+startIdx+endIdx+"]"+"AftPart");
			quicksort(tape, startIdx, partition);
			quicksort(tape, partition + 1, endIdx);
		}
	}

	 // reorder array to lower vals before pivot and higher after it
	private int partition(List tape, int itIdx, int rightIdx) {
		List locTape = tape;
		Object val = locTape.get(rightIdx); // pivot ostatni elem
		int cursor = itIdx - 1; // ustaw kursor poza pierwszy elem
		while( itIdx<= rightIdx ) { // jesli nie doszles do konca
			if(order.compare(locTape.get(itIdx),val) <= 0) // if iter mniejszy od pivota
				swap(locTape, ++cursor, itIdx); // zamien z kursorem, przesun kursor
			++itIdx; // iter++
		}
		tape = locTape;
		return cursor< rightIdx ? cursor: cursor-1;
	}
	
	private void swap( List tape, int leftIdx, int rightIdx) {
		Object oldLeft = tape.get(leftIdx);
		tape.set(leftIdx,tape.get(rightIdx));
		tape.set(rightIdx,oldLeft);
	}
}