package bt.algorithms.comparators;

import bt.algorithms.interfaces.Comparator;
import bt.collections.interfaces.Edgable;

public class EdgeStartComparator<V,W> implements Comparator {
	public EdgeStartComparator() {}
	
	@Override
	public int compare(Object left, Object right) throws ClassCastException {
		Comparable<Integer> leftPack = (Comparable<Integer>) ((Edgable<V,W>)left).getStart();
		Integer rightPack = (Integer) ((Edgable<Integer,W>)right).getStart();
		return leftPack.compareTo(rightPack);
	}

}
