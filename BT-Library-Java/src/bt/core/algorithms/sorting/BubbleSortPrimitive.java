package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;

public class BubbleSortPrimitive implements ListSorter{
	public Comparator order ;
	
	public BubbleSortPrimitive(Comparator order) {
		this.order = order;
	}
	
	@Override
	public List sort(List tape) {
		if( tape!= null) {
			int size = tape.size();
			int rightIdx = -1;
			for( int lvl = 1; lvl < size ; lvl++) {
				for(int currIdx = 0 ; currIdx < (size -lvl); currIdx++)
					if( order.compare(tape.get(currIdx), tape.get(rightIdx= currIdx+1)) > 0 )
						swap( tape, currIdx, rightIdx);
			}
			return tape;
		}else
			throw new NullPointerException();
	}

	private void swap(List tape, int currIdx, int rightIdx) {
		Object oldLeft = tape.get(currIdx);
		tape.set(currIdx, tape.get(rightIdx));
		tape.set(rightIdx,oldLeft);
	}

}
