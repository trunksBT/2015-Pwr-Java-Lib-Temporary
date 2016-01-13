package bt.core.collections.elems;

import java.io.Serializable;

import bt.core.collections.interfaces.IPrintable;
import bt.core.streams.Strumien;

public class Osoba implements IPrintable,Strumien
{
    double x;
    double y;

    public Osoba()
    {
        this.x=0;
        this.y=0;
    }
    
    public Osoba(Osoba p)
    {
        this.x=p.x;
        this.y=p.y;
    }
    
    public Osoba(double x,double y)
    {
    	this.x=x;
    	this.y=y;
    }
        
    public String toString()
    {
    	return (String.format("( %#5.1f,%#5.1f )",x,y));
    }
    
    @Override
	public void drukuj() {
		wyj.println(toString());
	}
 }  

