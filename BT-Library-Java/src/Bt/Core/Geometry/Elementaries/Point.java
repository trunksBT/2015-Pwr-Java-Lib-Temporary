package Bt.Core.Geometry.Elementaries;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Point implements Serializable
{
    double _x;
    double _y;
    String _test = "test";

    public Point(Point val)
    {
        _x=val._x;
        _y=val._y;
    }
    
    public Point(double aX,double aY)
    {
        _x=aX;
        _y=aY;
    }
      
    public boolean equals(Point aSecond)
    {
        return _x == aSecond._x && _y == aSecond._y;
    }
    
    public void shift(double dx, double dy)
    {
        _x+=dx;
        _y+=dy;
    }
    
    public double distance(Point aSecond)
    {        
        double xSubstract = aSecond._x - _x;
        double ySubstract = aSecond._y - _y;
        
        double firstSub = Math.pow(xSubstract,2);
        double secondSub = Math.pow(ySubstract,2);
        
        double distance = Math.sqrt(firstSub+secondSub);
        return distance;
    }  
    
    public String toString()
    {			
        return String.format("( %#5.1f,%#5.1f )",_x,_y);
    }// acc = 15
 }  

