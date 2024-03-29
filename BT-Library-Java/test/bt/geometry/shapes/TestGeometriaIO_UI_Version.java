package bt.geometry.shapes;

import java.io.IOException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.geometry.collections.GeometriaIO;
import bt.geometry.collections.Shapes;
import bt.geometry.elementaries.LineSegment;
import bt.geometry.elementaries.Point;
import bt.geometry.shapes.Circle;
import bt.geometry.shapes.Triangle;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestGeometriaIO_UI_Version extends TestCase{ 
    
	// every first shape have postFix 1 etc
	// every second shape have postfix 2 etc
	
	String name1 = "trojkat1";
	Point vert11 = new Point(0,0);
	Point vert21 = new Point(4,0);
	Point vert31 = new Point(0,3);
	
	String name2 = "kolo2";
	Point center2 = new Point(0,0);
	double radius2 = 3.0;
	
	String name3 = "kolo3";
	Point center3 = new Point(center2);
	double radius3 = 5.0;
	
	Triangle _trojkat1 = new Triangle(name1,vert11,vert21,vert31);
	Circle _kolo2 = new Circle(name2,center2,radius2);    	
	Circle _kolo3 = new Circle(name3,center3,radius3);
	
	String pathBin = "binFigury";
	String pathTxt = "txtFigury";
	    
    @Test
    public void test_DodajKolo()
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	
    	// act 		
    	GeometriaIO ioGeo = new GeometriaIO(_figury);
    	ioGeo.dodajFigure();
    	
    	// assert	
    	assertNotNull(ioGeo.dajFigure(name1));
    }//test it by inserting empty values etc
    
    @Test
    public void test_DodajTriangle()
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	
    	// act 		
    	GeometriaIO ioGeo = new GeometriaIO(_figury);
    	ioGeo.dodajFigure();
    	
    	// assert	
    	assertNotNull(ioGeo.dajFigure(name2));
    }//test it by inserting empty values etc
    
    @Test
    public void test_PoszerzKola()
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	_figury.add(_trojkat1);
    	_figury.add(_kolo2);
    	_figury.add(_kolo2);
    	_figury.add(_kolo3);
    	
    	double mult = 3;
    	
    	GeometriaIO _geo = new GeometriaIO(_figury);
    	
    	// act
    	_geo.powiekszKola();
    	
    	// assert
    	Circle buff1 = (Circle) _geo.dajFigure(name2);
    	Circle buff2 = (Circle) _geo.dajFigure(name3);
    	boolean logic1 = buff1.getRadius().getSecondEdge().equals(new Point(9,0));
    	boolean logic2 = buff2.getRadius().getSecondEdge().equals(new Point(15,0));
    	
    	assertTrue(logic1 && logic2 );
    }//test it by inserting empty values etc
    
    @Test
    public void test_Save() throws IOException
    {	  
    	//arrange 	
    	Shapes _figury = new Shapes();
    	_figury.add(_trojkat1);
    	_figury.add(_kolo2);
    	_figury.add(_kolo2);
    	_figury.add(_kolo3);

    	GeometriaIO _geo = new GeometriaIO(_figury);
    	
    	// act
    	_geo.save();
    	
    	// assert
    	assertTrue(true);
    }//test it by inserting empty values etc
    
    @Test
    public void test_RestoreTest() throws IOException, ClassNotFoundException
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	GeometriaIO _geo = new GeometriaIO(_figury);
    	_geo.dodaj(_trojkat1);
    	_geo.dodaj(_kolo2);
    	_geo.dodaj(_kolo3);
    	_geo.saveForTests(pathBin);
    	
    	_geo.usunFigure(name1);
    	_geo.usunFigure(name2);
    	_geo.usunFigure(name3);
    	
    	// act
    	boolean logic1 = _geo.dajFigure(name1) == null;
    	_geo.restore();
    	
    	// assert    	
    	boolean logic2 = _geo.dajFigure(name1) != null;

    	assertTrue(logic1 && logic2);
    }//test it by inserting empty values etc
    
    @Test
    public void test_WczytajFiguryTest() throws IOException, ClassNotFoundException
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	GeometriaIO _geo = new GeometriaIO(_figury);
    	
    	// act
    	_geo.wczytajFigury();
    	
    	// assert
    	boolean partLogic1 = _geo.dajFigure("kolko") != null;	
    	boolean partLogic2 = _geo.dajFigure("trojkat") != null;

    	assertTrue(partLogic1 && partLogic2);
    }
    
    @Test
    public void test_GUI() throws IOException, ClassNotFoundException
    {	  
    	// arrange
//    	do 
//    	{ 
//    		wyj.println(" Co chcesz robic : Dodaj publikacje, Wypisz liste, Save, Restore, Koniec ");
//    		st.nextToken(); 
//    	
//    		odp=st.sval.toLowerCase().charAt(0);
//    	
//        	switch(odp)
//        	{
//    	    	case 'd' : spis.nowaPublikacja(st,true);break;
//    	    	case 'w' : plikWyj.printf("%s %n",spis); break;
//    	    	case 's' : spis.save(); break;
//    	    	case 'r' : spis=spis.restore(); break;
//    	    	case 'k' : break;
//    	    	default  : wyj.printf(" Nie ma takiej opcji %n");
//        	}
//         } while (odp!='k');
//        
//      if(plikWyj != null) plikWyj.close();  

    	assertTrue(true);
    }

}

