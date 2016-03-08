package bt.tests.core.collections.dataTypes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.dataTypes.RatajElem;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestRatajList extends TestCase {

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_null_true()
    {
    	// arrange
    	RatajLista list1 = null;
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_1size_true()
    {
    	// arrange
    	RatajLista list1 = new RatajLista();
    	
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
    	RatajLista.druk(hd1);
    	
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
    	RatajLista.druk(hd1);
    	
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
    	RatajLista.druk(hd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_maxVal_null_true()
    {
    	// arrange
    	RatajElem hd1 = null;
    	RatajLista l1 = new RatajLista(hd1);
    	int expVal = -1;
    	int rcVal = -1;
    	
    	// act
    	try {
    		rcVal = l1.maxVal();
    	}finally {
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
    	RatajLista l1 = new RatajLista(hd1);
    	int expVal = 1;
    	int rcVal = -1;
    	
    	// act
    	try {
    		rcVal = l1.maxVal();
    	}finally {
    			
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
    	RatajLista l1 = new RatajLista(hd1);
    	int expVal = 3;
    	int rcVal = -1;
    	
    	// act
    	try {
    		rcVal = l1.maxVal();
    	}finally {
    			
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_Onnull_true()
    {
    	// arrange
    	RatajLista l1 = new RatajLista();
    	int expVal = -1;
    	int rcVal = -1;
    	int toAdd1 = 0;
    	
    	
    	// act
    	rcVal = l1.add(toAdd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_On1size_true()
    {
    	// arrange
    	RatajElem elem = new RatajElem(0, null);
    	RatajLista l1 = new RatajLista(elem);
    	int toAdd1 = 1;
    	
    	// act
    	rcVal = l1.add(toAdd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_On2size_true()
    {
    	// arrange
    	RatajElem elem = new RatajElem(0, new RatajElem(1, null));
    	RatajLista l1 = new RatajLista(elem);
    	int expVal = -1;
    	int rcVal = -1;
    	int toAdd1 = 2;
    	
    	
    	// act
    	rcVal = l1.add(toAdd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_On3size_true()
    {
    	// arrange
    	RatajElem elem = new RatajElem(0, new RatajElem(1, new RatajElem(2, null)));
    	RatajLista l1 = new RatajLista(elem);
    	int expVal = -1;
    	int rcVal = -1;
    	int toAdd1 = 3;
    	
    	
    	// act
    	rcVal = l1.add(toAdd1);
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_get_0_OnNull_true()
    {
    	// arrange
    	int expVal = -1;
    	int idx = 0;
    	RatajLista l1 = new RatajLista();
    	int rcVal = -1;
	
    	// act
    	try {
    		rcVal = l1.getElem(idx).val;
    	}finally {
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_get_0_On1size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int expVal = 0;
    	int idx = 0;
    	RatajLista l1 = new RatajLista(new RatajElem(yetAdded0));
    	int rcVal = -1;
    	
    	// act
    	// act
    	try {
    		rcVal = l1.getElem(idx).val;
    	}finally {
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_0_On2size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int expVal = 0;
    	int idx = 0;
    	RatajLista l1 = new RatajLista(new RatajElem(yetAdded0,new RatajElem(yetAdded1)));
    	int rcVal = -1;
    	
    	// act
    	// act
    	try {
    		rcVal = l1.getElem(idx).val;
    	}finally {
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_1_On2size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int expVal = 1;
    	int idx = 1;
    	RatajLista l1 = new RatajLista(new RatajElem(yetAdded0,new RatajElem(yetAdded1)));
    	int rcVal = -1;
    	
    	// act
    	// act
    	try {
    		rcVal = l1.getElem(idx).val;
    	}finally {
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_2_On2size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int expVal = -1;
    	int idx = 2;
    	RatajLista l1 = new RatajLista(new RatajElem(yetAdded0,new RatajElem(yetAdded1)));
    	int rcVal = -1;
    	
    	// act
    	// act
    	try {
    		rcVal = l1.getElem(idx).val;
    	}finally {
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    
    public void test_get_0_On3size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int yetAdded2 = 2;
    	int expVal = 0;
    	int idx = 0;
    	RatajLista l1 = new RatajLista(
    			new RatajElem(yetAdded0,
    					new RatajElem(yetAdded1,
    							new RatajElem(yetAdded2))));
    	int rcVal = -1;
    	
    	// act
    	// act
    	try {
    		rcVal = l1.getElem(idx).val;
    	}finally {
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_1_On3size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int yetAdded2 = 2;
    	int expVal = 1;
    	int idx = 1;
    	RatajLista l1 = new RatajLista(
    			new RatajElem(yetAdded0,
    					new RatajElem(yetAdded1,
    							new RatajElem(yetAdded2))));
    	int rcVal = -1;
    	
    	// act
    	// act
    	try {
    		rcVal = l1.getElem(idx).val;
    	}finally {
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_2_On3size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int yetAdded2 = 2;
    	int expVal = 2;
    	int idx = 2;
    	RatajLista l1 = new RatajLista(
    			new RatajElem(yetAdded0,
    					new RatajElem(yetAdded1,
    							new RatajElem(yetAdded2))));
    	int rcVal = -1;
    	
    	// act
    	// act
    	try {
    		rcVal = l1.getElem(idx).val;
    	}finally {
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
    
    public void test_get_3_On3size_true()
    {
    	// arrange
    	int yetAdded0 = 0;
    	int yetAdded1 = 1;
    	int yetAdded2 = 2;
    	int expVal = -1;
    	int idx = 2;
    	RatajLista l1 = new RatajLista(
    			new RatajElem(yetAdded0,
    					new RatajElem(yetAdded1,
    							new RatajElem(yetAdded2))));
    	int rcVal = -1;
    	
    	// act
    	// act
    	try {
    		rcVal = l1.getElem(idx).val;
    	}finally {
    		rcVal = -1;
    	}
    	
    	// assert
    	assertEquals(expVal,rcVal);
    }
}