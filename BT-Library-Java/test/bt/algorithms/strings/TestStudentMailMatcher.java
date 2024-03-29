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
	
	@After
	public void tearDown() throws Exception {
		
	}
	
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
		/* 13 */ tcMock.add("000000@.pwr.edu.pl");
		/* 14 */ tcMock.add("000000@ 2.pwr.edu.pl");
		/* 15 */ tcMock.add("000000@2.pwr.edu.pl");	
		/* 16 */ tcMock.add("000000@student.pwr.edu.pl");	
		/* 17 */ tcMock.add("000000@studentpwr.edu.pl");	
		/* 18 */ tcMock.add("000000@student..pwr.edu.pl");	
		/* 19 */ tcMock.add("000000@student. .edu.pl");	
		/* 20 */ tcMock.add("000000@student..edu.pl");	
		/* 21 */ tcMock.add("000000@student.a.edu.pl");	
		/* 22 */ tcMock.add("000000@student.3.edu.pl");	
		/* 23 */ tcMock.add("000000@student.32.edu.pl");	
		/* 24 */ tcMock.add("000000@student.pwr.edu.pl");	
		/* 25 */ tcMock.add("000000@student.pwr. .pl");		
		/* 26 */ tcMock.add("000000@student.pwr.edu.pl");
		/* 27 */ tcMock.add("000000@student.pwr..pl");
		/* 28 */ tcMock.add("000000@student.pwr.a.pl");
		/* 29 */ tcMock.add("000000@student.pwr.3.pl");
		/* 30 */ tcMock.add("000000@student.pwr.aa.pl");
		/* 31 */ tcMock.add("000000@student.pwr.33.pl");
		/* 32 */ tcMock.add("000000@student.pwr.aa3.pl");
		/* 33 */ tcMock.add("000000@student.pwr.aaaa.pl");
		/* 34 */ tcMock.add("000000@student.pwr.wroc.pl");
		/* 35 */ tcMock.add("000000@student.pwr.wroc. pl");
		/* 36 */ tcMock.add("000000@student.pwr.wroc.pl");
		/* 37 */ tcMock.add("000000@student.pwr.wroc.pd");
		/* 38 */ tcMock.add("000000@student.pwr.wroc.3");
		/* 39 */ tcMock.add("000000@student.pwr.wroc.com");
		/* 40 */ tcMock.add(null);
		/* 41 */ tcMock.add(" ");
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_41_space_Expect_false()
	{
	    //arrange
		int tcIdx = 41;
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
	public void test_40_null_Expect_false()
	{
	    //arrange
		int tcIdx = 40;
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
	public void test_39_wczesniejOk_adresSerwera4_com_Expect_false()
	{
	    //arrange
		int tcIdx = 39;
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
	public void test_38_wczesniejOk_adresSerwera4_cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 38;
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
	public void test_37_wczesniejOk_adresSerwera4_pd_Expect_false()
	{
	    //arrange
		int tcIdx = 37;
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
	public void test_36_wczesniejOk_adresSerwera4_dobry_Expect_true()
	{
	    //arrange
		int tcIdx = 36;
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
	public void test_35_wczesniejOk_adresSerwera4_spacja_Expect_false()
	{
	    //arrange
		int tcIdx = 35;
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
	public void test_34_wczesniejOk_adresSerwera3_dobry_aliasWroc_Expect_true()
	{
	    //arrange
		int tcIdx = 34;
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
	public void test_33_wczesniejOk_adresSerwera3_4_znak_Expect_false()
	{
	    //arrange
		int tcIdx = 33;
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
	public void test_32_wczesniejOk_adresSerwera3_2_znak_1_cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 32;
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
	public void test_31_wczesniejOk_adresSerwera3_2_cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 31;
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
	public void test_30_wczesniejOk_adresSerwera3_2_znak_Expect_false()
	{
	    //arrange
		int tcIdx = 30;
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
	public void test_29_wczesniejOk_adresSerwera3_1_cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 29;
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
	public void test_28_wczesniejOk_adresSerwera3_1_znak_Expect_false()
	{
	    //arrange
		int tcIdx = 28;
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
	public void test_27_wczesniejOk_adresSerwera3_brak_Expect_false()
	{
	    //arrange
		int tcIdx = 27;
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
	public void test_26_wczesniejOk_adresSerwera3_dobry_Expect_true()
	{
	    //arrange
		int tcIdx = 26;
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
	public void test_25_wczesniejOk_adresSerwera3_spacja_Expect_false()
	{
	    //arrange
		int tcIdx = 25;
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
	public void test_24_wczesniejOk_adresSerwera2_2_cyfra_Expect_true()
	{
	    //arrange
		int tcIdx = 24;
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
	public void test_23_wczesniejOk_adresSerwera2_2_cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 23;
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
	public void test_22_wczesniejOk_adresSerwera2_1_znak_Expect_false()
	{
	    //arrange
		int tcIdx = 22;
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
	public void test_21_wczesniejOk_adresSerwera2_1_znak_Expect_false()
	{
	    //arrange
		int tcIdx = 21;
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
	public void test_20_wczesniejOk_adresSerwera2_brak_Expect_false()
	{
	    //arrange
		int tcIdx = 20;
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
	public void test_19_wczesniejOk_adresSerwera2_spacja_Expect_false()
	{
	    //arrange
		int tcIdx = 19;
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
	public void test_18_wczesniejOk_adresSerwera1_dwieKropkiPotem_Expect_false()
	{
	    //arrange
		int tcIdx = 18;
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
	public void test_17_wczesniejOk_adresSerwera1_brakKropkiPotem_Expect_false()
	{
	    //arrange
		int tcIdx = 17;
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
	public void test_16_wczesniejOk_adresSerwera1_dobry_Expect_true()
	{
	    //arrange
		int tcIdx = 16;
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
	public void test_15_wczesniejOk_adresSerwera1_1cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 15;
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
	public void test_14_wczesniejOk_adresSerwera1_spacja_Expect_false()
	{
	    //arrange
		int tcIdx = 14;
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
	public void test_13_wczesniejOk_adresSerwera1_1znak_Expect_false()
	{
	    //arrange
		int tcIdx = 13;
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
	public void test_09_nazwa_Konta_6_Cyfr_2xMalpa_Expect_false()
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
	public void test_08_nazwa_Konta_6_Znakow_Expect_false()
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
	public void test_07_nazwa_Konta_5_Cyfry_1_Znak_Expect_false()
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
	public void test_06_nazwa_Konta_6_Cyfra_Expect_true()
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
	public void test_05_nazwa_Konta_7_Cyfra_Expect_false()
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
	public void test_04_nazwa_Konta_6_Cyfra_Expect_true()
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
	public void test_03_nazwa_Konta_2_Cyfra_Expect_false()
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
	public void test_02_nazwa_Konta_1_Cyfra_Expect_false()
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
	public void test_01_nazwa_Konta_1_Znak_Expect_false()
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
	public void test_00_nazwa_Konta_0_Znakow_Expect_false()
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
