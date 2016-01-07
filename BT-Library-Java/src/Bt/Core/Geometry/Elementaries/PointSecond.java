package Bt.Core.Geometry.Elementaries;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PointSecond implements Serializable
{
    private double _x;
    private double _y;
    private String _test = "test";

    public PointSecond(PointSecond val)
    {
        _x=val._x;
        _y=val._y;
    }
    
    public PointSecond(double aX,double aY)
    {
        _x=aX;
        _y=aY;
    }
      
    public boolean equals(PointSecond aSecond)
    {
        return _x == aSecond._x && _y == aSecond._y;
    }
    
    public void shift(double dx, double dy)
    {
        _x+=dx;
        _y+=dy;
    }
    
    public double distance(PointSecond aSecond)
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

