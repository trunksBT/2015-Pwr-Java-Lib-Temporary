package bt.core.algorithms.comparators;

import bt.core.algorithms.interfaces.Comparator;

public class ReverseComparator implements Comparator{
	private final Comparator comparator;
	
	public ReverseComparator(Comparator comparator) {
		this.comparator = comparator;
	}
	
	@Override
	public int compare(Object left, Object right) throws ClassCastException {
		return comparator.compare(right,left);
	}
}
