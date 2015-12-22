package Bt.Core.Geometry.Collections;

import java.util.Iterator;

import Bt.Core.Geometry.Shapes.Circle;
import Bt.Core.Geometry.Shapes.Shape;

public class Geometria implements IGeometry{

	protected Shapes _elementy;
	
	public Geometria(Shapes _elementy) {
		this._elementy = _elementy;
	}
	
	public boolean druk() {	
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			System.out.println(el.toString());
			System.out.println();
		}
		return true;
	}

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
		_elementy.remove(new Shape(nazwa));
	}
	
	public Shape dajFigure(String nazwa) {
		
		Shape retVal = null;
		
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			if(el.name.equals(nazwa))
				retVal = el;
		}
		
		return retVal;
	}

	@Override
	public void dodaj(Shape aShape) {
		_elementy.add(aShape);
	}
}
