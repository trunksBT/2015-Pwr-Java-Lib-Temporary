package bt.algorithms.graphs;

import java.time.Instant;

import org.junit.Before;
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
		Graph<Integer,String> graph = new AdjacentList<String>(mockAdjacentListNotEmpty(inSize));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = (ArrayList) new DFS<String>()
		    		.forAdjacentList((AdjacentList<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = mockExpValNotEmpty().iterator();
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
		Graph<Integer,String> graph = new AdjacentList<String>(mockAdjacentListNull(0));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = (ArrayList) new DFS<String>()
		    		.forAdjacentList((AdjacentList<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = mockExpValNull().iterator();
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
		Graph<Integer,String> graph = new AdjacentList<String>(mockAdjacentListTwoElem(inSize));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = (ArrayList) new DFS<String>()
		    		.forAdjacentList((AdjacentList<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = mockExpValTwoElem().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}

	@Test
	public void test_edgeList_NotEmpty_012356874()
	{
	    //arrange
		ArrayList rcVal = null;
		int inSize = 9;
		Graph<Integer,String> graph = new AdjacentList<String>(mockAdjacentListNotEmpty(inSize));
	    boolean rcLogic = true;
	    
	    //act
		rcVal = (ArrayList) new DFS<String>()
		    		.forAdjacentList((AdjacentList<String>) graph);
	    
	    //assert
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = mockExpValNotEmpty().iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    assertTrue(rcLogic);
	}
	
	public LinkedList[] mockAdjacentListNotEmpty(int size) {
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
	
	public LinkedList mockExpValNotEmpty() {
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
	
	public LinkedList[] mockAdjacentListTwoElem(int size) {
		LinkedList [] tab = new LinkedList[size];
		for(int i = 0; i < size ; i++)
			tab[i] = new LinkedList();
		tab[0].add(1);
		return tab;
	}
	
	public LinkedList mockExpValTwoElem() {
		List tab = new LinkedList();
		tab.add(0);
		tab.add(1);
		return (LinkedList) tab;
	}
	
	public LinkedList[] mockAdjacentListNull(int size) {
		return null;
	}
	
	public LinkedList mockExpValNull() {
		return new LinkedList();
	}
}