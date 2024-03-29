package bt.geometry.shapes;

import bt.geometry.elementaries.LineSegment;
import bt.geometry.elementaries.Point;

@SuppressWarnings("serial")
public class Circle extends Shape{

	Point center;
	LineSegment radius;
	
	public Circle(String name)
	{
		super(name);
		center = new Point(0,0);
		radius = new LineSegment(new Point(0,0),new Point(0,0));
	}
	
	public Circle(String name, Point center,LineSegment radius)
	{
		super(name);
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(String name, Point center,double radiusLength)
	{
		super(name);
		this.center = center;
		Point copyOfCenter = new Point(center);
		copyOfCenter.shift(radiusLength,0);
		this.radius = new LineSegment(this.center,copyOfCenter);
	}

	@Override
	public double obwod() {
		return 2*Math.PI*radius.length();
	}

	@Override
	public String toString() {
		return String.format("%-15s %-9s %-15s %-9.1f %-15s %-15s %-15s",
			super.toString(),
			this.getClass().getSimpleName(),
			center,
			radius.length(),
			"",
			"",
			"");
	}
	
	public LineSegment getRadius()
	{
		return radius;
	}
}
