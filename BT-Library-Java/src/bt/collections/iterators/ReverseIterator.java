package bt.collections.iterators;

public class ReverseIterator extends ItPrint implements Iterator {
	private final Iterator it;
	
	public ReverseIterator( Iterator it){
		this.it = it;
	}
	
	@Override
	public void previous() {
		it.next();	
	}

	@Override
	public void next() {
		it.previous();
	}

	@Override
	public Object current() {
		return it.current();
	}

	@Override
	public void first() {
		it.last();
	}

	@Override
	public void last() {
		it.first();	
	}

	@Override
	public boolean isDone() {
		return it.isDone();
	}
}
