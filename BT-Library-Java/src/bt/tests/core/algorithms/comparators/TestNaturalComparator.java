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
	public void test_NaturalComparator_2y1_Expect_1_True()
	{
	    //arrange
		Integer val1 = new Integer(2);
		Integer val2 = new Integer(1);
		int expVal = 1;
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
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_nativeComparator_9y50_Expect_m41_True()
	{
	    //arrange
		Integer val1 = new Integer(9);
		Integer val2 = new Integer(50);
		int expVal = -1;
		int rcVal = 0;
		
		//act
		rcVal = val1.compareTo(val2);
	    
	    //assert
	    assertEquals(expVal,rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_nativeComparator_Strings_9y50_Expect_True()
	{
	    //arrange
		String val1 = "9";
		String val2 = "50";
		int rcVal = 0;
		
		//act
		rcVal = compareTo(val1,val2);
		System.out.println( rcVal );
	    
	    //assert
	    assertTrue(rcVal<0);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_nativeComparator_Strings_09y50_Expect_True()
	{
	    //arrange
		String val1 = "09";
		String val2 = "50";
		int rcVal = 0;
		
		//act
		rcVal = compareTo(val1,val2);
		System.out.println( rcVal );
	    
	    //assert
	    assertTrue(rcVal<0);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_nativeComparator_Strings_59y50_Expect_9_True()
	{
	    //arrange
		String val1 = "59";
		String val2 = "50";
		int rcVal = 0;
		int expVal = 9;
		
		//act
		rcVal = compareTo(val1,val2);
		System.out.println( rcVal );
	    
	    //assert
	    assertEquals(expVal, rcVal);
	}
	
    public int compareTo(String val1,String val2) {
        int len1 = val1.length();
        int len2 = val2.length();
        int lim = Math.min(len1, len2);
        char v1[] = val1.toCharArray();
        char v2[] = val2.toCharArray();

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }

}
