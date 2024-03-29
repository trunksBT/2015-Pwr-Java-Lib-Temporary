package bt.algorithms.sorting;

import bt.algorithms.interfaces.Comparator;
import bt.algorithms.interfaces.ListSorter;
import bt.collections.interfaces.List;

public class BubbleSortOptimal implements ListSorter{
	private final Comparator order;
	
	public BubbleSortOptimal(Comparator order) {
		this.order = order;
	}
	
	@Override
	public List sort(List tape) {
		if(tape == null)
			return tape;
		
		int lastSwap = tape.size() -1;
		while(lastSwap > 0) {
			int end = lastSwap;
			lastSwap = 0;
			for(int i = 0; i< end; i++) {
				if(order.compare(tape.get(i), tape.get(i+1))>0) {
					Object toBubbleUp = tape.get(i);
					while(i<end && order.compare(toBubbleUp, tape.get(i+1))>0){
						tape.set(i, tape.get(i+1));
						i++;
					}
					tape.set(i, toBubbleUp);
					lastSwap = i;
				}
			}
		}
		return tape;
	}
}
