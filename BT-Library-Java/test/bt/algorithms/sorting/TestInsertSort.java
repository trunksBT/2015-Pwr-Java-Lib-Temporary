package bt.algorithms.sorting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.Sequences;
import bt.algorithms.comparators.NaturalComparator;
import bt.algorithms.interfaces.ListOneElemSorter;
import bt.algorithms.interfaces.ListSorter;
import bt.algorithms.sorting.BubbleSortOptimal;
import bt.algorithms.sorting.ShellSort;
import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestInsertSort extends TestCase
{
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_InsertSort_63124805_Expect_01234568_True()
	{
	    //arrange	    
		List tape = new ArrayList(10);
		List orderedTape = null;
		List expectedTape = new ArrayList(10);
		ListSorter algo =  new InsertSort(NaturalComparator.INSTANCE);
		
		tape.add(new Integer(6));
		tape.add(new Integer(3));
		tape.add(new Integer(1));
		tape.add(new Integer(2));
		tape.add(new Integer(4));
		tape.add(new Integer(8));
		tape.add(new Integer(0));
		tape.add(new Integer(5));

		expectedTape.add(new Integer(0));
		expectedTape.add(new Integer(1));
		expectedTape.add(new Integer(2));
		expectedTape.add(new Integer(3));
		expectedTape.add(new Integer(4));
		expectedTape.add(new Integer(5));
		expectedTape.add(new Integer(6));
		expectedTape.add(new Integer(8));
			      
	    //act
		orderedTape = algo.sort(tape);
	    
	    //assert
	    assertEquals(expectedTape,orderedTape);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_InsertSort_63124805_10_7_9_15_11_13_12_14_Expect_0123456789101112131415_True()
	{
	    //arrange	    
		List tape = new ArrayList(10);
		List orderedTape = null;
		List expectedTape = new ArrayList(10);
		ListSorter algo =  new InsertSort(NaturalComparator.INSTANCE);
		
		tape.add(new Integer(6));
		tape.add(new Integer(3));
		tape.add(new Integer(1));
		tape.add(new Integer(2));
		tape.add(new Integer(4));
		tape.add(new Integer(8));
		tape.add(new Integer(0));
		tape.add(new Integer(5));
		tape.add(new Integer(10));
		tape.add(new Integer(7));
		tape.add(new Integer(9));
		tape.add(new Integer(15));
		tape.add(new Integer(11));
		tape.add(new Integer(13));
		tape.add(new Integer(12));
		tape.add(new Integer(14));
		tape.add(new Integer(18));
		tape.add(new Integer(17));
		tape.add(new Integer(16));

		expectedTape.add(new Integer(0));
		expectedTape.add(new Integer(1));
		expectedTape.add(new Integer(2));
		expectedTape.add(new Integer(3));
		expectedTape.add(new Integer(4));
		expectedTape.add(new Integer(5));
		expectedTape.add(new Integer(6));
		expectedTape.add(new Integer(7));
		expectedTape.add(new Integer(8));
		expectedTape.add(new Integer(9));
		expectedTape.add(new Integer(10));
		expectedTape.add(new Integer(11));
		expectedTape.add(new Integer(12));
		expectedTape.add(new Integer(13));
		expectedTape.add(new Integer(14));
		expectedTape.add(new Integer(15));
		expectedTape.add(new Integer(16));
		expectedTape.add(new Integer(17));
		expectedTape.add(new Integer(18));
			      
	    //act
		orderedTape = algo.sort(tape);
	    
	    //assert
	    assertEquals(expectedTape,orderedTape);
	}

		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_InsertSort_empty_Expect_empty_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			List orderedTape = null;
			List expectedTape = new ArrayList(10);
			ListSorter algo =  new InsertSort(NaturalComparator.INSTANCE);
			
		    //act
			orderedTape = algo.sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
		
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_InsertSort_012345678_Expect_012345678_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			List orderedTape = null;
			List expectedTape = new ArrayList(10);			
			ListSorter algo =  new InsertSort(NaturalComparator.INSTANCE);
			
			expectedTape.add(new Integer(0));
			expectedTape.add(new Integer(1));
			expectedTape.add(new Integer(2));
			expectedTape.add(new Integer(3));
			expectedTape.add(new Integer(4));
			expectedTape.add(new Integer(5));
			expectedTape.add(new Integer(6));
			expectedTape.add(new Integer(7));
			expectedTape.add(new Integer(8));
			
			tape.add(new Integer(0));
			tape.add(new Integer(1));
			tape.add(new Integer(2));
			tape.add(new Integer(3));
			tape.add(new Integer(4));
			tape.add(new Integer(5));
			tape.add(new Integer(6));
			tape.add(new Integer(7));
			tape.add(new Integer(8));
						      
		    //act
			orderedTape = algo.sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
		
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_InsertSort_876543210_Expect_012345678_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			List orderedTape = null;
			List expectedTape = new ArrayList(10);		
			ListSorter algo =  new InsertSort(NaturalComparator.INSTANCE);
			
			tape.add(new Integer(8));
			tape.add(new Integer(7));
			tape.add(new Integer(6));
			tape.add(new Integer(5));
			tape.add(new Integer(4));
			tape.add(new Integer(3));
			tape.add(new Integer(2));
			tape.add(new Integer(1));
			tape.add(new Integer(0));
			
			expectedTape.add(new Integer(0));
			expectedTape.add(new Integer(1));
			expectedTape.add(new Integer(2));
			expectedTape.add(new Integer(3));
			expectedTape.add(new Integer(4));
			expectedTape.add(new Integer(5));
			expectedTape.add(new Integer(6));
			expectedTape.add(new Integer(7));
			expectedTape.add(new Integer(8));
						      
		    //act
			orderedTape =algo.sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
		
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_OneElemInsertSort_01234568_7_Expect_012345678_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			Object elemToInsert = new Integer(7);
			List orderedTape = null;
			List expectedTape = new ArrayList(10);		
			ListOneElemSorter algo = new InsertOneElementSort(NaturalComparator.INSTANCE);
			
			expectedTape.add(new Integer(0));
			expectedTape.add(new Integer(1));
			expectedTape.add(new Integer(2));
			expectedTape.add(new Integer(3));
			expectedTape.add(new Integer(4));
			expectedTape.add(new Integer(5));
			expectedTape.add(new Integer(6));
			expectedTape.add(new Integer(7));
			expectedTape.add(new Integer(8));
			
			tape.add(new Integer(0));
			tape.add(new Integer(1));
			tape.add(new Integer(2));
			tape.add(new Integer(3));
			tape.add(new Integer(4));
			tape.add(new Integer(5));
			tape.add(new Integer(6));
			tape.add(new Integer(8));
						      
		    //act
			orderedTape = algo.sort(tape,elemToInsert);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
		
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_OneElemInsertSort_null_7_Expect_null_True()
		{
		    //arrange	    
			List tape = null;
			Object elemToInsert = new Integer(7);
			List orderedTape = null;
			List expectedTape = null;
			ListOneElemSorter algo = new InsertOneElementSort(NaturalComparator.INSTANCE);

		    //act
			orderedTape = algo.sort(tape,elemToInsert);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
}
