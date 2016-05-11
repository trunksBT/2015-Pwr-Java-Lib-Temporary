package bt.test.algorithms.comparators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.comparators.EdgeStartComparator;
import bt.collections.graphs.Edge;
import bt.collections.interfaces.Edgable;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestEdgeStartComparator extends TestCase
{
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeStartComparator_01_CompareTo_Equals()
	{
	    //arrange
		int start0 = 0;
		int end0 = 1;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(start0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(start0,end0,wage);
		int expVal = 0;
		int rcVal = 0;
		
		//act
		rcVal = new EdgeStartComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeStartComparator_01y11_CompareTo_m1()
	{
	    //arrange
		int start0 = 0;
		int end0 = 1;
		int start1 = 1;
		int end1 = 1;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(start0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(start1,end1,wage);
		int expVal = -1;
		int rcVal = 0;
		
		//act
		rcVal = new EdgeStartComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeStartComparator_11y01_CompareTo_1()
	{
	    //arrange
		int start0 = 1;
		int end0 = 1;
		int start1 = 0;
		int end1 = 1;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(start0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(start1,end1,wage);
		int expVal = 1;
		int rcVal = 0;
		
		//act
		rcVal = new EdgeStartComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}
}
