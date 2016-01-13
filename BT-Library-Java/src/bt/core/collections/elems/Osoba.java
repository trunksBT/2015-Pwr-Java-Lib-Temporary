package bt.core.collections.elems;

import java.io.Serializable;

import bt.core.collections.interfaces.IPrintable;
import bt.core.streams.Strumien;

public class Osoba extends Ssak implements IPrintable,Strumien
{
    double y;

    public Osoba()
    {
        this.y=0;
    }
    
    public Osoba(Osoba p)
    {
    	super(p);
        this.y=p.y;
    }
    
    public Osoba(double x,double y)
    {
    	super(x);
    	this.y=y;
    }
        
    public String toString()
    {
    	return super.toString() + (String.format("( %#5.1f )",x));
    }
    
    @Override
	public void drukuj() {
		wyj.println(toString());
	}
 }  

