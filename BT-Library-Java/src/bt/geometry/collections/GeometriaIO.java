package bt.geometry.collections;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import bt.geometry.elementaries.LineSegment;
import bt.geometry.elementaries.Point;
import bt.geometry.shapes.Circle;
import bt.geometry.shapes.Shape;
import bt.geometry.shapes.Triangle;
import bt.streams.Strumien;

public class GeometriaIO extends Geometria implements IGeometry,Strumien,IForTestIO {

	public GeometriaIO(Shapes elementy){
		super(elementy);
	}
	
	public boolean druk() {
		
		System.out.println( String.format("%-15s %-9s %-15s %-9s %-15s %-15s %-15s\n",
				"Nazwa figury",
				"Rodzaj",
				"Srodek",
				"Promien",
				"A",
				"B",
				"C") ); 
		
		for(Iterator<Shape> it = elementy.iterator(); it.hasNext();)
			wyj.println(it.next());
		
		System.out.println();
		
		return true;
	}
		
	@SuppressWarnings("resource")
	public boolean wczytajFigury() throws IOException
	{
		BufferedReader reader = null;
		boolean opened = false;
		
		try
		{
			wyj.println("Podaj nazwe pliku txt z zawartymi figurami");
			String path = scan.next();
			
			reader = new BufferedReader(new FileReader(path.concat(".txt")));
			opened = true;
		    
			String line = null;
		    while((line = reader.readLine())!=null){
		    	String[] infos = line.split("[ (),]");
		    	// scanner pomija rzeczy !!! TODO
		    	
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
		    		elementy.add(new Circle(name,point,length));
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
	    	
				    elementy.add(new Triangle(name,pointA,pointB,pointC));
			    }
		    	else
		    		throw new InvalidClassException("Not Matched Class");
	    	}
		}
	    catch(FileNotFoundException e) {
	    	wyj.println("Nie odnaleziono takiego pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
	    }
	    catch(InvalidClassException  e) {
	    	wyj.println("Zle zapisane obiektu do pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
	    }
		catch(NumberFormatException e)
		{
	    	wyj.println("Zle zapisane obiektu do pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
		}
		catch(Exception e)
		{
	    	wyj.println("Zle zapisane obiektu do pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
		}

		if(opened) reader.close();
		
	    return true;
	}
	
	public boolean liczbaKol()
	{
		wyj.println("Liczba Kol: " + iLiczbaKol());
		return true;
	}
	
	public boolean sumaObwodow()
	{
		wyj.println("Suma Obwodow wszystkich figur : " + super.iSumaObwodow() + "\n");
		return true;
	}
	
	public boolean usunFigure()
	{
		wyj.println("Podaj nazwe figury");
		
		if(usunFigure(scan.next()))
			wyj.println("Skasowano\n");
		else
			wyj.println("Nie bylo takiej figury\n");
		
		return true;
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
	    		elementy.add(new Circle(name,point,length));
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
    	
			    elementy.add(new Triangle(name,pointA,pointB,pointC));
		    }  	
	    }	    
	    reader.close();
	}
	
	public boolean dodajFigure()
	{
		boolean retVal = true;
		boolean breakFlag = true;
		
		do
		{
			try
			{
				wyj.println("Wybierz typ figury");
				wyj.println("1 Kolo\n 2 Trojkat\n 3 Powrot do wczesniejszego menu\n 4 Lub cos innego konczy program\n");
				int typ = scan.nextInt();
			
				switch(typ)
				{
					case 1:// kolo
					{			
						wyj.println("Podaj nazwe figury");
						String name = scan.next();	
						
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
						wyj.println("Podaj nazwe figury");
						String name = scan.next();	
						
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
					case 3:
						retVal = true;
						breakFlag = false;
						break;
						
					default:
						retVal = false;
						breakFlag = false;
				}		
			}
			catch(InputMismatchException e)
			{
				wyj.println("Podales zla wartosc, powrot do wczesniejszego menu");	
				breakFlag = false;
			}
			catch(NoSuchElementException e)
			{
				wyj.println("StrumienPusty, powrot do wczesniejszego menu");
				breakFlag = false;
			}
		}
		while(breakFlag == true);
		
		return retVal;
	}
	
	public boolean dajFigure()
	{
		wyj.println("Podaj nazwe figury");
		String name = scan.next();
		super.dajFigure(name);
		
		if(super.dajFigure(name)!=null)			
			wyj.println(super.dajFigure(name)+"\n");
		else
			wyj.println("Brak Figury\n");
		
		return true;
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
	
	public boolean save() throws IOException
	{
		wyj.println("Podaj nazwe pliku do ktorego mam zapisac figury");
//		String name = scan.next();	
		ObjectOutputStream wyjObj = null;
		boolean opened = false;
		
		try
		{	
			wyjObj = new ObjectOutputStream(new FileOutputStream(scan.next().concat(".dta")));	
			opened = true;
			wyjObj.writeObject(elementy);
		
		}catch(FileNotFoundException e) {
	    	wyj.println("Nie odnaleziono takiego pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
	    }
	    catch(IOException e)
		{
	    	wyj.println("Blad odczytu z pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
		}
		catch(Exception e)
		{
	    	wyj.println("Wystapil blad");
	    	wyj.println("Wracam do wczesniejszego menu");
		}

		if( opened ) wyjObj.close();
			
		return true;
	}
		
	public void saveForTests(String path) throws IOException
	{	
		ObjectOutputStream wyjObj = null;
		boolean opened = false;
		
		try {		
			
			wyjObj =new ObjectOutputStream(new FileOutputStream(path.concat(".dta")));
			opened = true;
			
			wyjObj.writeObject(elementy);
			
		}catch(FileNotFoundException e) {
	    	wyj.println("Nie odnaleziono takiego pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
	    }
		catch(InvalidClassException e)
		{
	    	wyj.println("Obiekt typu nieoczekiwanego");
	    	wyj.println("Wracam do wczesniejszego menu");
		}
	    catch(IOException e)
		{
	    	wyj.println("Blad odczytu z pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
		}
		catch(Exception e)
		{
	    	wyj.println("Wystapil blad");
	    	wyj.println("Wracam do wczesniejszego menu");
		}
		
		if( opened ) wyjObj.close();
		
	}
	
	public boolean restore() throws IOException
	{
		ObjectInputStream wyjObj = null;
		boolean opened = false;
		try
		{
			wyj.println("Podaj nazwe pliku z ktorego mam wczytac figury");
								
			wyjObj = new ObjectInputStream(new FileInputStream(scan.next().concat(".dta")));
			opened = true;
			
			elementy = (Shapes) wyjObj.readObject();
			
		}catch(FileNotFoundException e) {
	    	wyj.println("Nie odnaleziono takiego pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
	    }
	    catch(ClassNotFoundException  e) {
	    	wyj.println("Zle zapisane obiektu do pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
	    }
		catch(IOException e)
		{
	    	wyj.println("Blad odczytu z pliku");
	    	wyj.println("Wracam do wczesniejszego menu");
		}
		catch(Exception e)
		{
	    	wyj.println("Wystapil blad");
	    	wyj.println("Wracam do wczesniejszego menu");
		}
		
		if( opened )wyjObj.close();	
	
		return true;
	}
	
	public void restoreForTests(String path) throws IOException, ClassNotFoundException
	{
		ObjectInputStream wyjObj = new ObjectInputStream(new FileInputStream(path.concat(".dta")));
		
		elementy = (Shapes) wyjObj.readObject();
		wyjObj.close();	
	}
	
	public boolean powiekszKola()
	{
		wyj.println("Podaj wartosc o jaka chcesz pomnozyc promienie kola");
		wyj.print("Mult: ");
		double mult = scan.nextDouble();	
					
		for(Iterator<Shape> it = elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			if(el instanceof Circle)
				((Circle) el).getRadius().extend(mult);
		}
		
		return true;
	}
	
	public boolean powiekszKolaForTests (double val)
	{
		double mult = val;	
		boolean ifPerformed = false;
					
		for(Iterator<Shape> it = elementy.iterator(); it.hasNext();)
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
