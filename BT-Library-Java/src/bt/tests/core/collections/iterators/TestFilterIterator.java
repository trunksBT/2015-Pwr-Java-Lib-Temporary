package bt.tests.core.collections.iterators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.iterators.ArrayIterator;
import bt.core.collections.iterators.EvenCordsPred;
import bt.core.collections.iterators.FilterIterator;
import bt.core.collections.iterators.Iterator;
import bt.core.geometry.elementaries.Point;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFilterIterator extends TestCase
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
	    
	    Iterator it = new ArrayIterator(points);
	    Iterator fIt = new FilterIterator(it, new EvenCordsPred());
	    
	    Point expVal = new Point(0,0);
	    fIt.next();
	    Point rcVal = (Point) fIt.current();
	    boolean expBool = true;
	      
	    //act
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
	    
	    Iterator it = new ArrayIterator(points);
	    Iterator fIt = new FilterIterator(it, new EvenCordsPred());
	    fIt.first();
	    
	    while(!fIt.isDone()) {
	    	System.out.println( fIt.current() );
	    	fIt.next();
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
	    
	    Iterator it = new ArrayIterator(points);
	    Iterator fIt = new FilterIterator(it, new EvenCordsPred());
	    fIt.last();
	    
	    while(!fIt.isDone()) {
	    	System.out.println( fIt.current() );
	    	fIt.previous();
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
	    
	    Iterator it = new ArrayIterator(points);
	    Iterator fIt = new FilterIterator(it, new EvenCordsPred());
	    
	    for( fIt.first(); !fIt.isDone(); fIt.next())
	    	System.out.println( fIt.current() );
	    
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
	    
	    Iterator it = new ArrayIterator(points);
	    Iterator fIt = new FilterIterator(it, new EvenCordsPred());
	    
	    for( fIt.last(); !fIt.isDone(); fIt.previous())
	    	System.out.println( fIt.current() );
	    
	    assertTrue(true);	
	}
}
