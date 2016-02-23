package bt.core.collections.various;

import bt.core.collections.elems.Player;
import bt.core.collections.elems.Student;
import bt.core.collections.iterators.ArrayIterator;
import bt.core.collections.iterators.FilterIterator;
import bt.core.collections.iterators.Iterator;
import bt.core.collections.iterators.Predicate;

public class Group extends Competition{	

	public Group(Student[] players, double average) {
		super(players);
		this.pred = new GoodAveragePred(average);
	}
	
	public void printAllOk() {
		Iterator it = new FilterIterator(new ArrayIterator(super.players),this.pred);
		for(it.first();!it.isDone();it.next()) 
			System.out.println( it.current() );
	}
	
	private class GoodAveragePred implements Predicate{
		private double average;
		
		public GoodAveragePred(double average)
		{
			this.average = average;
		}
		
		@Override
		public boolean accept(Object obj) {
			return ((Student)obj).getAverageRate()> average;
		}
		
	}
}
