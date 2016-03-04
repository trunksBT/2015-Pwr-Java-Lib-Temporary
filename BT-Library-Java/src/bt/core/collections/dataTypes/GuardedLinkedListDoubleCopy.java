package bt.core.collections.dataTypes;

import bt.core.collections.interfaces.List;
import bt.core.collections.iterators.Iterator;

public class GuardedLinkedListDoubleCopy extends AbstractList implements List {
	Element hdAndTl = new Element(null);
	private int size;
	
	public GuardedLinkedListDoubleCopy() {
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
		hdAndTl.prev = hdAndTl;
		hdAndTl.next = hdAndTl;
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
		oldEl.detach();
		size--;
		
		return oldEl.val;
	}

	@Override
	public boolean delete(Object val) {
		Element cur = hdAndTl.next;
		boolean retVal = false;
		
		while( !val.equals(cur.val) && cur != hdAndTl )
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
		if( isOutOfBounds(idx) )
			throw new IndexOutOfBoundsException();
	}

	private boolean isOutOfBounds(int idx) {
		return idx < 0 || idx >= size;
	}

	public Element getElement(int idx) {
		return idx > size / 2 ?
				getElementForwards(idx) :
					getElementBackwards(idx);
	}

	private Element getElementBackwards(int idx) {
		Element cur = hdAndTl;
		
		for(int i = 0 ; i < size - idx ; i ++)
			cur = cur.prev;
		
		return cur;
	}

	private Element getElementForwards(int idx) {
		Element cur = hdAndTl;
		
		for(int i = 0 ; i< idx + 1; i++)
			cur = cur.next;
		
		return cur;
	}

	@Override
	public int indexOf(Object val) {
		Element cur = hdAndTl;
		int i = -1;
		
		while( i < size && !val.equals(cur.val)) {
			cur = cur.next;
			i++;
		}
		
		return i == size ? -1 : i ;
	}

	@Override
	public void insert(int idx, Object val) throws IndexOutOfBoundsException {
		if( idx < 0 || idx > size)
			throw new IndexOutOfBoundsException();
		
		new Element(val).attachBefore(getElement(idx));
		size++;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Object set(int idx, Object val) throws IndexOutOfBoundsException {
		checkOutOfBounds(idx);
		
		Element elAtIdx = getElement(idx);
		Object oldVal = elAtIdx.val;
		
		elAtIdx.val = val;
		return oldVal;
	}

	@Override
	public int size() {
		return size;
	}
}
