package bt.algorithms.comparators;

public class EdgeComparator<V,W> extends CompoundComparator{
	public EdgeComparator() {
		addComparator(new EdgeStartComparator<V,W>());
		addComparator(new EdgeEndComparator<V,W>());
	}
}
