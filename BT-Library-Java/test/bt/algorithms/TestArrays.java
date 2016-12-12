package bt.algorithms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.Arrays;
import bt.algorithms.comparators.NaturalComparator;
import bt.algorithms.interfaces.ListOneElemSorter;
import bt.algorithms.sorting.InsertOneElementSort;
import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;
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
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_duplicate_123_0314_2223()
	{
	    //arrange	    
		List srcCollection = new ArrayList(3);
		List multiplierCollection = new ArrayList(4);
		
		List receivedTape = null;
		List expectedTape = new ArrayList(4);
		
		srcCollection.add(1);
		srcCollection.add(2);
		srcCollection.add(3);

		multiplierCollection.add(0);
		multiplierCollection.add(3);
		multiplierCollection.add(1);
		multiplierCollection.add(4);
		
		expectedTape.add(2);
		expectedTape.add(2);
		expectedTape.add(2);
		expectedTape.add(3);
			      
	    //act
		receivedTape = Arrays.duplicate( srcCollection, multiplierCollection);
	    
	    //assert
	    assertEquals(expectedTape,receivedTape);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_duplicate_1234_12_122()
	{
	    //arrange	    
		List srcCollection = new ArrayList(4);
		List multiplierCollection = new ArrayList(2);
		
		List receivedTape = null;
		List expectedTape = new ArrayList(3);
		
		srcCollection.add(1);
		srcCollection.add(2);
		srcCollection.add(3);
		srcCollection.add(4);

		multiplierCollection.add(1);
		multiplierCollection.add(2);
		
		expectedTape.add(1);
		expectedTape.add(2);
		expectedTape.add(2);
			      
	    //act
		receivedTape = Arrays.duplicate( srcCollection, multiplierCollection);
	    
	    //assert
	    assertEquals(expectedTape,receivedTape);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_duplicate_0_0314_0()
	{
	    //arrange	    
		List srcCollection = new ArrayList(1);
		List multiplierCollection = new ArrayList(4);
		
		List receivedTape = null;
		List expectedTape = new ArrayList(0);
		
		srcCollection.add(0);

		multiplierCollection.add(0);
		multiplierCollection.add(3);
		multiplierCollection.add(1);
		multiplierCollection.add(4);
			      
	    //act
		receivedTape = Arrays.duplicate( srcCollection, multiplierCollection);
	    
	    //assert
	    assertEquals(expectedTape,receivedTape);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_duplicate_12345_00000_0()
	{
	    //arrange	    
		List srcCollection = new ArrayList(5);
		List multiplierCollection = new ArrayList(5);
		
		List receivedTape = null;
		List expectedTape = new ArrayList(0);
		
		srcCollection.add(1);
		srcCollection.add(2);
		srcCollection.add(3);
		srcCollection.add(4);
		srcCollection.add(5);
		
		multiplierCollection.add(0);
		multiplierCollection.add(0);
		multiplierCollection.add(0);
		multiplierCollection.add(0);
		multiplierCollection.add(0);
		
	    //act
		receivedTape = Arrays.duplicate( srcCollection, multiplierCollection);
	    
	    //assert
	    assertEquals(expectedTape,receivedTape);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_duplicate_null_0314_null()
	{
	    //arrange	    
		List srcCollection = null;
		List multiplierCollection = new ArrayList(4);
		
		List receivedTape = null;
		List expectedTape = null;

		multiplierCollection.add(0);
		multiplierCollection.add(3);
		multiplierCollection.add(1);
		multiplierCollection.add(4);
			      
	    //act
		receivedTape = Arrays.duplicate( srcCollection, multiplierCollection);
	    
	    //assert
	    assertEquals(expectedTape,receivedTape);
	}
}
