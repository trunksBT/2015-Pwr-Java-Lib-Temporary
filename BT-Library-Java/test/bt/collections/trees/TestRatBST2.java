//package bt.collections.trees;
//
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import bt.collections.trees.RatBST2;
//import bt.collections.trees.RatNode2;
//import junit.framework.TestCase;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//
//public class TestRatBST2 extends TestCase {
//	
//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//    @Test
//    public void test_CTOR_empty_true()
//    {
//    	// arrange
//    	RatNode2 root = getMockNotEmpty();
//    	
//    	// act
//    	// assert
//    	assertTrue(true);
//    }
//    
//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//    @Test
//    public void test_countInternalNodes_null_0()
//    {
//    	// arrange
//    	RatNode2 tape = null;
//    	int expVal = 0;
//    	int recVal;
//    	
//    	// act
//    	recVal = RatBST2.countInternalNodes(tape);
//    	
//    	// assert
//    	assertEquals(expVal, recVal);
//    }
//    
//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//    @Test
//    public void test_countInternalNodes_MockOneElement_1()
//    {
//    	// arrange
//    	RatNode2 tape = getMockOneElement();
//    	int expVal = 1;
//    	int recVal;
//    	
//    	// act
//    	recVal = RatBST2.countInternalNodes(tape);
//    	
//    	// assert
//    	assertEquals(expVal, recVal);
//    }
//    
//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//    @Test
//    public void test_countInternalNodes_MockNotEmpty_8()
//    {
//    	// arrange
//    	RatNode2 tape = getMockNotEmpty();
//    	int expVal = 8;
//    	int recVal;
//    	
//    	// act
//    	recVal = RatBST2.countInternalNodes(tape);
//    	
//    	// assert
//    	assertEquals(expVal, recVal);
//    }
//    
//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//    @Test
//    public void test_countExternalNodes_null_1()
//    {
//    	// arrange
//    	RatNode2 tape = null;
//    	int expVal = 1;
//    	int recVal;
//    	
//    	// act
//    	recVal = RatBST2.countExternalNodes(tape);
//    	
//    	// assert
//    	assertEquals(expVal, recVal);
//    }
//    
//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//    @Test
//    public void test_countExternalNodes_MockOneElement_2()
//    {
//    	// arrange
//    	RatNode2 tape = getMockOneElement();
//    	int expVal = 2;
//    	int recVal;
//    	
//    	// act
//    	recVal = RatBST2.countExternalNodes(tape);
//    	
//    	// assert
//    	assertEquals(expVal, recVal);
//    }
//    
//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//    @Test
//    public void test_countExternalNodes_MockNotEmpty_9()
//    {
//    	// arrange
//    	RatNode2 tape = getMockNotEmpty();
//    	int expVal = 9;
//    	int recVal;
//    	
//    	// act
//    	recVal = RatBST2.countExternalNodes(tape);
//    	
//    	// assert
//    	assertEquals(expVal, recVal);
//    }
//    
// 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_countLeaves_null_0()
//     {
//     	// arrange
//     	RatNode2 tape = null;
//     	int expVal = 0;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.countLeaves(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
// 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_countLeaves_MockOneElement_1()
//     {
//     	// arrange
//     	RatNode2 tape = getMockOneElement();
//     	int expVal = 1;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.countLeaves(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
// 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_countLeaves_MockNotEmpty_4()
//     {
//     	// arrange
//     	RatNode2 tape = getMockNotEmpty();
//     	int expVal = 4;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.countLeaves(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
//  	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_height_null_m1()
//     {
//     	// arrange
//     	RatNode2 tape = null;
//     	int expVal = -1;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.height(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
// 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_height_MockOneElement_0()
//     {
//     	// arrange
//     	RatNode2 tape = getMockOneElement();
//     	int expVal = 0;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.height(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
// 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_height_MockNotEmpty_3()
//     {
//     	// arrange
//     	RatNode2 tape = getMockNotEmpty();
//     	int expVal = 3;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.height(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
//   	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_assignAndReturnAmountOfLowerNodes_null_0()
//     {
//     	// arrange
//     	RatNode2 tape = null;
//     	int expVal = 0;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.assignAndReturnAmountOfLowerNodes(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
////     	assertTrue(true);
//     }
//     
// 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_assignAndReturnAmountOfLowerNodes_MockOneElement_0()
//     {
//     	// arrange
//     	RatNode2 tape = getMockOneElement();
//     	int expVal = 0;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.assignAndReturnAmountOfLowerNodes(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
////     	assertTrue(true);
//     }
//     
// 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_assignAndReturnAmountOfLowerNodes_MockNotEmpty_4()
//     {
//     	// arrange
//     	RatNode2 tape = getMockNotEmpty();
//     	int expVal = 4;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.assignAndReturnAmountOfLowerNodes(tape);
//     	
//     	// assert
////     	assertTrue(true);
//     }
//     
//    //Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_assignAmountOfInternalNodes_null_0()
//     {
//     	// arrange
//     	RatNode2 tape = null;
//     	int expVal = 0;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.assignAmountOfInternalNodes(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
// 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_assignAmountOfInternalNodes_MockOneElement_1()
//     {
//     	// arrange
//     	RatNode2 tape = getMockOneElement();
//     	int expVal = 1;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.assignAmountOfInternalNodes(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
// 	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_assignAmountOfInternalNodes_MockNotEmpty_8()
//     {
//     	// arrange
//     	RatNode2 tape = getMockNotEmpty();
//     	int expVal = 8;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.assignAmountOfInternalNodes(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
//  	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_maxVal_MockNotEmpty_7()
//     {
//     	// arrange
//     	RatNode2 tape = getMockNotEmpty();
//     	int expVal = 7;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.maxVal(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
//   	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_maxVal_MockOneElement_4()
//     {
//     	// arrange
//     	RatNode2 tape = getMockOneElement();
//     	int expVal = 4;
//     	int recVal;
//     	
//     	// act
//     	recVal = RatBST2.maxVal(tape);
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
//    //Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//     @Test
//     public void test_maxVal_MockNull_4()
//     {
//     	// arrange
//     	RatNode2 tape = null;
//     	int expVal = -1;
//     	int recVal;
//     	
//     	// act
//     	try {
//     		recVal = RatBST2.maxVal(tape);
//     	}catch(NullPointerException e) {
//     		recVal = -1;
//     	}
//     	
//     	// assert
//     	assertEquals(expVal, recVal);
//     }
//     
//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//    @Test
//    public void test_preorder_Mock_4213657()
//    {
//    	// arrange
//    	RatNode2 tape = getMockNotEmpty();
//    	
//    	// act
//    	RatBST2.preorder(tape);
//    	
//    	// assert
//    	assertTrue(true);
//    }
//    
//    public RatNode2 getMockNotEmpty() {
//    	return 						new RatNode2(4,
//    					new RatNode2(2,
//    				new RatNode2(1, 
//    	new RatNode2(0),null),new RatNode2(3)),
//    											new RatNode2(6,
//    										new RatNode2(5), new RatNode2(7)));
//    }// lwp 01234567
//    
//    public RatNode2 getMockOneElement() {
//    	return new RatNode2(4);
//    }
//}
