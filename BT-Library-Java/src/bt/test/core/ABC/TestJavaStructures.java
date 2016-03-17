package bt.test.core.ABC;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

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
}

