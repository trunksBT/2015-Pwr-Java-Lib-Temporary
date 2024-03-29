package bt.collections.lists;

import bt.collections.interfaces.List;
import bt.collections.iterators.ArrayIterator;
import bt.collections.iterators.Iterator;

public class ArrayList extends AbstractList implements List {
	private static final int DEFAULT_INIT_CAPACITY = 16;
	private final int initCapacity;
	private Object[] array;
	private int size;
	
	public ArrayList() {
		this(DEFAULT_INIT_CAPACITY);
	}
	
	public ArrayList(int initCapacity) {
		this.initCapacity = initCapacity;
		array = new Object[initCapacity];
	}

	@Override
	public Iterator iterator() {
		return (Iterator) new ArrayIterator( array, 0, size);
	}

	@Override
	public void add(Object val) {
		insert(size,val);
	}

	@Override
	public void clear() {
		array = new Object[initCapacity];
		size = 0;
	}

	@Override
	public boolean contains(Object val) {
		return indexOf(val) !=- 1;
	}

	@Override
	public Object delete(int idx) throws IndexOutOfBoundsException {
		checkOutOfBounds(idx);
		Object oldValue = array[idx];
		int nextValIdx = idx+1;
		
		if(nextValIdx < size)
			System.arraycopy(array,nextValIdx,array,idx, size - nextValIdx);
		
		array[--size] = null;
		return oldValue;
	}

	@Override
	public boolean delete(Object val) {
		int idxOfSearched = indexOf(val);
		boolean retVal = false;
		
		if( idxOfSearched != -1) {
			delete(idxOfSearched);
			retVal = true;
		}
		
		return retVal;
	}

	@Override
	public Object get(int idx) throws IndexOutOfBoundsException {
		checkOutOfBounds(idx);
		return array[idx];
	}

	@Override
	public int indexOf(Object val) {
		int retIdx = -1;
		
		for(int i = 0 ; i<size && retIdx == -1; i++)
			if( array[i].equals(val) )
				retIdx = i;
		
		return retIdx;
	}

	@Override
	public void insert(int idx, Object val) throws IndexOutOfBoundsException {
		if( idx < 0 || idx > size)
			throw new IndexOutOfBoundsException();
		
		ensureCapacity(size + 1);
		System.arraycopy(array, idx, array, idx+1, size - idx);
		array[idx] = val;
		++size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Object set(int idx, Object val) throws IndexOutOfBoundsException {
		checkOutOfBounds(idx);
		Object oldVal = array[idx];
		array[idx] = val;
		return oldVal;
	}

	@Override
	public int size() {
		return size;
	}
	
	private void checkOutOfBounds(int idx) {
		if( isOutOfBounds(idx) )
			throw new IndexOutOfBoundsException();
	}
	
	private boolean isOutOfBounds(int idx) {
		return idx < 0 | idx >= size;
	}
	
	private void ensureCapacity(int capacity) {
		if( array.length < capacity ) {
			Object[] copy = new Object[capacity+ capacity/2];
			System.arraycopy(array, 0, copy, 0, size);
			array = copy;
		}
	}

}
