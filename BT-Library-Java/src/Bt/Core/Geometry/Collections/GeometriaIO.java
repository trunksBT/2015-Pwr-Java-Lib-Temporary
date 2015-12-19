package Bt.Core.Geometry.Collections;

import java.util.Iterator;

import Bt.Core.FileOperations.Strumien;
import Bt.Core.Geometry.Elementaries.LineSegment;
import Bt.Core.Geometry.Elementaries.Point;
import Bt.Core.Geometry.Shapes.Circle;
import Bt.Core.Geometry.Shapes.Shape;
import Bt.Core.Geometry.Shapes.Triangle;

public class GeometriaIO extends Geometria implements IGeometry,Strumien{
	
//	W klasie geometria warto, dla 
//	uproszczenia obs�ugi we/we zdefiniowa� 
//	pola strumieniowe i Scanner.
	
	public GeometriaIO(Shapes _elementy) {
		super(_elementy);
	}
	
	public void druk() {
		
		System.out.println( String.format("%-15s %-9s %-15s %-9s %-15s %-15s %-15s",
				"Nazwa figury",
				"Rodzaj",
				"Srodek",
				"Promien",
				"A",
				"B",
				"C") ); 
	
		wyj.println();
		
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			wyj.println(el);
			wyj.println();
		}
	}
	
	public void wczytajFigury()
	{
//		metoda wczytajFigury () 
//		ma wczytywa� ci�g figur zapisanych 
//		(dowolnym edytorem np. notatnikiem) 
//		w pliku tekstowym o nazwie podanej przez u�ytkownika
//		i oczywi�cie dodawa� je do zbioru . 
//		Ka�da figura ma by� zapisana w osobnym wierszu. Np.
//		k�ko    Kolo       12.5    -1.0    14.0
//		tr1        Trojk  1.0  -5.1  3.5  17.0   -3.2  234.0

	}
	
	public void dodajFigure()
	{
		String name;
		wyj.println("Hej Podaj nazwe figury");
		name = scan.next();
		
		int typ;
		wyj.println("Wybierz typ figury");
		wyj.println("1. Kolo ");
		wyj.println("2. Trojkat ");
		typ = scan.nextInt();
		
		switch(typ)
		{
			case 1:// kolo
			{
				wyj.println("Podaj srodek");
				
				wyj.println("X:");
				double x = scan.nextDouble();
				
				wyj.println("Y:");
				double y = scan.nextDouble();
				wyj.println();
				
				wyj.println("Podaj dlugosc promienia");
				double radius = scan.nextDouble();
				
				Point center = new Point(x,y);
				Point onEdge = new Point(x,y);
				onEdge.shift(radius,0);
				
				LineSegment radiusSeg = new LineSegment(center,onEdge);
				
				Circle temp = new Circle(name, center,radiusSeg);
				this.dodaj(temp);
				wyj.println(temp);
				break;
			}			
			case 2:// trojkat
			{
				wyj.println("Podaj PunktA");	
				wyj.println("X:");
				double aX = scan.nextDouble();
				
				wyj.println("Y:");
				double aY = scan.nextDouble();
				wyj.println();
				
				wyj.println("Podaj PunktB");	
				wyj.println("X:");
				double bX = scan.nextDouble();
				
				wyj.println("Y:");
				double bY = scan.nextDouble();
				wyj.println();
				
				wyj.println("Podaj PunktC");		
				wyj.println("X:");
				double cX = scan.nextDouble();
				
				wyj.println("Y:");
				double cY = scan.nextDouble();
				wyj.println();
				
				Point A = new Point(aX,aY);
				Point B = new Point(bX,bY);
				Point C = new Point(cX,cY);
						
				Triangle temp = new Triangle(name, A,B,C);
				this.dodaj(temp);
				wyj.println(temp);
				break;
			}
			default:
			{
				wyj.println("Zly wybor,koniec aplikacji");
				break;
			}
		}		

		wyj.println("KoniecCzytania");
		scan.close();
//		- metoda dodajFigure()  
//		ma wczyta� i doda� do zbioru figur� , 
//		oczywi�cie zdefiniowan� w czasie dialogu z u�ytkownikiem
	}
	
	public void save()
	{
//	- metoda  zapisuj�ca zbi�r figur do pliku binarnego o
//		nazwie podanej przez u�ytkownika
	}
	
	public void restore()
	{
//		- metoda restore() wczytuj�ca (do pola figury) 
//		zbi�r figur z pliku binarnego o nazwie podanej przez u�ytkownika
	}
	
	public void powiekszKola ()
	{
		wyj.println("Hej podaj wartosc o jaka chcesz pomnozyc promienie kola");
		wyj.print("Mult: ");
		double mult = scan.nextDouble();	
					
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			if(el instanceof Circle)
			{
				((Circle) el).getRadius().extend(mult);
			}
		}
	}
}
