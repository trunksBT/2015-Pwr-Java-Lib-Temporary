package Bt.Core.Geometry.Collections;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Iterator;

import Bt.Core.FileOperations.Strumien;
import Bt.Core.Geometry.Shapes.Shape;

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
//		scan
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
//	- metoda powiekszKola ()  
//	mno��ca promienie wszystkich k� 
//	przez podany przez u�ytkownika wsp�czynnik.
	}
}
