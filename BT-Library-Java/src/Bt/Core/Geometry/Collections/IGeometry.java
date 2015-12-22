package Bt.Core.Geometry.Collections;

import Bt.Core.Geometry.Shapes.Shape;

public interface IGeometry {
	public boolean druk();
	public double iSumaObwodow();	
	public int iLiczbaKol();	
	public void dodaj(Shape aShape);
	public boolean usunFigure(String nazwa);	
	public Shape dajFigure(String nazwa);
}