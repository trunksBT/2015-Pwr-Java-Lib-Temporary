package bt.collections.lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;
import bt.collections.lists.RatajElem;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestRatajElem extends TestCase {
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_4size_true()
    {
    	// arrange
    	RatajElem hd = new RatajElem(0, new RatajElem(1, new RatajElem(2, new RatajElem(3, null))));
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_null_true()
    {
    	// arrange
    	RatajElem hd = null;
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_1size_true()
    {
    	// arrange
    	RatajElem hd = new RatajElem(3,null);
    	
    	// act
    	
    	// assert
    	assertTrue(true);
    }
}