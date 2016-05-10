package bt.core.algorithms.graphs;

import java.time.Instant;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.algorithms.graph.DFS;
import bt.core.collections.graphs.Graph;
import bt.core.collections.graphs.AdjacentList;
import bt.core.collections.interfaces.List;
import bt.core.collections.iterators.Iterator;
import bt.core.collections.lists.ArrayList;
import bt.core.collections.lists.LinkedList;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_DFS extends TestCase
{
	final int size = 9;
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_adjacentList_WithTime_012356874()
	{
	    //arrange
		ArrayList rcVal = null;
		Graph<Integer,String> graph = new AdjacentList<String>(getAdjacentList(size));
	    boolean rcLogic = true;
	    final int arraySize = 1000000;
	    int endVal = 0;
	    java.util.ArrayList<Integer> toTimeCalc = new java.util.ArrayList<>(arraySize);
	    //act
	    for(int i = 0 ; i < arraySize; i++) {
		    int start = Instant.now().getNano();
		    rcVal = ((ArrayList) new DFS<String>()
		    		.forAdjacentList((AdjacentList<String>) graph));
		    int end = Instant.now().getNano();
		    toTimeCalc.add(end-start);
	    }
	    for(int it :toTimeCalc)
	    	endVal+=it;
	    
	    System.out.println( "TimePerform:"+ endVal / arraySize );
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = getExpVal().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}
	
	@Test
	public void test_adjacentList_012356874()
	{
	    //arrange
		ArrayList rcVal = null;
		Graph<Integer,String> graph = new AdjacentList<String>(getAdjacentList(size));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = ((ArrayList) new DFS<String>()
		    		.forAdjacentList((AdjacentList<String>) graph));
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = getExpVal().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}
	
	public LinkedList[] getAdjacentList(int size) {
		LinkedList [] tab = new LinkedList[size];
		for(int i = 0; i < size ; i++)
			tab[i] = new LinkedList();
		tab[0].add(1);
		tab[0].add(3);		
		tab[1].add(2);
		tab[1].add(4);	
		tab[2].add(3);
		tab[2].add(4);	
		tab[3].add(5);
		tab[4].add(6);
		tab[5].add(6);
		tab[5].add(7);
		tab[6].add(8);
		tab[7].add(8);
		return tab;
	}
	
	public LinkedList getExpVal() {
		List tab = new LinkedList();
		tab.add(0);
		tab.add(1);
		tab.add(2);
		tab.add(3);
		tab.add(5);
		tab.add(6);
		tab.add(8);
		tab.add(7);
		tab.add(4);
		return (LinkedList) tab;
	}
}