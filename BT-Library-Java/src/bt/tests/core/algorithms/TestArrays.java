package bt.tests.core.algorithms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.algorithms.Arrays;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestArrays extends TestCase
{				
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_sumValsOnMultiOfK_2_24()
	{
	    //arrange	    
	    int[][] chain = {
	    		{ 0,1,2,3 },
	    		{ 1,2,3,4 },
	    		{ 2,3,4,5 },
	    		{ 3,4,5,6 }};
	    
	    
	    int multipler = 2;
	    int expVal = 24;
	      
	    //act
	    int rcVal = Arrays.sumValsOnMultiOfK(chain, multipler);
	    
	    //assert
	    assertTrue(expVal == rcVal);
	}
}
