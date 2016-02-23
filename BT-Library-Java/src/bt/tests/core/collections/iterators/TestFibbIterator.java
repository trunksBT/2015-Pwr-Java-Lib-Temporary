package bt.tests.core.collections.iterators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.iterators.FibIterator;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFibbIterator extends TestCase
{				
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTOR_FibIterator_Fst_True()
	{
	    //arrange	    
	    FibIterator it = new FibIterator(34);
	    boolean expBool = true;
	    int expVal = 0;
	    int rcVal;
	      
	    //act
	    it.first();
	    rcVal = (int) it.current();
	    boolean rcBool = rcVal == expVal;
	    
	    //assert
	    boolean result = !(expBool ^ rcBool);
	    assertTrue(result);
	}	

	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_WhileLoopNext_0()
	{
	    //arrange	    
	    FibIterator it = new FibIterator(0);
	    boolean expBool = true;
	    int expVal = 0;
	    int rcVal = 0;
	    int i = 0;
	      
	    //act
	    it.first();
	    while(!it.isDone()) {
	    	rcVal = (int) it.current();
	    	it.next();
	    	System.out.println( "I: "+ i++ + " val: " + rcVal);
	    }
	    
	    //assert
	    boolean rcBool = rcVal == expVal;
	    boolean result = !(expBool ^ rcBool);
	    assertTrue(result);
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_WhileLoopNext_1()
	{
	    //arrange	    
	    FibIterator it = new FibIterator(1);
	    it.first();
	    boolean expBool = true;
	    int expVal = 0;
	    int rcVal = 0;
	    int i = 0;
	      
	    //act
	    while(!it.isDone()) {
	    	rcVal = (int) it.current();
	    	it.next();
	    	System.out.println( "I: "+ i++ + " val: " + rcVal);
	    }
	    
	    //assert
	    boolean rcBool = rcVal == expVal;
	    boolean result = !(expBool ^ rcBool);
	    assertTrue(result);
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_WhileLoopNext_35()
	{
	    //arrange	    
	    FibIterator it = new FibIterator(35);
	    boolean expBool = true;
	    int expVal = 34;
	    int rcVal = 0;
	    int i = 0;
	      
	    //act
	    it.first();
	    while(!it.isDone()) {
	    	rcVal = (int) it.current();
	    	it.next();
	    	System.out.println( "I: "+ i++ + " val: " + rcVal);
	    }
	    
	    //assert
	    boolean rcBool = rcVal == expVal;
	    boolean result = !(expBool ^ rcBool);
	    assertTrue(result);
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_WhileLoopPrevious_Step2_True()
	{
	    //arrange
	    

	    
	    assertTrue(true);
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_ForLoopNext_Step2_True()
	{
	    //arrange

	    
	    assertTrue(true);	
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_ForLoopPrevious_Step2_True()
	{
	    //arrange

	    
	    assertTrue(true);	
	}
}
