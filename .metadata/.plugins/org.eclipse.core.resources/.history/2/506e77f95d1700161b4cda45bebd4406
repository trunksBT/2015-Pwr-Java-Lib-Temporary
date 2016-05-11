package bt.core.algorithms.sorting;

import java.util.PriorityQueue;

import bt.core.algorithms.interfaces.ListSorter;
import bt.core.collections.interfaces.List;
import bt.core.collections.lists.LinkedList;

public class BucketSort implements ListSorter{
	
	public List sort(List tape) {
		PriorityQueue tempTape = new PriorityQueue();
		List tempList = new LinkedList();
		for(int i = 0; i < tape.size(); i++)
			tempTape.add(tape.get(i));
		for(int i = 0; i < tape.size(); i++)
			tempList.add(tempTape.poll());
		return tempList;		
	}
}
