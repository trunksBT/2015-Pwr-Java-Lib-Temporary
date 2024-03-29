package bt.algorithms.sorting;

import bt.algorithms.interfaces.Comparator;
import bt.algorithms.interfaces.ListSorter;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;

public class MergeSortRec implements ListSorter {
	private final Comparator order;
	public MergeSortRec(Comparator order) {
		this.order = order;
	}
	
	@Override
	public List sort(List tape) {
		if(tape == null){
			return null;
		}
		else	{
			return mergeSort(tape, 0, tape.size() - 1);
		}
	}
	
	private List mergeSort(List tape, int idxStart, int idxEnd) {
		if( idxStart== idxEnd) {
			List oneElemList = new ArrayList(1);
			oneElemList.add(tape.get(idxStart));
			return oneElemList;
		}
		int idxSplit = idxStart + (idxEnd- idxStart)/2;
		return merge(mergeSort(tape, idxStart, idxSplit), mergeSort( tape, idxSplit+1, idxEnd));
	}
	
	private List merge(List leftArray, List rightArray) {
		List retList = new ArrayList(leftArray.size() + rightArray.size());
		Iterator itLeft = leftArray.iterator();
		Iterator itRight = rightArray.iterator();

		itLeft.first();
		itRight.first();

		while(!itLeft.isDone() && !itRight.isDone()) {
			if(order.compare(itLeft.current(), itRight.current())<=0) {
				retList.add(itLeft.current());
				itLeft.next();
			}
			else{
				retList.add(itRight.current());
				itRight.next();
			}
		}
		while(!itLeft.isDone()) {
			retList.add(itLeft.current());
			itLeft.next();
		}
		while(!itRight.isDone()) {
			retList.add(itRight.current());
			itRight.next();
		}
		
		return retList;
	}
}
