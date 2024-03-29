package bt.collections.lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestAbstractList extends TestCase {
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_empty_null_false()
    {
    	// arrange
    	List tape1 = new ArrayList();
    	List tape2 = null;
    	boolean rcLog = false;
    	
    	// act
    	try {
    		rcLog = tape1.equals(tape2);
    	}catch(NullPointerException e) {
    	}
 
    	// assert
    	assertFalse(rcLog);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_null_empty_false()
    {
    	// arrange
    	List tape1 = null;
    	List tape2 = new ArrayList();
    	boolean rcLog = false;
    	
    	// act
    	try {
    		rcLog = tape2.equals(tape1);
    	}catch(NullPointerException e) {
    	}
 
    	// assert
    	assertFalse(rcLog);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_notEmpty_null_false()
    {
    	// arrange
    	List tape1 = new ArrayList();
    	List tape2 = null;
    	boolean rcLog = false;
    	
    	// act
    	try {
    		tape1.add(new Integer(0));
    		rcLog = tape1.equals(tape2);
    	}catch(NullPointerException e) {
    	}
 
    	// assert
    	assertFalse(rcLog);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_null_notEmpty_false()
    {
    	// arrange
    	List tape1 = null;
    	List tape2 = new ArrayList();
    	boolean rcLog = false;
    	
    	// act
    	try {
    		tape1.add(new Integer(0));
    		rcLog = tape2.equals(tape1);
    	}catch(NullPointerException e) {
    	}
 
    	// assert
    	assertFalse(rcLog);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_equalValues_true()
    {
    	// arrange
    	List tape1 = new ArrayList();
    	List tape2 = new ArrayList();
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.add(yetAdded1);
    	tape1.add(yetAdded2);
    	tape2.add(yetAdded1);
    	tape2.add(yetAdded2);
    	rcLog = tape2.equals(tape1);

    	// assert
    	assertTrue(rcLog);
    }

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_differentValues_equalSize_false()
    {
    	// arrange
    	List tape1 = new ArrayList();
    	List tape2 = new ArrayList();
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.add(yetAdded1);
    	tape1.add(yetAdded1);
    	tape2.add(yetAdded1);
    	tape2.add(yetAdded2);
    	rcLog = tape2.equals(tape1);

    	// assert
    	assertFalse(rcLog);
    }  
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_differentValues_differentSize_false()
    {
    	// arrange
    	List tape1 = new ArrayList();
    	List tape2 = new ArrayList();
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.add(yetAdded1);
    	tape1.add(yetAdded1);
    	tape2.add(yetAdded1);
    	tape2.add(yetAdded2);
    	tape2.add(yetAdded2);
    	rcLog = tape2.equals(tape1);

    	// assert
    	assertFalse(rcLog);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_hashCode_empty_null_equals_true()
    {
    	// arrange
    	List tape1 = new ArrayList();
    	List tape2 = null;
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	
    	// act
    	try {
    		hashCodeOfTape1 = tape1.hashCode();
    		hashCodeOfTape2 = tape2.hashCode();
    	}catch(NullPointerException e) {
    	}
 
    	// assert
    	assertNotEquals(hashCodeOfTape1,hashCodeOfTape2);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_hashCode_null_empty_false_equals_true()
    {
    	// arrange
    	List tape1 = null;
    	List tape2 = new ArrayList();;
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	
    	// act
    	try {
    		hashCodeOfTape1 = tape1.hashCode();
    		hashCodeOfTape2 = tape2.hashCode();
    	}catch(NullPointerException e) {
    	}
 
    	// assert
    	assertEquals(hashCodeOfTape1,hashCodeOfTape2);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_hashCode_notEmpty_null_equals_false()
    {
    	// arrange
    	List tape1 = new ArrayList();
    	List tape2 = null;
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	String yetAdded1 = new String("0");
    	
    	// act
    	try {
    		tape1.add(yetAdded1);
    		hashCodeOfTape1 = tape1.hashCode();
    		hashCodeOfTape2 = tape2.hashCode();
    	}catch(NullPointerException e) {
    	}
 
    	// assert
    	assertNotEquals(hashCodeOfTape1,hashCodeOfTape2);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_hashCode_null_notEmpty_false_equals_true()
    {
    	// arrange
    	List tape1 = null;
    	List tape2 = new ArrayList();;
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	String yetAdded1 = new String("0");
    	
    	// act
    	try {
    		tape2.add(yetAdded1);
    		hashCodeOfTape1 = tape1.hashCode();
    		hashCodeOfTape2 = tape2.hashCode();
    	}catch(NullPointerException e) {
    	}
 
    	// assert
    	assertEquals(hashCodeOfTape1,hashCodeOfTape2);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_hashCode_equalValues_true()
    {
    	// arrange
    	List tape1 = new ArrayList();
    	List tape2 = new ArrayList();
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.add(yetAdded1);
    	tape1.add(yetAdded2);
    	tape2.add(yetAdded1);
    	tape2.add(yetAdded2);
    	hashCodeOfTape1 = tape1.hashCode();
    	hashCodeOfTape2 = tape2.hashCode();

    	// assert
    	assertEquals(hashCodeOfTape1,hashCodeOfTape2);
    }

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_hashCode_differentValues_equalSize_false()
    {
    	// arrange
    	List tape1 = new ArrayList();
    	List tape2 = new ArrayList();
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.add(yetAdded1);
    	tape1.add(yetAdded1);
    	tape2.add(yetAdded1);
    	tape2.add(yetAdded2);
    	hashCodeOfTape1 = tape1.hashCode();
    	hashCodeOfTape2 = tape2.hashCode();

    	// assert
    	assertNotEquals(hashCodeOfTape1,hashCodeOfTape2);
    }  
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_hashCode_differentValues_differentSize_false()
    {
    	// arrange
    	List tape1 = new ArrayList();
    	List tape2 = new ArrayList();
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.add(yetAdded1);
    	tape1.add(yetAdded1);
    	tape2.add(yetAdded1);
    	tape2.add(yetAdded2);
    	tape2.add(yetAdded2);
    	hashCodeOfTape1 = tape1.hashCode();
    	hashCodeOfTape2 = tape2.hashCode();

    	// assert
    	assertNotEquals(hashCodeOfTape1,hashCodeOfTape2);
    }
}
