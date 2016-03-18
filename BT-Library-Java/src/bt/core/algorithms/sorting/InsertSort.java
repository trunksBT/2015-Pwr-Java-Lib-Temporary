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
		// start from first
		for(int idxFrom = 1; idxFrom<tape.size(); ++idxFrom) {
			Object toInsert = tape.get(idxFrom),ordered;
			int idxTo;
			for(idxTo = idxFrom; 
					idxTo > 0 && order.compare(toInsert, ordered = tape.get(idxTo-1)) < 0; 
						--idxTo)
				tape.set(idxTo, ordered);
			tape.set(idxTo,toInsert);
		}
		return tape;
	}
}
