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
		for(int slotIdx = 0; slotIdx< size -1 ; ++slotIdx) {
			int smallestIdx = slotIdx;
			for(int checkedIdx = slotIdx+1; checkedIdx< size; ++checkedIdx)
				if(order.compare(tape.get(checkedIdx), tape.get(smallestIdx)) < 0)
					smallestIdx = checkedIdx;
			swap(tape, smallestIdx, slotIdx);
		}
		return tape;
	}

	private void swap(List tape, int smallestIdx, int slotIdx) {
		if( smallestIdx != slotIdx ) {
			Object oldSmallest = tape.get(smallestIdx);
			tape.set(smallestIdx, tape.get(slotIdx));
			tape.set(slotIdx, oldSmallest);
		}
	}

}
