package bt.test.collections.iterators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.iterators.PrimeIterator;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestPrimeIter extends TestCase
{				
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTOR_limes_d0_u12_Expect_0_True()
	{
	    //arrange	    
		int downLim = 0;
		int upLim = 12;
	    PrimeIterator it = new PrimeIterator(downLim, upLim);
	    boolean expBool = true;
	    int expVal = 0;
	    int rcVal = 0;
	      
	    //act
	    it.first();
	    rcVal = (int) it.current();
	    boolean rcBool = rcVal == expVal;
	    
	    //assert
	    boolean result = !(expBool ^ rcBool);
	    assertTrue(result);
	}	

	@Test
	public void test_NextOneTime_limes_d0_u11_Expect_1_True()
	{
	    //arrange	    
		int downLim = 0;
		int upLim = 0;
	    PrimeIterator it = new PrimeIterator(downLim, upLim);
	    boolean expBool = true;
	    int expVal = 1;
	    int rcVal = 0;
	    int i = 0;
	      
	    //act
	    it.first();
	    it.next();
	    rcVal = (int) it.current();
	    
	    //assert
	    boolean rcBool = rcVal == expVal;
	    boolean result = !(expBool ^ rcBool);
	    assertTrue(result);
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_WhileLoopNext_limes_d0_u12_Expect_11_True()
	{
	    //arrange	    
		int downLim = 0;
		int upLim = 12;
	    PrimeIterator it = new PrimeIterator(downLim, upLim);
	    
	    int expVal = 11;
	    boolean expBool = true;
	    
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
	public void test_WhileLoopNext_limes_d0_u11_Expect_11_True()
	{
	    //arrange	  
		int downLim = 0;
		int upLim = 11;
	    PrimeIterator it = new PrimeIterator(downLim, upLim);
	    boolean expBool = true;
	    int expVal = 11;
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
}
