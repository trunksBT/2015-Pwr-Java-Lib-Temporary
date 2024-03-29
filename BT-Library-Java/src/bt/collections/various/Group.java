package bt.collections.various;

import bt.collections.elems.Student;
import bt.collections.iterators.ArrayIterator;
import bt.collections.iterators.FilterIterator;
import bt.collections.iterators.Iterator;
import bt.collections.iterators.Predicate;

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
	
	public Iterator iterator(double avrg) {
		return new FilterIterator(new ArrayIterator(super.players),new GoodAveragePred(avrg));
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
