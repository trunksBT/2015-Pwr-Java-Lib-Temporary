package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class SelectSort implements ListSorter {
	private final Comparator order;
	
	public SelectSort(Comparator order) {
		this.order = order;
	}

	@Override
	public List sort(List tape) {
		if( tape== null)
			throw new NullPointerException();
		
		int size = tape.size();
		for(int i = 0; i <size; i++) {
			Object theLowest = tape.get(i);
			int theLowestIdx = i;
			for(int j = i+1; j< size; j++) {
				if(order.compare(tape.get(j), theLowest)<0) {
					theLowest = tape.get(j);
					theLowestIdx = j;
				}
			}
			swap(tape,i,theLowestIdx);
		}
		return tape;
	}

	private void swap(List tape, int i, int j) {
		Object oldLeft = tape.get(i);
		tape.set(i, tape.get(j));
		tape.set(j,oldLeft);
	}
}