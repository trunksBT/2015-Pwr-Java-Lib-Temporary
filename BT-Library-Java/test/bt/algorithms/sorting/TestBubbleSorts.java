package bt.algorithms.sorting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.Sequences;
import bt.algorithms.comparators.NaturalComparator;
import bt.algorithms.sorting.BubbleSortOptimal;
import bt.algorithms.sorting.BubbleSortPrimitive;
import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestBubbleSorts extends TestCase
{
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_BubbleSortPrimitive_63124805_Expect_01234568_True()
	{
	    //arrange	    
		List tape = new ArrayList(10);
		List orderedTape = null;
		tape.add(new Integer(6));
		tape.add(new Integer(3));
		tape.add(new Integer(1));
		tape.add(new Integer(2));
		tape.add(new Integer(4));
		tape.add(new Integer(8));
		tape.add(new Integer(0));
		tape.add(new Integer(5));
		List expectedTape = new ArrayList(10);
		expectedTape.add(new Integer(0));
		expectedTape.add(new Integer(1));
		expectedTape.add(new Integer(2));
		expectedTape.add(new Integer(3));
		expectedTape.add(new Integer(4));
		expectedTape.add(new Integer(5));
		expectedTape.add(new Integer(6));
		expectedTape.add(new Integer(8));
			      
	    //act
		orderedTape = new BubbleSortPrimitive(NaturalComparator.INSTANCE).sort(tape);
	    
	    //assert
	    assertEquals(expectedTape,orderedTape);
	}


	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_BubbleSortPrimitive_876543210_Expect_012345678_True()
	{
	    //arrange	    
		List tape = new ArrayList(10);
		List orderedTape = null;
		List expectedTape = new ArrayList(10);		
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
		orderedTape = new BubbleSortPrimitive(NaturalComparator.INSTANCE).sort(tape);
	    
	    //assert
	    assertEquals(expectedTape,orderedTape);
	}
		
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_BubbleSortPrimitive_empty_Expect_empty_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			List orderedTape = null;
			List expectedTape = new ArrayList(10);
				      
		    //act
			orderedTape = new BubbleSortPrimitive(NaturalComparator.INSTANCE).sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}


		
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_BubbleSortPrimitive_012345678_Expect_012345678_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			List orderedTape = null;
			List expectedTape = new ArrayList(10);			
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
			orderedTape = new BubbleSortPrimitive(NaturalComparator.INSTANCE).sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
	
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_BubbleSortOptimal_012345678_Expect_012345678_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			List orderedTape = null;
			List expectedTape = new ArrayList(10);
			expectedTape.add(new Integer(0));
			expectedTape.add(new Integer(1));
			expectedTape.add(new Integer(2));
			expectedTape.add(new Integer(3));
			expectedTape.add(new Integer(4));
			expectedTape.add(new Integer(5));
			expectedTape.add(new Integer(6));
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
			orderedTape = new BubbleSortOptimal(NaturalComparator.INSTANCE).sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}

	
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_BubbleSortOptimal_876543210_Expect_012345678_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			List orderedTape = null;
			List expectedTape = new ArrayList(10);
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
			orderedTape = new BubbleSortOptimal(NaturalComparator.INSTANCE).sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}

		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_BubbleSortOptimal_63124805_Expect_01234568_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			List orderedTape = null;
			tape.add(new Integer(6));
			tape.add(new Integer(3));
			tape.add(new Integer(1));
			tape.add(new Integer(2));
			tape.add(new Integer(4));
			tape.add(new Integer(8));
			tape.add(new Integer(0));
			tape.add(new Integer(5));
			List expectedTape = new ArrayList(10);
			expectedTape.add(new Integer(0));
			expectedTape.add(new Integer(1));
			expectedTape.add(new Integer(2));
			expectedTape.add(new Integer(3));
			expectedTape.add(new Integer(4));
			expectedTape.add(new Integer(5));
			expectedTape.add(new Integer(6));
			expectedTape.add(new Integer(8));
				      
		    //act
			orderedTape = new BubbleSortOptimal(NaturalComparator.INSTANCE).sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
		
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_BubbleSortOptimal_empty_Expect_empty_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			List orderedTape = null;
			List expectedTape = new ArrayList(10);
			
		    //act
			orderedTape = new BubbleSortOptimal(NaturalComparator.INSTANCE).sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
}
