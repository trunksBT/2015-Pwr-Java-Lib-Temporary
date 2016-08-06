package bt.collections.iterators;

public class ArrayPeriodIterator implements Iterator{
	final ArrayIterator it;
	final int period;
	
	public ArrayPeriodIterator(ArrayIterator it, int period) {
		this.it = it;
		this.period = period;
	}
	
	@Override
	public void previous() {
		for(int i = 0 ;i< period ;i++)
			it.previous();
	}

	@Override
	public void next() {
		for(int i = 0 ;i< period ;i++)
			it.next();
	}

	@Override
	public Object current() {
		return it.current();
	}

	@Override
	public void first() {
		it.first();
	}

	@Override
	public void last() {
		it.last();
		rewindIfWrong();
	}

	@Override
	public boolean isDone() {
		return it.isDone();
	}
	
	private void rewindIfWrong() {
		if(it.current % period != 0)
			it.previous();
	}
}
