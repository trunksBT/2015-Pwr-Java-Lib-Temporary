package bt.test.collections.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.graphs.DirtyEdgeDecorator;
import bt.collections.graphs.EdgeDecorator;
import bt.collections.graphs.Edge;
import bt.collections.interfaces.Edgable;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_DirtyEdgeDecorator extends TestCase
{			
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTOR_isDirty_From_0to1_wage_cat_False()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edgable<Integer,String> inEdge = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	    boolean rcLogic;
	      
	    //act
	    rcLogic = ((DirtyEdgeDecorator<Integer,String>)inEdge).isDirty();
	    
	    //assert
	    assertFalse(rcLogic);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_getStart_From_0to1_wage_cat_True()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edgable<Integer,String> inEdge = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	    int expVal = 0;
	    int rcVal = -1;
	      
	    //act
	    rcVal = inEdge.getStart();
	    
	    //assert
	    assertEquals(expVal , rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_isDirty_getStart_From_0to1_wage_cat_False()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edgable<Integer,String> inEdge = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	    int expVal = 0;
	    int rcVal = -1;
	    boolean rcLogic = false;
	      
	    //act
	    rcVal = inEdge.getStart();
	    rcLogic = ((DirtyEdgeDecorator<Integer,String>)inEdge).isDirty();
	    
	    //assert
	    assertEquals(expVal , rcVal);
	    assertFalse(rcLogic);
	}

	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_getEnd_From_0to1_wage_cat_True()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edgable<Integer,String> inEdge = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	    int expVal = 1;
	    int rcVal = -1;
	      
	    //act
	    rcVal = inEdge.getEnd();
	    
	    //assert
	    assertEquals(expVal , rcVal);
	}

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_workingWithPolymorphism()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    DirtyEdgeDecorator<Integer,String> inEdge = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	    Edgable<Integer,String> inEdge2 = inEdge;
	    //act
	    inEdge.getStart();
	    ((Edgable<Integer,String>)inEdge).getStart();
	    
	    
	    inEdge2.getStart();
	    ((EdgeDecorator<Integer,String>)inEdge2).getStart();
	    // Java object are made on references not on pointers, so after statically tying to object i 
	    // can't go up in class hierarchy
	    
	    //assert
	    assertTrue(true);
	}
	
//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//	@Test
//	public void test_isDirty_getEndFromFatherClass_From_0to1_wage_cat_False()
//	{
//	    //arrange	    
//	    int inStart = 0;	
//	    int inEnd = 1;
//	    String inWage = "cat";
//	    Edgable<Integer,String> inEdge = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
//	    EdgeDecorator<Integer,String> inEdge2 = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
//	    int expVal = 1;
//	    int rcVal = -1;
//	    boolean rcLogic;
//	      
//	    //act
//	    rcVal = ((EdgeDecorator<Integer,String>)inEdge);
//	    rcLogic = ((DirtyEdgeDecorator<Integer,String>)inEdge).isDirty();
//	    
//	    //assert
//	    assertEquals(expVal , rcVal);
//	    assertFalse(rcLogic);
//	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_getWeight_From_0to1_wage_cat_True()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edgable<Integer,String> inEdge = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	    String expVal = "cat";
	    String rcVal = null;
	      
	    //act
	    rcVal = inEdge.getWage();
	    
	    //assert
	    assertEquals(expVal , rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_setDirty_false_exp_false()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edgable<Integer,String> inEdge = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	    boolean rcLogic = false;
	    boolean inLogic = false;
	      
	    //act
	    ((DirtyEdgeDecorator<Integer,String>)inEdge).setDirty(inLogic);
	    rcLogic = ((DirtyEdgeDecorator<Integer,String>)inEdge).isDirty();
	    
	    //assert
	    assertFalse(rcLogic);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_setDirty_true_exp_true()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edgable<Integer,String> inEdge = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	    boolean rcLogic = true;
	    boolean inLogic = true;
	      
	    //act
	    ((DirtyEdgeDecorator<Integer,String>)inEdge).setDirty(inLogic);
	    rcLogic = ((DirtyEdgeDecorator<Integer,String>)inEdge).isDirty();
	    
	    //assert
	    assertTrue(rcLogic);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_toString_From_0to1_wage_cat_True()
	{
	    //arrange	    
	    int inStart = 0;	
	    int inEnd = 1;
	    String inWage = "cat";
	    Edgable<Integer,String> inEdge = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	      
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
	    Edgable<Integer,String> inEdge1 = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	    Edgable<Integer,String> inEdge2 = new DirtyEdgeDecorator<>(new Edge<>(inStart, inEnd, inWage));
	    boolean expVal = true;
	    boolean rcVal = true;
	      
	    //act
	    rcVal&= inEdge1.getStart() == inEdge2.getStart();
	    rcVal&= inEdge1.getEnd() == inEdge2.getEnd();
	    rcVal&= inEdge1.getWage() == inEdge2.getWage();
	    
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