package bt.core.collections.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.graphs.Edge;
import bt.core.collections.graphs.Graph;
import bt.core.collections.interfaces.List;
import bt.core.collections.iterators.Iterator;
import bt.core.collections.graphs.AdjacentList;
import bt.core.collections.lists.LinkedList;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_GraphAdjacentList extends TestCase
{
	final int size = 9;
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTORandnumberOfVerts_mock_9()
	{
	    //arrange	    
	    Graph<Integer,String> inGraph = 
	    		new AdjacentList<>(getMock(size));
	    int expVal = 9;
	    int rcVal = -1;
	    
	    //act
	    rcVal = inGraph.getNumberOfVerts();
	    
	    //assert
	    assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_resetVerticesStory_false()
	{
	    //arrange	    
		AdjacentList<String> inGraph = 
	    		new AdjacentList<>(getMock(size));
	    boolean expVal = false;
	    boolean rcVal = false;
	    
	    //act
	    inGraph.resetVerticesStory();
	    
	    //assert
	    for(int i = 0 ; i <inGraph.getNumberOfVerts(); i++)
	    	rcVal|= inGraph.getAdjacents(i).isDirty();
	    assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_isVerticeDirty_of0_false()
	{
	    //arrange	    
		AdjacentList<String> inGraph = 
	    		new AdjacentList<>(getMock(size));
	    int searchedVert = 0;
	    boolean expVal = false;
	    boolean rcVal = false;
	    
	    //act
	    rcVal = inGraph.isVerticeDirty(searchedVert);
	    
	    //assert
	    assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_getAdjacents_of0_1and3()
	{
	    //arrange	    
		AdjacentList<String> inGraph = 
	    		new AdjacentList<>(getMock(size));
	    int searchedVert = 0;
	    List expVal = new LinkedList();
	    expVal.add(1);
	    expVal.add(3);
	    List rcVal = null;
	    boolean rcLogic = true;
	    
	    //act
	    rcVal = inGraph.getAdjacents(searchedVert);
	    
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = expVal.iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    
	    //assert
	    assertTrue(rcLogic);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_getAdjacents_null_empty()
	{
	    //arrange	    
		AdjacentList<String> inGraph = 
	    		new AdjacentList<>(null);
	    int searchedVert = 0;
	    List expVal = new LinkedList();
	    List rcVal = null;
	    boolean rcLogic = true;
	    
	    //act
	    rcVal = inGraph.getAdjacents(searchedVert);
	    
	    Iterator fstIt = rcVal.iterator();
	    Iterator sndIt = expVal.iterator();
	    fstIt.first();
	    sndIt.first();
	    while(!fstIt.isDone() && !sndIt.isDone()) {
	    	rcLogic &= fstIt.current().equals(sndIt.current());
	    	fstIt.next(); sndIt.next();
	    }
	    
	    //assert
	    assertTrue(rcLogic);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTORandnumberOfVerts_null_0()
	{
	    //arrange	    
	    Graph<Integer,String> inGraph = 
	    		new AdjacentList<>(null);
	    int expVal = 0;
	    int rcVal = -1;
	    
	    //act
	    rcVal = inGraph.getNumberOfVerts();
	    
	    //assert
	    assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTORandnumberOfVerts_empty_0()
	{
	    //arrange	    
		Graph<Integer,String> inGraph = 
	    		new AdjacentList<>(new LinkedList[0]);
	    int expVal = 0;
	    int rcVal = -1;
	    
	    //act
	    rcVal = inGraph.getNumberOfVerts();
	    
	    //assert
	    assertEquals(expVal, rcVal);
	}
	
	public LinkedList[] getMock(int size) {
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
}