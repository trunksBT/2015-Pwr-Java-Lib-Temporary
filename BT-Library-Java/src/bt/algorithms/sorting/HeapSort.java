package bt.algorithms.sorting;


import java.util.PriorityQueue;

import bt.algorithms.comparators.ReverseComparator;
import bt.algorithms.interfaces.Comparator;
import bt.algorithms.interfaces.ListSorter;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;
import bt.collections.queues.Queue;

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
