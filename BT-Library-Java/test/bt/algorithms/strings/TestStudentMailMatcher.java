package bt.algorithms.strings;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStudentMailMatcher extends TestCase
{
	// testCases further refered as tc
	public ArrayList<String> tcMock;
	public final int ammOfTc = 46;
	
	@Before
	public void setUp() throws Exception {
		tcMock = new ArrayList<>(ammOfTc);
		tcMock.add("@student.pwr.edu.pl");
		tcMock.add("a@student.pwr.edu.pl");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println( "TearDown" );
	}

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_0_nazwa_Konta_0_Znakow_Expect_false()
	{
	    //arrange
		int tcIdx = 0;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = StudentMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertFalse(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_1_nazwa_Konta_1_Znak_Expect_false()
	{
	    //arrange
		int tcIdx = 1;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = StudentMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertFalse(rcVal);
	}
}