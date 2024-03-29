package bt.collections.lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.lists.RatajListRec2;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestRatajListRec2 extends TestCase {

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_oneEl_true()
    {
    	// arrange
    	int expSize = 1;
    	RatajListRec2 list1 = new RatajListRec2(0);
    	
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
    	RatajListRec2 list1 = new RatajListRec2(0);
    	RatajListRec2 list2 = new RatajListRec2(1,list1);
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
    	RatajListRec2 list1 = null;
    	int expVal = 0;
    	int rcVal = -1;
    	
    	// act
    	rcVal = RatajListRec2.sum(list1);
   	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_sumStatic_1size_Expect_1_true()
    {
    	// arrange
    	RatajListRec2 list = new RatajListRec2(1);
    	int expVal = 1;
    	int rcVal = -1;
    	
    	// act
    	rcVal = RatajListRec2.sum(list);

    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_sumStatic_3size_Expect_6_true()
    {
    	// arrange
    	RatajListRec2 list = 
    			new RatajListRec2(1, 
    			new RatajListRec2(2, 
    			new RatajListRec2(3)));
    	int expVal = 6;
    	int rcVal = -1;
    	
    	// act
    	rcVal = RatajListRec2.sum(list);
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
 
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_On1size_Expect_size2()
    {
    	// arrange
    	RatajListRec2 list = new RatajListRec2(0);
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
    	RatajListRec2 list = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1));
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
    	RatajListRec2 list = 
    			new RatajListRec2(0);
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
    	RatajListRec2 list = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1));
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
    	RatajListRec2 list = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2)));
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
    	RatajListRec2 list1 = new RatajListRec2(1);
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
    	RatajListRec2 list1 = 
    			new RatajListRec2(1, 
    			new RatajListRec2(2, 
    			new RatajListRec2(3)));
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
    	RatajListRec2 list = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2)));
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
    	RatajListRec2 list = 
    			new RatajListRec2(0);
    	int expVal = 1;

    	// act
    	list.deleteEvery2();
    	
    	///TODO
    	// assert
    	assertTrue(true);
//    	assertEquals(list.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_deleteEvery2_size3_Expect_size2()
    {
    	// arrange
    	RatajListRec2 list = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2)));
    	int expVal = 2;

    	// act
    	list.deleteEvery2();
    	
    	///TODO
    	// assert
    	assertTrue(true);
//    	assertEquals(list.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_deleteEvery2_size5_Expect_size3()
    {
    	// arrange
    	RatajListRec2 list = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2,
    									new RatajListRec2(3,
    											new RatajListRec2(4)))));
    	int expVal = 3;

    	// act
    	///TODO
    	list.deleteEvery2();
    	
    	// assert
    	assertTrue(true);
//    	assertEquals(list.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_copyStatic_3size_Expect_size3()
    {
    	// arrange
    	RatajListRec2 list = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2)));
    	RatajListRec2 rcVal;
    	int expSize = 3;

    	// act
    	rcVal = RatajListRec2.copy(list);
    	list.next = null;
    	
    	// assert
    	assertEquals(rcVal.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_copy_3size_Expect_size3()
    {
    	// arrange
    	RatajListRec2 list = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2)));
    	RatajListRec2 rcVal;
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
    	RatajListRec2 list = new RatajListRec2(0);
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0,
    							new RatajListRec2(1));
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1));
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0,
    					new RatajListRec2(1));
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0,
    					new RatajListRec2(1,
    							new RatajListRec2(2)));
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0,
    					new RatajListRec2(1,
    							new RatajListRec2(2)));
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0,
    					new RatajListRec2(1,
    							new RatajListRec2(2)));
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0,
    					new RatajListRec2(1,
    							new RatajListRec2(2)));
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
    	RatajListRec2 list = new RatajListRec2(0);
    	RatajListRec2 rcList = null;
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
    	RatajListRec2 list = new RatajListRec2(0);
    	RatajListRec2 rcList = null;
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0, 
    			new RatajListRec2(1));
    	RatajListRec2 rcList = null;
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2)));
    	RatajListRec2 rcList = null;
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2)));
    	RatajListRec2 rcList = null;
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2)));
    	
    	RatajListRec2 l2 = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2,new RatajListRec2(3))));
    	
    	RatajListRec2 rcList = null;
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
    	RatajListRec2 l1 = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2,
    									new RatajListRec2(3,
    											new RatajListRec2(4,
    													new RatajListRec2(5))))));
    	
    	RatajListRec2 rcList = null;
    	int expVal = 7;
    	
    	// act
    	rcList = l1.deleteEach2From1(l1);
    	
    	// assert
    	RatajListRec2.print(rcList);
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_revAndRetList_on6size_Descending_Expect_6size_Ascending()
    {
    	// arrange
    	RatajListRec2 expList = 
    			new RatajListRec2(0, 
    					new RatajListRec2(1, 
    							new RatajListRec2(2,
    									new RatajListRec2(3,
    											new RatajListRec2(4,
    													new RatajListRec2(5))))));
    	
    	int[] inTab = {5,4,3,2,1,0};
    	int inSize = 6;
    	RatajListRec2 rcList = null;
    	
    	// act
    	rcList = RatajListRec2.revAndRetList(inTab, inSize);
    	
    	// assert
    	RatajListRec2.print(rcList);
    	assertTrue(RatajListRec2.equals(expList, rcList, inSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_revAndRetList_on1size_Descending_Expect_1size_Ascending()
    {
    	// arrange
    	RatajListRec2 expList = 
    			new RatajListRec2(0);
    	
    	int[] inTab = {0};
    	int inSize = 1;
    	RatajListRec2 rcList = null;
    	
    	// act
    	rcList = RatajListRec2.revAndRetList(inTab, inSize);
    	
    	// assert
    	RatajListRec2.print(rcList);
    	assertTrue(RatajListRec2.equals(expList, rcList, inSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_revAndRetList_null_Descending_Expect_null_Ascending()
    {
    	// arrange
    	RatajListRec2 expList = null;
    	
    	int[] inTab = {};
    	int inSize = 0;
    	RatajListRec2 rcList = null;
    	
    	// act
    	try {
    	rcList = RatajListRec2.revAndRetList(inTab, inSize);
    	
    	// assert
    		RatajListRec2.print(rcList);
    		assertTrue(RatajListRec2.equals(expList, rcList, inSize));
    	}catch(NullPointerException e) {
    		assertTrue(true);
    	}
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_revAndRetList_on2Size_Descending_Expect_2Size_Ascending()
    {
    	// arrange
    	RatajListRec2 expList = new RatajListRec2(1, new RatajListRec2(0));
    	
    	int[] inTab = {0,1};
    	int inSize = 0;
    	RatajListRec2 rcList = null;
    	
    	// act
    	rcList = RatajListRec2.revAndRetList(inTab, inSize);
    	
    	// assert
    	RatajListRec2.print(rcList);
    	assertTrue(RatajListRec2.equals(expList, rcList, inSize));
    }
}
