package bt.core.collections.interfaces;

import bt.core.exceptions.EmptyStackException;

public interface Stack extends Queue {
	public void push(Object val);
	public Object pop() throws EmptyStackException;
	public Object peek() throws EmptyStackException;
}
