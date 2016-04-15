package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class BubbleSortOptimal2 implements ListSorter {
	private final Comparator order;
	
	public BubbleSortOptimal2(Comparator order) {
		this.order= order;
	}
	@Override
	public List sort(List tape) {
		int lastSwap = tape.size()-1;
		while(lastSwap > 0 ) {
			int end = lastSwap;
			lastSwap = 0;
			for( int i = 0; i<end-1; i++) {
				if( order.compare(tape.get(i),tape.get(i+1))> 0) {
					Object notProper = tape.get(i);
					while( i < end && order.compare(notProper,tape.get(i+1)) > 0)
							tape.set(i, tape.get(i+++1));
					lastSwap = i;
					tape.set(lastSwap,notProper);
				}
			}
		}
		return tape;
	}
}
