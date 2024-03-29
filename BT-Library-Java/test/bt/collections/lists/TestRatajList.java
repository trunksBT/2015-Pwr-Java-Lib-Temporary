package bt.collections.lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.lists.RatajElem;
import bt.collections.lists.RatajList;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestRatajList extends TestCase {

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_null_true()
    {
    	// arrange
    	RatajList list1 = new RatajList();
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_1size_true()
    {
    	// arrange
    	RatajList list1 = new RatajList();
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_druk_null_true()
    {
    	// arrange
    	RatajElem hd1 = null;
    	
    	// act
    	RatajList.print(hd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_druk_1size_true()
    {
    	// arrange
    	RatajElem hd1 = new RatajElem(1, null);
    	
    	// act
    	RatajList.print(hd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_druk_3size_true()
    {
    	// arrange
    	RatajElem hd1 = new RatajElem(1, new RatajElem(2, new RatajElem(3, null)));
    	
    	// act
    	RatajList.print(hd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_maxVal_null_true()
    {
    	// arrange
    	RatajElem hd1 = null;
    	RatajList l1 = new RatajList(hd1);
    	int expVal = -1;
    	int rcVal = -1;
    	
    	// act
    	try {
    		rcVal = l1.maxVal();
    	}catch(NullPointerException e)
    	{
    		rcVal = -1;
    	}

    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_maxVal_1size_true()
    {
    	// arrange
    	RatajElem hd1 = new RatajElem(1, null);
    	RatajList l1 = new RatajList(hd1);
    	int expVal = 1;
    	int rcVal = -1;
    	
    	// act
    	try {
    		rcVal = l1.maxVal();
    	}catch(NullPointerException e)
    	{
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_maxVal_3size_true()
    {
    	// arrange
    	RatajElem hd1 = new RatajElem(1, new RatajElem(2, new RatajElem(3, null)));
    	RatajList l1 = new RatajList(hd1);
    	int expVal = 3;
    	int rcVal = -1;
    	
    	// act
    	try {
    		rcVal = l1.maxVal();
    	}catch(NullPointerException e)
    	{
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_Onnull_Expect_size1()
    {
    	// arrange
    	RatajList l1 = new RatajList();
    	int expVal = 1;
    	int toAdd1 = 0;
    		
    	// act
    	l1.add(toAdd1);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_On1size_Expect_size2()
    {
    	// arrange
    	RatajElem elem = new RatajElem(0, null);
    	RatajList l1 = new RatajList(elem);
    	int toAdd1 = 1;
    	int expVal = 2;
    	
    	// act
    	l1.add(toAdd1);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_On2size_Expect_size3()
    {
    	// arrange
    	RatajElem elem = new RatajElem(0, new RatajElem(1, null));
    	RatajList l1 = new RatajList(elem);
    	int expVal = 3;
    	int toAdd1 = 2;
    	    	
    	// act
    	l1.add(toAdd1);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_On3size_Expect_size4()
    {
    	// arrange
    	RatajElem elem = new RatajElem(0, new RatajElem(1, new RatajElem(2, null)));
    	RatajList l1 = new RatajList(elem);
    	int expVal = 4;
    	int toAdd1 = 3;

    	// act
    	l1.add(toAdd1);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_get_0val_OnNull_true()
    {
    	// arrange
    	int expVal = -1;
    	int searchedVal = 0;
    	RatajList l1 = new RatajList();
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
    public void test_get_0val_On1size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int expVal = 0;
    	int searchedVal = 0;
    	RatajList l1 = new RatajList(new RatajElem(yetAdded0));
    	int rcVal = -1;
    	
    	// actata
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
    
    public void test_get_0val_On2size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int expVal = 0;
    	int searchedVal = 0;
    	RatajList l1 = new RatajList(new RatajElem(yetAdded0,new RatajElem(yetAdded1)));
    	int rcVal = -1;
    	
    	// act
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
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int expVal = 1;
    	int searchedVal = 1;
    	RatajList l1 = new RatajList(new RatajElem(yetAdded0,new RatajElem(yetAdded1)));
    	int rcVal = -1;
    	
    	// act
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
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int expVal = -1;
    	int searchedVal = 2;
    	RatajList l1 = new RatajList(new RatajElem(yetAdded0,new RatajElem(yetAdded1)));
    	int rcVal = -1;
    	
    	// act
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
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int yetAdded2 = 2;
    	int expVal = 0;
    	int searchedVal = 0;
    	RatajList l1 = new RatajList(
    			new RatajElem(yetAdded0,
    					new RatajElem(yetAdded1,
    							new RatajElem(yetAdded2))));
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
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int yetAdded2 = 2;
    	int expVal = 1;
    	int searchedVal = 1;
    	RatajList l1 = new RatajList(
    			new RatajElem(yetAdded0,
    					new RatajElem(yetAdded1,
    							new RatajElem(yetAdded2))));
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
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int yetAdded2 = 2;
    	int expVal = 2;
    	int searchedVal = 2;
    	RatajList l1 = new RatajList(
    			new RatajElem(yetAdded0,
    					new RatajElem(yetAdded1,
    							new RatajElem(yetAdded2))));
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
    
    public void test_attachAfter_0_OnNullOrEmpty_Expect_size1()
    {
    	// arrange
    	int toAdd0 = 1;
    	int expSize = 1;
    	RatajList l1 = new RatajList(null);
    	
    	// act
    	l1.attachAfter(null,toAdd0);
    	
    	// assert
    	assertEquals(l1.size(), expSize);
    }
    
    public void test_attachAfter_0_On1size_Expect_size2()
    {
    	// arrange
    	int afterWhich = 0;
    	int toAdd0 = 1;
    	int expSize = 2;
    	RatajElem yetAdded0 = new RatajElem(afterWhich);
    	RatajList l1 = new RatajList(yetAdded0);
    	
    	// act
    	l1.attachAfter(yetAdded0,toAdd0);
    	
    	// assert
    	assertEquals(l1.size(), expSize);
    }
    
    public void test_attachAfter_0_On2size_Expect_size3()
    {
    	// arrange
    	int afterWhich = 0;
    	int toAdd0 = 2;
    	int expSize = 3;
    	RatajElem yetAdded0 = new RatajElem(afterWhich);
    	RatajElem yetAdded1 = new RatajElem(1);
    	yetAdded0.setNext(yetAdded1);
    	
    	RatajList l1 = new RatajList(yetAdded0);
    	
    	// act
    	l1.attachAfter(yetAdded0,toAdd0);
    	
    	// asser
    	assertEquals(l1.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_Onnull_Expect_size0()
    {
    	// arrange
    	RatajList l1 = new RatajList();
    	int expVal = 0;
    	int toDel = 0;
    		
    	// act
    	l1.delete(toDel);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_On1size_Expect_size0()
    {
    	// arrange
    	RatajElem elem = new RatajElem(0, null);
    	RatajList l1 = new RatajList(elem);
    	int toDel = 0;
    	int expVal = 0;
    	
    	// act
    	l1.delete(toDel);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_On1size_Expect_size1()
    {
    	// arrange
    	RatajElem elem = new RatajElem(0, null);
    	RatajList l1 = new RatajList(elem);
    	int toDel = 1;
    	int expVal = 1;
    	
    	// act
    	l1.delete(toDel);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_On2size_Expect_size1()
    {
    	// arrange
    	RatajElem elem = new RatajElem(0, new RatajElem(1, null));
    	RatajList l1 = new RatajList(elem);
    	int expVal = 1;
    	int toDel = 1;
    	
    	// act
    	l1.delete(toDel);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_On3size_Expect_size2()
    {
    	// arrange
    	RatajElem elem = new RatajElem(0, new RatajElem(1, new RatajElem(2, null)));
    	RatajList l1 = new RatajList(elem);
    	int expVal = 2;
    	int toDel = 1;
    	
    	// act
    	l1.delete(toDel);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
}