package bt.algorithms.strings;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestTeacherMailMatcher extends TestCase
{
	// testCases further refered as tc
	public ArrayList<String> tcMock;
	public final int ammOfTc = 46;
	
	@After
	public void tearDown() throws Exception {
		System.out.println( "TearDown" );
	}
	
	@Before
	public void setUp() throws Exception {
		tcMock = new ArrayList<>(ammOfTc);
		/* 0  */ tcMock.add("@pwr.edu.pl");
		/* 1  */ tcMock.add("a.ala@pwr.edu.pl");
		/* 2  */ tcMock.add("2.ala@pwr.edu.pl");
		/* 3  */ tcMock.add("23.ala@pwr.edu.pl");
		/* 4  */ tcMock.add("000000.ala@pwr.edu.pl");
		/* 5  */ tcMock.add("0000000.ala@pwr.edu.pl");
		/* 6  */ tcMock.add("00000a.ala@pwr.edu.pl");
		/* 7  */ tcMock.add("asdzxc.ala@pwr.edu.pl");
				
	}

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_7_nazwa_Konta1_6_Znakow_Expect_true()
	{
	    //arrange
		int tcIdx = 7;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = TeacherMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertTrue(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_6_nazwa_Konta1_5_Cyfry_1_Znak_Expect_false()
	{
	    //arrange
		int tcIdx = 6;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = TeacherMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertFalse(rcVal);
	}

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_5_nazwa_Konta1_7_Cyfry_Expect_false()
	{
	    //arrange
		int tcIdx = 5;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = TeacherMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertFalse(rcVal);
	}

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_4_nazwa_Konta1_6_Cyfry_Expect_false()
	{
	    //arrange
		int tcIdx = 4;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = TeacherMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertFalse(rcVal);
	}

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_3_nazwa_Konta1_2_Cyfry_Expect_false()
	{
	    //arrange
		int tcIdx = 3;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = TeacherMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertFalse(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_2_nazwa_Konta1_1_Cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 2;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = TeacherMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertFalse(rcVal);
	}
	

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_1_nazwa_Konta1_1_Znak_Expect_true()
	{
	    //arrange
		int tcIdx = 1;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = TeacherMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertTrue(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_0_nazwa_Konta1y2_0_Znakow_Expect_false()
	{
	    //arrange
		int tcIdx = 0;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = TeacherMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertFalse(rcVal);
	}
}
