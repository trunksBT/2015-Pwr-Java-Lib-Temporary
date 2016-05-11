package bt.core.geometry.collections;

import java.util.Iterator;

import bt.core.geometry.shapes.Circle;
import bt.core.geometry.shapes.Shape;

public class Geometria implements IGeometry{

	protected Shapes elementy;
	
	public Geometria(Shapes elementy) {
		this.elementy = elementy;
	}
	
	public boolean druk() {	
		for(Iterator<Shape> it = elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			System.out.println(el);
			System.out.println();
		}
		return true;
	}

	public double iSumaObwodow() {
		
		double acc = 0;
		
		for(Iterator<Shape> it = elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			acc+=el.obwod();
		}
		
		return acc;
	}
	
	public int iLiczbaKol() {
		
		int acc = 0;
		
		for(Iterator<Shape> it = elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			if(it.next().getClass() == Circle.class)
				acc++;
		}
		
		return acc;
	}
	
	public boolean usunFigure(String nazwa) {
		return elementy.remove(new Shape(nazwa));
	}
	
	public Shape dajFigure(String nazwa) {
		
		Shape retVal = null;
		
//		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext())
		for(Iterator<Shape> it = elementy.iterator(); it.hasNext() && retVal == null;)
		{ 
			Shape el=it.next();
			if(el.name.equals(nazwa))
				retVal = el;
		}
		
		return retVal;
	}

	@Override
	public void dodaj(Shape aShape) {
		elementy.add(aShape);
	}
}
