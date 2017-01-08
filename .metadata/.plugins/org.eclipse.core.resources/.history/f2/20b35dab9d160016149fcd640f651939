package bt.tests.core.collections.dataTypes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.dataTypes.AbstractList;
import bt.core.collections.dataTypes.ArrayList;
import bt.core.collections.dataTypes.LinkedList;
import bt.core.collections.dataTypes.Queue;
//import bt.core.collections.dataTypes.GuardedLinkedListDoubleCopy;
import bt.core.collections.interfaces.List;
import bt.core.exceptions.EmptyQueueException;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestQueue extends TestCase {
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_emptyList_size0()
    {
    	// arrange
    	Queue tape = new Queue();
    	int expSize = 0;
    	
    	// act
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_enqueue_emptyList_Expect_size1()
    {
    	// arrange
    	List tape = new LinkedList();
    	Queue queue = new Queue(tape);
    	String toAdd1 = new String("0");
    	int expSize = 1;
    	
    	// act
    	queue.enqueue(toAdd1);
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_enqueue_NotEmptyList_Expect_size3()
    {
    	// arrange
    	List tape = new LinkedList();
    	Queue queue = new Queue(tape);
    	String toAdd0 = new String("0");
    	String toAdd1 =  new String("1");
    	String toAdd2 =  new String("2");
    	int expSize = 3;
    	
    	// act
    	tape.add(toAdd0);
    	tape.add(toAdd1);
    	queue.enqueue(toAdd2);	
    	
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
    	Queue queue = new Queue(tape);
    	String toAdd1 =  new String("1");
    	String toAdd2 =  new String("2");
    	boolean isEmptyAfterAdd = false;
    	
    	// act
    	tape.add(toAdd1);
    	tape.add(toAdd2);
    	isEmptyAfterAdd = queue.isEmpty();
    	queue.clear();
    	
    	// assert
    	assertTrue(queue.isEmpty()^isEmptyAfterAdd);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_clearYisEmpty_Empty_Expect_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Queue queue = new Queue(tape);
    	
    	// act
    	queue.clear();
    	
    	// assert
    	assertTrue(queue.isEmpty());
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_dequeue_empty_Expect_Null_y_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Queue queue = new Queue(tape);
    	Object dequeued = null;
    	
    	// act
    	try{
    		dequeued = queue.dequeue();
    	}catch(EmptyQueueException e) {
    		dequeued = null;
    	}
    	
    	// assert
    	assertNull(dequeued);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_dequeue_size1_Expect_0_y_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Queue queue = new Queue(tape);
    	String toAdd0 =  new String("0");
    	Object dequeued = null;
    	tape.add(toAdd0);
    	
    	// act
    	try{
    		dequeued = queue.dequeue();
    	}catch(EmptyQueueException e) {
    		dequeued = null;
    	}
    	
    	// assert
    	assertSame(dequeued,toAdd0);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_dequeue_size2_Expect_0_True()
    {
    	// arrange
    	List tape = new LinkedList();
    	Queue queue = new Queue(tape);
    	String toAdd0 =  new String("0");
    	String toAdd1 =  new String("1");
    	Object dequeued = null;
    	tape.add(toAdd0);
    	tape.add(toAdd1);
    	
    	// act
    	try{
    		dequeued = queue.dequeue();
    	}catch(EmptyQueueException e) {
    		dequeued = null;
    	}
    	
    	// assert
    	assertSame(dequeued,toAdd0);
    }
}
