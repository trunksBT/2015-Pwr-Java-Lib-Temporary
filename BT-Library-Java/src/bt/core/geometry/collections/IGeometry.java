package bt.core.geometry.collections;

import bt.core.geometry.shapes.Shape;

public interface IGeometry {
	public boolean druk();
	public double iSumaObwodow();	
	public int iLiczbaKol();	
	public void dodaj(Shape aShape);
	public boolean usunFigure(String nazwa);	
	public Shape dajFigure(String nazwa);
}