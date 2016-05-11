package bt.algorithms.comparators;

import bt.algorithms.interfaces.Comparator;
import bt.collections.interfaces.Edgable;

public class EdgeEndComparator<V,W> implements Comparator {
	public EdgeEndComparator() {}
	
	@Override
	public int compare(Object left, Object right) throws ClassCastException {
		Comparable<Integer> leftPack = (Comparable<Integer>) ((Edgable<V,W>)left).getEnd();
		Integer rightPack = (Integer) ((Edgable<Integer,W>)right).getEnd();
		return leftPack.compareTo(rightPack);
	}

}
