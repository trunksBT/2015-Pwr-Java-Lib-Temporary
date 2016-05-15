package bt.collections.iterators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.iterators.ArrayIterator;
import bt.collections.iterators.EvenCordsPred;
import bt.collections.iterators.FilterIterator;
import bt.collections.iterators.Iterator;
import bt.geometry.elementaries.Point;
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
	    int size = points.length;
	    int start = 0;
	    
	    Iterator it = new ArrayIterator(points,start,size);
	    Iterator fIt = new FilterIterator(it, new EvenCordsPred());
	    
	    Point expVal = new Point(0,0);
	    boolean expBool = true;
	      
	    //act
	    fIt.first();
	    Point rcVal = (Point) fIt.current();
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
	    int start = 0;
	    
	    Iterator it = new ArrayIterator(points,start,size);
	    Iterator fIt = new FilterIterator(it, new EvenCordsPred());
	    
	    //act
	    fIt.first();    
	    while(!fIt.isDone()) {
	    	System.out.println( fIt.current() );
	    	fIt.next();
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
	    int start = 0;
	    
	    Iterator it = new ArrayIterator(points,start,size);
	    Iterator fIt = new FilterIterator(it, new EvenCordsPred());
	    
	    //act
	    fIt.last();    
	    while(!fIt.isDone()) {
	    	System.out.println( fIt.current() );
	    	fIt.previous();
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
	    int start = 0;
	    
	    Iterator it = new ArrayIterator(points,start,size);
	    Iterator fIt = new FilterIterator(it, new EvenCordsPred());
	    
	    //act  
	    for( fIt.first(); !fIt.isDone(); fIt.next())
	    	System.out.println( fIt.current() );
	    
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
	    int start = 0;
	    
	    Iterator it = new ArrayIterator(points,start,size);
	    Iterator fIt = new FilterIterator(it, new EvenCordsPred());
	    
	    //act   
	    for( fIt.last(); !fIt.isDone(); fIt.previous())
	    	System.out.println( fIt.current() );
	    
	    //assert
	    assertTrue(true);	
	}
}
