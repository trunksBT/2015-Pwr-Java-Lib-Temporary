package Bt.Core.Geometry.Elementaries;


public class Point
{
    double _x;
    double _y;

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

