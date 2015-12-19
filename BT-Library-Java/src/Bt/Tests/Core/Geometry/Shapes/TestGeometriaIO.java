package Bt.Tests.Core.Geometry.Shapes;

import java.io.IOException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

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
    
    @Test
    public void testDodajKolo()
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	
    	int expectedSize = 1;
    	
    	// act 		
    	GeometriaIO ioGeo = new GeometriaIO(_figury);
    	ioGeo.dodajFigure();
    	
    	// assert	
    	assertEquals(expectedSize,ioGeo.liczbaKol());
    }//test it by inserting empty values etc
    
    @Test
    public void testDodajTriangle()
    {	  
    	// arrange
    	Shapes _figury = new Shapes(); 	
    	
    	String name = "Trojkat";
    	Point tempA = new Point(0,0);
    	Point tempB = new Point(1,1);
    	Point tempC = new Point(2,2);
    	
    	Triangle buff = new Triangle(name,tempA,tempB,tempC);
    	
    	// act 		
    	GeometriaIO ioGeo = new GeometriaIO(_figury);
    	ioGeo.dodajFigure();
    	
    	// assert	
    	assertEquals(buff,ioGeo.dajFigure("Trojkat"));
    }//test it by inserting empty values etc
    
    @Test
    public void testPoszerzKola()
    {	  
    	//arrange
    	String triaName = "trojkat";
    	Point vert1 = new Point(0,0);
    	Point vert2 = new Point(4,0);
    	Point vert3 = new Point(0,3);
    	
    	Triangle _trojkat1 = new Triangle(triaName,vert1,vert2,vert3);
    	
    	String name2 = "kolo1";
    	Point center2 = new Point(0,0);
    	Point endRadius2 = new Point(4,0);
    	LineSegment radious2 = new LineSegment(center2,endRadius2);
    	
    	Circle _kolo1 = new Circle(name2,center2,radious2);
    	
    	String name3 = "kolo2";
    	Point center3 = new Point(0,0);
    	Point endRadius3 = new Point(10,0);
    	LineSegment radious3 = new LineSegment(center3,endRadius3);
    	
    	Circle _kolo2 = new Circle(name3,center3,radious3);
    	
    	Shapes _figury = new Shapes();
    	_figury.add(_kolo1);
    	_figury.add(_kolo2);
    	_figury.add(_kolo2);
    	_figury.add(_trojkat1);
    	
    	GeometriaIO _geo = new GeometriaIO(_figury);
    	_geo.powiekszKola();
    	
    	Circle buff = (Circle) _geo.dajFigure(name3);
    	assertTrue(buff.getRadius().getSecondEdge().equals(new Point(30,0)));
    }//test it by inserting empty values etc
    
    @Test
    public void test_Save() throws IOException
    {	  
    	//arrange
    	String triaName = "trojkat";
    	Point vert1 = new Point(0,0);
    	Point vert2 = new Point(4,0);
    	Point vert3 = new Point(0,3);
    	
    	Triangle _trojkat1 = new Triangle(triaName,vert1,vert2,vert3);
    	
    	String name2 = "kolo1";
    	Point center2 = new Point(0,0);
    	Point endRadius2 = new Point(4,0);
    	LineSegment radious2 = new LineSegment(center2,endRadius2);
    	
    	Circle _kolo1 = new Circle(name2,center2,radious2);
    	
    	String name3 = "kolo2";
    	Point center3 = new Point(0,0);
    	Point endRadius3 = new Point(10,0);
    	LineSegment radious3 = new LineSegment(center3,endRadius3);
    	
    	Circle _kolo2 = new Circle(name3,center3,radious3);
    	
    	Shapes _figury = new Shapes();
    	_figury.add(_kolo1);
    	_figury.add(_kolo2);
    	_figury.add(_kolo2);
    	_figury.add(_trojkat1);
    	
    	GeometriaIO _geo = new GeometriaIO(_figury);
    	_geo.save();
    	
    	Circle buff = (Circle) _geo.dajFigure(name3);
    	assertTrue(true);
    }//test it by inserting empty values etc
    
    @Test
    public void test_Restore() throws IOException, ClassNotFoundException
    {	  
    	//arrange
    	String triaName = "trojkat";
    	Point vert1 = new Point(0,0);
    	Point vert2 = new Point(4,0);
    	Point vert3 = new Point(0,3);
    	
    	Triangle _trojkat1 = new Triangle(triaName,vert1,vert2,vert3);
    	
    	String name2 = "kolo1";
    	Point center2 = new Point(0,0);
    	Point endRadius2 = new Point(4,0);
    	LineSegment radious2 = new LineSegment(center2,endRadius2);
    	
    	Circle _kolo1 = new Circle(name2,center2,radious2);
    	
    	String name3 = "kolo2";
    	Point center3 = new Point(0,0);
    	Point endRadius3 = new Point(10,0);
    	LineSegment radious3 = new LineSegment(center3,endRadius3);
    	
    	Circle _kolo2 = new Circle(name3,center3,radious3);
    	
    	Shapes _figury = new Shapes();
    	_figury.add(_kolo1);
    	_figury.add(_kolo2);
    	_figury.add(_kolo2);
    	_figury.add(_trojkat1);
    	
    	GeometriaIO _geo = new GeometriaIO(_figury);
    	_geo.saveForTests();
    	
    	_geo.usunFigure("kolo1");
    	_geo.usunFigure("kolo2");
    	_geo.usunFigure("trojkat");
    	
    	boolean partLogic1 = _geo.dajFigure("kolo1") == null;
    	_geo.restoreForTests();
    	
    	boolean partLogic2 = _geo.dajFigure("kolo1") != null;

    	assertTrue(partLogic1 && partLogic2);
    }//test it by inserting empty values etc
    
    @Test
    public void test_WczytaFigury() throws IOException, ClassNotFoundException
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	
    	GeometriaIO _geo = new GeometriaIO(_figury);
    	_geo.wczytajFiguryForTests();
    	
    	boolean partLogic1 = _geo.dajFigure("kolko") != null;	
    	boolean partLogic2 = _geo.dajFigure("trojkat") != null;

    	assertTrue(partLogic1 && partLogic2);
    }
}
