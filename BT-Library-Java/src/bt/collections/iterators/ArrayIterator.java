package bt.collections.iterators;

public class ArrayIterator extends ItPrint implements Iterator{
	Object[] array;
	final int first;
	final int last;
	int current= -1;
	
	public ArrayIterator(Object [] array, int start,int length) {
		this.array = array;
		this.first = start;
		this.last = start+ length -1;
	}
	
	public ArrayIterator(Object [] array) {
		this.array= array;
		this.first = 0;
		this.last = array.length -1;
	}
	@Override
	public void previous() {
		--current;
	}

	@Override
	public void next() {
		++current;
	}

	@Override
	public Object current() {
		return array[current];
	}

	@Override
	public void first() {
		current = first;
	}

	@Override
	public void last() {
		current = last;	
	}

	@Override
	public boolean isDone() {
		return current < first || current >last;
	}
}
