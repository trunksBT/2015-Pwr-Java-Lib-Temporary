package bt.tests.core.collections.dataTypes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.dataTypes.ArrayList;
import bt.core.collections.interfaces.List;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestArrayList extends TestCase {
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_emptyList_size0()
    {
    	// arrange
    	List tape = new ArrayList();
    	int expSize = 0;
    	
    	// act
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_emptyList_size1()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(0);
    	int expSize = 1;
    	
    	// act
    	tape.add(toAdd1);
    	
    	// assert
    	assertSame(toAdd1, tape.get(0));
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_NotEmptyList_size2()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(0);
    	int expSize = 2;
    	
    	// act
    	tape.add(new Integer(1));
    	tape.add(toAdd1);
    	
    	// assert
    	assertSame(toAdd1, tape.get(1));
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_add_NotEmptyList_size3()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(0);
    	int expSize = 3;
    	
    	// act
    	tape.add(new Integer(1));
    	tape.add(new Integer(2));
    	tape.add(toAdd1);
    	
    	// assert
    	assertSame(toAdd1, tape.get(2));
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_clear_notEmpty_size0()
    {
    	// arrange
    	List tape = new ArrayList();
    	int expSize = 0;
    	
    	// act
    	tape.add(new Integer(1));
    	tape.add(new Integer(2));
    	tape.clear();
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_clear_empty_size0()
    {
    	// arrange
    	List tape = new ArrayList();
    	int expSize = 0;
    	
    	// act
    	tape.clear();
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_contains_empty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer searchedVal = new Integer(0);
    	boolean rcVal = false;
    	
    	// act
    	rcVal = tape.contains(searchedVal);
    	
    	// assert
    	assertFalse(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_contains_notEmpty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer searchedVal = new Integer(0);
    	boolean rcVal = false;
    	
    	// act
    	tape.add(new Integer(1));
    	tape.add(new Integer(2));
    	tape.add(new Integer(3));
    	rcVal = tape.contains(searchedVal);
    	
    	// assert
    	assertFalse(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_contains_notEmpty_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer searchedVal = new Integer(0);
    	boolean rcVal = false;
    	
    	// act
    	tape.add(new Integer(0));
    	tape.add(new Integer(1));
    	tape.add(new Integer(2));
    	rcVal = tape.contains(searchedVal);
    	
    	// assert
    	assertTrue(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byIdx_empty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	int searchedIdx = 0;
    	boolean rcVal = true;
    	
    	// act
    	try{
    		tape.delete(searchedIdx);
    	}catch(IndexOutOfBoundsException e) {
    		rcVal = false;
    	}
    	
    	// assert
    	assertFalse(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byIdx_notEmpty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	int searchedIdx = 1;
    	boolean rcVal = true;
    	
    	// act
    	tape.add(new Integer(0));
    	
    	try{
    		tape.delete(searchedIdx);
    	}catch(IndexOutOfBoundsException e) {
    		rcVal = false;
    	}
    	
    	// assert
    	assertFalse(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byIdx_notEmpty_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	int searchedIdx = 0;
    	boolean rcVal = true;
    	
    	// act
    	tape.add(new Integer(0));
    	
    	try{
    		tape.delete(searchedIdx);
    	}catch(IndexOutOfBoundsException e) {
    		rcVal = false;
    	}
    	
    	// assert
    	assertTrue(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byVal_empty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer searchedVal = new Integer(0);
    	boolean rcVal = true;
    	
    	// act
    	rcVal = tape.delete(searchedVal);
    	
    	// assert
    	assertFalse(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byVal_notEmpty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer searchedVal = new Integer(1);
    	boolean rcVal = true;
    	
    	// act
    	tape.add(new Integer(0));
    	rcVal = tape.delete(searchedVal);
    	
    	// assert
    	assertFalse(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byVal_notEmpty_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer searchedVal = new Integer(1);
    	boolean rcVal = true;
    	
    	// act
    	tape.add(new Integer(0));
    	tape.add(new Integer(1));
    	tape.add(new Integer(1));
    	
    	rcVal = tape.delete(searchedVal);
    	
    	// assert
    	assertTrue(rcVal);
    	assertEquals(tape.get(1),searchedVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_get_empty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Object rcVal = null;
    	Integer expVal =  new Integer(0);
    	int searchedIdx = 0;
    	
    	// act
    	try {
    		rcVal = tape.get(searchedIdx);
    	}catch(IndexOutOfBoundsException e)
    	{
    		
    	}
    	
    	// assert
    	assertNull(rcVal);
    }
    
    @Test
    public void test_get_notEmpty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Object rcVal = null;
    	Integer expVal =  new Integer(1);
    	int searchedIdx = 0;
    	
    	// act
    	tape.add(new Integer(0));
    	
    	try {
    		rcVal = tape.get(searchedIdx);
    	}catch(IndexOutOfBoundsException e){
    		
    	}
    	
    	// assert
    	assertNotNull(rcVal);
    	assertThat(expVal, not(equals(rcVal)));
    }
    
    @Test
    public void test_get_notEmpty_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	Object rcVal = null;
    	Integer expVal =  new Integer(0);
    	int searchedIdx = 0;
    	
    	// act
    	tape.add(new Integer(0));
    	rcVal = tape.get(searchedIdx);

    	// assert
    	assertNotNull(rcVal);
    	assertThat(expVal, is(rcVal));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_indexOf_empty_m1()
    {
    	// arrange
    	List tape = new ArrayList();
    	int rcVal = -1;
    	int expVal =  -1;
    	Integer searchedVal = new Integer(0);
    	
    	// act
    	rcVal = tape.indexOf(searchedVal);

    	// assert
    	assertThat(expVal, is(rcVal));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_indexOf_notEmpty_m1()
    {
    	// arrange
    	List tape = new ArrayList();
    	int rcVal = -1;
    	int expVal =  -1;
    	Integer searchedVal = new Integer(0);
    	
    	// act
    	tape.add(new Integer(1));
    	rcVal = tape.indexOf(searchedVal);

    	// assert
    	assertThat(expVal, is(rcVal));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_indexOf_notEmpty_0()
    {
    	// arrange
    	List tape = new ArrayList();
    	int rcVal = -1;
    	int expVal = 0;
    	Integer searchedVal = new Integer(0);
    	
    	// act
    	tape.add(new Integer(0));
    	rcVal = tape.indexOf(searchedVal);

    	// assert
    	assertThat(expVal, is(rcVal));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_on1_empty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(0);
    	int desIdx = 1;
    	int expSize = 0;
    	int rcSize = -1;
    	
    	// act
    	try {
    		tape.insert(desIdx,toAdd1);
    	}catch(IndexOutOfBoundsException e){
    		rcSize = tape.size();
    	}
    	
    	// assert
    	assertThat(rcSize, is(expSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_on0_empty_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(0);
    	int desIdx = 0;
    	int expSize = 1;
    	int rcSize = -1;
    	
    	// act
    	tape.insert(desIdx,toAdd1);
    	rcSize = tape.size();
    	
    	// assert
    	assertSame(tape.get(desIdx),toAdd1);
    	assertThat(rcSize, is(expSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_on0_oneElInTape_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(0);
    	int desIdx = 0;
    	int expSize = 2;
    	int rcSize = -1;
    	
    	// act
    	tape.add(new Integer(1));
    	tape.insert(desIdx,toAdd1);
    	rcSize = tape.size();
    	
    	// assert
    	assertSame(tape.get(desIdx),toAdd1);
    	assertThat(rcSize, is(expSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_on0_twoElInTape_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(0);
    	int desIdx = 0;
    	int expSize = 3;
    	int rcSize = -1;
    	
    	// act
    	tape.add(new Integer(1));
    	tape.add(new Integer(2));
    	tape.insert(desIdx,toAdd1);
    	rcSize = tape.size();
    	
    	// assert
    	assertSame(tape.get(desIdx),toAdd1);
    	assertThat(rcSize, is(expSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_on1_oneElInTape_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(0);
    	Integer yetAdded1 = new Integer(1);
    	int desIdx = 1;
    	int expSize = 2;
    	int rcSize = -1;
    	
    	// act
    	tape.add(yetAdded1);
    	tape.insert(desIdx,toAdd1);
    	rcSize = tape.size();
    	
    	// assert
    	assertSame(tape.get(desIdx),toAdd1);
    	assertThat(rcSize, is(expSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_on1_twoElInTape_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(0);
    	Integer yetAdded1 = new Integer(1);
    	Integer yetAdded2 = new Integer(2);
    	int desIdx = 1;
    	int expSize = 3;
    	int rcSize = -1;
    	
    	// act
    	tape.add(yetAdded1);
    	tape.add(yetAdded2);
    	tape.insert(desIdx,toAdd1);
    	rcSize = tape.size();
    	
    	// assert
    	assertSame(tape.get(0),yetAdded1);
    	assertSame(tape.get(2),yetAdded2);
    	assertSame(tape.get(desIdx),toAdd1);
    	assertThat(rcSize, is(expSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_on3_twoElInTape_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(0);
    	Integer yetAdded1 = new Integer(1);
    	Integer yetAdded2 = new Integer(2);
    	int desIdx = 3;
    	int expSize = 2;
    	int rcSize = -1;
    	
    	// act
    	tape.add(yetAdded1);
    	tape.add(yetAdded2);
    	
    	try {
    		tape.insert(desIdx,toAdd1);
    	}catch(IndexOutOfBoundsException e) {
    		rcSize = tape.size();
    	}
    	
    	// assert
    	assertThat(rcSize, is(expSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_isEmpty_empty_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	boolean rcVal = false;
    	
    	// act
    	rcVal = tape.isEmpty();
    	
    	// assert
    	assertTrue(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_isEmpty_notEmpty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer yetAdded1 = new Integer(1);
    	boolean rcVal = false;
    	
    	// act
    	tape.add(yetAdded1);
    	rcVal = tape.isEmpty();
    	
    	// assert
    	assertFalse(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_size_empty_0()
    {
    	// arrange
    	List tape = new ArrayList();
    	int rcVal = -1;
    	int expVal = 0;
    	
    	// act
    	rcVal = tape.size();
    	
    	// assert
    	assertThat(rcVal,is(expVal));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_size_notEmpty_2()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer yetAdded1 = new Integer(1);
    	Integer yetAdded2 = new Integer(2);
    	int rcVal = -1;
    	int expVal = 2;
    	
    	// act
    	tape.add(yetAdded1);
    	tape.add(yetAdded2);
    	rcVal = tape.size();
    	
    	// assert
    	assertThat(rcVal,is(expVal));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_set_empty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer toAdd1 = new Integer(1);
    	Object rcVal = null;
    	int desIdx = 0;
    	
    	// act
    	try {
    		tape.set(desIdx,toAdd1);
    	}catch(IndexOutOfBoundsException e) {
    		
    	}
    	
    	// assert
    	assertNull(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_set_notEmpty_false()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer yetAdded1 = new Integer(0);
    	Integer toAdd1 = new Integer(1);
    	Object rcVal = null;
    	int desIdx = 1;
    	
    	// act
    	tape.add(yetAdded1);
    	
    	try {
    		tape.set(desIdx,toAdd1);
    	}catch(IndexOutOfBoundsException e) {
    		
    	}
    	
    	// assert
    	assertNull(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_set_notEmpty_true()
    {
    	// arrange
    	List tape = new ArrayList();
    	Integer yetAdded1 = new Integer(0);
    	Integer toAdd1 = new Integer(1);
    	Object rcVal = null;
    	int desIdx = 0;
    	
    	// act
    	tape.add(yetAdded1);
    	rcVal = tape.set(desIdx,toAdd1);
    	
    	// assert
    	assertSame(rcVal,yetAdded1);
    	assertSame(tape.get(desIdx),toAdd1);
    }
}
