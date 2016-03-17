package bt.core.algorithms.comparators;

import bt.core.algorithms.interfaces.Comparator;

public class NaturalComparator implements Comparator {
	public static final NaturalComparator INSTANCE = new NaturalComparator();
	
	private NaturalComparator() {}

	@Override
	public int compare(Object left, Object right) throws ClassCastException {		
		return ((Comparable)left).compareTo(right);
	}
}
