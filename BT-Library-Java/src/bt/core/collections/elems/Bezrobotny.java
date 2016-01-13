package bt.core.collections.elems;

import bt.core.collections.interfaces.IPrintable;
import bt.core.streams.Strumien;

public class Bezrobotny extends Osoba implements IPrintable,Strumien 
{
    public Bezrobotny()
    {
    	super();
    }
    
    public Bezrobotny(Bezrobotny p)
    {
    	super(p);
    }
    
    public Bezrobotny(double x, double y) {
		super(x, y);
	}
 }  

