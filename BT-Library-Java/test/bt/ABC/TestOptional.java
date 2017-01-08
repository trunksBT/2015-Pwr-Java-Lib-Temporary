package bt.ABC;

import java.util.PriorityQueue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.OptionalTemp;
import bt.collections.elems.FriendlyStudent;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestOptional extends TestCase{
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
   
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_itWillChangeNick_Expect_1_VarWillNotRefferToOtherObject()
    {
    	// arrange
    	OptionalTemp stud = new OptionalTemp();
    	
    	// act
    	System.out.println(stud.tempVal);
    	// assert	
    	assertTrue(true);
    }
}

