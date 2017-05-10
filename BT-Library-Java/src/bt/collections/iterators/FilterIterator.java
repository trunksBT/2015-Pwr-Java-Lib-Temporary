package bt.collections.iterators;

public class FilterIterator extends ItPrint implements Iterator {
	private final Iterator it;
	private final Predicate pred;
	
	public FilterIterator(Iterator it, Predicate pred){
		this.it = it;
		this.pred = pred;
	}
	
	public void filterForwards(){
		while(!it.isDone() && !pred.accept(it.current()))
			it.next();
	}
	
	public void filterBackwards() {
		while(!it.isDone() && !pred.accept(it.current()))
			it.previous();
	}
	
	@Override
	public void previous() {
		it.previous();
		filterBackwards();
	}

	@Override
	public void next() {
		it.next();
		filterForwards();
	}

	@Override
	public Object current() {
		return it.current();
	}

	@Override
	public void first() {
		it.first();
		filterForwards();
	}

	@Override
	public void last() {
		it.last();
		filterBackwards();
	}

	@Override
	public boolean isDone() {
		return it.isDone();
	}
}
