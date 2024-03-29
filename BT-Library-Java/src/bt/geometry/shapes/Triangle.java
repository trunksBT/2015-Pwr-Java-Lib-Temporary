package bt.geometry.shapes;

import bt.geometry.elementaries.LineSegment;
import bt.geometry.elementaries.Point;

@SuppressWarnings("serial")
public class Triangle extends Shape implements IShape{

	Point vert1;
	Point vert2;
	Point vert3;
	
	public Triangle(String name,Point vert1,Point vert2,Point vert3) {
		super(name);
		this.vert1 = vert1;
		this.vert2 = vert2;
		this.vert3 = vert3;
	}

	@Override
	public double obwod() {
		LineSegment a = new LineSegment(vert1,vert2);
		LineSegment b = new LineSegment(vert2,vert3);
		LineSegment c = new LineSegment(vert3,vert1);
		
		return a.length() + b.length() + c.length();
	}

	@Override
	public String toString() {
		return String.format("%-15s %-9s %-15s %-9s %-15s %-15s %-15s",
			super.toString(),
			this.getClass().getSimpleName(),
			"",
			"",
			vert1,
			vert2,
			vert3);
	}
}
