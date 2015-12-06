package Bt.Core.ABC.Tests;

import Bt.Core.Collections.Shape;
import Bt.Core.Geometry.Complex.LineSegment;
import Bt.Core.Geometry.Elementaries.Point;

public class Triangle extends Shape {

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
	public double Obwod() {
		LineSegment a = new LineSegment(vert1,vert2);
		LineSegment b = new LineSegment(vert2,vert3);
		LineSegment c = new LineSegment(vert3,vert1);
		
		return a.length() + b.length() + c.length();
	}

	@Override
	public String toString() {
		return "[Triangle_Name: "+super.name+
				"_P1: "+vert1.toString()+
				"_P2: "+vert2.toString()+
				"_P3: "+vert3.toString()+"]";
	}

}