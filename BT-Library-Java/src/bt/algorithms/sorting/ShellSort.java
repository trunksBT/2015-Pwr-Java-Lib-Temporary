package bt.algorithms.sorting;

import bt.algorithms.interfaces.Comparator;
import bt.algorithms.interfaces.ListSorter;
import bt.collections.interfaces.List;

public class ShellSort implements ListSorter{
	private final Comparator order;
	private int growth;

	public ShellSort(Comparator comparator) {
		order = comparator;
		growth = 1;
	}
	
	public List sort(List tape) {
		int size = tape.size();
		hMaxGrowth(size);		
		
		do {
			for(int i = growth; i<size; i++)
				insert(tape,i);
		}while((growth/=3) > 0);	
		
		return tape;
	}

	private void insert(List tape, int idx) {	
		Object temp, val = tape.get(idx);
		while( idx>= growth && order.compare(val, temp = tape.get(idx - growth)) < 0) {
			tape.set(idx, temp);
			idx-=growth;
		}
		tape.set(idx,val);
	}

	private void hMaxGrowth(int size) {
		while( growth < size / 9) growth = 3*growth +1;
	}			
}
