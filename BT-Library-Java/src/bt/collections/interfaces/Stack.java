package bt.collections.interfaces;

import bt.exceptions.EmptyStackException;

public interface Stack extends IQueue {
	public void push(Object val);
	public Object pop() throws EmptyStackException;
	public Object peek() throws EmptyStackException;
}
