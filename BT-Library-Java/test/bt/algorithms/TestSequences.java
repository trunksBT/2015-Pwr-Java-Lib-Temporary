package bt.algorithms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.Sequences;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSequences extends TestCase
{				
//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//	@Test
//	public void test_Null_Ascending_False()
//	{
//	    //arrange	    
//	    int[] chain = null;	
//	    boolean rcVal = true;
//	      
//	    //act
//	    try {
//	    	rcVal = Sequences.isNotAscending(chain,chain.length);
//	    }catch( NullPointerException e) {
//	    	rcVal = false;
//	    }
//	    
//	    //assert
//	    assertFalse(rcVal);
//	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_isNotAscending_Ascending_False()
	{
	    //arrange	    
	    int[] chain = {0,1,2,3,4};	    
	      
	    //act
	    boolean rcVal = Sequences.isNotAscending(chain,chain.length);
	    
	    //assert
	    assertFalse(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_isNotAscending_Descending1_True()
	{
	    //arrange	    
	    int[] chain = {4,3,2,1,0};	    
	      
	    //act
	    boolean rcVal = Sequences.isNotAscending(chain,chain.length);
	    
	    //assert
	    assertTrue(rcVal);
	}
	
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_isNotAscending_NotAscending1_True()
	{
	    //arrange	    
	    int[] chain = {4,3,3,2,0};	    
	      
	    //act
	    boolean rcVal = Sequences.isNotAscending(chain,chain.length);
	    
	    //assert
	    assertTrue(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_isNotAscending_NotAscending2_True()
	{
	    //arrange	    
	    int[] chain = {4,4,4,4,4};	    
	      
	    //act
	    boolean rcVal = Sequences.isNotAscending(chain,chain.length);
	    
	    //assert
	    assertTrue(rcVal);
	}
		
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_isNotAscending_NotAscending3_False()
	{
	    //arrange	    
	    int[] chain = {4,3,5,2,1};	    
	      
	    //act
	    boolean rcVal = Sequences.isNotAscending(chain,chain.length);
	    
	    //assert
	    assertFalse(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_isNotAscending_NotAscending4_False()
	{
	    //arrange	    
	    int[] chain = {4,5,3,2,3};	    
	      
	    //act
	    boolean rcVal = Sequences.isNotAscending(chain,chain.length);
	    
	    //assert
	    assertFalse(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_isNotAscending_Empty_True()
	{
	    //arrange	    
	    int[] chain = {};	    
	      
	    //act
	    boolean rcVal = Sequences.isNotAscending(chain,chain.length);
	    
	    //assert
	    assertTrue(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_isNotAscending_OneElement_True()
	{
	    //arrange	    
	    int[] chain = {1};	    
	      
	    //act
	    boolean rcVal = Sequences.isNotAscending(chain,chain.length);
	    
	    //assert
	    assertTrue(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_Null_False()
	{
	    //arrange	    
	    int[] chain = null;
	    boolean rcVal = true;
	      
	    //act
	    try {
	    	Sequences.amountOfZeroOnBegin(chain);
	    }catch(NullPointerException e) {
	    	rcVal = false;
	    }
	    
	    //assert
	    assertFalse(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_idxOfFirstNotZero_NoZeroOnStart_0()
	{
	    //arrange	    
	    int[] chain = {1,0,1,2};	
	    int expVal = 0;
	      
	    //act
	    int rcVal = Sequences.amountOfZeroOnBegin(chain);
	    
	    //assert
	    assertTrue(expVal == rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_idxOfFirstNotZero_OneZeroOnStart_1()
	{
	    //arrange	    
	    int[] chain = {0,1,2,};	
	    int expVal = 1;
	      
	    //act
	    int rcVal = Sequences.amountOfZeroOnBegin(chain);
	    
	    //assert
	    assertTrue(expVal == rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_idxOfFirstNotZero_FourZeroOnStart_4()
	{
	    //arrange	    
	    int[] chain = {0,0,0,0,1,2,};	
	    int expVal = 4;
	      
	    //act
	    int rcVal = Sequences.amountOfZeroOnBegin(chain);
	    
	    //assert
	    assertTrue(expVal == rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_idxOfFirstNotZero_TwoZeroOneTwoZeroOnStart_2()
	{
	    //arrange	    
	    int[] chain = {0,0,1,0,0,1,2,};	
	    int expVal = 2;
	      
	    //act
	    int rcVal = Sequences.amountOfZeroOnBegin(chain);
	    
	    //assert
	    assertTrue(expVal == rcVal);
	}
}
