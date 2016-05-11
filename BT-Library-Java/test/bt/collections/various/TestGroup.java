package bt.collections.various;

import java.util.LinkedList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.elems.Player;
import bt.collections.elems.Student;
import bt.collections.iterators.Iterator;
import bt.collections.various.Competition;
import bt.collections.various.Group;
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
	
	@Test
	public void test_iterator_True_2()
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
	    LinkedList<Student> studs = new LinkedList<>();
	    double average = 0.0;
	        	      
	    //act	    
	    Iterator it = comp.iterator(average);
	    for(it.first();!it.isDone();it.next())
	    	studs.add((Student) it.current());
	    
	    //assert    
	    assertTrue(true);
	}
}
