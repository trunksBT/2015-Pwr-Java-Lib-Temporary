package bt.collections.trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.comparators.NaturalComparator;
import bt.collections.interfaces.List;
import bt.collections.interfaces.Tree;
import bt.collections.lists.ArrayList;
import bt.collections.lists.LinkedList;
import bt.collections.queues.Queue;
import bt.collections.trees.BST;
import bt.exceptions.ItemNotFoundException;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestBST extends TestCase {
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_empty_null_false()
    {
    	// arrange
       	Tree tape1 = new BST(NaturalComparator.INSTANCE);
    	Tree tape2 = null;
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
    	Tree tape1 = null;
    	Tree tape2 = new BST(NaturalComparator.INSTANCE);
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
    	Tree tape1 = new BST(NaturalComparator.INSTANCE);
    	Tree tape2 = null;
    	boolean rcLog = false;
    	
    	// act
    	try {
    		tape1.insert(new Integer(0));
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
    	Tree tape1 = null;
    	Tree tape2 = new BST(NaturalComparator.INSTANCE);
    	boolean rcLog = false;
    	
    	// act
    	try {
    		tape1.insert(new Integer(0));
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
    	Tree tape1 = new BST(NaturalComparator.INSTANCE);
    	Tree tape2 = new BST(NaturalComparator.INSTANCE);
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.insert(yetAdded1);
    	tape1.insert(yetAdded2);
    	tape2.insert(yetAdded1);
    	tape2.insert(yetAdded2);
    	rcLog = tape2.equals(tape1);

    	// assert
    	assertTrue(rcLog);
    }

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_differentValues_equalSize_false()
    {
    	// arrange
    	Tree tape1 = new BST(NaturalComparator.INSTANCE);
    	Tree tape2 = new BST(NaturalComparator.INSTANCE);
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.insert(yetAdded1);
    	tape1.insert(yetAdded2);
    	tape2.insert(yetAdded2);
    	tape2.insert(yetAdded1);
    	rcLog = tape2.equals(tape1);

    	// assert
    	assertFalse(rcLog);
    }  
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_equals_differentValues_differentSize_false()
    {
    	// arrange
    	Tree tape1 = new BST(NaturalComparator.INSTANCE);
    	Tree tape2 = new BST(NaturalComparator.INSTANCE);
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.insert(yetAdded1);
    	tape1.insert(yetAdded2);
    	tape2.insert(yetAdded1);
    	rcLog = tape2.equals(tape1);

    	// assert
    	assertFalse(rcLog);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_hashCode_null_empty_false_equals_true()
    {
    	// arrange
    	Tree tape1 = null;
    	Tree tape2 = new BST(NaturalComparator.INSTANCE);;
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
    	Tree tape1 = new BST(NaturalComparator.INSTANCE);
    	Tree tape2 = null;
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	String yetAdded1 = new String("0");
    	
    	// act
    	try {
    		tape1.insert(yetAdded1);
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
    	Tree tape1 = null;
    	Tree tape2 = new BST(NaturalComparator.INSTANCE);;
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	String yetAdded1 = new String("0");
    	
    	// act
    	try {
    		tape2.insert(yetAdded1);
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
    	Tree tape1 = new BST(NaturalComparator.INSTANCE);
    	Tree tape2 = new BST(NaturalComparator.INSTANCE);
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.insert(yetAdded1);
    	tape1.insert(yetAdded2);
    	tape2.insert(yetAdded1);
    	tape2.insert(yetAdded2);
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
    	Tree tape1 = new BST(NaturalComparator.INSTANCE);
    	Tree tape2 = new BST(NaturalComparator.INSTANCE);
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.insert(yetAdded2);
    	tape1.insert(yetAdded1);
    	tape2.insert(yetAdded1);
    	tape2.insert(yetAdded2);
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
    	Tree tape1 = new BST(NaturalComparator.INSTANCE);
    	Tree tape2 = new BST(NaturalComparator.INSTANCE);
    	int hashCodeOfTape1 = 0;
    	int hashCodeOfTape2 = 0;
    	String yetAdded1 = new String("1");
    	String yetAdded2 = new String("2");
    	boolean rcLog = false;
    	
    	// act
    	tape1.insert(yetAdded1);
    	tape1.insert(yetAdded2);
    	tape2.insert(yetAdded2);
    	tape2.insert(yetAdded1);
    	hashCodeOfTape1 = tape1.hashCode();
    	hashCodeOfTape2 = tape2.hashCode();

    	// assert
    	assertNotEquals(hashCodeOfTape1,hashCodeOfTape2);
    }
    
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_emptyList_Expect_size1()
    {
    	// arrange
    	Tree tape = new BST(NaturalComparator.INSTANCE);
    	String toAdd1 = new String("0");
    	int expSize = 1;
    	
    	// act
    	tape.insert(toAdd1);
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_notEmptyList_Expect_size2()
    {
    	// arrange
    	Tree tape = new BST(NaturalComparator.INSTANCE);
    	String toAdd0 = new String("0");
    	String toAdd1 = new String("1");
    	int expSize = 2;
    	
    	// act
    	tape.insert(toAdd0);
    	tape.insert(toAdd1);
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_NotEmptyList_Expect_size3()
    {
    	// arrange
    	Tree tape = new BST(NaturalComparator.INSTANCE);
    	String toAdd0 = new String("0");
    	String toAdd1 =  new String("1");
    	int expSize = 2;
    	
    	// act
    	tape.insert(toAdd0);
    	tape.insert(toAdd1);
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_NotEmptyList_deleteRoot_Expect_size11()
    {
    	// arrange
    	Tree tape = new BST(NaturalComparator.INSTANCE);
    	String toAdd0 = new String("50");
    	String toAdd1 =  new String("17");
    	String toAdd2 =  new String("72");
    	String toAdd3 =  new String("12");
    	String toAdd4 =  new String("23");
    	String toAdd5 =  new String("54");
    	String toAdd6 =  new String("76");
    	String toAdd7 =  new String("09");
    	String toAdd8 =  new String("14");
    	String toAdd9 =  new String("19");
    	String toAdd10 =  new String("67");
    	int expSize = 10;
    	tape.insert(toAdd0 );
    	tape.insert(toAdd1 );
    	tape.insert(toAdd2 );
    	tape.insert(toAdd3 );
    	tape.insert(toAdd4 );
    	tape.insert(toAdd5 );
    	tape.insert(toAdd6 );
    	tape.insert(toAdd7 );
    	tape.insert(toAdd8 );
    	tape.insert(toAdd9 );
    	tape.insert(toAdd10);
    	
    	// act
    	tape.delete( toAdd0);    	
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_NotEmptyList_delete14_Expect_size11()
    {
    	// arrange
    	Tree tape = new BST(NaturalComparator.INSTANCE);
    	String toAdd0 = new String("50");
    	String toAdd1 =  new String("17");
    	String toAdd2 =  new String("72");
    	String toAdd3 =  new String("12");
    	String toAdd4 =  new String("23");
    	String toAdd5 =  new String("54");
    	String toAdd6 =  new String("76");
    	String toAdd7 =  new String("09");
    	String toAdd8 =  new String("14");
    	String toAdd9 =  new String("19");
    	String toAdd10 =  new String("67");
    	int expSize = 10;
    	tape.insert(toAdd0 );
    	tape.insert(toAdd1 );
    	tape.insert(toAdd2 );
    	tape.insert(toAdd3 );
    	tape.insert(toAdd4 );
    	tape.insert(toAdd5 );
    	tape.insert(toAdd6 );
    	tape.insert(toAdd7 );
    	tape.insert(toAdd8 );
    	tape.insert(toAdd9 );
    	tape.insert(toAdd10);
    	
    	// act
    	tape.delete( toAdd8);    	
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_NotEmptyList_delete12_Expect_size11()
    {
    	// arrange
    	Tree tape = new BST(NaturalComparator.INSTANCE);
    	String toAdd0 = new String("50");
    	String toAdd1 =  new String("17");
    	String toAdd2 =  new String("72");
    	String toAdd3 =  new String("12");
    	String toAdd4 =  new String("23");
    	String toAdd5 =  new String("54");
    	String toAdd6 =  new String("76");
    	String toAdd7 =  new String("09");
    	String toAdd8 =  new String("14");
    	String toAdd9 =  new String("19");
    	String toAdd10 =  new String("67");
    	String toAdd11 =  new String("15");
    	int expSize = 11;
    	tape.insert(toAdd0 );
    	tape.insert(toAdd1 );
    	tape.insert(toAdd2 );
    	tape.insert(toAdd3 );
    	tape.insert(toAdd4 );
    	tape.insert(toAdd5 );
    	tape.insert(toAdd6 );
    	tape.insert(toAdd7 );
    	tape.insert(toAdd8 );
    	tape.insert(toAdd9 );
    	tape.insert(toAdd10);
    	tape.insert(toAdd11);
    	
    	// act
    	tape.delete( toAdd3);    	
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
    
    
  	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
      @Test
      public void test_insert_NotEmptyList_delete54_Expect_size11()
      {
      	// arrange
      	Tree tape = new BST(NaturalComparator.INSTANCE);
      	String toAdd0 = new String("50");
      	String toAdd1 =  new String("17");
      	String toAdd2 =  new String("72");
      	String toAdd3 =  new String("12");
      	String toAdd4 =  new String("23");
      	String toAdd5 =  new String("54");
      	String toAdd6 =  new String("76");
      	String toAdd7 =  new String("09");
      	String toAdd8 =  new String("14");
      	String toAdd9 =  new String("19");
      	String toAdd10 =  new String("67");
      	String toAdd11 =  new String("15");
      	int expSize = 11;
      	tape.insert(toAdd0 );
      	tape.insert(toAdd1 );
      	tape.insert(toAdd2 );
      	tape.insert(toAdd3 );
      	tape.insert(toAdd4 );
      	tape.insert(toAdd5 );
      	tape.insert(toAdd6 );
      	tape.insert(toAdd7 );
      	tape.insert(toAdd8 );
      	tape.insert(toAdd9 );
      	tape.insert(toAdd10);
      	tape.insert(toAdd11);
      	
      	// act
      	tape.delete( toAdd5);    	
      	
      	// assert
      	assertEquals(tape.size(), expSize);
      }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_insert_NotEmptyList2_Expect_size3()
    {
    	// arrange
    	Tree tape = new BST(NaturalComparator.INSTANCE);
    	String toAdd0 = new String("0");
    	String toAdd1 =  new String("1");
    	int expSize = 2;
    	
    	// act
    	tape.insert(toAdd1);
    	tape.insert(toAdd0);
    	
    	// assert
    	assertEquals(tape.size(), expSize);
    }
       
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byVal_empty_false()
    {
    	// arrange
    	Tree tape = new BST(NaturalComparator.INSTANCE);
    	String searchedVal = new String("0");
    	boolean rcVal = true;
    	int expSize = 0;
    	
    	// act
    	try {
    		tape.delete(searchedVal);
    	}catch(ItemNotFoundException e) {
    		rcVal = false;
    	}
    	
    	// assert
    	assertFalse(rcVal);
    	assertEquals(tape.size(),expSize);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byVal_notEmpty_false()
    {
    	// arrange
    	Tree tape = new BST(NaturalComparator.INSTANCE);
    	String yetAdded0 =  new String("0");
    	String searchedVal = new String("1");
    	boolean rcVal = true;
    	int expSize = 1;
    	
    	// act
    	tape.insert(yetAdded0);
    	try {
    		tape.delete(searchedVal);
    	}catch(ItemNotFoundException e) {
    		rcVal = false;
    	}
    	
    	// assert
    	assertFalse(rcVal);
    	assertEquals(expSize,tape.size());
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_delete_byVal_notEmpty_true()
    {
    	// arrange
    	Tree tape = new BST(NaturalComparator.INSTANCE);
    	String toAdd0 =  new String("0");
    	String toAdd1 =  new String("1");
    	String searchedVal = new String("1");
    	boolean rcVal = true;
    	int expSize = 1;
    	
    	// act
    	tape.insert(toAdd0);
    	tape.insert(toAdd1);
    	
    	try {
    		tape.delete(searchedVal);
    	}catch(ItemNotFoundException e) {
    		rcVal = false;
    	}
    	
    	// assert
    	assertTrue(rcVal);
    	assertEquals(tape.size(),expSize);
    }
    
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_find_empty_false()
    {
    	// arrange
       	Tree tape = new BST(NaturalComparator.INSTANCE);
    	Object rcVal = null;
    	String expVal =  new String("0");
       	String searchedIdx = new String("0");
    	
    	// act
    	try {
    		rcVal = tape.find(searchedIdx);
    	}catch(IndexOutOfBoundsException e)
    	{
    		
    	}
    	
    	// assert
    	assertNull(rcVal);
    }
    
    @Test
    public void test_find_notEmpty_false()
    {
    	// arrange
       	Tree tape = new BST(NaturalComparator.INSTANCE);
    	Object rcVal = null;
    	String expVal =  new String("1");
    	String toAdd1 =  new String("0");
    	String searchedIdx = new String("0");
    	
    	// act
    	tape.insert(toAdd1);
    	
    	try {
    		rcVal = tape.find(searchedIdx);
    	}catch(IndexOutOfBoundsException e){
    		
    	}
    	
    	// assert
    	assertNotNull(rcVal);
    	assertThat(expVal, not(equals(rcVal)));
    }
    
    @Test
    public void test_find_notEmpty_true()
    {
    	// arrange
       	Tree tape = new BST(NaturalComparator.INSTANCE);
    	Object rcVal = null;
    	String toAdd1 =  new String("0");
    	String expVal =  new String("0");
       	String searchedIdx = new String("0");
    	
    	// act
    	tape.insert(toAdd1);
    	rcVal = tape.find(searchedIdx);

    	// assert
    	assertNotNull(rcVal);
    	assertThat(expVal, is(rcVal));
    }
}
