package bt.tests.core.algorithms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.algorithms.Strings;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStrings extends TestCase
{				
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_FirstRight_False()
	{
	    //arrange	    
	    String chain = ")sdfdsf(";
	    boolean rcVal;
	      
	    //act
	    rcVal = Strings.parenthesisOK(chain);
	    
	    //assert
	    assertFalse(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_TwoLeftOneRight_False()
	{
	    //arrange	    
	    String chain = "(()sdfdsf";
	    boolean rcVal;
	      
	    //act
	    rcVal = Strings.parenthesisOK(chain);
	    
	    //assert
	    assertFalse(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_OnlyLeftAndRightProper_True()
	{
	    //arrange	    
	    String chain = "()";
	    boolean rcVal;
	      
	    //act
	    rcVal = Strings.parenthesisOK(chain);
	    
	    //assert
	    assertTrue(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_LongerProperAndOnlyLeftAndRightProper_True()
	{
	    //arrange	    
	    String chain = "(asdsds)(asdds)()";
	    boolean rcVal;
	      
	    //act
	    rcVal = Strings.parenthesisOK(chain);
	    
	    //assert
	    assertTrue(rcVal);
	}
}
