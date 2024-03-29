package bt.algorithms.strings;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStringUtils extends TestCase
{
	// testCases further refered as tc
	public ArrayList<String> tcMock;
	public final int ammOfTc = 46;
	
	@Before
	public void setUp() throws Exception {
		tcMock = new ArrayList<>(ammOfTc);
		tcMock.add("@student.pwr.edu.pl");
		tcMock.add("123@student.pwr.edu.pl");
	}

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_uppCase_0_nazwa_Konta_0_Znakow_Expect_true()
	{
	    //arrange
		int tcIdx = 0;
		String rcVal ;
		String inChain = tcMock.get(tcIdx);
		String expVal = "@STUDENT.PWR.EDU.PL";
		
		//act
		rcVal = StringUtils.upCase(inChain);
		
		//assert
		assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_uppCase_0_nazwa_Konta_0_Znakow_Expect_false()
	{
	    //arrange
		int tcIdx = 0;
		String rcVal ;
		String inChain = tcMock.get(tcIdx);
		String expVal = "@STuDENT.PWR.EDU.PL";
		
		//act
		rcVal = StringUtils.upCase(inChain);
		
		//assert
		assertFalse(expVal.equals(rcVal));
	}
	
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_uppCase_1_nazwa_Konta_numbers_Znakow_Expect_true()
	{
	    //arrange
		int tcIdx = 1;
		String rcVal ;
		String inChain = tcMock.get(tcIdx);
		String expVal = "123@STUDENT.PWR.EDU.PL";
		
		//act
		rcVal = StringUtils.upCase(inChain);
		
		//assert
		assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_Character_isLetter_dot_Expect_false()
	{
	    //arrange
		boolean expVal = false;
		boolean rcVal;
		
		//act
		rcVal = Character.isLetter('.');
		
		//assert
		assertEquals(expVal, rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_Character_Monkey_dot_Expect_false()
	{
	    //arrange
		boolean expVal = false;
		boolean rcVal;
		
		//act
		rcVal = Character.isLetter('@');
		
		//assert
		assertEquals(expVal, rcVal);
	}
}
