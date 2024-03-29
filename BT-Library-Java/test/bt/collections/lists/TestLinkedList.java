package bt.collections.lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.interfaces.List;
import bt.collections.lists.AbstractList;
import bt.collections.lists.ArrayList;
import bt.collections.lists.LinkedList;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestLinkedList extends TestCase {
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_emptyList_size0()
    {
    	// arrange
    	List tape = new LinkedList();
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
    	List tape = new LinkedList();
    	String toAdd1 = new String("0");
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
    	List tape = new LinkedList();
    	String toAdd0 = new String("0");
    	String toAdd1 =  new String("1");
    	int expSize = 2;
    	
    	// act
    	tape.add(toAdd0);
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
    	List tape = new LinkedList();
    	String toAdd0 = new String("0");
    	String toAdd1 =  new String("1");
    	String toAdd2 =  new String("2");
    	int expSize = 3;
    	
    	// act
    	tape.add(toAdd0);
    	tape.add(toAdd1);
    	tape.add(toAdd2);
    	
    	// assert
    	assertSame(toAdd2, tape.get(2));
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_clear_notEmpty_size0()
    {
    	// arrange
    	List tape = new LinkedList();
    	int expSize = 0;
    	String toAdd1 =  new String("1");
    	String toAdd2 =  new String("2");
    	
    	// act
    	tape.add(toAdd1);
    	tape.add(toAdd2);
    	tape.clear();
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_clear_empty_size0()
    {
    	// arrange
    	List tape = new LinkedList();
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
    	List tape = new LinkedList();
    	String searchedVal = new String("0");
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
    	List tape = new LinkedList();
    	String searchedVal = new String("0");
    	String toAdd1 =  new String("1");
    	String toAdd2 =  new String("2");
    	String toAdd3 =  new String("3");
    	boolean rcVal = false;
    	
    	// act
    	tape.add(toAdd1);
    	tape.add(toAdd2);
    	tape.add(toAdd3);
    	rcVal = tape.contains(searchedVal);
    	
    	// assert
    	assertFalse(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_contains_notEmpty_true()
    {
    	// arrange
    	List tape = new LinkedList();
    	String searchedVal = new String("0");
    	String toAdd0 =  new String("0");
    	String toAdd1 =  new String("1");
    	String toAdd2 =  new String("2");
    	
    	boolean rcVal = false;
    	
    	// act
    	tape.add(toAdd0);
    	tape.add(toAdd1);
    	tape.add(toAdd2);
    	rcVal = tape.contains(searchedVal);
    	
    	// assert
    	assertTrue(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byIdx_empty_false()
    {
    	// arrange
    	List tape = new LinkedList();
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
    	List tape = new LinkedList();
    	int searchedIdx = 1;
    	String toAdd0 =  new String("0");
    	boolean rcVal = true;
    	
    	// act
    	tape.add(toAdd0);
    	
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
    	List tape = new LinkedList();
    	String toAdd0 =  new String("0");
    	int searchedIdx = 0;
    	boolean rcVal = true;
    	
    	// act
    	tape.add(toAdd0);
    	
    	try{
    		tape.delete(searchedIdx);
    	}catch(IndexOutOfBoundsException e) {
    		rcVal = false;
    	}
    	
    	// assert
    	assertEquals(tape.size() , 0);
    	assertTrue(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byVal_empty_false()
    {
    	// arrange
    	List tape = new LinkedList();
    	String searchedVal = new String("0");
    	boolean rcVal = true;
    	
    	// act
    	try {
    		rcVal = tape.delete(searchedVal);
    	}catch(IndexOutOfBoundsException e) {
    		rcVal = false;
    	}
    	
    	// assert
    	assertFalse(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byVal_notEmpty_false()
    {
    	// arrange
    	List tape = new LinkedList();
    	String yetAdded0 =  new String("0");
    	String searchedVal = new String("1");
    	boolean rcVal = true;
    	
    	// act
    	tape.add(yetAdded0);
    	try {
    		rcVal = tape.delete(searchedVal);
    	}catch(IndexOutOfBoundsException e) {
    		rcVal = false;
    	}
    	
    	// assert
    	assertFalse(rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byVal_notEmpty_true()
    {
    	// arrange
    	List tape = new LinkedList();
    	String toAdd0 =  new String("0");
    	String toAdd1 =  new String("1");
    	String searchedVal = new String("1");
    	boolean rcVal = true;
    	
    	// act
    	tape.add(toAdd0);
    	tape.add(toAdd1);
    	tape.add(toAdd1);
    	
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
    	List tape = new LinkedList();
    	Object rcVal = null;
    	String expVal =  new String("0");
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
    	List tape = new LinkedList();
    	Object rcVal = null;
    	String expVal =  new String("1");
    	String toAdd1 =  new String("0");
    	int searchedIdx = 0;
    	
    	// act
    	tape.add(toAdd1);
    	
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
    	List tape = new LinkedList();
    	Object rcVal = null;
    	String toAdd1 =  new String("0");
    	String expVal =  new String("0");
    	int searchedIdx = 0;
    	
    	// act
    	tape.add(toAdd1);
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
    	List tape = new LinkedList();
    	int rcVal = -1;
    	int expVal =  -1;
    	String searchedVal = new String("0");
    	
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
    	List tape = new LinkedList();
    	int rcVal = -1;
    	int expVal =  -1;
    	String searchedVal = new String("0");
    	
    	// act
    	tape.add(new Double(1));
    	rcVal = tape.indexOf(searchedVal);

    	// assert
    	assertThat(expVal, is(rcVal));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_indexOf_notEmpty_0()
    {
    	// arrange
    	List tape = new LinkedList();
    	int rcVal = -1;
    	int expVal = 0;
    	String yetAdded0 = new String("0");
    	String searchedVal = new String("0");
    	
    	// act
    	tape.add(yetAdded0);
    	rcVal = tape.indexOf(searchedVal);

    	// assert
    	assertThat(expVal, is(rcVal));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_on1_empty_false()
    {
    	// arrange
    	List tape = new LinkedList();
    	String toAdd1 = new String("0");
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
    	List tape = new LinkedList();
    	String toAdd1 = new String("0");
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
    	List tape = new LinkedList();
    	String toAdd1 = new String("0");
    	int desIdx = 0;
    	int expSize = 2;
    	int rcSize = -1;
    	
    	// act
    	tape.add(new Double(1));
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
    	List tape = new LinkedList();
    	String toAdd1 = new String("0");
    	int desIdx = 0;
    	int expSize = 3;
    	int rcSize = -1;
    	
    	// act
    	tape.add(new Double(1));
    	tape.add(new Double(2));
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
    	List tape = new LinkedList();
    	String toAdd1 = new String("0");
    	String yetAdded1 = new String("1");
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
    	List tape = new LinkedList();
    	String toAdd0 = new String("0");
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	int desIdx = 1;
    	int expSize = 3;
    	int rcSize = -1;
    	
    	// act
    	tape.add(yetAdded1);
    	tape.add(yetAdded2);
    	tape.insert(desIdx,toAdd0);
    	rcSize = tape.size();
    	
    	// assert
    	assertSame(tape.get(0),yetAdded1);
    	assertSame(tape.get(2),yetAdded2);
    	assertSame(tape.get(desIdx),toAdd0);
    	assertThat(rcSize, is(expSize));
    }
    
  //Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_toString_true()
    {
    	// arrange
    	List tape = new LinkedList();
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	String yetAdded3 = new String("3");
    	String yetAdded4 = new String("4");
    	String yetAdded5 = new String("5");
    	String yetAdded6 = new String("6");
    	String yetAdded7 = new String("7");
    	String yetAdded8 = new String("8");
    	String yetAdded9 = new String("9");
    	String yetAdded10= new String("10");
    	String yetAdded11 = new String("11");
    	String yetAdded12 = new String("12");
    	String yetAdded13 = new String("13");
    	String yetAdded14 = new String("14");
    	String yetAdded15 = new String("15");
    	
    	
    	// act
    	tape.add(yetAdded1);
    	tape.add(yetAdded2);
    	tape.add(yetAdded3);
    	tape.add(yetAdded4);
    	tape.add(yetAdded5);
    	tape.add(yetAdded6);
    	tape.add(yetAdded7);
    	tape.add(yetAdded8);
    	tape.add(yetAdded9);
    	tape.add(yetAdded10);
    	tape.add(yetAdded11);
    	tape.add(yetAdded12);
    	tape.add(yetAdded13);
    	tape.add(yetAdded14);
    	tape.add(yetAdded15);
    	
    	System.out.println( tape );
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_on3_twoElInTape_false()
    {
    	// arrange
    	List tape = new LinkedList();
    	String toAdd1 = new String("0");
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
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
    public void test_insert_on6_10elOnTape_false()
    {
    	// arrange
    	AbstractList tape = new LinkedList();
    	String toAdd1 = new String("0");
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	String yetAdded3 = new String("3");
    	String yetAdded4 = new String("4");
    	String yetAdded5 = new String("5");
    	String yetAdded6 = new String("6");
    	String yetAdded7 = new String("7");
    	String yetAdded8 = new String("8");
    	String yetAdded9 = new String("9");
    	String yetAdded10 = new String("10");
    	int desIdx = 6;
    	int expSize = 11;
    	int rcSize = -1;
    	
    	// act
    	tape.add(yetAdded1);
    	tape.add(yetAdded2);
    	tape.add(yetAdded3);
    	tape.add(yetAdded4);
    	tape.add(yetAdded5);
    	tape.add(yetAdded6);
    	tape.add(yetAdded7);
    	tape.add(yetAdded8);
    	tape.add(yetAdded9);
    	tape.add(yetAdded10);
    	
    	
    	try {
    		tape.insert(desIdx,toAdd1);
    	}catch(IndexOutOfBoundsException e) {
    		rcSize = tape.size();
    	}
    	
    	System.out.println( tape.toString() );
    	// assert
    	assertThat(tape.size(), is(expSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_on15_15elOnTape_true()
    {
    	// arrange
    	List tape = new LinkedList();
    	String toAdd1 = new String("17");
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	String yetAdded3 = new String("3");
    	String yetAdded4 = new String("4");
    	String yetAdded5 = new String("5");
    	String yetAdded6 = new String("6");
    	String yetAdded7 = new String("7");
    	String yetAdded8 = new String("8");
    	String yetAdded9 = new String("9");
    	String yetAdded10= new String("10");
    	String yetAdded11 = new String("11");
    	String yetAdded12 = new String("12");
    	String yetAdded13 = new String("13");
    	String yetAdded14 = new String("14");
    	String yetAdded15 = new String("15");
    	
    	
    	int desIdx = 15;
    	int expSize = 16;
    	int rcSize = -1;
    	
    	// act
    	tape.add(yetAdded1);
    	tape.add(yetAdded2);
    	tape.add(yetAdded3);
    	tape.add(yetAdded4);
    	tape.add(yetAdded5);
    	tape.add(yetAdded6);
    	tape.add(yetAdded7);
    	tape.add(yetAdded8);
    	tape.add(yetAdded9);
    	tape.add(yetAdded10);
    	tape.add(yetAdded11);
    	tape.add(yetAdded12);
    	tape.add(yetAdded13);
    	tape.add(yetAdded14);
    	tape.add(yetAdded15);
    	
    	try {
    		tape.insert(desIdx,toAdd1);
    	}catch(IndexOutOfBoundsException e) {
    		rcSize = tape.size();
    	}
    	
    	// assert
    	assertThat(tape.size(), is(expSize));
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_true()
    {
    	// arrange
    	List tapeBase = new LinkedList();
    	tapeBase.add(new String("1"));
    	tapeBase.add(new String("2"));
    	tapeBase.add(new String("3"));
    	tapeBase.add(new String("4"));
    	tapeBase.add(new String("5"));
    	
    	List tapeToTest = new LinkedList();
    	tapeToTest.add(new String("1"));
    	tapeToTest.add(new String("2"));
    	tapeToTest.add(new String("3"));
    	tapeToTest.add(new String("4"));
    	tapeToTest.add(new String("5"));
    	
    	// act
    	// assert
    	assertThat(tapeBase.equals(tapeToTest), is(true));
    }

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_isEmpty_empty_true()
    {
    	// arrange
    	List tape = new LinkedList();
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
    	List tape = new LinkedList();
    	String yetAdded1 = new String("1");
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
    	List tape = new LinkedList();
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
    	List tape = new LinkedList();
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
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
    	List tape = new LinkedList();
    	String toAdd1 = new String("1");
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
    	List tape = new LinkedList();
    	String yetAdded1 = new String("0");
    	String toAdd1 = new String("1");
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
    	List tape = new LinkedList();
    	String yetAdded1 = new String("0");
    	String toAdd1 = new String("1");
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
