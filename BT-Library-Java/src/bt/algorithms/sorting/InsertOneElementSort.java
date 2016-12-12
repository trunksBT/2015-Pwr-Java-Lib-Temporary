package bt.algorithms.sorting;

import bt.algorithms.interfaces.Comparator;
import bt.algorithms.interfaces.ListOneElemSorter;
import bt.collections.interfaces.List;

public class InsertOneElementSort extends InsertSort implements ListOneElemSorter {
	public InsertOneElementSort(Comparator order) {
		super(order);
	}
	
	public List sort(List tape, Object elemToInsert)
	{
		if ( tape == null )
			return null;
		
		tape.add(elemToInsert);
		return super.sort(tape);
	}
}
