package bt.collections.queues;

import bt.collections.interfaces.IQueue;
import bt.collections.interfaces.List;
import bt.collections.lists.LinkedList;
import bt.exceptions.EmptyQueueException;

public class Queue implements IQueue {
	private final List tape;

	public Queue(List list) {
		this.tape = list;
	}
	
	public Queue() {
		this.tape = new LinkedList();
	}

	@Override
	public void enqueue(Object val) {
		tape.add(val);
	}

	@Override
	public Object dequeue() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException();
		return tape.delete(0);
	}

	@Override
	public void clear() {
		tape.clear();
	}

	@Override
	public int size() {
		return tape.size();
	}

	@Override
	public boolean isEmpty() {
		return tape.isEmpty();
	}
}
