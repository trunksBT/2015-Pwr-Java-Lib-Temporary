package bt.algorithms.strings;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import junit.framework.TestCase;

public class TestStringBufferVsString extends TestCase
{
	int loopMultiplier = 10000000;
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_appendBigValueToString100Times_Expect_Exception()
	{
	    //arrange
		String inChain = "Siema";
		String valToAppend = new String("Siema");
		
		long startTime = System.currentTimeMillis();

		for(int i = 0 ; i < loopMultiplier;i++)
		{
			inChain+=valToAppend;
		}
			
		long estimatedTime = System.currentTimeMillis() - startTime;
		
		System.out.println(estimatedTime);
	}
	
	@Test
	public void test_appendBigValueToStringBuffer100Times_Expect_Exception()
	{
	    //arrange
		StringBuffer inChain = new StringBuffer("Siema");
		String valToAppend = "Siema";
		
		long startTime = System.currentTimeMillis();

		for(int i = 0 ; i < loopMultiplier;i++)
		{
			inChain.append(valToAppend);
		}
		
		inChain.toString();
			
		long estimatedTime = System.currentTimeMillis() - startTime;
		
		System.out.println(estimatedTime);
	}
}
