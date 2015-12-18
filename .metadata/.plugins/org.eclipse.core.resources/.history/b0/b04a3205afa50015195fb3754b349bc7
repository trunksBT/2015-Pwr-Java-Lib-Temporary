package Bt.Core.Geometry.Shapes;

import Bt.Core.Geometry.Elementaries.LineSegment;
import Bt.Core.Geometry.Elementaries.Point;

public class Circle extends Shape {

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
		return "[Circle_Name: "+name.toString()+center.toString()+"_Radius: "+radius.toString()+"]";
	}
	
}
