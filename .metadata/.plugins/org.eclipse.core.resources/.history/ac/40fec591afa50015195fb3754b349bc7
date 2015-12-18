package Bt.Core.Geometry.Collections;

import java.util.Iterator;

import Bt.Core.Geometry.Shapes.Shape;

public class GeometriaIO extends Geometria{

	public GeometriaIO(Shapes _elementy) {
		super(_elementy);
	}
	
	public void druk() {
		for(Iterator<Shape> it = _elementy.iterator(); it.hasNext();)
		{ 
			Shape el=it.next();
			System.out.println(el.toString());
			System.out.println();
		}
	}
}
