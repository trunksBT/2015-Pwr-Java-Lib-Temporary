package bt.core.collections.dataTypes;

import bt.core.collections.interfaces.List;
import bt.core.exceptions.EmptyQueueException;

public class Queue implements bt.core.collections.interfaces.IQueue {
	private final List list;

	public Queue(List list) {
		this.list = list;
	}
	
	public Queue() {
		this.list = new GuardedLinkedListDouble();
	}

	@Override
	public void enqueue(Object val) {
		list.add(val);
	}

	@Override
	public Object dequeue() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException();
		return list.delete(0);
	}

	@Override
	public void clear() {
		list.clear();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
