package bt.test.core.collections.dataTypes.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.dataTypes.GuardedLinkedListDouble;
import bt.core.collections.dataTypes.graphs.Edge;
import bt.core.collections.dataTypes.graphs.GraphEdgeList;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_GraphEdgeList extends TestCase
{				
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTOR()
	{
	    //arrange	    
//	    GraphEdgeList<Integer,String> inEdge1 = new GraphEdgeList(
//	    		new GuardedLinkedListDouble<>inStart, inEnd, inWage);
	    int expVal = 0;
	    int rcVal = -1;
	      
	    // not Work
	    //act
//	    rcVal = inEdge.getStart();
	    
	    //assert
	    assertEquals(expVal , rcVal);
	}
	
	GuardedLinkedListDouble getMock() {
		GuardedLinkedListDouble retVal = new GuardedLinkedListDouble();
		retVal.add(new Edge<Integer,String>(0,1,"a"));
		retVal.add(new Edge<Integer,String>(0,2,"b"));
		retVal.add(new Edge<Integer,String>(0,3,"c"));
		retVal.add(new Edge<Integer,String>(1,5,"d"));
		retVal.add(new Edge<Integer,String>(1,6,"e"));
		return retVal;
	}
}