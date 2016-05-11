package bt.collections.lists;

import bt.collections.iterators.Iterator;

public class ValueIterator implements Iterator {
	final Element hdAndTlcopy;
	Element cur;
	
	public ValueIterator(Element hdAndTl) {
		this.hdAndTlcopy = hdAndTl;
		this.cur = hdAndTl;
	}
	
	@Override
	public void previous() {
		cur = cur.prev;
	}

	@Override
	public void next() {
		cur = cur.next;
	}

	@Override
	public Object current() {
		if(isDone())
			throw new IndexOutOfBoundsException();
		
		return cur.val;
		
	}

	@Override
	public void first() {
		cur = hdAndTlcopy.next;
	}

	@Override
	public void last() {
		cur = hdAndTlcopy.prev;
	}

	@Override
	public boolean isDone() {
		return cur == hdAndTlcopy;
	}

}
