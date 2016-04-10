package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.dataTypes.ArrayList;
import bt.core.collections.interfaces.List;

public class CountingSort implements ListSorter{
	private final int upperLimExclusive;
	
	public CountingSort(int upperLim) {
		this.upperLimExclusive = upperLim+1;
	}
	
	@Override
	public List sort(List tape) {
		List result = new ArrayList(upperLimExclusive);
		int i;
		for( i = 0; i<upperLimExclusive; i++)
			result.add(0);
		for( i = 0; i<tape.size(); i++) {
			int buffVal;
			result.set(buffVal=(int)tape.get(i),(int)result.get(buffVal)+1);
		}
		return null;
	} // only integer array only
}
