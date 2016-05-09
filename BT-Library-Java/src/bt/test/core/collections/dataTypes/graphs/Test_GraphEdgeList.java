package bt.test.core.collections.dataTypes.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.dataTypes.LinkedList;
import bt.core.collections.dataTypes.graphs.Edge;
import bt.core.collections.dataTypes.graphs.Graph;
import bt.core.collections.dataTypes.graphs.GraphEdgeList;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_GraphEdgeList extends TestCase
{				
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTORandnumberOfEdges_mock_12()
	{
	    //arrange	    
	    Graph<Integer,String> inGraph = 
	    		new GraphEdgeList<>(getMock());
	    int expVal = 12;
	    int rcVal = -1;
	    
	    //act
	    rcVal = inGraph.numberOfEdges();
	    
	    //assert
	    assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTORandnumberOfEdges_null_0()
	{
	    //arrange	    
	    Graph<Integer,String> inGraph = 
	    		new GraphEdgeList<>(null);
	    int expVal = 0;
	    int rcVal = -1;
	    
	    //act
	    rcVal = inGraph.numberOfEdges();
	    
	    //assert
	    assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTORandnumberOfEdges_empty_0()
	{
	    //arrange	    
		Graph<Integer,String> inGraph = 
	    		new GraphEdgeList<>(new LinkedList());
	    int expVal = 0;
	    int rcVal = -1;
	    
	    //act
	    rcVal = inGraph.numberOfEdges();
	    
	    //assert
	    assertEquals(expVal, rcVal);
	}
	
	public LinkedList getMock() {
		LinkedList retVal = new LinkedList();
		retVal.add(new Edge<Integer,String>(0,1,"ab"));
		retVal.add(new Edge<Integer,String>(0,3,"ad"));
		retVal.add(new Edge<Integer,String>(1,4,"be"));
		retVal.add(new Edge<Integer,String>(1,2,"bc"));
		retVal.add(new Edge<Integer,String>(2,3,"cd"));
		retVal.add(new Edge<Integer,String>(2,4,"ce"));
		retVal.add(new Edge<Integer,String>(3,5,"df"));
		retVal.add(new Edge<Integer,String>(4,6,"eg"));
		retVal.add(new Edge<Integer,String>(5,6,"fg"));
		retVal.add(new Edge<Integer,String>(5,7,"fh"));
		retVal.add(new Edge<Integer,String>(6,8,"gi"));
		retVal.add(new Edge<Integer,String>(7,8,"hi"));
		return retVal;
	}
}