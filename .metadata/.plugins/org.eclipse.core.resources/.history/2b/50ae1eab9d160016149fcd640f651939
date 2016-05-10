package bt.core.collections.dataTypes;

import bt.core.collections.interfaces.List;
import bt.core.collections.iterators.Iterator;

// GuardedLinkedListDouble
public class LinkedList extends AbstractList implements List {
	Element hdAndTl = new Element(null);
	private int size;
	
	public LinkedList() {
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
		
		Element el = getElement(idx);
		el.detach();
		--size;
		
		return el.val;
	}
	
	@Override
	public boolean delete(Object val) {
		Element el = hdAndTl.next;
		boolean retVal = false;
		
		while(el != hdAndTl && ! val.equals(el.val))
			el = el.next;
		
		if( !el.equals( hdAndTl )) {
			el.detach();
			--size;
			retVal = true;
		}

		return retVal;
	}

	private void checkOutOfBounds(int idx) {
		if ( isOutOfBounds ( idx ) )
			throw new IndexOutOfBoundsException();
	}

	private boolean isOutOfBounds(int idx) {
		return idx < 0 || idx > size -1;
	}

	@Override
	public Object get(int idx) throws IndexOutOfBoundsException {
		checkOutOfBounds(idx);
		return getElement(idx).val;
	}

	@Override
	public int indexOf(Object val) {
		int idx = 0;
		Element el = hdAndTl.next;
		
		while(el != hdAndTl && ! el.val.equals(val)) {
			el = el.next;
			++idx;
		}
		
		return el != hdAndTl ? idx : -1;		
	}

	@Override
	public void insert(int idx, Object val) throws IndexOutOfBoundsException {
		if( idx < 0 || idx > size)
			throw new IndexOutOfBoundsException();
		
		Element el = new Element(val);
		el.attachBefore(getElement(idx));
		++size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Object set(int idx, Object val) throws IndexOutOfBoundsException {
		checkOutOfBounds(idx);
		
		Element el = getElement(idx);
		Object oldVal = el.val;
		
		el.val = val;
		return oldVal;
	}

	@Override
	public int size() {
		return size;
	}
	
	private Element getElement(int idx) {
		return idx < size /2 ? 
				getElementForwards(idx) :
					getElementBackwards(idx);		
	}
	
	private Element getElementBackwards(int idx) {
		Element el = hdAndTl;
		
		for(int i = size - idx ; i > 0 ; --i )
			el = el.prev;
		
		return el;
	}
	
	private Element getElementForwards(int idx) {
		Element el = hdAndTl.next;
		
		for(int i = idx; i>0 ; --i)
			el = el.next;
		
		return el;
	}
}
