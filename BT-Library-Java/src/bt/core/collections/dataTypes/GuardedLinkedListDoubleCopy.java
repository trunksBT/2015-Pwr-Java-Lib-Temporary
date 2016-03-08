package bt.core.collections.dataTypes;

import bt.core.collections.interfaces.List;
import bt.core.collections.iterators.Iterator;

public class GuardedLinkedListDoubleCopy extends AbstractList implements List {
	Element hdAndTl;
	int size;
	
	public GuardedLinkedListDoubleCopy() {
		hdAndTl = new Element(null);
		clear();
	}
	
	@Override
	public Iterator iterator() {
		return new ValueIterator(hdAndTl);
	}

	@Override
	public void add(Object val) {
		insert(size,val);
	}

	@Override
	public void clear() {
		hdAndTl.next = hdAndTl;
		hdAndTl.prev = hdAndTl;
		size = 0;
	}

	@Override
	public boolean contains(Object val) {
		return indexOf(val) != -1;
	}

	@Override
	public Object delete(int idx) throws IndexOutOfBoundsException {
		checkOutOfBounds(idx);
		Element oldEl = getElement(idx);
		size--;
		
		oldEl.detach();
		return oldEl.val;
	}

	@Override
	public boolean delete(Object val) {
		boolean retVal = false;
		Element cur = hdAndTl.next;
		
		while(cur!= hdAndTl && !cur.val.equals(val))
			cur = cur.next;
		
		if( !cur.equals(hdAndTl)) {
			cur.detach();
			size--;
			retVal = true;
		}	
			
		return retVal;
	}

	@Override
	public Object get(int idx) throws IndexOutOfBoundsException {
		checkOutOfBounds(idx);
		return getElement(idx).val;
	}

	private void checkOutOfBounds(int idx) {
		if( isOutOfBounds(idx ))
			throw new IndexOutOfBoundsException();
	}

	private boolean isOutOfBounds(int idx) {
		return idx<0 || idx> size-1;
	}

	@Override
	public int indexOf(Object val) {
		Element cur = hdAndTl.next;
		int idx = 0;
		
		while( cur != hdAndTl && ! cur.val.equals(val)) {
			cur = cur.next;
			idx++;
		}
		
		return cur != hdAndTl ? idx : -1;
	}

	@Override
	public void insert(int idx, Object val) throws IndexOutOfBoundsException {
		if( idx < 0 || idx > size)
			throw new IndexOutOfBoundsException();
		
		size++;
		Element el = new Element(val);
		Element gettedEl = getElement(idx);
		el.attachBefore(gettedEl);
	}

	private Element getElement(int idx) {
		return idx < size/2 ?
				getElementForwards(idx)	:
					getElementBackwards(idx);
	}

	private Element getElementBackwards(int idx) {
		Element cur = hdAndTl;
		
		for(int i = size - idx ; i>0 ; --i)
			cur = cur.prev;
		
		return cur;
	}

	private Element getElementForwards(int idx) {
		Element cur = hdAndTl.next;
		
		for(int i = idx ; i > 0 ; --i)
			cur = cur.next;
		
		return cur;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Object set(int idx, Object val) throws IndexOutOfBoundsException {
		checkOutOfBounds(idx);
		
		Element oldEl = getElement(idx);
		Object oldVal = oldEl.val;

		oldEl.val = val;//oldEl.val = new Element(val);
		
		return oldVal;
	}

	@Override
	public int size() {
		return size;
	}
}
