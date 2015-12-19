package Bt.Tests.Core.Geometry.Shapes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Collections.OneDimTable;
import Bt.Core.Geometry.Collections.Geometria;
import Bt.Core.Geometry.Collections.GeometriaIO;
import Bt.Core.Geometry.Collections.Shapes;
import Bt.Core.Geometry.Elementaries.LineSegment;
import Bt.Core.Geometry.Elementaries.Point;
import Bt.Core.Geometry.Shapes.Circle;
import Bt.Core.Geometry.Shapes.Triangle;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestGeometriaIO extends TestCase{ 
    
    @Test
    public void testCreateGeometryIO()
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
    	
    	// act 	
    	
    	GeometriaIO ioGeo = new GeometriaIO(_figury);
    	ioGeo.druk();
    	// assert	
    	assertEquals(expectedSize,_figury.size());
    }
}

