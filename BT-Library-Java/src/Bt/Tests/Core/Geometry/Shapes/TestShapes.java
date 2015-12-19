package Bt.Tests.Core.Geometry.Shapes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Collections.OneDimTable;
import Bt.Core.Geometry.Collections.Geometria;
import Bt.Core.Geometry.Collections.Shapes;
import Bt.Core.Geometry.Elementaries.LineSegment;
import Bt.Core.Geometry.Elementaries.Point;
import Bt.Core.Geometry.Shapes.Circle;
import Bt.Core.Geometry.Shapes.Triangle;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestShapes extends TestCase{

    @Test
    public void test_CTOR_Circle_Point_Length()
    {
    	// arrange
    	String name = "kolo1";
    	Point center = new Point(0,0);
    	double length = 3.0;
    	
    	Circle _kolo = new Circle(name,center,length);
    	
    	// act 	
    	System.out.println(_kolo);
    	
    	
    	// assert	
    	assertEquals(3,3);
    }
    
    @Test
    public void test_CTOR_Circle_Point_LineSegment()
    {
    	// arrange
    	String name = "kolo1";
    	Point center = new Point(0,0);
    	Point endRadius = new Point(4,0);
    	LineSegment radious = new LineSegment(center,endRadius);
    	
    	Circle _kolo = new Circle(name,center,radious);
    	
    	// act 	
    	System.out.println(_kolo);
    	
    	
    	// assert	
    	assertEquals(3,3);
    }
    
    @Test
    public void test_Create_Triangle()
    {
    	// arrange
    	String name = "trojkat1";
    	
    	Point vert1 = new Point(0,0);
    	Point vert2 = new Point(4,0);
    	Point vert3 = new Point(0,3);
    	
    	Triangle _trojkat = new Triangle(name,vert1,vert2,vert3);
    	
    	// act 	
    	double expectedObwod = 12;
    	double reachedObwod = _trojkat.Obwod();
    	System.out.println(_trojkat);
    	
    	
    	// assert	
    	assertEquals(expectedObwod,reachedObwod);
    }
    
    @Test
    public void testCreateSet()
    {
    	// arrange
    	String name1 = "trojkat1";
    	
    	Point vert1 = new Point(0,0);
    	Point vert2 = new Point(4,0);
    	Point vert3 = new Point(0,3);
    	
    	Triangle _trojkat1 = new Triangle(name1,vert1,vert2,vert3);
    	
    	String name2 = "kolo1";
    	Point center2 = new Point(0,0);
    	Point endRadius2 = new Point(4,0);
    	LineSegment radious2 = new LineSegment(center2,endRadius2);
    	
    	Circle _kolo2 = new Circle(name2,center2,radious2);
    	
    	String name3 = "kolo2";
    	Point center3 = new Point(0,0);
    	Point endRadius3 = new Point(4,0);
    	LineSegment radious3 = new LineSegment(center3,endRadius3);
    	
    	Circle _kolo3 = new Circle(name3,center3,radious3);
    	
    	Shapes _figury = new Shapes();
    	_figury.add(_kolo3);
    	_figury.add(_kolo2);
    	_figury.add(_kolo2);
    	_figury.add(_trojkat1);
    	
    	int expectedSize = 3;
    	
    	assertEquals(expectedSize,_figury.size());
    }
}
