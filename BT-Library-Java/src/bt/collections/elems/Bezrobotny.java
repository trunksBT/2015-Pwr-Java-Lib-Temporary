package bt.collections.elems;

import bt.collections.interfaces.IPrintable;
import bt.streams.Strumien;

public class Bezrobotny extends Osoba implements IPrintable,Strumien 
{
    public Bezrobotny()
    {
    	super();
    }
    
    public Bezrobotny(Bezrobotny par)
    {
    	super(par);
    }
    
    public Bezrobotny getPerson()
    {
    	return new Bezrobotny();
    }
    
    public Bezrobotny(double iq, double tonMowy) {
		super(iq, tonMowy);
	}
 }  

