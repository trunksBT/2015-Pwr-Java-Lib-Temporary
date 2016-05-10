package bt.core.wrox.algosFromBegg;

import java.io.File;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.wrox.algosFromBegg.RecursiveFolderTreeProcessing;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestRecursiveFolderTreeProcessing extends TestCase{
		private static final String SPACES = "  ";
	
		//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
		@Test
		public void test_print_Elocation_True()
		{
			// arrange
			
			// act
			
			RecursiveFolderTreeProcessing.print(new File("E:\\Games\\"), SPACES);
				
			// assert
			assertTrue(true);
		}
}
