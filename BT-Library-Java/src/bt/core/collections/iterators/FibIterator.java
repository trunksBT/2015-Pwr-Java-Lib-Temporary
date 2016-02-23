package bt.core.collections.iterators;

public class FibIterator implements Iterator{
	final int upperLim;
	int n;
	int fn;
	int fnm1;
	int curr;
	
	public FibIterator(int upperLim) {
		this.upperLim = upperLim;
		this.fn = fnm1 = n = 0;
		this.curr = -1;
	}
	
	@Override
	public void previous() {
	}

	@Override
	public void next() {
		calcForward();		
	}

	@Override
	public Object current() {
		return curr;
	}

	@Override
	public void first() {
		curr = 0;
	}

	@Override
	public void last() {
	}

	@Override
	public boolean isDone() {
		return curr >= upperLim;
	}
	
	private void calcForward() {
		if( n == 0 ) {
			fn = fnm1 = curr = 0;
			++n;
		}
		else if ( n == 1 ) {
			fn = curr = 1;
			fnm1 = 0;
			++n;
		}
		else {
			fnm1 = fn;
			fn = curr;
			curr = fnm1 +fn;
			++n;
		}
	}
}
