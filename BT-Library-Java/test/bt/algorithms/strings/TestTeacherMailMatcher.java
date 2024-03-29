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
		
	}
	
	@Before
	public void setUp() throws Exception {
		tcMock = new ArrayList<>(ammOfTc);
		/* 00  */ tcMock.add("@pwr.edu.pl");
		/* 01  */ tcMock.add("a.ala@pwr.edu.pl");
		/* 02  */ tcMock.add("2.ala@pwr.edu.pl");
		/* 03  */ tcMock.add("23.ala@pwr.edu.pl");
		/* 04  */ tcMock.add("000000.ala@pwr.edu.pl");
		/* 05  */ tcMock.add("0000000.ala@pwr.edu.pl");
		/* 06  */ tcMock.add("00000a.ala@pwr.edu.pl");
		/* 07  */ tcMock.add("asdzxc.ala@pwr.edu.pl");
		/* 08  */ tcMock.add("ala.a@pwr.edu.pl");
		/* 09  */ tcMock.add("ala.2@pwr.edu.pl");
		/* 10  */ tcMock.add("ala.23@pwr.edu.pl");
		/* 11  */ tcMock.add("ala.000000@pwr.edu.pl");
		/* 12  */ tcMock.add("000000@student.pwr.edu.pl");
		/* 13  */ tcMock.add("ala.000001@pwr.edu.pl");
		/* 14  */ tcMock.add("ala.00000a@pwr.edu.pl");
		/* 15  */ tcMock.add("ala.asdzxc@pwr.edu.pl");
		/* 16  */ tcMock.add("ala.nowak@@pwr.edu.pl");
		/* 17  */ tcMock.add("ala.nowak @pwr.edu.pl");
		/* 18  */ tcMock.add("ala.nowakpwr.edu.pl");
		/* 19  */ tcMock.add("ala.nowak@..pwr.edu.pl");
		/* 20  */ tcMock.add("ala.nowak@ .edu.pl");
		/* 21  */ tcMock.add("ala.nowak@.edu.pl");
		/* 22  */ tcMock.add("ala.nowak@a.edu.pl");
		/* 23  */ tcMock.add("ala.nowak@3.edu.pl");
		/* 24  */ tcMock.add("ala.nowak@32.edu.pl");
		/* 25  */ tcMock.add("ala.nowak@pwr.edu.pl");
		/* 26  */ tcMock.add("ala.nowak@pwr. .pl");
		/* 27  */ tcMock.add("ala.nowak@pwr..pl");
		/* 28  */ tcMock.add("ala.nowak@pwr.a.pl");
		/* 29  */ tcMock.add("ala.nowak@pwr.3.pl");
		/* 30  */ tcMock.add("ala.nowak@pwr.aa.pl");
		/* 31  */ tcMock.add("ala.nowak@pwr.33.pl");
		/* 32  */ tcMock.add("ala.nowak@pwr.aa3.pl");
		/* 33  */ tcMock.add("ala.nowak@pwr.aaaa.pl");
		/* 34  */ tcMock.add("ala.nowak@pwr.wroc.pl");
		/* 35  */ tcMock.add("ala.nowak@pwr.wroc. pl");
		/* 36  */ tcMock.add("ala.nowak@pwr.wroc.pd");
		/* 37  */ tcMock.add("ala.nowak@pwr.wroc.3");
		/* 38  */ tcMock.add("ala.nowak@pwr.wroc.com");
		/* 39  */ tcMock.add("alaasdasdasdasdasdasdsdfasdfasdf.nowakasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf@pwr.wroc.com");
		/* 40  */ tcMock.add(" ");	
		/* 41  */ tcMock.add(null);	
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_41_null_Expect_false()
	{
	    //arrange
		int tcIdx = 41;
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
	public void test_40_space_Expect_false()
	{
	    //arrange
		int tcIdx = 40;
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
	public void test_39_ponad64_nazwaUzytkownika_Expect_false()
	{
	    //arrange
		int tcIdx = 39;
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
	public void test_38_wczesniejOk_adresSerwera3_com_Expect_false()
	{
	    //arrange
		int tcIdx = 38;
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
	public void test_37_wczesniejOk_adresSerwera3_pd_Expect_false()
	{
	    //arrange
		int tcIdx = 37;
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
	public void test_36_wczesniejOk_adresSerwera3_pd_Expect_false()
	{
	    //arrange
		int tcIdx = 36;
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
	public void test_35_wczesniejOk_adresSerwera3_spacja_Expect_false()
	{
	    //arrange
		int tcIdx = 35;
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
	public void test_34_wczesniejOk_adresSerwera2_dobry_aliasWroc_Expect_true()
	{
	    //arrange
		int tcIdx = 34;
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
	public void test_33_wczesniejOk_adresSerwera2_4_znak_Expect_false()
	{
	    //arrange
		int tcIdx = 33;
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
	public void test_32_wczesniejOk_adresSerwera2_2_znak_1_cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 32;
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
	public void test_31_wczesniejOk_adresSerwera2_2_cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 31;
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
	public void test_30_wczesniejOk_adresSerwera2_2_znak_Expect_false()
	{
	    //arrange
		int tcIdx = 30;
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
	public void test_29_wczesniejOk_adresSerwera2_1_cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 29;
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
	public void test_28_wczesniejOk_adresSerwera2_1_znak_Expect_false()
	{
	    //arrange
		int tcIdx = 28;
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
	public void test_27_wczesniejOk_adresSerwera2_brak_Expect_false()
	{
	    //arrange
		int tcIdx = 27;
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
	public void test_26_wczesniejOk_adresSerwera3_spacja_Expect_false()
	{
	    //arrange
		int tcIdx = 26;
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
	public void test_25_wczesniejOk_adresSerwera1_dobry_Expect_true()
	{
	    //arrange
		int tcIdx = 25;
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
	public void test_24_wczesniejOk_adresSerwera1_2_cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 24;
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
	public void test_23_wczesniejOk_adresSerwera1_1_cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 23;
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
	public void test_22_wczesniejOk_adresSerwera1_1_znak_Expect_false()
	{
	    //arrange
		int tcIdx = 22;
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
	public void test_21_wczesniejOk_adresSerwera1_brak_Expect_false()
	{
	    //arrange
		int tcIdx = 21;
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
	public void test_20_wczesniejOk_adresSerwera1_spacja_Expect_false()
	{
	    //arrange
		int tcIdx = 20;
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
	public void test_19_wczesniejOk_adresSerwera1_dwieKropkiPotem_Expect_false()
	{
	    //arrange
		int tcIdx = 19;
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
	public void test_18_wczesniejOk_Cyfr_BrakMalpy_Expect_false()
	{
	    //arrange
		int tcIdx = 18;
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
	public void test_17_wczesniejOk_Cyfr_1_Spacja_Expect_false()
	{
	    //arrange
		int tcIdx = 17;
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
	public void test_16_wczesniejOk_6_Cyfr_2xMalpa_Expect_false()
	{
	    //arrange
		int tcIdx = 16;
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
	public void test_15_nazwa_Konta2_6_Znakow_Expect_true()
	{
	    //arrange
		int tcIdx = 15;
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
	public void test_14_nazwa_Konta2_5_Cyfry_1_Znak_Expect_false()
	{
	    //arrange
		int tcIdx = 14;
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
	public void test_13_nazwa_Konta2_6_Cyfry_Expect_false()
	{
	    //arrange
		int tcIdx = 13;
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
	public void test_12_nazwa_Konta1y2_6_Cyfry_Expect_false()
	{
	    //arrange
		int tcIdx = 12;
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
	public void test_11_nazwa_Konta2_6_Cyfry_Expect_false()
	{
	    //arrange
		int tcIdx = 11;
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
	public void test_10_nazwa_Konta2_2_Cyfry_Expect_false()
	{
	    //arrange
		int tcIdx = 10;
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
	public void test_09_nazwa_Konta2_1_Cyfra_Expect_false()
	{
	    //arrange
		int tcIdx = 9;
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
	public void test_08_nazwa_Konta2_1_Znak_Expect_true()
	{
	    //arrange
		int tcIdx = 8;
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
	public void test_07_nazwa_Konta1_6_Znakow_Expect_true()
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
	public void test_06_nazwa_Konta1_5_Cyfry_1_Znak_Expect_false()
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
	public void test_05_nazwa_Konta1_7_Cyfry_Expect_false()
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
	public void test_04_nazwa_Konta1_6_Cyfry_Expect_false()
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
	public void test_03_nazwa_Konta1_2_Cyfry_Expect_false()
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
	public void test_02_nazwa_Konta1_1_Cyfra_Expect_false()
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
	public void test_01_nazwa_Konta1_1_Znak_Expect_true()
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
	public void test_00_nazwa_Konta1y2_0_Znakow_Expect_false()
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
