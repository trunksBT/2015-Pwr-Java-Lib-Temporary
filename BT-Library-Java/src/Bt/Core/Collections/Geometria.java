package Bt.Core.Collections;

import java.util.Iterator;

import Bt.Core.ABC.Tests.Circle;

public class Geometria {

	Shapes _elementy;
	
	public Geometria(Shapes _elementy) {
		this._elementy = _elementy;
	}
	
	public void druk() {
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			System.out.println(el.toString());
			System.out.println();
		}
	}
//	
	public double sumaObwodow() {
		
		double acc = 0;
		
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			acc+=el.Obwod();
		}
		
		return acc;
	}
	
	public int liczbaKol() {
		
		int acc = 0;
		
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			if(el.getClass() == Circle.class)
				acc++;
		}
		
		return acc;
	}
	
	public void usunFigure(String nazwa) {
		_elementy.remove(new Circle(nazwa));
	}
	
	public Shape dajFigure(String nazwa) {
		
		Shape retVal = null;
		
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			if(el.name == nazwa)
				retVal = el;
		}
		
		return retVal;
	}
}