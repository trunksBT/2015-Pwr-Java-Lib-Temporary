package bt.algorithms.sorting;

import bt.algorithms.interfaces.Comparator;
import bt.algorithms.interfaces.ListSorter;
import bt.collections.interfaces.List;

public class BubbleSortPrimitive implements ListSorter{
	private final Comparator order;
	
	public BubbleSortPrimitive( Comparator order ) {
		this.order = order;
	}
	@Override
	public List sort(List tape) {
		int size = tape.size();
		for(int i = 0 ; i < size ; i ++)
			for(int j = 0 ; j < size -i-1 ; j ++)
				if( order.compare(tape.get(j),tape.get(j+1))> 0)
					swap(j,tape);
		return tape;
	}
	private void swap(int leftIdx, List tape) {
		Object oldVal = tape.get(leftIdx);
		tape.set(leftIdx,tape.get(leftIdx+1));
		tape.set(leftIdx+1,oldVal);	
	}
}
