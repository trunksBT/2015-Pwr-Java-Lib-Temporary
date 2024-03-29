package bt.collections.iterators;

public class PrimeIterator extends ItPrint implements Iterator {
	private final int downLim; // inclusive
	private final int upLim; // inclusive
	private int curr;
	
	public PrimeIterator(int downLim, int upLim) {
		this.downLim = downLim;
		this.upLim = upLim;
		curr = upLim + 1;
	}

	@Override
	public void previous() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void next() {
		curr++;
		moveForward();
	}

	@Override
	public Object current() {
		return curr;
	}

	@Override
	public void first() {
		curr = downLim;
		moveForward();
	}

	@Override
	public void last() {

	}

	@Override
	public boolean isDone() {
		return curr > upLim;
	}
	
	private boolean isPrime() {
		int i = 2;
		for(; i*i <= curr && curr % i != 0; i++) {}
		return i*i > curr;		
	}
	
	private void moveForward() {
		if( !isPrime() && !isDone())
			++curr;
	}
}
