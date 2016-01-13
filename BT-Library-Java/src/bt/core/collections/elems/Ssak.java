package bt.core.collections.elems;

import bt.core.collections.interfaces.IPrintable;
import bt.core.streams.Strumien;

public class Ssak implements IPrintable,Strumien
{
    double x;

    public Ssak()
    {
        this.x=0;
    }
    
    public Ssak(Ssak p)
    {
        this.x=p.x;
    }
    
    public Ssak(double x)
    {
    	this.x=x;
    }
        
    public String toString()
    {
    	return (String.format("( %#5.1f )",x));
    }
    
    @Override
	public void drukuj() {
		wyj.println(toString());
	}
 }  

