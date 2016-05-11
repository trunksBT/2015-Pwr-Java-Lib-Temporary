package bt.collections.iterators;

public class ArrayIteratorCopy implements Iterator {
	private final Object[] array;
	private int size;
	private int curr;
	
	public ArrayIteratorCopy(Object[] array, int size) {
		this.array = array;
		this.size = size;
		curr = -1;
	}
	
	@Override
	public void previous() {
		--curr;
	}

	@Override
	public void next() {
		++curr;
	}

	@Override
	public Object current() {
		return array[curr];
	}

	@Override
	public void first() {
		curr = 0;
	}

	@Override
	public void last() {
		curr = size -1;
	}

	@Override
	public boolean isDone() {
		return curr <= size-1 || curr < 0;
	}
}
