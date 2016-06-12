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
		/* 0  */ tcMock.add("@student.pwr.edu.pl");
		/* 1  */ tcMock.add("a@student.pwr.edu.pl");
		/* 2  */ tcMock.add("2@student.pwr.edu.pl");
		/* 3  */ tcMock.add("23@student.pwr.edu.pl");
		/* 4  */ tcMock.add("000000@student.pwr.edu.pl");
		/* 5  */ tcMock.add("0000000@student.pwr.edu.pl");
		/* 6  */ tcMock.add("000001@student.pwr.edu.pl");
		/* 7  */ tcMock.add("00000a@student.pwr.edu.pl");
		/* 8  */ tcMock.add("asdzxc@student.pwr.edu.pl");
		/* 9  */ tcMock.add("000001@@student.pwr.edu.pl");
		/* 10 */ tcMock.add("000001 @student.pwr.edu.pl");
		/* 11 */ tcMock.add("000001student.pwr.edu.pl");
		/* 12 */ tcMock.add("000000@.pwr.edu.pl");
	}


	@After
	public void tearDown() throws Exception {
		System.out.println( "TearDown" );
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_12_wczesniejOk_adresSerwera1_Brak_Expect_false()
	{
	    //arrange
		int tcIdx = 12;
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
	public void test_11_nazwa_Konta_6_Cyfr_BrakMalpy_Expect_false()
	{
	    //arrange
		int tcIdx = 11;
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
	public void test_10_nazwa_Konta_6_Cyfr_1_Spacja_Expect_false()
	{
	    //arrange
		int tcIdx = 10;
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
	public void test_9_nazwa_Konta_6_Cyfr_2xMalpa_Expect_false()
	{
	    //arrange
		int tcIdx = 9;
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
	public void test_8_nazwa_Konta_6_Znakow_Expect_false()
	{
	    //arrange
		int tcIdx = 8;
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
	public void test_7_nazwa_Konta_5_Cyfry_1_Znak_Expect_false()
	{
	    //arrange
		int tcIdx = 7;
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
	public void test_6_nazwa_Konta_6_Cyfra_Expect_true()
	{
	    //arrange
		int tcIdx = 6;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = StudentMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertTrue(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_5_nazwa_Konta_7_Cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 5;
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
	public void test_4_nazwa_Konta_6_Cyfra_Expect_true()
	{
	    //arrange
		int tcIdx = 4;
		boolean rcVal = true;
		String inChain = tcMock.get(tcIdx);
		MailMatcher turnstile = StudentMailMatcher.INSTANCE;
		
		//act
		rcVal = turnstile.apply(inChain);
		
		//assert
		assertTrue(rcVal);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_3_nazwa_Konta_2_Cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 3;
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
	public void test_2_nazwa_Konta_1_Cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 2;
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
}
