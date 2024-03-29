package bt.algorithms.sorting;

import bt.algorithms.interfaces.Comparator;
import bt.algorithms.interfaces.ListSorter;
import bt.collections.interfaces.List;

public class SelectSort implements ListSorter {
	private final Comparator order;

	public SelectSort(Comparator order) {
		this.order = order;
	}
	
	@Override
	public List sort(List tape) {
		if(tape == null)
			return tape;
		
		int size = tape.size();
		for(int i = 0; i < size -1; i++) {
			int smallestIdx = i;
			for(int j = i + 1; j < size; j++) {
				if(order.compare(tape.get(smallestIdx), tape.get(j)) > 0) {
					smallestIdx = j;
				}
			}
			swap(tape, smallestIdx, i);
		}
		return tape;
	}
	
	public void swap(List tape, int smallestIdx, int slotIdx) {
		if(tape!=null && smallestIdx != slotIdx) {
			Object oldSmallest = tape.get(smallestIdx);
			tape.set(smallestIdx, tape.get(slotIdx));
			tape.set(slotIdx, oldSmallest);
		}
	}
}
