package bt.collections.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.Sequences;
import bt.collections.graphs.Edge;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_Edge extends TestCase
{				
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_getStart_From_0to1_wage_cat_True()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edge<Integer,String> inEdge = new Edge<>(inStart, inEnd, inWage);
	    int expVal = 0;
	    int rcVal = -1;
	      
	    //act
	    rcVal = inEdge.getStart();
	    
	    //assert
	    assertEquals(expVal , rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_getEnd_From_0to1_wage_cat_True()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edge<Integer,String> inEdge = new Edge<>(inStart, inEnd, inWage);
	    int expVal = 1;
	    int rcVal = -1;
	      
	    //act
	    rcVal = inEdge.getEnd();
	    
	    //assert
	    assertEquals(expVal , rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_getWeight_From_0to1_wage_cat_True()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edge<Integer,String> inEdge = new Edge<>(inStart, inEnd, inWage);
	    String expVal = "cat";
	    String rcVal = null;
	      
	    //act
	    rcVal = inEdge.getWeight();
	    
	    //assert
	    assertEquals(expVal , rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_toString_From_0to1_wage_cat_True()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edge<Integer,String> inEdge = new Edge<>(inStart, inEnd, inWage);
	      
	    //act
	    System.out.println( inEdge );
	    
	    //assert
	    assertTrue(true);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_equals_From_0to1_wage_cat_True()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edge<Integer,String> inEdge1 = new Edge<>(inStart, inEnd, inWage);
	    Edge<Integer,String> inEdge2 = new Edge<>(inStart, inEnd, inWage);
	    boolean expVal = true;
	    boolean rcVal = false;
	      
	    //act
	    rcVal = inEdge1.equals(inEdge2);
	    
	    //assert
	    assertEquals(expVal , rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_hashCode_From_0to1_wage_cat_True()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edge<Integer,String> inEdge1 = new Edge<>(inStart, inEnd, inWage);
	    Edge<Integer,String> inEdge2 = new Edge<>(inStart, inEnd, inWage);
	    int rcVal1 = -1;
	    int rcVal2 = -1;
	      
	    //act
	    rcVal1 = inEdge1.hashCode();
	    rcVal2 = inEdge2.hashCode();
	    
	    //assert
	    assertEquals(rcVal1 , rcVal2);
	}
}