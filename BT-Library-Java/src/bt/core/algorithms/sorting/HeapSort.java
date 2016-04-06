package bt.core.algorithms.sorting;


import java.util.PriorityQueue;

import bt.core.algorithms.comparators.ReverseComparator;
import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.dataTypes.ArrayList;
import bt.core.collections.dataTypes.Queue;
import bt.core.collections.interfaces.List;
import bt.core.collections.iterators.Iterator;

public class HeapSort implements ListSorter {
	private final Comparator order;
	
	public HeapSort(Comparator order) {
		this.order = order;
	}
	
	@Override
	public List sort(List tape) {
		PriorityQueue queue = createPriorityQueue(tape);
		List result = new ArrayList(tape.size());
		while(!queue.isEmpty())
			result.add(queue.poll());
		return result;
	}

	private PriorityQueue createPriorityQueue(List tape) {
		PriorityQueue<Comparable<? super Comparable<? super Integer>>> 
		queue = new PriorityQueue<>(java.util.Comparator.naturalOrder());
		Iterator it = tape.iterator();
		it.first();
		while(!it.isDone()) {
			queue.add((Comparable<? super Comparable<? super Integer>>) it.current())	;
			it.next();
		}
		return queue;
	}

}
