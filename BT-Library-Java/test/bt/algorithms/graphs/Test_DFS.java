package bt.algorithms.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.graph.DFS;
import bt.collections.graphs.AdjacentList;
import bt.collections.graphs.AdjacentMatrix;
import bt.collections.graphs.Graph;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;
import bt.mock.algorithms.graph.MockAdjacentList;
import bt.mock.algorithms.graph.MockAdjacentMatrix;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_DFS extends TestCase
{		
	@Test
	public void test_adjacentList_NotEmpty_012356874()
	{
	    //arrange
		List rcVal = null;
		int inSize = 9;
		Graph<Integer,String> graph = 
				new AdjacentList<String>(MockAdjacentList.NotEmpty(inSize));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = new DFS<String>()
		    		.forAdjacentShapes((AdjacentList<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = MockAdjacentList.expValForNotEmpty_DFS().iterator();
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
		List rcVal = null;
		Graph<Integer,String> graph = 
				new AdjacentList<String>(MockAdjacentList.Null(0));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = new DFS<String>()
		    		.forAdjacentShapes((AdjacentList<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = MockAdjacentList.expValForNotEmpty_DFS().iterator();
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
		List rcVal = null;
		int inSize = 2;
		Graph<Integer,String> graph = 
				new AdjacentList<String>(MockAdjacentList.TwoElem(inSize));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = new DFS<String>()
		    		.forAdjacentShapes((AdjacentList<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = MockAdjacentList.expValForTwoElem_DFSyBFS().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}
	
	@Test
	public void test_adjacentMatrix_NotEmpty_012356874()
	{
	    //arrange
		List rcVal = null;
		int inSize = 9;
		Graph<Integer,String> graph = 
				new AdjacentMatrix<String>(MockAdjacentMatrix.notEmpty(inSize));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = new DFS<String>()
		    		.forAdjacentShapes((AdjacentMatrix<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = MockAdjacentMatrix.expValForNotEmpty_DFS().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}
	
	@Test
	public void test_adjacentMatrix_Null_Empty()
	{
	    //arrange
		List rcVal = null;
		Graph<Integer,String> graph = 
				new AdjacentMatrix<String>(MockAdjacentMatrix.Null(0));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = new DFS<String>()
		    		.forAdjacentShapes((AdjacentMatrix<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = MockAdjacentMatrix.expValForNotEmpty_DFS().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}
	
	@Test
	public void test_adjacentMatrix_TwoElem_12()
	{
	    //arrange
		List rcVal = null;
		int inSize = 2;
		Graph<Integer,String> graph = 
				new AdjacentMatrix<String>(MockAdjacentMatrix.twoElem(inSize));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = new DFS<String>()
		    		.forAdjacentShapes((AdjacentMatrix<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = MockAdjacentMatrix.expValForTwoElem_DFSyBFS().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}
	

}