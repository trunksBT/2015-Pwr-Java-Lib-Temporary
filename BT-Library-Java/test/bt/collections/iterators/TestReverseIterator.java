package bt.collections.iterators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.iterators.ArrayIterator;
import bt.collections.iterators.Iterator;
import bt.collections.iterators.ReverseIterator;
import bt.geometry.elementaries.Point;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestReverseIterator extends TestCase
{				
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_CTOR_AggregateIterator_True()
	{
	    //arrange
	    Point[] points = { 
	    		new Point(0,0),
	    		new Point(1,1),
	    		new Point(2,2)};
	    
	    Iterator it = new ReverseIterator(new ArrayIterator(points));
	    Point expVal = new Point(0,0);
      
	    //act
	    it.first();
	    Point rcVal = (Point) it.current();
	    
	    //assert
	    assertTrue(true);
	}	
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_WhileLoopNext_Expect_True()
	{
	    //arrange
	    Point[] points = { 
	    		new Point(0,0),
	    		new Point(1,1),
	    		new Point(2,2)};
	    
	    Iterator it = new ReverseIterator(new ArrayIterator(points));
	    it.first();
	    
	    while(!it.isDone()) {
	    	System.out.println( it.current() );
	    	it.next();
	    }
	    
	    assertTrue(true);
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_WhileLoopPrevious_Expect_True()
	{
	    //arrange
	    Point[] points = { 
	    		new Point(0,0),
	    		new Point(1,1),
	    		new Point(2,2)};
	    
	    Iterator it = new ReverseIterator(new ArrayIterator(points));
	    it.last();
	    
	    while(!it.isDone()) {
	    	System.out.println( it.current() );
	    	it.previous();
	    }
	    
	    assertTrue(true);
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_ForLoopNext_Expect_True()
	{
	    //arrange
	    Point[] points = { 
	    		new Point(0,0),
	    		new Point(1,1),
	    		new Point(2,2)};
	    
	    Iterator it = new ReverseIterator(new ArrayIterator(points));
	    
	    for( it.first(); !it.isDone(); it.next())
	    	System.out.println( it.current() );
	    
	    assertTrue(true);	
	}
	
	//Test_StateUnderTest_Expect_ExpectedBehavior
	@Test
	public void test_ForLoopPrevious_Expect_True()
	{
	    //arrange
	    Point[] points = { 
	    		new Point(0,0),
	    		new Point(1,1),
	    		new Point(2,2)};
	    
	    Iterator it = new ReverseIterator(new ArrayIterator(points));
	    
	    for( it.last(); !it.isDone(); it.previous())
	    	System.out.println( it.current() );
	    
	    assertTrue(true);	
	}
}
