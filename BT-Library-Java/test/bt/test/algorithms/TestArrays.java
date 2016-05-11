package bt.test.algorithms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.Arrays;
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
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_sumValsOnMultiOfK_KmoreThanTwiceOfSizeOfTable_0()
	{
	    //arrange	    
	    int[][] chain = {
	    		{ 0,1,2,3 },
	    		{ 1,2,3,4 },
	    		{ 2,3,4,5 },
	    		{ 3,4,5,6 }};
	    
	    
	    int multipler = 8;
	    int expVal = 0;
	      
	    //act
	    int rcVal = Arrays.sumValsOnMultiOfK(chain, multipler);
	    
	    //assert
	    assertTrue(expVal == rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_sumValsOnMultiOfK_1_48()
	{
	    //arrange	    
	    int[][] chain = {
	    		{ 0,1,2,3 },
	    		{ 1,2,3,4 },
	    		{ 2,3,4,5 },
	    		{ 3,4,5,6 }};
	    
	    
	    int multipler = 1;
	    int expVal = 48;
	      
	    //act
	    int rcVal = Arrays.sumValsOnMultiOfK(chain, multipler);
	    
	    //assert
	    assertTrue(expVal == rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_sumValsOnMultiOfK_3_30()
	{
	    //arrange	    
	    int[][] chain = {
	    		{ 0,1,2,3,4 },
	    		{ 1,2,3,4,5 },
	    		{ 2,3,4,5,6 },
	    		{ 3,4,5,6,7 },
	    		{ 4,5,6,7,8 }};
	    
	    
	    int multipler = 3;
	    int expVal = 30;
	      
	    //act
	    int rcVal = Arrays.sumValsOnMultiOfK(chain, multipler);
	    
	    //assert
	    assertTrue(expVal == rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_null_3_Exception()
	{
	    //arrange	    
	    int[][] chain = null;
	    
	    int multipler = 3;
	    boolean endVal = true;
	      
	    //act
	    try
	    {
	    	int rcVal = Arrays.sumValsOnMultiOfK(chain, multipler);
	    }catch(NullPointerException e)
	    {
	    	endVal = false;
	    }
	    
	    //assert
	    assertFalse(endVal);
	}
}
