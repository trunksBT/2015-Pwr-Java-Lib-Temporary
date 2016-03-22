package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class InsertSort implements ListSorter {
	private final Comparator order;
	
	public InsertSort(Comparator order) {
		this.order = order;
	}

	@Override
	public List sort(List tape) {
		if(tape== null)
			throw new NullPointerException();
		Object curr,fromQueue;
		for(int i = 1; i<tape.size();i++) {
			fromQueue = tape.get(i);
			int j = i;
			for(j = i; 
					j>0 && (order.compare(curr =tape.get(j-1), fromQueue)>0);
						j--)
				tape.set(j, curr);
			tape.set(j,fromQueue);
		}
		return tape;
	}
}