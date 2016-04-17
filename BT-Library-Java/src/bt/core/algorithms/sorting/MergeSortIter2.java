package bt.core.algorithms.sorting;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.dataTypes.ArrayList;
import bt.core.collections.dataTypes.GuardedLinkedListDouble;
import bt.core.collections.dataTypes.Queue;
import bt.core.collections.interfaces.IQueue;
import bt.core.collections.interfaces.List;
import bt.core.collections.iterators.Iterator;

public class MergeSortIter2 implements ListSorter {
	private final Comparator order;
	public MergeSortIter2(Comparator order) {
		this.order = order;
	}
	@Override
	public List sort(List tape) {
		return mergeSort(createQueueOfLists(tape));
	}
	private List mergeSort(IQueue lists) {
		while(lists.size()>1)
			lists.enqueue(merge((List)lists.dequeue(),(List)lists.dequeue()));
		return (List) lists.dequeue();
	}
	private List merge(List fstDequeued, List sndDequeued) {
		Iterator fstIt = fstDequeued.iterator();
		Iterator sndIt = sndDequeued.iterator();
		List retVal = new ArrayList(fstDequeued.size() + sndDequeued.size());
		fstIt.first();sndIt.first();
		while(!fstIt.isDone() && !sndIt.isDone()) {
			if( order.compare(fstIt.current(),sndIt.current())<0) {
				retVal.add(fstIt.current());
				fstIt.next();
			}else {
				retVal.add(sndIt.current());
				sndIt.next();
			}
		}
		while(!fstIt.isDone()) {
			retVal.add(fstIt.current());
			fstIt.next();
		}
		while(!sndIt.isDone()) {
			retVal.add(sndIt.current());
			sndIt.next();
		}
		return retVal;
	}
	private IQueue createQueueOfLists(List tape) {
		Iterator it = tape.iterator();
		IQueue retVal = new Queue();
		it.first();
		while( !it.isDone() ) {
			List singleton = new ArrayList();
			singleton.add(it.current());
			retVal.enqueue(singleton);
			it.next();
		}
		return retVal;
	}
}
