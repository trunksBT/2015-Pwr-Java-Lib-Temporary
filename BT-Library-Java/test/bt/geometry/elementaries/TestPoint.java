package bt.geometry.elementaries;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.geometry.elementaries.Point;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestPoint extends TestCase{

    @Test
    public void test_Equals_EqualPoints_True()
    {
        //arrange
        Point _pointA = new Point(2,2);
        Point _pointB = new Point(2,2);
        boolean expected = true;
        
        //act
        boolean reached = _pointA.equals(_pointB);
        
        //assert
        boolean result = !(expected ^ reached);
        assertTrue(result);
    }
    
    @Test
    public void test_Equals_OtherPoints_False()
    {
        //arrange
    	Point _pointA = new Point(2,2);
        Point _pointB = new Point(3,3);
        boolean expected = false;
        
        //act
        boolean reached = _pointA.equals(_pointB);
        
        //assert    
        boolean result = !(expected ^ reached);
        assertTrue(result);
    }

    @Test
    public void test_Distance_EqualPoints_True()
    {
        //arrange
        Point _pointA  = new Point(2,5);        
        Point _pointB = new Point(2,5);
        double expected = 0.0;
        
        //act
        double reached = _pointA.distance(_pointB);
        
        //assert     
        boolean result = reached == expected;
        assertTrue(result);
    }

    @Test
    public void test_Distance_OtherPoints_True()
    {
        //arrange
        Point _pointA = new Point(2,5);        
        Point _pointB = new Point(5,9);
        double expected = 5;
        
        //act
        double reached = _pointA.distance(_pointB);
        
        //assert    
        boolean result = expected == reached;    
        assertTrue(result);
    }

    @Test
    public void test_Distance_OtherPoints_False()
    {
        //arrange
        Point _pointA = new Point(2,5);        
        Point _pointB = new Point(5,9);
        double expected = 3;
        
        //act
        double reached = _pointA.distance(_pointB);
        
        //assert    
        boolean result = expected != reached;      
        assertTrue(result);
    }

    @Test
    public void test_Shift_True()
    {
        //arrange
        Point _pointA = new Point(2,2);        
        Point _pointB = new Point(4,4);
        boolean expected = true;
        
        //act
        _pointA.shift(2, 2);
        boolean reached = _pointA.equals(_pointB);
        
        //assert
        boolean result = ! (expected ^ reached);
        assertTrue(result);
    }

    @Test
    public void test_Shift_False()
    {
        //arrange
        Point _pointA = new Point(2,2);        
        Point _pointB = new Point(3,3);
        boolean expected = false;
        
        //act
        _pointA.shift(2,2);
        boolean reached = _pointA.equals(_pointB);
                
        //assert
        boolean result = !(expected ^ reached);
        assertTrue(result);
    } 
    
    @Test
    public void test_toString()
    {
    	Point vert1 = new Point(999.5,17.0);
    	Point vert2 = new Point(999.5,27.0);
    	
    	System.out.println( vert1 );
    	System.out.println( vert2 );
    	
    	assertEquals(true,true); 
    }

}
