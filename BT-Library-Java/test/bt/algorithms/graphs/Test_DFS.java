package bt.algorithms.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.graph.DFS;
import bt.collections.graphs.AdjacentList;
import bt.collections.graphs.Graph;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;
import bt.collections.lists.LinkedList;
import bt.mock.algorithms.graph.MockAdjacentList;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_DFS extends TestCase
{		
	@Test
	public void test_adjacentList_NotEmpty_012356874()
	{
	    //arrange
		ArrayList rcVal = null;
		int inSize = 9;
		Graph<Integer,String> graph = 
				new AdjacentList<String>(MockAdjacentList.NotEmpty(inSize));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = (ArrayList) new DFS<String>()
		    		.forAdjacentList((AdjacentList<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = MockAdjacentList.expValForNotEmpty().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}
	
	@Test
	public void test_adjacentList_Null_Empty()
	{
	    //arrange
		ArrayList rcVal = null;
		Graph<Integer,String> graph = 
				new AdjacentList<String>(MockAdjacentList.Null(0));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = (ArrayList) new DFS<String>()
		    		.forAdjacentList((AdjacentList<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = MockAdjacentList.expValForNotEmpty().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}
	
	@Test
	public void test_adjacentList_TwoElem_12()
	{
	    //arrange
		ArrayList rcVal = null;
		int inSize = 2;
		Graph<Integer,String> graph = 
				new AdjacentList<String>(MockAdjacentList.TwoElem(inSize));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = (ArrayList) new DFS<String>()
		    		.forAdjacentList((AdjacentList<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = MockAdjacentList.expValForTwoElem().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}
	

}