package bt.test.algorithms.sorting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.Sequences;
import bt.algorithms.comparators.EdgeComparator;
import bt.algorithms.comparators.NaturalComparator;
import bt.algorithms.sorting.BubbleSortOptimal;
import bt.algorithms.sorting.BubbleSortPrimitive;
import bt.algorithms.sorting.QuickSort;
import bt.collections.graphs.Edge;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;
import bt.collections.lists.LinkedList;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestQuickSort extends TestCase
{
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_QuickSort_63124805_Expect_01234568_True()
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
		orderedTape = new QuickSort(NaturalComparator.INSTANCE).sort(tape);
	    
	    //assert
	    assertEquals(expectedTape,orderedTape);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_QuickSort_63124805_10_7_9_15_11_13_12_14_Expect_0123456789101112131415_True()
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
		orderedTape = new QuickSort(NaturalComparator.INSTANCE).sort(tape);
	    
	    //assert
	    assertEquals(expectedTape,orderedTape);
	}

		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_QuickSort_empty_Expect_empty_True()
		{
		    //arrange	    
			List tape = new ArrayList(10);
			List orderedTape = null;
			List expectedTape = new ArrayList(10);
			
		    //act
			orderedTape = new QuickSort(NaturalComparator.INSTANCE).sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
		
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_QuickSort_onEdgeList_Expect_True()
		{
		    //arrange	    
			List tape = getEdgeListMixed();
			List orderedTape = null;
			List expectedTape = getEdgeListOrdered();
			boolean rcLogic = true;
			boolean expLogic = true;
			
		    //act
			orderedTape = new QuickSort(new EdgeComparator()).sort(tape);
		    
		    //assert
			Iterator fstIt = orderedTape.iterator();
			Iterator sndIt = expectedTape.iterator();
			fstIt.first(); sndIt.first();
			while(!fstIt.isDone()&&!sndIt.isDone()) {
				rcLogic &= fstIt.current().equals(sndIt.current());
				fstIt.next(); sndIt.next();		
			}
				
		    assertTrue(rcLogic);
		}
		
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_QuickSort_012345678_Expect_012345678_True()
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
			orderedTape = new QuickSort(NaturalComparator.INSTANCE).sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
		
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_QuickSort_876543210_Expect_012345678_True()
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
			orderedTape = new QuickSort(NaturalComparator.INSTANCE).sort(tape);
		    
		    //assert
		    assertEquals(expectedTape,orderedTape);
		}
		
		public LinkedList getEdgeListOrdered() {
			LinkedList retVal = new LinkedList();
			retVal.add(new Edge<Integer,String>(0,1,"ab"));
			retVal.add(new Edge<Integer,String>(0,3,"ad"));
			retVal.add(new Edge<Integer,String>(1,2,"bc"));
			retVal.add(new Edge<Integer,String>(1,4,"be"));
			retVal.add(new Edge<Integer,String>(2,3,"cd"));
			retVal.add(new Edge<Integer,String>(2,4,"ce"));
			retVal.add(new Edge<Integer,String>(3,5,"df"));
			retVal.add(new Edge<Integer,String>(4,6,"eg"));
			retVal.add(new Edge<Integer,String>(5,6,"fg"));
			retVal.add(new Edge<Integer,String>(5,7,"fh"));
			retVal.add(new Edge<Integer,String>(6,8,"gi"));
			retVal.add(new Edge<Integer,String>(7,8,"hi"));
			return retVal;
		}
		
		public LinkedList getEdgeListMixed() {
			LinkedList retVal = new LinkedList();
			retVal.add(new Edge<Integer,String>(2,3,"cd"));
			retVal.add(new Edge<Integer,String>(5,7,"fh"));
			retVal.add(new Edge<Integer,String>(0,3,"ad"));	
			retVal.add(new Edge<Integer,String>(1,2,"bc"));		
			retVal.add(new Edge<Integer,String>(7,8,"hi"));
			retVal.add(new Edge<Integer,String>(2,4,"ce"));
			retVal.add(new Edge<Integer,String>(3,5,"df"));
			retVal.add(new Edge<Integer,String>(4,6,"eg"));
			retVal.add(new Edge<Integer,String>(1,4,"be"));
			retVal.add(new Edge<Integer,String>(6,8,"gi"));
			retVal.add(new Edge<Integer,String>(5,6,"fg"));
			retVal.add(new Edge<Integer,String>(0,1,"ab"));		
			return retVal;
		}
}
