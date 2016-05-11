package bt.collections.various;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.elems.Player;
import bt.collections.various.Competition;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCompetition extends TestCase
{				
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_PrintAll_True()
	{
	    //arrange
	    Competition comp = new Competition();
	    	      
	    //act
	    comp.printAll();
	    
	    //assert    
	    assertTrue(true);
	}
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_PrintAllOk_True_1()
	{
	    //arrange
	    Competition comp = new Competition(
	    		new Player[] {
	    				new Player("Adam",0),
	    				new Player("Ada",1),
	    				new Player("Adama",2),
	    				new Player("Ad",3),
	    				new Player("Ala",4),
	    		});
	    	      
	    //act
	    comp.printAllOk();
	    
	    //assert    
	    assertTrue(true);
	}
	
	@Test
	public void test_PrintAllOk_True_2()
	{
	    //arrange
	    Competition comp = new Competition(
	    		new Player[] {
	    				new Player("Adam",0),
	    				new Player("Ada",0),
	    				new Player("Adama",0),
	    				new Player("Ad",2),
	    				new Player("Ala",2),
	    		});
	    	      
	    //act
	    comp.printAllOk();
	    
	    //assert    
	    assertTrue(true);
	}
}
