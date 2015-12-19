package Bt.Core.Geometry.Collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

import Bt.Core.FileOperations.Strumien;
import Bt.Core.Geometry.Elementaries.LineSegment;
import Bt.Core.Geometry.Elementaries.Point;
import Bt.Core.Geometry.Shapes.Circle;
import Bt.Core.Geometry.Shapes.Shape;
import Bt.Core.Geometry.Shapes.Triangle;

public class GeometriaIO extends Geometria implements IGeometry,Strumien,IForTestIO {


	
	public GeometriaIO(Shapes _elementy){
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
	}
	
	public void save() throws IOException
	{
		String name;
		wyj.println("Hej Podaj nazwe pliku do ktorego mam zapisac figury");
		name = scan.next();	
							
		FileOutputStream wyjStr = new FileOutputStream(name.concat(".dta"));
		ObjectOutputStream wyjObj = new ObjectOutputStream(wyjStr);
		
		wyjObj.writeObject(_elementy);
		wyjObj.close();	
		wyjStr.close();
	}
	
	public void saveForTests() throws IOException
	{							
		FileOutputStream wyjStr = new FileOutputStream(fileName());
		ObjectOutputStream wyjObj = new ObjectOutputStream(wyjStr);
		
		wyjObj.writeObject(_elementy);
		wyjObj.close();	
		wyjStr.close();
	}
	
	public void restore() throws IOException, ClassNotFoundException
	{
		String name;
		wyj.println("Hej Podaj nazwe pliku z ktorego mam wczytac figury");
		name = scan.next();	
							
		FileInputStream wyjStr = new FileInputStream(name.concat(".dta"));
		ObjectInputStream wyjObj = new ObjectInputStream(wyjStr);
		
		_elementy = (Shapes) wyjObj.readObject();
		wyjObj.close();	
		wyjStr.close();
	}
	
	public void restoreForTests() throws IOException, ClassNotFoundException
	{

		FileInputStream wyjStr = new FileInputStream(fileName());
		ObjectInputStream wyjObj = new ObjectInputStream(wyjStr);
		
		_elementy = (Shapes) wyjObj.readObject();
		wyjObj.close();	
		wyjStr.close();
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
