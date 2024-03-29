package bt.collections.interfaces;

import bt.exceptions.EmptyQueueException;

public interface IQueue {
	public void enqueue(Object val);
	public Object dequeue() throws EmptyQueueException;
	public void clear();
	public int size();
	public boolean isEmpty();
}
