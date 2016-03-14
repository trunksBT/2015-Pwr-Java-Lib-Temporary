package bt.core.collections.interfaces;

import bt.core.exceptions.EmptyQueueException;

public interface Queue {
	public void enqueue(Object val);
	public Object dequeue() throws EmptyQueueException;
	public void clear();
	public int size();
	public boolean isEmpty();
}
