package Bt.Tests.Core.Geometry.Shapes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Geometry.Collections.Geometria;
import Bt.Core.Geometry.Collections.Shapes;
import Bt.Core.Geometry.Elementaries.LineSegment;
import Bt.Core.Geometry.Elementaries.Point;
import Bt.Core.Geometry.Shapes.Circle;
import Bt.Core.Geometry.Shapes.Triangle;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestGeometria extends TestCase{ 
    
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
    	
    	// act 	
    	System.out.println("**************DOWOD ZE JEST TO SET**********");
    	int reachedSize = _figury.size();
    	
    	Geometria _algebra = new Geometria(_figury);
    	System.out.println("**************DOWOD ZE SIE DRUKUJA**********");
    	_algebra.druk();
    	
    	System.out.println("**************DOWOD ZE OBWODY DOBRE**********");
    	System.out.println(_algebra.sumaObwodow());
    	
    	System.out.println("**************DOWOD ZE KOLO DODANE RAZ**********");
    	System.out.println(_algebra.liczbaKol());
    	
    	System.out.println("**************DOWOD ZE KOLO USUNIETE RAZ**********");
    	_algebra.usunFigure("kolo1");
    	_algebra.druk();
    	
    	System.out.println("**************DOWOD POBRANIA KOLA**********");
    	System.out.println(_algebra.dajFigure("kolo2").toString());
    	
    	// assert	
    	assertEquals(3,3);
    }
}

