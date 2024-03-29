package bt.collections.various;

import bt.collections.elems.Player;
import bt.collections.iterators.ArrayIterator;
import bt.collections.iterators.FilterIterator;
import bt.collections.iterators.Iterator;
import bt.collections.iterators.Predicate;

public class Competition {
	protected final Player[] players;
	protected Predicate pred;
	
	public Competition(Player[] players) {
		this.players = players;
		this.pred = new MoreThanTwoPred();
	}
	
	public Competition() {
		this.players = new Player[0];
		this.pred = new MoreThanTwoPred();
	}
	
	public void printAll() {
		Iterator it = new ArrayIterator(players);
		it.first();
		while(!it.isDone()) {
			System.out.println( it.current() );
			it.next();
		}
	}	
		
	public void printAllOk() {
		Iterator it = new FilterIterator(new ArrayIterator(players),pred);
		for(it.first();!it.isDone();it.next()) 
			System.out.println( it.current() );
	}
	
	private class MoreThanTwoPred implements Predicate
	{
		@Override
		public boolean accept(Object obj) {
			return ((Player)obj).getPoints() > 2;
		}	
	}
}
