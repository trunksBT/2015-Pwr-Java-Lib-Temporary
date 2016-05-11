package bt.core.collections.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.graphs.Edge;
import bt.core.collections.graphs.Graph;
import bt.core.collections.graphs.AdjacentMatrix;
import bt.core.collections.lists.LinkedList;
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
	    		new AdjacentMatrix<>(getMock(size));
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
	
	public String [][] getMock(int size) {
		String [][] retTab = new String[size][size];
		retTab[0][1] = "ab";
		retTab[0][3] = "ad";
		retTab[1][2] = "bc";
		retTab[1][4] = "be";
		retTab[2][3] = "cd";
		retTab[2][4] = "ce";
		retTab[3][5] = "df";
		retTab[4][6] = "eg";
		retTab[5][6] = "fg";
		retTab[5][7] = "fh";
		retTab[6][8] = "gi";
		retTab[7][8] = "hi";
		return retTab;
	}
}