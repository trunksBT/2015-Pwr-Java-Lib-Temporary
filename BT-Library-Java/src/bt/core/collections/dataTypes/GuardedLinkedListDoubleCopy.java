package bt.core.collections.dataTypes;

import bt.core.collections.interfaces.List;
import bt.core.collections.iterators.Iterator;

public class GuardedLinkedListDoubleCopy extends AbstractList implements List {
	bt.core.collections.dataTypes.Element hdAndTail = new Element(null);
	private int size;
	
	public GuardedLinkedListDoubleCopy() {
		clear();
	}
	
	@Override
	public Iterator iterator() {
		return new ValueIterator(hdAndTail);
	}

	@Override
	public void add(Object val) {
		insert(size, val);
	}

	@Override
	public void clear() {
		hdAndTail.prev = hdAndTail;
		hdAndTail.next = hdAndTail;
		size = 0;
	}

	@Override
	public boolean contains(Object val) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object delete(int idx) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Object val) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int idx) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object val) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(int idx, Object val) throws IndexOutOfBoundsException {
		if( idx < 0 || idx > size)
			throw new IndexOutOfBoundsException();
		
		new Element(val).attachBefore(getElement(idx));
		++size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Object set(int idx, Object val) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}
	
	private Element getElement(int idx) {
		return idx < size / 2 ? 
				getElementForward(idx) :
					getElementBackwards ( idx);
	}
	
	private Element getElementForward(int idx) {
		Element cur = hdAndTail.next;
		
		for(int i = idx ; i > 0 ; i--)
			cur = cur.next;
		
		return cur;
	}
	
	private Element getElementBackwards(int idx) {
		Element cur = hdAndTail;
		
		for(int i = size - idx ; i > 0 ; i--)
			cur = cur.prev;
		
		return cur;
	}
}
