package bt.algorithms.comparators;

import bt.algorithms.interfaces.Comparator;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;

public class CompoundComparator implements Comparator{
	private final List comparators = new ArrayList();
	
	public void addComparator(Comparator comparator) {
		this.comparators.add(comparator);
	}

	@Override
	public int compare(Object left, Object right) throws ClassCastException {
		int result = 0;
		Iterator it = comparators.iterator();
		for(it.first(); 
				!it.isDone() && (result = ((Comparator) it.current()).compare(left,right)) == 0; 
					it.next());
		return result;
	}
}
