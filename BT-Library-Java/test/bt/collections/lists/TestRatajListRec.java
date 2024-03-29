package bt.collections.lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.lists.RatajList;
import bt.collections.lists.RatajListRec;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestRatajListRec extends TestCase {

//	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
//    @Test
//    public void test_CTOR_empty_true()
//    {
//    	// arrange
//    	int expSize = 0;
//    	RatajListRec list1 = new RatajListRec();
//    	
//    	// act
//    	
//    	// assert
//    	assertEquals(expSize, list1.size());
//    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_oneEl_true()
    {
    	// arrange
    	int expSize = 1;
    	RatajListRec list1 = new RatajListRec(0);
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    	assertEquals(list1.size(),expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_associateTwoLists_true()
    {
    	// arrange
    	RatajListRec list1 = new RatajListRec(0);
    	RatajListRec list2 = new RatajListRec(1,list1);
    	int expSize = 2;
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    	assertEquals(list2.size(),expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_sumStatic_null_Expect_0_true()
    {
    	// arrange
    	RatajListRec list1 = null;
    	int expVal = 0;
    	int rcVal = -1;
    	
    	// act
    	rcVal = RatajListRec.sum(list1);
   	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_sumStatic_1size_Expect_1_true()
    {
    	// arrange
    	RatajListRec list = new RatajListRec(1);
    	int expVal = 1;
    	int rcVal = -1;
    	
    	// act
    	rcVal = RatajListRec.sum(list);

    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_sumStatic_3size_Expect_6_true()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(1, 
    			new RatajListRec(2, 
    			new RatajListRec(3)));
    	int expVal = 6;
    	int rcVal = -1;
    	
    	// act
    	rcVal = RatajListRec.sum(list);
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
 
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_On1size_Expect_size2()
    {
    	// arrange
    	RatajListRec list = new RatajListRec(0);
    	int toAdd1 = 1;
    	int expVal = 2;
    	
    	// act
    	list.add(toAdd1);
    	
    	// assert
    	assertEquals(list.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_On2size_Expect_size3()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(0, 
    					new RatajListRec(1));
    	int expVal = 3;
    	int toAdd1 = 2;
    	    	
    	// act
    	list.add(toAdd1);
    	
    	// assert
    	assertEquals(list.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_size_On1size_Expect_1()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(0);
    	int expVal = 1;
    	int rcVal = -1;

    	// act
    	rcVal = list.size();
    	
    	// assert
    	assertEquals(rcVal, expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_size_On2size_Expect_2()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(0, 
    					new RatajListRec(1));
    	int expVal = 2;
    	int rcVal = -1;

    	// act
    	rcVal = list.size();
    	
    	// assert
    	assertEquals(rcVal, expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_size_On3size_Expect_3()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2)));
    	int expVal = 3;
    	int rcVal = -1;

    	// act
    	rcVal = list.size();
    	
    	// assert
    	assertEquals(rcVal, expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_sum_1size_Expect_1_true()
    {
    	// arrange
    	RatajListRec list1 = new RatajListRec(1);
    	int expVal = 1;
    	int rcVal = -1;
    	
    	// act
    	rcVal = list1.sum();
	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_sum_3size_Expect_6_true()
    {
    	// arrange
    	RatajListRec list1 = 
    			new RatajListRec(1, 
    			new RatajListRec(2, 
    			new RatajListRec(3)));
    	int expVal = 6;
    	int rcVal = -1;
    	
    	// act
    	rcVal = list1.sum();
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_On3size_Expect_size4()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2)));
    	int expVal = 4;
    	int toAdd1 = 3;

    	// act
    	list.add(toAdd1);
    	
    	// assert
    	assertEquals(list.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_deleteEvery2_size1_Expect_size1()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(0);
    	int expVal = 1;

    	// act
    	list.deleteEvery2();
    	
    	// assert
    	assertEquals(list.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_deleteEvery2_size3_Expect_size2()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2)));
    	int expVal = 2;

    	// act
    	list.deleteEvery2();
    	
    	// assert
    	assertEquals(list.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_deleteEvery2_size5_Expect_size3()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2,
    									new RatajListRec(3,
    											new RatajListRec(4)))));
    	int expVal = 3;

    	// act
    	list.deleteEvery2();
    	
    	// assert
    	assertEquals(list.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_copyStatic_3size_Expect_size3()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2)));
    	RatajListRec rcVal;
    	int expSize = 3;

    	// act
    	rcVal = RatajListRec.copy(list);
    	list.next = null;
    	
    	// assert
    	assertEquals(rcVal.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_copy_3size_Expect_size3()
    {
    	// arrange
    	RatajListRec list = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2)));
    	RatajListRec rcVal;
    	int expSize = 3;

    	// act
    	rcVal = list.copy();
    	list.next = null;
    	
    	// assert
    	assertEquals(rcVal.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_get_0val_On1size_true()
    {
    	// arrange
    	int expVal = 0;
    	int searchedVal = 0;
    	RatajListRec list = new RatajListRec(0);
    	int rcVal = -1;

    	// act
    	try {
    		rcVal = list.getElem(searchedVal).getVal();
    	}catch(NullPointerException e)
    	{
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_0val_On2size_true()
    {
    	// arrange
    	int expVal = 0;
    	int searchedVal = 0;
    	RatajListRec l1 = 
    			new RatajListRec(0,
    							new RatajListRec(1));
    	int rcVal = -1;
    	
    	// act
    	try {
    	rcVal = l1.getElem(searchedVal).getVal();
    	}catch(NullPointerException e)
    	{
    		rcVal = -1;
    	}

    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_1val_On2size_true()
    {
    	// arrange
    	int expVal = 1;
    	int searchedVal = 1;
    	RatajListRec l1 = 
    			new RatajListRec(0, 
    					new RatajListRec(1));
    	int rcVal = -1;
    	
    	// act
    	try {
    	rcVal = l1.getElem(searchedVal).getVal();
    	}catch(NullPointerException e)
    	{
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_2val_On2size_true()
    {
    	// arrange
    	int expVal = -1;
    	int searchedVal = 2;
    	RatajListRec l1 = 
    			new RatajListRec(0,
    					new RatajListRec(1));
    	int rcVal = -1;
    	
    	// act
    	try {
    		rcVal = l1.getElem(searchedVal).getVal();
		}catch(NullPointerException e)
		{
			rcVal = -1;
		}
    	

    	// assert
    	assertEquals(expVal,rcVal);
    }
     
    public void test_get_0val_On3size_true()
    {
    	// arrange
    	int expVal = 0;
    	int searchedVal = 0;
    	RatajListRec l1 = 
    			new RatajListRec(0,
    					new RatajListRec(1,
    							new RatajListRec(2)));
    	int rcVal = -1;
    	
    	// act
    	try {
    		rcVal = l1.getElem(searchedVal).getVal();
    	}catch(NullPointerException e)
    	{
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_1val_On3size_true()
    {
    	// arrange
    	int expVal = 1;
    	int searchedVal = 1;
    	RatajListRec l1 = 
    			new RatajListRec(0,
    					new RatajListRec(1,
    							new RatajListRec(2)));
    	int rcVal = -1;

    	// act
    	try {
    		rcVal = l1.getElem(searchedVal).getVal();
    	}catch(NullPointerException e)
    	{
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_2val_On3size_true()
    {
    	// arrange
    	int expVal = 2;
    	int searchedVal = 2;
    	RatajListRec l1 = 
    			new RatajListRec(0,
    					new RatajListRec(1,
    							new RatajListRec(2)));
    	int rcVal = -1;

    	// act
    	try {
    		rcVal = l1.getElem(searchedVal).getVal();
    	}catch(NullPointerException e)
    	{
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_4val_On3size_false()
    {
    	// arrange
    	int expVal = -1;
    	int searchedVal = 4;
    	RatajListRec l1 = 
    			new RatajListRec(0,
    					new RatajListRec(1,
    							new RatajListRec(2)));
    	int rcVal = -1;

    	// act
    	try {
    		rcVal = l1.getElem(searchedVal).getVal();
    	}catch(NullPointerException e)
    	{
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_0_On1size_Expect_size0()
    {
    	// arrange
    	RatajListRec list = new RatajListRec(0);
    	RatajListRec rcList = null;
    	int toDel = 0;
    	int expVal = -1;
    	int rcVal = -1;
    	
    	// act
    	rcList = list.delete(toDel);
    	try {
    		rcVal = rcList.size();
    	}catch(NullPointerException e) {
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(rcVal, expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_1_On1size_Expect_size1()
    {
    	// arrange
    	RatajListRec list = new RatajListRec(0);
    	RatajListRec rcList = null;
    	int toDel = 1;
    	int expVal = 1;
    	
    	// act
    	rcList = list.delete(toDel);
    	
    	// assert
    	assertEquals(list.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_1_On2size_Expect_size1()
    {
    	// arrange
    	RatajListRec l1 = 
    			new RatajListRec(0, 
    			new RatajListRec(1));
    	RatajListRec rcList = null;
    	int expVal = 1;
    	int toDel = 1;
    	
    	// act
    	rcList = l1.delete(toDel);
    	
    	// assert
    	assertEquals(rcList.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_1_On3size_Expect_size2()
    {
    	// arrange
    	RatajListRec l1 = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2)));
    	RatajListRec rcList = null;
    	int expVal = 2;
    	int toDel = 1;
    	
    	// act
    	rcList = l1.delete(toDel);
    	
    	// assert
    	assertEquals(rcList.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_4_On3size_Expect_size3()
    {
    	// arrange
    	RatajListRec l1 = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2)));
    	RatajListRec rcList = null;
    	int expVal = 3;
    	int toDel = 4;
    	
    	// act
    	rcList = l1.delete(toDel);
    	
    	// assert
    	assertEquals(rcList.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_append_4size_On3size_Expect_size7()
    {
    	// arrange
    	RatajListRec l1 = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2)));
    	
    	RatajListRec l2 = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2,new RatajListRec(3))));
    	
    	RatajListRec rcList = null;
    	int expVal = 7;
    	
    	// act
    	rcList = l1.append(l2);
    	
    	// assert
    	assertEquals(rcList.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_deleteEach2From1_on6size_Expect()
    {
    	// arrange
    	RatajListRec l1 = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2,
    									new RatajListRec(3,
    											new RatajListRec(4,
    													new RatajListRec(5))))));
    	
    	RatajListRec rcList = null;
    	int expVal = 7;
    	
    	// act
    	rcList = l1.deleteEach2From1(l1);
    	
    	// assert
    	RatajListRec.print(rcList);
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_revAndRetList_on6size_Descending_Expect_6size_Ascending()
    {
    	// arrange
    	RatajListRec expList = 
    			new RatajListRec(0, 
    					new RatajListRec(1, 
    							new RatajListRec(2,
    									new RatajListRec(3,
    											new RatajListRec(4,
    													new RatajListRec(5))))));
    	
    	int[] inTab = {5,4,3,2,1,0};
    	int inSize = 6;
    	RatajListRec rcList = null;
    	
    	// act
    	rcList = RatajListRec.revAndRetList(inTab);
    	
    	// assert
    	RatajListRec.print(rcList);
    	assertTrue(RatajListRec.equals(expList, rcList, inSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_revAndRetList_on1size_Descending_Expect_1size_Ascending()
    {
    	// arrange
    	RatajListRec expList = 
    			new RatajListRec(0);
    	
    	int[] inTab = {0};
    	int inSize = 1;
    	RatajListRec rcList = null;
    	
    	// act
    	rcList = RatajListRec.revAndRetList(inTab, inSize);
    	
    	// assert
    	RatajListRec.print(rcList);
    	assertTrue(RatajListRec.equals(expList, rcList, inSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_revAndRetList_null_Descending_Expect_null_Ascending()
    {
    	// arrange
    	RatajListRec expList = null;
    	
    	int[] inTab = {};
    	int inSize = 0;
    	RatajListRec rcList = null;
    	
    	// act
    	try {
    	rcList = RatajListRec.revAndRetList(inTab, inSize);
    	
    	// assert
    		RatajListRec.print(rcList);
    		assertTrue(RatajListRec.equals(expList, rcList, inSize));
    	}catch(NullPointerException e) {
    		assertTrue(true);
    	}
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_revAndRetList_on2Size_Descending_Expect_2Size_Ascending()
    {
    	// arrange
    	RatajListRec expList = new RatajListRec(1, new RatajListRec(0));
    	
    	int[] inTab = {0,1};
    	int inSize = 0;
    	RatajListRec rcList = null;
    	
    	// act
    	rcList = RatajListRec.revAndRetList(inTab, inSize);
    	
    	// assert
    	RatajListRec.print(rcList);
    	assertTrue(RatajListRec.equals(expList, rcList, inSize));
    }
}
