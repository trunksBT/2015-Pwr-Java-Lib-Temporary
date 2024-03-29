package bt.ABC;

import java.util.PriorityQueue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.elems.FriendlyStudent;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestJavaStructures extends TestCase{
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_divideAndAssign_OrderOfPerformedActions_Expect_1_DivideAndReturnDividedValue()
    {
    	// arrange
    	int changedVal = 100;
    	int rcVal = -1;
    	int expVal = 1;
    	
    	// act 	
    	if((changedVal/=2) <= 50)
    		rcVal = 1;
    	
    	// assert	
    	assertEquals(rcVal,expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_thisWillChangeRef1_Expect_VarRefferToOtherObject()
    {
    	// arrange
    	FriendlyStudent stud = new FriendlyStudent("testMethod","Adam",123);
    	FriendlyStudent rcVal = null;
    	
    	// act
    	rcVal = thisWillChangeRef1(stud);
    	
    	// assert	
    	assertEquals(rcVal.getNick(),"inMethod");
    	assertNotSame(stud,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_thisWillChangeRef2_Expect_VarRefferToOtherObject()
    {
    	// arrange
    	FriendlyStudent stud = new FriendlyStudent("testMethod","Adam",123);
    	FriendlyStudent rcVal = null;
    	
    	// act
    	rcVal = thisWillChangeRef2(stud);
    	
    	// assert	
    	assertEquals(rcVal.getNick(),"inMethod");
    	assertNotSame(stud,rcVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_itWillNotChangeRef_Expect_1_VarWillNotRefferToOtherObject()
    {
    	// arrange
    	FriendlyStudent stud = new FriendlyStudent("testMethod","Adam",123);
    	
    	// act
    	itWillNotChangeRef(stud);
    	
    	// assert	
    	assertEquals(stud.getNick(),"testMethod");
    }
    
  //Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_priorityQueue_enqueue_Expect_size_1()
    {
    	// arrange
    	java.util.Queue<Integer> queue = new PriorityQueue<>();
    	
    	// act
    	queue.add(new Integer(0));
    	
    	// assert	
    	assertEquals(queue.size(),1);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_priorityQueue_enqueueTwice_Expect_size_2()
    {
    	// arrange
    	java.util.Queue<Integer> queue = new PriorityQueue<>();
    	
    	// act
    	queue.add(new Integer(0));
    	queue.add(new Integer(1));
    	
    	// assert	
    	assertEquals(queue.size(),2);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_priorityQueue_enqueueTwice_dequeue_Expect_size_1()
    {
    	// arrange
    	java.util.Queue<Integer> queue = new PriorityQueue<>();
    	queue.add(new Integer(0));
    	queue.add(new Integer(1));
    	Integer expVal = new Integer(0);
    	Integer rcVal = null;
    	
    	// act
    	rcVal = (Integer) queue.poll();
    	
    	// assert	
    	assertEquals(queue.size(),1);
    	assertEquals(rcVal,expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_priorityQueue_enqueueThreeTimes_dequeue_Expect_0()
    {
    	// arrange
    	java.util.Queue<Integer> queue = new PriorityQueue<>();
    	queue.add(new Integer(1));
    	queue.add(new Integer(0));
    	queue.add(new Integer(0));
    	Integer expVal = new Integer(0);
    	Integer rcVal = null;
    	
    	// act
    	rcVal = (Integer) queue.poll();
    	
    	// assert	
    	assertEquals(queue.size(),2);
    	assertEquals(rcVal,expVal);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_priorityQueue_enqueueThreeTimes_dequeue_Expect_1()
    {
    	// arrange
    	java.util.Queue<Integer> queue = new PriorityQueue<>();
    	queue.add(new Integer(0));
    	queue.add(new Integer(0));
    	queue.add(new Integer(1));
    	Integer expVal = new Integer(0);
    	Integer rcVal = null;
    	
    	// act
    	rcVal = (Integer) queue.poll();
    	
    	// assert	
    	assertEquals(queue.size(),2);
    	assertEquals(rcVal,expVal);
    }
    	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_itWillChangeNick_Expect_1_VarWillNotRefferToOtherObject()
    {
    	// arrange
    	FriendlyStudent stud = new FriendlyStudent("testMethod","Adam",123);
    	
    	// act
    	itWillChangeNick(stud);
    	
    	// assert	
    	assertEquals(stud.getNick(),"changedThanksToCopiedRef");
    }
           
    public FriendlyStudent thisWillChangeRef1(FriendlyStudent stud) {
    	return stud=new FriendlyStudent("inMethod","jan",123);
    }
    
    public FriendlyStudent thisWillChangeRef2(FriendlyStudent stud) {
    	stud=new FriendlyStudent("inMethod","jan",123);
    	return stud;
    }
    
    public void itWillNotChangeRef(FriendlyStudent stud) {
    	stud=new FriendlyStudent("inMethod","jan",123);
    }
    
    public void itWillChangeNick(FriendlyStudent stud) {
    	stud.setNick("changedThanksToCopiedRef");
    }
}

