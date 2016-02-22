package bt.tests.core.collections.various;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.elems.Player;
import bt.core.collections.elems.Student;
import bt.core.collections.various.Competition;
import bt.core.collections.various.Group;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup extends TestCase
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
	    Group comp = new Group(
	    		new Student[] {
	    				new Student("Adam",0.0),
	    				new Student("Ada",1.0),
	    				new Student("Adama",2.0),
	    				new Student("Ad",3.0),
	    				new Student("Ala",4.0),
	    		}, 2.0);
	    	      
	    //act
	    comp.printAllOk();
	    
	    //assert    
	    assertTrue(true);
	}
	
	@Test
	public void test_PrintAllOk_True_2()
	{
	    //arrange
	    Group comp = new Group(
	    		new Student[] {
	    				new Student("Adam",0.0),
	    				new Student("Ada",1.0),
	    				new Student("Adama",2.0),
	    				new Student("Ad",3.0),
	    				new Student("Ala",4.0),
	    		}, 2.0);
	    	      
	    //act
	    comp.printAllOk();
	    
	    //assert    
	    assertTrue(true);
	}
}