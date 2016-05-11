package bt.test.algorithms.comparators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.comparators.EdgeComparator;
import bt.collections.graphs.Edge;
import bt.collections.interfaces.Edgable;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestEdgeComparator extends TestCase
{
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeComparator_01_CompareTo_Equals()
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
		rcVal = new EdgeComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeComparator_01y11_CompareTo_fstLower()
	{
	    //arrange
		int start0 = 0;
		int end0 = 1;
		int start1 = 1;
		int end1 = 1;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(start0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(start1,end1,wage);
		int rcVal = 0;
		boolean rcLogic;
		
		//act
		rcVal = new EdgeComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
		rcLogic = rcVal<0;
	    assertTrue(rcLogic);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeComparator_11y01_CompareTo_fstHigher()
	{
	    //arrange
		int start0 = 1;
		int end0 = 1;
		int start1 = 0;
		int end1 = 1;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(start0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(start1,end1,wage);
		int rcVal = 0;
		boolean rcLogic;
		
		//act
		rcVal = new EdgeComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
		rcLogic = rcVal>0;
	    assertTrue(rcLogic);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeComparator_12y13_CompareTo_fstLower()
	{
	    //arrange
		int start0 = 1;
		int end0 = 2;
		int start1 = 1;
		int end1 = 3;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(start0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(start1,end1,wage);
		int rcVal = 0;
		boolean rcLogic;
		
		//act
		rcVal = new EdgeComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
		rcLogic = rcVal<0;
	    assertTrue(rcLogic);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeComparator_18y10_CompareTo_fstHigher()
	{
	    //arrange
		int start0 = 1;
		int end0 = 8;
		int start1 = 1;
		int end1 = 0;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(start0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(start1,end1,wage);
		int rcVal = 0;
		boolean rcLogic;
		
		//act
		rcVal = new EdgeComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
		rcLogic = rcVal>0;
	    assertTrue(rcLogic);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_EdgeComparator_90y12_CompareTo_fstHigher()
	{
	    //arrange
		int start0 = 9;
		int end0 = 0;
		int start1 = 1;
		int end1 = 2;
		String wage = "aa";
		Edgable<Integer,String> val0 = new Edge<>(start0,end0,wage);
		Edgable<Integer,String> val1 = new Edge<>(start1,end1,wage);
		int rcVal = 0;
		boolean rcLogic;
		
		//act
		rcVal = new EdgeComparator<Integer, String>().compare(val0, val1);
	    
	    //assert
		rcLogic = rcVal>0;
	    assertTrue(rcLogic);
	}
}
