package bt.core.collections.various;

import bt.core.collections.elems.Player;
import bt.core.collections.iterators.ArrayIterator;
import bt.core.collections.iterators.FilterIterator;
import bt.core.collections.iterators.Iterator;
import bt.core.collections.iterators.Predicate;

public class Competition {
	private final Player[] players;
	
	public Competition(Player[] players) {
		this.players = players;
	}
	
	public Competition() {
		this.players = new Player[0];
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
		Iterator it = new FilterIterator(new ArrayIterator(players),new MoreThanTwoPred());
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
