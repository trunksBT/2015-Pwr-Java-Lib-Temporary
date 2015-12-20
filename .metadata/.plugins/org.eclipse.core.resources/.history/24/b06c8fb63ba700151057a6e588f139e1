package Bt.Tests.Core.Geometry.Shapes;

import java.io.IOException;
import java.util.Scanner;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Geometry.Collections.GeometriaIO;
import Bt.Core.Geometry.Collections.Shapes;
import Bt.Core.Geometry.Elementaries.Point;
import Bt.Core.Geometry.Shapes.Circle;
import Bt.Core.Geometry.Shapes.Triangle;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestGeometriaIO_Test_Version extends TestCase{ 
    
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
    public void test_CTOR_GeometryIO()
    {	  
    	// arrange	  	
    	Shapes _figury = new Shapes();
    	_figury.add(_trojkat1);
    	_figury.add(_kolo2);
    	_figury.add(_kolo2);
    	_figury.add(_kolo3);
    	
    	int expectedSize = 3;
    	
    	// act 	 	
    	GeometriaIO ioGeo = new GeometriaIO(_figury);
//    	ioGeo.druk();
    	
    	// assert   	
    	assertEquals(expectedSize,_figury.size());
    }
    
    @Test
    public void test_DodajKolo_Test()
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	
    	// act 		
    	GeometriaIO ioGeo = new GeometriaIO(_figury);
    	ioGeo.dodajFigureForTests(
    			name1,
    			1,
    			0,
    			0,
    			3,
    			0,
    			0,
    			0,
    			0
    			);
    	
    	// assert	
    	assertNotNull(ioGeo.dajFigure(name1));
    }//test it by inserting empty values etc
    
    @Test
    public void test_DodajTriangle_Test()
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	
    	// act 		
    	GeometriaIO ioGeo = new GeometriaIO(_figury);
    	ioGeo.dodajFigureForTests(
    			name2,
    			2,
    			0,
    			0,
    			3,
    			1,
    			1,
    			2,
    			2
    			);
    	
    	// assert	
    	assertNotNull(ioGeo.dajFigure(name2));
    }//test it by inserting empty values etc
    
    @Test
    public void test_PoszerzKola_PlusMutli_Test()
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
    	_geo.powiekszKolaForTests(mult);
    	
    	// assert
    	Circle buff1 = (Circle) _geo.dajFigure(name2);
    	Circle buff2 = (Circle) _geo.dajFigure(name3);
    	boolean logic1 = buff1.getRadius().getSecondEdge().equals(new Point(9,0));
    	boolean logic2 = buff2.getRadius().getSecondEdge().equals(new Point(15,0));
    	
    	assertTrue(logic1 && logic2 );
    }//test it by inserting empty values etc
    
    @Test
    public void test_PoszerzKola_MinusMutli_FilledCollection_Test()
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	_figury.add(_trojkat1);
    	_figury.add(_kolo2);
    	_figury.add(_kolo2);
    	_figury.add(_kolo3);
    	
    	double mult = -3;
    	
    	GeometriaIO _geo = new GeometriaIO(_figury);
    	
    	// act
    	_geo.powiekszKolaForTests(mult);
    	
    	// assert
    	Circle buff1 = (Circle) _geo.dajFigure(name2);
    	Circle buff2 = (Circle) _geo.dajFigure(name3);
    	boolean logic1 = buff1.getRadius().getSecondEdge().equals(new Point(-9,0));
    	boolean logic2 = buff2.getRadius().getSecondEdge().equals(new Point(-15,0));
    	
    	assertTrue(logic1 && logic2 );
    }//test it by inserting empty values etc
    
    
    @Test
    public void test_PoszerzKola_MinusMutli_NoCircleInCollection_Test()
    {	  
    	// arrange
    	Shapes _figury = new Shapes();
    	_figury.add(_trojkat1);
    	
    	double mult = -3;
    	
    	GeometriaIO _geo = new GeometriaIO(_figury);
    	
    	// act
    	boolean ifPerformed = _geo.powiekszKolaForTests(mult);
    	// assert

        assertTrue(!ifPerformed);
    }//test it by inserting empty values etc
    
    @Test
    public void test_SaveTest() throws IOException
    {	  
    	//arrange 	
    	Shapes _figury = new Shapes();
    	_figury.add(_trojkat1);
    	_figury.add(_kolo2);
    	_figury.add(_kolo2);
    	_figury.add(_kolo3);

    	GeometriaIO _geo = new GeometriaIO(_figury);
    	
    	// act
    	_geo.saveForTests(pathBin);
    	
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
    	_geo.restoreForTests(pathBin);
    	
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
    	_geo.wczytajFiguryForTests(pathTxt);
    	
    	// assert
    	boolean partLogic1 = _geo.dajFigure("kolko") != null;	
    	boolean partLogic2 = _geo.dajFigure("trojkat") != null;

    	assertTrue(partLogic1 && partLogic2);
    }
    
    @Test
    public void test_GUI() throws IOException, ClassNotFoundException
    {	  
    	// init
    	boolean breakFlag = false;
		Scanner scan = new Scanner(System.in);
		GeometriaIO geometry = new GeometriaIO(new Shapes());
		
    	do 
    	{ 
    		System.out.println(
    				"Co chcesz dzisiaj zrobic ?\nPodaj Numer Operacji: \n\n"
    				+ "1 Dodaj figure\n"
    				+ "2 Wczytaj figury z pliku txt\n"
    				+ "3 Wczytaj figury z pliku binarnego\n"
    				+ "4 Zapisz figury do pliku binarnego\n"
    				+ "5 Wypisz liste figur\n"
    				+ "6 Poszerz wszystkie kola\n"
    				+ "\nUwaga ! Kazdy inny wpis powoduje koniec programu ! \n  ");
    		    		
    		switch (scan.nextInt())
    		{
    			case 1:
    				geometry.dodajFigure();
    				break;
    			case 2:
    				geometry.wczytajFigury();
    				break;
    			case 3:
    				geometry.restore();
    				break;
    			case 4:
    				geometry.save();
    				break;
    			case 5:
    				geometry.druk();
    				break;
    			case 6:
    				geometry.powiekszKola();
    			default:
    				breakFlag = true;
    		}
    	}
    	while(breakFlag == false); 
    	scan.close();

    	assertTrue(true);    
    }
}

