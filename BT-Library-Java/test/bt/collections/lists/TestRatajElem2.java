package bt.collections.lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;
import bt.collections.lists.RatajElem2;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestRatajElem2 extends TestCase {
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_4size_true()
    {
    	// arrange
    	RatajElem2 hd = new RatajElem2(0, new RatajElem2(1, new RatajElem2(2, new RatajElem2(3, null))));
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_null_true()
    {
    	// arrange
    	RatajElem2 hd = null;
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_1size_true()
    {
    	// arrange
    	RatajElem2 hd = new RatajElem2(3,null);
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
}