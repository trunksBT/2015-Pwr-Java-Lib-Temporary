package bt.collections.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.graphs.AdjacentMatrix;
import bt.collections.graphs.Graph;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.LinkedList;
import bt.mock.algorithms.graph.MockAdjacentMatrix;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_GraphAdjacentMatrix extends TestCase
{
	final int size = 9;
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTORandnumberOfVerts_mock_9()
	{
	    //arrange	    
	    Graph<Integer,String> inGraph = 
	    		new AdjacentMatrix<>(MockAdjacentMatrix.notEmpty(size));
	    int expVal = 9;
	    int rcVal = -1;
	    
	    //act
	    rcVal = inGraph.getNumberOfVerts();
	    
	    //assert
	    assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTORandnumberOfVerts_null_0()
	{
	    //arrange	    
	    Graph<Integer,String> inGraph = 
	    		new AdjacentMatrix<>(null);
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
	    		new AdjacentMatrix<>(new String[0][0]);
	    int expVal = 0;
	    int rcVal = -1;
	    
	    //act
	    rcVal = inGraph.getNumberOfVerts();
	    
	    //assert
	    assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_getAdjacents_of0_1and3()
	{
	    //arrange	    
		AdjacentMatrix<String> inGraph = 
	    		new AdjacentMatrix<>(MockAdjacentMatrix.notEmpty(size));
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
	public void test_resetVerticesStory_false()
	{
	    //arrange	    
	    Graph<Integer,String> inGraph = 
	    		new AdjacentMatrix<>(MockAdjacentMatrix.notEmpty(size));
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
	public void test_getAdjacents_null_empty()
	{
	    //arrange	    
		AdjacentMatrix<String> inGraph = 
	    		new AdjacentMatrix<>(null);
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
}