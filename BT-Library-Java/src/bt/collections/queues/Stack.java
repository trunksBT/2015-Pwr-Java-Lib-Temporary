package bt.collections.queues;

import bt.collections.interfaces.List;
import bt.collections.lists.LinkedList;
import bt.exceptions.EmptyQueueException;
import bt.exceptions.EmptyStackException;

public class Stack implements bt.collections.interfaces.Stack {
	private final List list;
	
	public Stack() {
		this.list = new LinkedList();
	}
	
	public Stack(List list) {
		this.list = list;
	}

	@Override
	public void enqueue(Object val) {
		push(val);
	}

	@Override
	public Object dequeue() throws EmptyQueueException {
		try {
			return pop();
		}catch(EmptyStackException e) {
			throw new EmptyQueueException();
		}
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

	@Override
	public void push(Object val) {
		list.add(val);
	}

	@Override
	public Object pop() throws EmptyStackException {
		if(isEmpty())
			throw new EmptyStackException();
		return list.delete(size()-1);
	}

	@Override
	public Object peek() throws EmptyStackException {
		Object poped = pop();
		push(poped);
		return poped;
	}
}
