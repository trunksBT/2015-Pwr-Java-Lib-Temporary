package bt.geometry.elementaries;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Point implements Serializable
{
    double x;
    double y;
    String test = "test"; // for ParP lab, redundant

    public Point(Point p)
    {
        this.x=p.x;
        this.y=p.y;
    }
    
    public Point(double x,double y)
    {
    	this.x=x;
    	this.y=y;
    }
      
    public boolean equals(Point second)
    {
        return x == second.x && y == second.y;
    }
    
    public void shift(double dx, double dy)
    {
    	this.x+=dx;
    	this.y+=dy;
    }
    
    public double distance(Point second)
    {        
        double xSub = second.x - this.x;
        double ySub = second.y - this.y;
        
        double fstSub = Math.pow(xSub,2);
        double sndSub = Math.pow(ySub,2);
        
        double distance = Math.sqrt(fstSub+sndSub);
        return distance;
    }  
    
    public double getX(){
    	return x;
    }
    
    public double getY(){
    	return y;
    }
    
    public String toString()
    {			
        return String.format("( %#5.1f,%#5.1f )",x,y);
    }// acc = 15
 }  

