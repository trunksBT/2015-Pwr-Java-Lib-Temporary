package bt.core.collections.elems;

import bt.core.collections.interfaces.IPrintable;
import bt.core.streams.Strumien;

public class Programista extends Pracownik implements IPrintable,Strumien 
{	
	double projektID;
	
    public Programista()
    {
    	super();
    	projektID = 0;
    }
	
    public Programista(Programista par)
    {
    	super(par);
    	if(par != null)
    		projektID = par.projektID;
    }
    
    public Programista(double iq, double tonMowy) {
		super(iq, tonMowy);
	}
    
    public Programista(double iq, double tonMowy, double wynagrodzenie) {
		super(iq, tonMowy,wynagrodzenie);
	}
    
    public Programista(double iq, double tonMowy, double wynagrodzenie,double projektID) {
		super(iq, tonMowy,wynagrodzenie);
		this.projektID = projektID;
	}
        
    public String toString()
    {
    	return super.toString()+(String.format("( %#5.1f )",projektID));
    }
 }  
