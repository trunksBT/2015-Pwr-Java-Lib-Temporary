package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class InsertSort2 implements ListSorter {
	private final Comparator order;
	
	public InsertSort2(Comparator order) {
		this.order = order;
	}
	
	@Override
	public List sort(List tape) throws NullPointerException{
		int size = tape.size();
		for(int i = 1 ; i < size ; i++) {
			int it = i;
			while( it> 0 && (order.compare(tape.get(it-1),tape.get(it)) > 0))
					swap(it-1,it--,tape);
		}
		return tape;
	}
	
	public void swap(int left, int right, List tape) {
		Object oldVal = tape.get(left);
		tape.set(left,tape.get(right));
		tape.set(right,oldVal);
	}
}