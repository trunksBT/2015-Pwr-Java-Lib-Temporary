package bt.tests.core.collections.dataTypes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.dataTypes.RatajElemCopy;
import bt.core.collections.dataTypes.RatajListCopy;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestRatajListCopy extends TestCase {

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_null_true()
    {
    	// arrange
    	RatajListCopy list1 = new RatajListCopy();
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_1size_true()
    {
    	// arrange
    	RatajListCopy list1 = new RatajListCopy();
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_druk_null_true()
    {
    	// arrange
    	RatajElemCopy hd1 = null;
    	
    	// act
    	RatajListCopy.print(hd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_druk_1size_true()
    {
    	// arrange
    	RatajElemCopy hd1 = new RatajElemCopy(1, null);
    	
    	// act
    	RatajListCopy.print(hd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_druk_3size_true()
    {
    	// arrange
    	RatajElemCopy hd1 = new RatajElemCopy(1, new RatajElemCopy(2, new RatajElemCopy(3, null)));
    	
    	// act
    	RatajListCopy.print(hd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_maxVal_null_true()
    {
    	// arrange
    	RatajElemCopy hd1 = null;
    	RatajListCopy l1 = new RatajListCopy(hd1);
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
    	RatajElemCopy hd1 = new RatajElemCopy(1, null);
    	RatajListCopy l1 = new RatajListCopy(hd1);
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
    	RatajElemCopy hd1 = new RatajElemCopy(1, new RatajElemCopy(2, new RatajElemCopy(3, null)));
    	RatajListCopy l1 = new RatajListCopy(hd1);
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
    	RatajListCopy l1 = new RatajListCopy();
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
    	RatajElemCopy elem = new RatajElemCopy(0, null);
    	RatajListCopy l1 = new RatajListCopy(elem);
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
    	RatajElemCopy elem = new RatajElemCopy(0, new RatajElemCopy(1, null));
    	RatajListCopy l1 = new RatajListCopy(elem);
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
    	RatajElemCopy elem = new RatajElemCopy(0, new RatajElemCopy(1, new RatajElemCopy(2, null)));
    	RatajListCopy l1 = new RatajListCopy(elem);
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
    	RatajListCopy l1 = new RatajListCopy();
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
    	RatajListCopy l1 = new RatajListCopy(new RatajElemCopy(yetAdded0));
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
    
    public void test_get_0val_On2size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int expVal = 0;
    	int searchedVal = 0;
    	RatajListCopy l1 = new RatajListCopy(new RatajElemCopy(yetAdded0,new RatajElemCopy(yetAdded1)));
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
    	RatajListCopy l1 = new RatajListCopy(new RatajElemCopy(yetAdded0,new RatajElemCopy(yetAdded1)));
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
    	RatajListCopy l1 = new RatajListCopy(new RatajElemCopy(yetAdded0,new RatajElemCopy(yetAdded1)));
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
    	RatajListCopy l1 = new RatajListCopy(
    			new RatajElemCopy(yetAdded0,
    					new RatajElemCopy(yetAdded1,
    							new RatajElemCopy(yetAdded2))));
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
    	RatajListCopy l1 = new RatajListCopy(
    			new RatajElemCopy(yetAdded0,
    					new RatajElemCopy(yetAdded1,
    							new RatajElemCopy(yetAdded2))));
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
    	RatajListCopy l1 = new RatajListCopy(
    			new RatajElemCopy(yetAdded0,
    					new RatajElemCopy(yetAdded1,
    							new RatajElemCopy(yetAdded2))));
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
    	int afterWhich = 0;
    	int toAdd0 = 1;
    	int expSize = 1;
    	RatajListCopy l1 = new RatajListCopy(null);
    	
    	// act
    	l1.attachAfter(null,toAdd0);
    	
    	// assert
    	assertEquals(l1.size(), expSize);
    }
    
    public void test_attachAfter_0_On1size_Expect_size2()
    {
    	// arrange
    	int toAdd0 = 1;
    	int expSize = 2;
    	RatajElemCopy yetAdded0 = new RatajElemCopy(0);
    	RatajListCopy l1 = new RatajListCopy(yetAdded0);
    	
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
    	RatajElemCopy yetAdded0 = new RatajElemCopy(afterWhich);
    	RatajElemCopy yetAdded1 = new RatajElemCopy(1);
    	yetAdded0.setNext(yetAdded1);
    	
    	RatajListCopy l1 = new RatajListCopy(yetAdded0);
    	
    	// act
    	l1.attachAfter(yetAdded0,toAdd0);
    	
    	// assert
    	assertEquals(l1.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_Onnull_Expect_size0()
    {
    	// arrange
    	RatajListCopy l1 = new RatajListCopy();
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
    	RatajElemCopy elem = new RatajElemCopy(0, null);
    	RatajListCopy l1 = new RatajListCopy(elem);
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
    	RatajElemCopy elem = new RatajElemCopy(0, null);
    	RatajListCopy l1 = new RatajListCopy(elem);
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
    	RatajElemCopy elem = new RatajElemCopy(0, new RatajElemCopy(1, null));
    	RatajListCopy l1 = new RatajListCopy(elem);
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
    	RatajElemCopy elem = new RatajElemCopy(0, new RatajElemCopy(1, new RatajElemCopy(2, null)));
    	RatajListCopy l1 = new RatajListCopy(elem);
    	int expVal = 2;
    	int toDel = 1;
    	
    	// act
    	l1.delete(toDel);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_fst_On3size_Expect_size2()
    {
    	// arrange
    	RatajElemCopy elem = new RatajElemCopy(0, new RatajElemCopy(1, new RatajElemCopy(2, null)));
    	RatajListCopy l1 = new RatajListCopy(elem);
    	int expVal = 2;
    	int toDel = 0;
    	
    	// act
    	l1.delete(toDel);
    	
    	// assert
    	assertEquals(l1.size(), expVal);
    }
}