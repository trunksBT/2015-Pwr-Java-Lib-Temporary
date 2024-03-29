package bt.collections.trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.comparators.NaturalComparator;
import bt.collections.interfaces.Tree;
import bt.collections.trees.BST;
import bt.collections.trees.RatBST;
import bt.collections.trees.RatNode;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestRatBST extends TestCase {
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_empty_true()
    {
    	// arrange
    	RatNode root = getMockNotEmpty();
    	
    	// act
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_countInternalNodes_null_0()
    {
    	// arrange
    	RatNode tape = null;
    	int expVal = 0;
    	int recVal;
    	
    	// act
    	recVal = RatBST.countInternalNodes(tape);
    	
    	// assert
    	assertEquals(expVal, recVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_countInternalNodes_MockOneElement_1()
    {
    	// arrange
    	RatNode tape = getMockOneElement();
    	int expVal = 1;
    	int recVal;
    	
    	// act
    	recVal = RatBST.countInternalNodes(tape);
    	
    	// assert
    	assertEquals(expVal, recVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_countInternalNodes_MockNotEmpty_8()
    {
    	// arrange
    	RatNode tape = getMockNotEmpty();
    	int expVal = 8;
    	int recVal;
    	
    	// act
    	recVal = RatBST.countInternalNodes(tape);
    	
    	// assert
    	assertEquals(expVal, recVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_countExternalNodes_null_1()
    {
    	// arrange
    	RatNode tape = null;
    	int expVal = 1;
    	int recVal;
    	
    	// act
    	recVal = RatBST.countExternalNodes(tape);
    	
    	// assert
    	assertEquals(expVal, recVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_countExternalNodes_MockOneElement_2()
    {
    	// arrange
    	RatNode tape = getMockOneElement();
    	int expVal = 2;
    	int recVal;
    	
    	// act
    	recVal = RatBST.countExternalNodes(tape);
    	
    	// assert
    	assertEquals(expVal, recVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_countExternalNodes_MockNotEmpty_9()
    {
    	// arrange
    	RatNode tape = getMockNotEmpty();
    	int expVal = 9;
    	int recVal;
    	
    	// act
    	recVal = RatBST.countExternalNodes(tape);
    	
    	// assert
    	assertEquals(expVal, recVal);
    }
    
    
    
 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_countLeaves_null_0()
     {
     	// arrange
     	RatNode tape = null;
     	int expVal = 0;
     	int recVal;
     	
     	// act
     	recVal = RatBST.countLeaves(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
     }
     
 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_countLeaves_MockOneElement_1()
     {
     	// arrange
     	RatNode tape = getMockOneElement();
     	int expVal = 1;
     	int recVal;
     	
     	// act
     	recVal = RatBST.countLeaves(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
     }
     
 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_countLeaves_MockNotEmpty_4()
     {
     	// arrange
     	RatNode tape = getMockNotEmpty();
     	int expVal = 4;
     	int recVal;
     	
     	// act
     	recVal = RatBST.countLeaves(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
     }
     
  	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_height_null_m1()
     {
     	// arrange
     	RatNode tape = null;
     	int expVal = -1;
     	int recVal;
     	
     	// act
     	recVal = RatBST.height(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
     }
     
 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_height_MockOneElement_0()
     {
     	// arrange
     	RatNode tape = getMockOneElement();
     	int expVal = 0;
     	int recVal;
     	
     	// act
     	recVal = RatBST.height(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
     }
     
 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_height_MockNotEmpty_3()
     {
     	// arrange
     	RatNode tape = getMockNotEmpty();
     	int expVal = 3;
     	int recVal;
     	
     	// act
     	recVal = RatBST.height(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
     }
     
   	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_assignAndReturnAmountOfLowerNodes_null_0()
     {
     	// arrange
     	RatNode tape = null;
     	int expVal = 0;
     	int recVal;
     	
     	// act
//     	System.out.println( "TODO" );
     	recVal = RatBST.assignAndReturnAmountOfLowerNodes(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
//     	assertTrue(true);
     }
     
 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_assignAndReturnAmountOfLowerNodes_MockOneElement_0()
     {
     	// arrange
     	RatNode tape = getMockOneElement();
     	int expVal = 0;
     	int recVal;
     	
     	// act
//     	System.out.println( "TODO" );
     	recVal = RatBST.assignAndReturnAmountOfLowerNodes(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
//     	assertTrue(true);
     }
     
 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_assignAndReturnAmountOfLowerNodes_MockNotEmpty_4()
     {
     	// arrange
     	RatNode tape = getMockNotEmpty();
     	int expVal = 4;
     	int recVal;
     	
     	// act
//    	System.out.println( "TODO" );
     	recVal = RatBST.assignAndReturnAmountOfLowerNodes(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
//     	assertTrue(true);
     }
     
    	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_assignAmountOfInternalNodes_null_0()
     {
     	// arrange
     	RatNode tape = null;
     	int expVal = 0;
     	int recVal;
     	
     	// act
     	recVal = RatBST.assignAmountOfInternalNodes(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
     }
     
 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_assignAmountOfInternalNodes_MockOneElement_1()
     {
     	// arrange
     	RatNode tape = getMockOneElement();
     	int expVal = 1;
     	int recVal;
     	
     	// act
     	recVal = RatBST.assignAmountOfInternalNodes(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
     }
     
 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_assignAmountOfInternalNodes_MockNotEmpty_8()
     {
     	// arrange
     	RatNode tape = getMockNotEmpty();
     	int expVal = 8;
     	int recVal;
     	
     	// act
     	recVal = RatBST.assignAmountOfInternalNodes(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
     }
     
  	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
     @Test
     public void test_maxVal_MockNotEmpty_7()
     {
     	// arrange
     	RatNode tape = getMockNotEmpty();
     	int expVal = 7;
     	int recVal;
     	
     	// act
     	recVal = RatBST.maxVal(tape);
     	
     	// assert
     	assertEquals(expVal, recVal);
     }
     
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_preorder_Mock_4213657()
    {
    	// arrange
    	RatNode tape = getMockNotEmpty();
    	
    	// act
    	RatBST.preOrder(tape);
    	
    	// assert
    	assertTrue(true);
    }
    
    @Test
    public void test_postOrderReversed_Mock_4213657()
    {
    	// arrange
    	RatNode tape = getMockNotEmpty();
    	
    	// act
    	RatBST.postOrderRev(tape);
    	
    	// assert
    	assertTrue(true);
    }
    
    @Test
    public void test_postOrder_Mock_4213657()
    {
    	// arrange
    	RatNode tape = getMockNotEmpty();
    	
    	// act
    	RatBST.postOrder(tape);
    	
    	// assert
    	assertTrue(true);
    }
    
    public RatNode getMockNotEmpty() {
    	return 						new RatNode(4,
    					new RatNode(2,
    				new RatNode(1, 
    	new RatNode(0),null),new RatNode(3)),
    											new RatNode(6,
    										new RatNode(5), new RatNode(7)));
    }// lwp 01234567
    
    public RatNode getMockOneElement() {
    	return new RatNode(4);
    }
}
