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
	public List sort(List tape) {
		// start from first
		for(int idxFrom = 1; idxFrom<tape.size(); ++idxFrom) {
			// get next in queue
			Object toInsert = tape.get(idxFrom),ordered;
			int idxTo;
			for(idxTo = idxFrom; 
					idxTo > 0 && order.compare(toInsert, ordered = tape.get(idxTo-1)) < 0; 
						--idxTo) // compare and save idx while curr elem in order part is higher than "toInsert"
				tape.set(idxTo, ordered); // shift table in right
			tape.set(idxTo,toInsert); // insert on proper place
		}
		return tape;
	}
}
