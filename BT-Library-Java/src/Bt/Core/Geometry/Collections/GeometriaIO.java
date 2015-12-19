package Bt.Core.Geometry.Collections;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
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
		
		System.out.println( String.format("%-15s %-9s %-15s %-9s %-15s %-15s %-15s\n",
				"Nazwa figury",
				"Rodzaj",
				"Srodek",
				"Promien",
				"A",
				"B",
				"C") ); 
		
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
			wyj.println(it.next());
	}
	
	public void wczytajFigury() throws IOException
	{
		wyj.println("Hej Podaj nazwe pliku txt z ktorego mam wczytac figury");
		String name = scan.next();	
							
	    StreamTokenizer plikWej=new StreamTokenizer(new FileReader(name.concat(".txt")));
	    
	    while(plikWej.nextToken()!=plikWej.TT_EOF){
	    	plikWej.pushBack();
	    	Object buff = plikWej;
	    }
	}
		
	public void wczytajFiguryForTests() throws IOException
	{					
		BufferedReader reader = new BufferedReader(new FileReader("shapes.txt"));
	    
		String line = null;
	    while((line = reader.readLine())!=null){
	    	String[] infos = line.split("[ (),]");

	    	String[] outTab = new String[9];
	    	int idx = 0;
	    	
	    	for(int i = 0 ; i < infos.length ;i++)
	    	{
	    		if(!(infos[i].equals("")))
	    		{
	    			outTab[idx++] = infos[i];
	    		}
	    	}
	    	
	    	if(outTab[1].equals("Circle"))
	    	{
	    		double x = Double.parseDouble(outTab[2]);
	    		double y = Double.parseDouble(outTab[3]);
	    		double length = Double.parseDouble(outTab[4]);
	    		
	    		Point point = new Point(x,y);
	    		String name = outTab[0];
	    			
	    		_elementy.add(new Circle(name,point,length));
	    	}else
		    if(outTab[1].equals("Triangle"))
		    {
			    double aX = Double.parseDouble(outTab[2]);
			    double aY = Double.parseDouble(outTab[3]);
			    
			    Point pointA = new Point(aX,aY);
			    
			    double bX = Double.parseDouble(outTab[4]);
			    double bY = Double.parseDouble(outTab[5]);
			    
			    Point pointB = new Point(bX,bY);
			    
			    double cX = Double.parseDouble(outTab[6]);
			    double cY = Double.parseDouble(outTab[7]);
			    
			    Point pointC = new Point(cX,cY);
			    String name = outTab[0];
			    	
			    _elementy.add(new Triangle(name,pointA,pointB,pointC));
		    }
	    	
	    }
	    
	    reader.close();
	}
	
	public void dodajFigure()
	{
		wyj.println("Hej Podaj nazwe figury");
		String name = scan.next();
		
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