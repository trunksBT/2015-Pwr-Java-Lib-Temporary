package bt.core.collections.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.graphs.Edge;
import bt.core.collections.graphs.Graph;
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
	    rcVal = inGraph.numberOfVerts();
	    
	    //assert
	    assertEquals(expVal, rcVal);
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
	    rcVal = inGraph.numberOfVerts();
	    
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
	    rcVal = inGraph.numberOfVerts();
	    
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