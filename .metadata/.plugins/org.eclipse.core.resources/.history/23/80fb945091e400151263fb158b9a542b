package bt.core.collections.dataTypes;

import bt.core.collections.iterators.Iterator;

public class ValueIterator implements Iterator {
	private Element cur;
	private final Element hdAndTl;
	
	public ValueIterator(Element hdAndTl) {
		cur = hdAndTl;
		this.hdAndTl = hdAndTl;
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
		if (isDone())
			throw new IndexOutOfBoundsException();
		
		return cur;
	}

	@Override
	public void first() {
		cur = hdAndTl.next;
	}

	@Override
	public void last() {
		cur = hdAndTl.prev;
	}

	@Override
	public boolean isDone() {
		return cur == hdAndTl;
	}
}
