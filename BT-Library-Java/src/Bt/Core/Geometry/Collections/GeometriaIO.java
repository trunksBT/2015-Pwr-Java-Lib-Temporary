package Bt.Core.Geometry.Collections;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
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
		wyj.println("Podaj nazwe pliku txt z zawartymi figurami");
		String path = scan.next();
		
		BufferedReader reader = new BufferedReader(new FileReader(path.concat(".txt")));
	    
		String line = null;
	    while((line = reader.readLine())!=null){
	    	String[] infos = line.split("[ (),]");
	    	String[] outTab = new String[9];
	    	
	    	for(int i = 0,idx = 0 ; i < infos.length ;i++)
	    	{
	    		if(!(infos[i].equals("")))
	    			outTab[idx++] = infos[i];
	    	}
	    	
	    	if(outTab[1].equals("Circle"))
	    	{
	    		String name = outTab[0];
	    		double x = Double.parseDouble(outTab[2]);
	    		double y = Double.parseDouble(outTab[3]);
	    		double length = Double.parseDouble(outTab[4]);
	    		
	    		Point point = new Point(x,y);   			
	    		_elementy.add(new Circle(name,point,length));
	    	}
	    	else if(outTab[1].equals("Triangle"))
		    {
			    String name = outTab[0];
			    double aX = Double.parseDouble(outTab[2]);
			    double aY = Double.parseDouble(outTab[3]);			    
			    Point pointA = new Point(aX,aY);
			    
			    double bX = Double.parseDouble(outTab[4]);
			    double bY = Double.parseDouble(outTab[5]);		    
			    Point pointB = new Point(bX,bY);
			    
			    double cX = Double.parseDouble(outTab[6]);
			    double cY = Double.parseDouble(outTab[7]);		    
			    Point pointC = new Point(cX,cY);
    	
			    _elementy.add(new Triangle(name,pointA,pointB,pointC));
		    }  	
	    }	    
	    reader.close();
	}
	
	public void wczytajFiguryForTests(String path) throws IOException
	{					
		BufferedReader reader = new BufferedReader(new FileReader(path.concat(".txt")));
	    
		String line = null;
	    while((line = reader.readLine())!=null){
	    	String[] infos = line.split("[ (),]");
	    	String[] outTab = new String[9];
	    	
	    	for(int i = 0,idx = 0 ; i < infos.length ;i++)
	    	{
	    		if(!(infos[i].equals("")))
	    			outTab[idx++] = infos[i];
	    	}
	    	
	    	if(outTab[1].equals("Circle"))
	    	{
	    		String name = outTab[0];
	    		double x = Double.parseDouble(outTab[2]);
	    		double y = Double.parseDouble(outTab[3]);
	    		double length = Double.parseDouble(outTab[4]);
	    		
	    		Point point = new Point(x,y);   			
	    		_elementy.add(new Circle(name,point,length));
	    	}
	    	else if(outTab[1].equals("Triangle"))
		    {
			    String name = outTab[0];
			    double aX = Double.parseDouble(outTab[2]);
			    double aY = Double.parseDouble(outTab[3]);			    
			    Point pointA = new Point(aX,aY);
			    
			    double bX = Double.parseDouble(outTab[4]);
			    double bY = Double.parseDouble(outTab[5]);		    
			    Point pointB = new Point(bX,bY);
			    
			    double cX = Double.parseDouble(outTab[6]);
			    double cY = Double.parseDouble(outTab[7]);		    
			    Point pointC = new Point(cX,cY);
    	
			    _elementy.add(new Triangle(name,pointA,pointB,pointC));
		    }  	
	    }	    
	    reader.close();
	}
	
	public void dodajFigure()
	{
		try
		{
			wyj.println("Podaj nazwe figury");
			String name = scan.next();
			

			wyj.println("Wybierz typ figury");
			wyj.println("1 Kolo\2 Trojkat \"");
			int typ = scan.nextInt();
			
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
					double radiusLen = scan.nextDouble();
					
					Circle temp = new Circle(name, new Point(x,y),radiusLen);
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
		}catch(InputMismatchException e)
		{
			wyj.println("Podales zla wartosc, zacznij od nowa");
			dodajFigure();
		}
		finally
		{
			scan.close();
		}
		
	}
	
	public void dodajFigureForTests(String name,
			int typ,
			double x1,
			double y1, 
			double radLen,
			double x2,
			double y2, 
			double x3,
			double y3 )
	{		
		switch(typ)
		{
			case 1:// kolo
			{			
				Circle temp = new Circle(name, new Point(x1,y1),radLen);
				this.dodaj(temp);
				break;
			}			
			case 2:// trojkat
			{
				Point A = new Point(x1,y1);
				Point B = new Point(x2,y2);
				Point C = new Point(x3,y3);
						
				Triangle temp = new Triangle(name, A,B,C);
				this.dodaj(temp);
				break;
			}
			default:
			{
				wyj.println("Zly wybor,koniec aplikacji");
				break;
			}
		}
	}
	
	public void save() throws IOException
	{
		wyj.println("Podaj nazwe pliku do ktorego mam zapisac figury");
		String name = scan.next();	
							
		ObjectOutputStream wyjObj = new ObjectOutputStream(new FileOutputStream(name.concat(".dta")));
		
		wyjObj.writeObject(_elementy);
		wyjObj.close();
	}
		
	public void saveForTests(String path) throws IOException
	{							
		ObjectOutputStream wyjObj = new ObjectOutputStream(new FileOutputStream(path.concat(".dta")));

		wyjObj.writeObject(_elementy);
		wyjObj.close();	
	}
	
	public void restore() throws IOException, ClassNotFoundException
	{
		wyj.println("Podaj nazwe pliku z ktorego mam wczytac figury");
		String name = scan.next();	
							
		ObjectInputStream wyjObj = new ObjectInputStream(new FileInputStream(name.concat(".dta")));
		
		_elementy = (Shapes) wyjObj.readObject();
		wyjObj.close();	
	}
	
	public void restoreForTests(String path) throws IOException, ClassNotFoundException
	{
		ObjectInputStream wyjObj = new ObjectInputStream(new FileInputStream(path.concat(".dta")));
		
		_elementy = (Shapes) wyjObj.readObject();
		wyjObj.close();	
	}
	
	public void powiekszKola ()
	{
		wyj.println("Podaj wartosc o jaka chcesz pomnozyc promienie kola");
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
	
	public boolean powiekszKolaForTests (double val)
	{
		double mult = val;	
		boolean ifPerformed = false;
					
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
		{ 
			Shape el = it.next();
			if(el instanceof Circle)
			{
				ifPerformed = true;
				((Circle) el).getRadius().extend(mult);
			}
		}
		
		return ifPerformed;
	}	
}
