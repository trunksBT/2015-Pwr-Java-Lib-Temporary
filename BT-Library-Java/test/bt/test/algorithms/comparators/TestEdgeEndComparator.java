package bt.test.algorithms.comparators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.comparators.EdgeEndComparator;
import bt.collections.graphs.Edge;
import bt.collections.interfaces.Edgable;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestEdgeEndComparator extends TestCase
{
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeEndComparator_01_CompareTo_Equals()
	{
	    //arrange
		int End0 = 0;
		int end0 = 1;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(End0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(End0,end0,wage);
		int expVal = 0;
		int rcVal = 0;
		
		//act
		rcVal = new EdgeEndComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeEndComparator_01y11_CompareTo_Equals()
	{
	    //arrange
		int End0 = 0;
		int end0 = 1;
		int End1 = 1;
		int end1 = 1;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(End0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(End1,end1,wage);
		int expVal = 0;
		int rcVal = 0;
		
		//act
		rcVal = new EdgeEndComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeEndComparator_10y01_CompareTo_m1()
	{
	    //arrange
		int End0 = 1;
		int end0 = 0;
		int End1 = 0;
		int end1 = 1;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(End0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(End1,end1,wage);
		int expVal = -1;
		int rcVal = 0;
		
		//act
		rcVal = new EdgeEndComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeEndComparator_11y10_CompareTo_1()
	{
	    //arrange
		int End0 = 1;
		int end0 = 1;
		int End1 = 1;
		int end1 = 0;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(End0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(End1,end1,wage);
		int expVal = 1;
		int rcVal = 0;
		
		//act
		rcVal = new EdgeEndComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}
}
