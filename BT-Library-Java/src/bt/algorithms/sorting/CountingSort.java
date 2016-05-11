package bt.algorithms.sorting;

import bt.algorithms.interfaces.ListSorter;
import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;

public class CountingSort implements ListSorter{
	private final int upperLimExclusive;
	
	public CountingSort(int upperLim) {
		this.upperLimExclusive = upperLim+1;
	}
	
	@Override
	public List sort(List tape) {
		List countings = new ArrayList(upperLimExclusive);
		List resultTape = new ArrayList(upperLimExclusive);
		int i;
		int buffVal;
		for( i = 0; i<upperLimExclusive; i++) {
			countings.add(0);
			resultTape.add(0);
		}
		for( i = 0; i<tape.size(); i++)
			countings.set(buffVal=(int)tape.get(i), (int)countings.get(buffVal)+1);
		for( i = 1; i<tape.size(); i++)
			countings.set(i, (int)countings.get(i-1)+(int)countings.get(i) );
		//w miejscu 1 ma byc 7 patrz gorna petla
		for( i = tape.size()-1; i>=0; i--)
			resultTape.set((int)countings.get((int)tape.get(i))-1, tape.get(i));
			
		return resultTape;
	} // only integer array only
}
