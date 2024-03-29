package bt.geometry.elementaries;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.geometry.elementaries.LineSegment;
import bt.geometry.elementaries.Point;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestLineSegment extends TestCase
{	
		@Test
	    public void testEqualsLineSegmentTheSameTrue1()
	    {
	        //arrange
	        Point _pointA = new Point(2,2);
	        Point _pointB = new Point(3,3);
	        
	        Point _pointC = new Point(2,2);
	        Point _pointD = new Point(3,3);
	        
	        LineSegment _arcAB = new LineSegment(_pointA,_pointB);
	        LineSegment _arcCD = new LineSegment(_pointC,_pointD); 
	        boolean expected = true;
	        
	        //act
	        boolean reached = _arcAB.equals(_arcCD);
	        
	        //assert
	        boolean result = !(expected ^ reached);
	        assertTrue(result);
	    }																																	
																																			
	 	@Test
	    public void testEqualsLineSegmentTheSameButReversedPointsTrue2()
	    {
	        //arrange
	        Point _pointA = new Point(3,3);
	        Point _pointB = new Point(2,2);
	        
	        Point _pointC = new Point(2,2);
	        Point _pointD = new Point(3,3);
	        
	        LineSegment _arcAB = new LineSegment(_pointA,_pointB);
	        LineSegment _arcCD = new LineSegment(_pointC,_pointD); 
	        boolean expected = true;
	        
	        //act
	        boolean reached = _arcAB.equals(_arcCD);
	        
	        //assert
	        boolean result = !(expected ^ reached);
	        assertTrue(result);
	    }
	    
	    @Test
	    public void testEqualsLineSegmentTheSameFalse1()
	    {
	        //arrange
	        Point _pointA = new Point(3,3);
	        Point _pointB = new Point(2,2);
	        
	        Point _pointC = new Point(2,2);
	        Point _pointD = new Point(4,4);
	        
	        LineSegment _arcAB = new LineSegment(_pointA,_pointB);
	        LineSegment _arcCD = new LineSegment(_pointC,_pointD); 
	        boolean expected = false;
	        
	        //act
	        boolean reached = _arcAB.equals(_arcCD);
	        
	        //assert
	        boolean result = !(expected ^ reached);
	        assertTrue(result);
	    }
	    
	    @Test
	    public void testEqualsLineSegmentTheSameFalse2()
	    {
	        //arrange
	        Point _pointA = new Point(5,5);
	        Point _pointB = new Point(2,2);
	        
	        Point _pointC = new Point(2,2);
	        Point _pointD = new Point(4,4);
	        
	        LineSegment _arcAB = new LineSegment(_pointA,_pointB);
	        LineSegment _arcCD = new LineSegment(_pointC,_pointD); 
	        boolean expected = false;
	        
	        //act
	        boolean reached = _arcAB.equals(_arcCD);
	        
	        //assert
	        boolean result = !(expected ^ reached);
	        assertTrue(result);
	    }

	    @Test
	    public void testLengthTrue()
	    {
	        //arrange
	        Point _pointA = new Point(2,5);        
	        Point _pointB = new Point(5,9);
	        double expected = 5;
	        
	        LineSegment _arcAB = new LineSegment(_pointA,_pointB);
	        
	        //act
	        double reached = _arcAB.length();
	        
	        //assert
	        boolean result = (expected == reached);
	        assertTrue(result);
	    }
	    
	    @Test
	    public void testLengthFalse()
	    {
	        //arrange
	        Point _pointA = new Point(2,9);        
	        Point _pointB = new Point(5,9);
	        double expected = 5;
	        
	        LineSegment _arcAB = new LineSegment(_pointA,_pointB);
	        
	        //act
	        double reached = _arcAB.length();
	        
	        //assert
	        boolean result = (expected != reached);
	        assertTrue(result);
	    }
	   
	   	@Test
	    public void testShiftLineSegmentTrue()
	    {
	        //arrange
	        Point _pointA = new Point(2,2);        
	        Point _pointB = new Point(4,4);
	        boolean expected = true;
	        LineSegment _arcAB = new LineSegment(_pointA,_pointB);
	        
	        Point _pointAAfter = new Point(4,4);        
	        Point _pointBAfter = new Point(6,6);
	        LineSegment _arcABShifted = new LineSegment(_pointAAfter,_pointBAfter);
	        
	        //act
	        _arcAB.shift(2,2);
	        boolean reached = _arcAB.equals(_arcABShifted);
	        
	        //assert
	        boolean result = ! (expected ^ reached);
	        assertTrue(result);
	    }
	    
	    @Test
	    public void testShiftLineSegmentFalse()
	    {
	        //arrange
	        Point _pointA = new Point(2,2);        
	        Point _pointB = new Point(4,4);
	        boolean expected = false;
	        LineSegment _arcAB = new LineSegment(_pointA,_pointB);
	        
	        Point _pointAAfter = new Point(4,4);        
	        Point _pointBAfter = new Point(8,8);
	        LineSegment _arcABShifted = new LineSegment(_pointAAfter,_pointBAfter);
	        
	        //act
	        _arcAB.shift(2,2);
	        boolean reached = _arcAB.equals(_arcABShifted);
	        
	        //assert
	        boolean result = ! (expected ^ reached);
	        assertTrue(result);
	    }
	    
	    @Test
	    public void test_toString()
	    {
	        //arrange
	        Point pointA = new Point(123.45,2.3);        
	        Point pointB = new Point(4,432);

	        LineSegment lineAB = new LineSegment(pointA,pointB);
	        LineSegment lineBA = new LineSegment(pointB,pointA);
	        
	        System.out.println( lineBA );
	        System.out.println( lineAB );
	    }	    
}
