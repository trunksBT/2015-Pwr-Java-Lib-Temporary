package Bt.Core.Geometry.Elementaries;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LineSegment implements Serializable
{
    private Point _a;
    private Point _b;

    public LineSegment(Point aA, Point aB)
    {
        _a = aA;
        _b = aB;
    }
         
    public void shift(double dx, double dy)
    {
        _a.shift(dx, dy);
        _b.shift(dx, dy);
    }
    
    public void extend(double dx)
    {
    	_b._x*=dx;
    	_b._y*=dx;
    }
     
    public double length()
    {
        return _a.distance(_b);
    }
    
    public Point getSecondEdge()
    {
    	return _b;
    }
    
    public boolean equals(LineSegment aSecond)
    {      
        boolean firstPred = 
            _a.equals(aSecond._a) && _b.equals(aSecond._b);
            
        boolean secondPred = 
            _a.equals(aSecond._b) && _b.equals(aSecond._a);
        
        return firstPred ^ secondPred;
    }

    public String toString()
    {
    	return String.format("%-15s,%-15s",_a,_b);
    }// acc = 31
}
