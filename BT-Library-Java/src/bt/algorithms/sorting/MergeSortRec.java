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
		return mergesort(tape, 0, tape.size() -1);
	}
	private List mergesort(List tape, int startIdx, int endIdx) {
		if(startIdx == endIdx) {
			List result = new ArrayList();
			result.add(tape.get(startIdx)); // here empty list will throw exception
			return result;
		}
		int splitIdx = startIdx + (endIdx- startIdx)/2;
		return merge(mergesort(tape, startIdx, splitIdx),
				mergesort(tape, splitIdx+1, endIdx)); 
	}
	private List merge(List leftArray, List rightArray) {
		List result = new ArrayList(leftArray.size()+rightArray.size());
		Iterator leftIt = leftArray.iterator();
		Iterator rightIt = rightArray.iterator();
		leftIt.first();rightIt.first();	
		
		while(!leftIt.isDone()&& !rightIt.isDone()) {
			if(order.compare(leftIt.current(), rightIt.current())<= 0) {
				result.add(leftIt.current());
				leftIt.next();
			}else {
				result.add(rightIt.current());
				rightIt.next();
			}
		}
		while(!leftIt.isDone()) {
			result.add(leftIt.current());
			leftIt.next();
		}
		while(!rightIt.isDone()) {
			result.add(rightIt.current());
			rightIt.next();
		}
		
		return result;
	}
}