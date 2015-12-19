package Bt.Core.Geometry.Shapes;

import Bt.Core.Geometry.Elementaries.LineSegment;
import Bt.Core.Geometry.Elementaries.Point;

public class Circle extends Shape{

	Point center;
	LineSegment radius;
	
	public Circle(String name)
	{
		super(name);
	}
	
	public Circle(String name, Point center,LineSegment radius)
	{
		super(name);
		this.center = center;
		this.radius = radius;
	}

	@Override
	public double Obwod() {
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
