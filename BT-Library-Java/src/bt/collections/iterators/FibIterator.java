package bt.collections.iterators;

public class FibIterator implements Iterator{
	private int n = 0;
	private int fnm1 = 0;
	private int fn = 0;
	private final int lim;
	
	public FibIterator( int lim) {
		this.lim = lim;
	}
	
	@Override
	public void previous() {

	}

	@Override
	public void next() {
		if( n <= 1) {
			fn = 1;
			n++;
		}else {
			int oldFnm1 = fnm1;
			fnm1 = fn;
			fn += oldFnm1;
			n++;
		}
	}

	@Override
	public Object current() {
		return fnm1 + fn;
	}

	@Override
	public void first() {
		n = 0;
	}

	@Override
	public void last() {
		
	}

	@Override
	public boolean isDone() {
		return fn + fnm1 >= lim;
	}
}
