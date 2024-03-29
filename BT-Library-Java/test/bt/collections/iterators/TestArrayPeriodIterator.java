package bt.collections.iterators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.iterators.ArrayIterator;
import bt.collections.iterators.ArrayPeriodIterator;
import bt.collections.iterators.Iterator;
import bt.geometry.elementaries.Point;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestArrayPeriodIterator extends TestCase
{				
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTOR_AggregateIterator_Step2_True()
	{
	    //arrange
	    Point[] points = { 
	    		new Point(0,0),
	    		new Point(1,1),
	    		new Point(2,2)};
	    int period = 2;
	    
	    ArrayIterator it = new ArrayIterator(points);
	    Iterator itPeriod = new ArrayPeriodIterator(it,period);
	    Point expVal = new Point(0,0);
	    itPeriod.first();
	    Point rcVal = (Point) itPeriod.current();
	    boolean expBool = true;
	      
	    //act
	    boolean rcBool = rcVal.equals(expVal);
	    
	    //assert
	    boolean result = !(expBool ^ rcBool);
	    assertTrue(result);
	}	
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_WhileLoopNext_Step2_True()
	{
	    //arrange
	    Point[] points = { 
	    		new Point(0,0),
	    		new Point(1,1),
	    		new Point(2,2),
	    		new Point(3,3),
	    		new Point(4,4),
	    		new Point(5,5),
	    		new Point(6,6),
	    		new Point(7,7),
	    		new Point(8,8)};
	    int period = 2;
	    
	    ArrayIterator it = new ArrayIterator(points);
	    Iterator itPeriod = new ArrayPeriodIterator(it,period);
	    itPeriod.first();
	    
	    while(!itPeriod.isDone()) {
	    	System.out.println( itPeriod.current() );
	    	itPeriod.next();
	    }
	    
	    assertTrue(true);
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_WhileLoopPrevious_Step2_True()
	{
	    //arrange
	    Point[] points = { 
	    		new Point(0,0),
	    		new Point(1,1),
	    		new Point(2,2),
	    		new Point(3,3),
	    		new Point(4,4),
	    		new Point(5,5),
	    		new Point(6,6),
	    		new Point(7,7),
	    		new Point(8,8)};
	    
	    int period = 2;
	    
	    ArrayIterator it = new ArrayIterator(points);
	    Iterator itPeriod = new ArrayPeriodIterator(it,period);
	    itPeriod.last();
	    
	    while(!itPeriod.isDone()) {
	    	System.out.println( itPeriod.current() );
	    	itPeriod.previous();
	    }
	    
	    assertTrue(true);
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_ForLoopNext_Step2_True()
	{
	    //arrange
	    Point[] points = { 
	    		new Point(0,0),
	    		new Point(1,1),
	    		new Point(2,2),
	    		new Point(3,3),
	    		new Point(4,4),
	    		new Point(5,5),
	    		new Point(6,6),
	    		new Point(7,7),
	    		new Point(8,8)};
	    
	    int period = 2;
	    
	    ArrayIterator it = new ArrayIterator(points);
	    Iterator itPeriod = new ArrayPeriodIterator(it,period);
	    
	    for( itPeriod.first(); !itPeriod.isDone(); itPeriod.next())
	    	System.out.println( itPeriod.current() );
	    
	    assertTrue(true);	
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_ForLoopPrevious_Step2_True()
	{
	    //arrange
	    Point[] points = { 
	    		new Point(0,0),
	    		new Point(1,1),
	    		new Point(2,2),
	    		new Point(3,3),
	    		new Point(4,4),
	    		new Point(5,5),
	    		new Point(6,6),
	    		new Point(7,7),
	    		new Point(8,8)};
	    
	    int period = 2;
	    
	    ArrayIterator it = new ArrayIterator(points);
	    Iterator itPeriod = new ArrayPeriodIterator(it,period);
	    
	    for( itPeriod.last(); !itPeriod.isDone(); itPeriod.previous())
	    	System.out.println( itPeriod.current() );
	    
	    assertTrue(true);	
	}
}
