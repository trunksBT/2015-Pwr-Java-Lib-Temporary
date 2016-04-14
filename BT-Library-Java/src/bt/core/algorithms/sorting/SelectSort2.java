package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class SelectSort2 implements ListSorter {
	private final Comparator order;
	
	public SelectSort2(Comparator order) {
		this.order = order;
	}
	
	@Override
	public List sort(List tape) {
		int size = tape.size();
		for( int i = 0 ; i < size-1; i++) {
			int theLowestIdx = i;
			for ( int j = 1+i ; j < size; j++)
				if( order.compare( tape.get(theLowestIdx), tape.get(j)) > 0)
					theLowestIdx = j;
			tape = swap(i,theLowestIdx,tape);
		}
		return tape;
	}
	
	public void sort2(List tape) {
		int size = tape.size();
		for( int i = 0 ; i < size-1; i++) {
			int theLowestIdx = i;
			for ( int j = 1+i ; j < size; j++)
				if( order.compare( tape.get(theLowestIdx), tape.get(j)) > 0)
					theLowestIdx = j;
			swap2(i,theLowestIdx,tape);
		}
	}

	private List swap(int left, int theLowestIdx, List tape) {
		Object oldVal = tape.get(left);
		tape.set(left,tape.get(theLowestIdx));
		tape.set(theLowestIdx,oldVal);
		return tape;
	}
	
	private void swap2(int left, int theLowestIdx, List tape) {
		Object oldVal = tape.get(left);
		tape.set(left,tape.get(theLowestIdx));
		tape.set(theLowestIdx,oldVal);
	}
}
