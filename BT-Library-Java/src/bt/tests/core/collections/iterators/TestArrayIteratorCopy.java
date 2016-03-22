package bt.tests.core.collections.iterators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.iterators.ArrayIterator;
import bt.core.collections.iterators.ArrayIteratorCopy;
import bt.core.collections.iterators.Iterator;
import bt.core.geometry.elementaries.Point;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestArrayIteratorCopy extends TestCase
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
	    int size = points.length;
	    
	    Iterator it = new ArrayIteratorCopy(points,size);
	    Point expVal = new Point(0,0);

	    boolean expBool = true;
	      
	    //act
	    it.first();
	    Point rcVal = (Point) it.current();
	    boolean rcBool = rcVal.equals(expVal);
	    
	    //assert
	    boolean result = !(expBool ^ rcBool);
	    assertTrue(result);
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
	    int size = points.length;
	    
	    Iterator it = new ArrayIteratorCopy(points,size);
	    
	    //act
	    it.first();
	    
	    while(!it.isDone()) {
	    	System.out.println( it.current() );
	    	it.next();
	    }
	    
	    //assert
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
	    int size = points.length;
	    
	    Iterator it = new ArrayIteratorCopy(points,size);
	    
	    // act
	    it.last();
	    
	    while(!it.isDone()) {
	    	System.out.println( it.current() );
	    	it.previous();
	    }
	    
	    //assert
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
	    int size = points.length;
	    
	    Iterator it = new ArrayIteratorCopy(points,size);
	    
	    // act
	    for( it.first(); !it.isDone(); it.next())
	    	System.out.println( it.current() );
	    
	    //assert
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
	    int size = points.length;
	    
	    Iterator it = new ArrayIteratorCopy(points,size);
	    
	    for( it.last(); !it.isDone(); it.previous())
	    	System.out.println( it.current() );
	    
	    //assert
	    assertTrue(true);	
	}
}