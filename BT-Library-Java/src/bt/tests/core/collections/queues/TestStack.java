package bt.tests.core.collections.queues;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.interfaces.List;
import bt.core.collections.lists.LinkedList;
import bt.core.collections.queues.Stack;
import bt.core.exceptions.EmptyStackException;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestStack extends TestCase {
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_emptyList_size0()
    {
    	// arrange
    	Stack tape = new Stack();
    	int expSize = 0;
    	
    	// act
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_push_emptyList_Expect_size1()
    {
    	// arrange
    	List tape = new LinkedList();
    	Stack stack = new Stack(tape);
    	String toAdd1 = new String("0");
    	int expSize = 1;
    	
    	// act
    	stack.push(toAdd1);
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_push_NotEmptyList_Expect_size3()
    {
    	// arrange
    	List tape = new LinkedList();
    	Stack stack = new Stack(tape);
    	String toAdd0 = new String("0");
    	String toAdd1 =  new String("1");
    	String toAdd2 =  new String("2");
    	int expSize = 3;
    	
    	// act
    	tape.add(toAdd0);
    	tape.add(toAdd1);
    	stack.push(toAdd2);	
    	
    	// assert
    	assertSame(toAdd1, tape.get(1));
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_clearYisEmpty_NotEmpty_Expect_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Stack stack = new Stack(tape);
    	String toAdd1 =  new String("1");
    	String toAdd2 =  new String("2");
    	boolean isEmptyAfterAdd = false;
    	
    	// act
    	tape.add(toAdd1);
    	tape.add(toAdd2);
    	isEmptyAfterAdd = stack.isEmpty();
    	stack.clear();
    	
    	// assert
    	assertTrue(stack.isEmpty()^isEmptyAfterAdd);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_clearYisEmpty_Empty_Expect_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Stack stack = new Stack(tape);
    	
    	// act
    	stack.clear();
    	
    	// assert
    	assertTrue(stack.isEmpty());
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_pop_empty_Expect_Null_y_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Stack stack = new Stack(tape);
    	Object peeked = null;
    	
    	// act
    	try{
    		peeked = stack.pop();
    	}catch(EmptyStackException e) {
    		peeked = null;
    	}
    	
    	// assert
    	assertNull(peeked);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_pop_size1_Expect_0_y_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Stack stack = new Stack(tape);
    	String toAdd0 =  new String("0");
    	Object peeked = null;
    	tape.add(toAdd0);
    	
    	// act
    	try{
    		peeked = stack.pop();
    	}catch(EmptyStackException e) {
    		peeked = null;
    	}
    	
    	// assert
    	assertSame(peeked,toAdd0);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_pop_size2_Expect_1_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Stack stack = new Stack(tape);
    	String toAdd0 =  new String("0");
    	String toAdd1 =  new String("1");
    	Object peeked = null;
    	tape.add(toAdd0);
    	tape.add(toAdd1);
    	
    	// act
    	try{
    		peeked = stack.pop();
    	}catch(EmptyStackException e) {
    		peeked = null;
    	}
    	
    	// assert
    	assertSame(peeked,toAdd1);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_peek_empty_Expect_Null_y_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Stack stack = new Stack(tape);
    	int expSize = 0;
    	Object peeked = null;
    	
    	// act
    	try{
    		peeked = stack.peek();
    	}catch(EmptyStackException e) {
    		peeked = null;
    	}
    	
    	// assert
    	assertNull(peeked);
    	assertEquals(stack.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_peek_size1_Expect_0_y_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Stack stack = new Stack(tape);
    	String toAdd0 =  new String("0");
    	int expSize = 1;
    	Object peeked = null;
    	tape.add(toAdd0);
    	
    	// act
    	try{
    		peeked = stack.peek();
    	}catch(EmptyStackException e) {
    		peeked = null;
    	}
    	
    	// assert
    	assertSame(peeked,toAdd0);
    	assertEquals(stack.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_peek_size2_Expect_1_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Stack stack = new Stack(tape);
    	String toAdd0 =  new String("0");
    	String toAdd1 =  new String("1");
    	int expSize = 2;
    	Object peeked = null;
    	tape.add(toAdd0);
    	tape.add(toAdd1);
    	
    	// act
    	try{
    		peeked = stack.peek();
    	}catch(EmptyStackException e) {
    		peeked = null;
    	}
    	
    	// assert
    	assertSame(peeked,toAdd1);
    	assertEquals(stack.size(), expSize);
    }
}
