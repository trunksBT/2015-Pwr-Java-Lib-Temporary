package bt.core.geometry.elementaries;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LineSegment implements Serializable
{
    private Point a;
    private Point b;

    public LineSegment(Point a, Point b)
    {
        this.a = a;
        this.b = b;
    }
         
    public void shift(double dx, double dy)
    {
    	this.a.shift(dx, dy);
    	this.b.shift(dx, dy);
    }
    
    public void extend(double dx)
    {
    	this.b.x*=dx;
    	this.b.y*=dx;
    }
     
    public double length()
    {
        return a.distance(b);
    }
    
    public Point getSecondEdge()
    {
    	return b;
    }
    
    public boolean equals(LineSegment aSecond)
    {      
        boolean firstPred = 
            a.equals(aSecond.a) && b.equals(aSecond.b);
            
        boolean secondPred = 
            a.equals(aSecond.b) && b.equals(aSecond.a);
        
        return firstPred ^ secondPred;
    }

    public String toString()
    {
    	return String.format("%-15s,%-15s",a,b);
    }// acc = 31
}
