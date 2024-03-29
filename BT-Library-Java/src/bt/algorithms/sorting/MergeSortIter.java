package bt.algorithms.sorting;

import bt.algorithms.interfaces.Comparator;
import bt.algorithms.interfaces.ListSorter;
import bt.collections.interfaces.IQueue;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;
import bt.collections.queues.Queue;

public class MergeSortIter implements ListSorter {
	private final Comparator order;
	
	public MergeSortIter(Comparator order) {
		this.order = order;
	}
	
	@Override
	public List sort(List tape) {
		return mergeSubLists(createQueue(tape));
	}
	private List mergeSubLists(IQueue tape) {
		while(tape.size()>1)
				tape.enqueue(mergePair((List)tape.dequeue(),(List)tape.dequeue()));
		return (List)tape.dequeue();
	}

	private List mergePair(List dequeuedFst, List dequeuedSnd) {
		List result = new ArrayList(dequeuedFst.size()+ dequeuedSnd.size());
		Iterator itFst = dequeuedFst.iterator();
		Iterator itSnd = dequeuedSnd.iterator();
		itFst.first();itSnd.first();
		
		while(!itFst.isDone() && !itSnd.isDone()) {
			if(order.compare(itFst.current(), itSnd.current())<=0) {
				result.add(itFst.current());
				itFst.next();
			}else {
				result.add(itSnd.current());
				itSnd.next();
			}
		}
		while(!itFst.isDone()) {
			result.add(itFst.current());
			itFst.next();
		}
		while(!itSnd.isDone()) {
			result.add(itSnd.current());
			itSnd.next();
		}
		
		return result;
	}
	private IQueue createQueue(List tape) {
		IQueue result = new Queue();
		Iterator it = tape.iterator();
		it.first();
		
		while(! it.isDone()) {
			List singletonList = new ArrayList(1);
			singletonList.add(it.current());
			result.enqueue(singletonList);
			it.next();
		}
		
		return result;
	}
}
