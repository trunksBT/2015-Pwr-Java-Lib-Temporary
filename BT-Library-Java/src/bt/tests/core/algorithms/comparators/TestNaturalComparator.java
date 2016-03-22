package bt.tests.core.algorithms.comparators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.algorithms.comparators.NaturalComparator;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestNaturalComparator extends TestCase
{
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_NaturalComparator_1y2_Expect_m1_True()
	{
	    //arrange
		Integer val1 = new Integer(1);
		Integer val2 = new Integer(2);
		int expVal = -1;
		int rcVal = 0;
		
		//act
		rcVal = NaturalComparator.INSTANCE.compare(val1, val2);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_nativeComparator_1y2_Expect_m1_True()
	{
	    //arrange
		Integer val1 = new Integer(1);
		Integer val2 = new Integer(2);
		int expVal = -1;
		int rcVal = 0;
		
		//act
		rcVal = val1.compareTo(val2);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}

}