package bt.algorithms.sorting;

import bt.algorithms.interfaces.Comparator;
import bt.algorithms.interfaces.ListSorter;
import bt.collections.interfaces.List;

public class InsertSort implements ListSorter {
	private final Comparator order;
	
	public InsertSort(Comparator order) {
		this.order = order;
	}
	
	@Override
	public List sort(List tape) {
		if(tape == null)
			return tape;
		
		for(int i = 1; i < tape.size(); i++) {
			Object toInsert = tape.get(i);
			Object curr = null;
			int j;
			for(j= i; j > 0 && order.compare(toInsert, curr = tape.get(j-1)) < 0; j--)
			{
				tape.set(j, curr);
			}
			tape.set(j, toInsert);
		}
		
		return tape;
	}
}
