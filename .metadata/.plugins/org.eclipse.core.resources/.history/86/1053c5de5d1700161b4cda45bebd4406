package bt.core.collections.elems;

import bt.core.collections.interfaces.IPrintable;
import bt.core.streams.Strumien;

public class Pracownik extends Osoba implements IPrintable,Strumien 
{
	double wynagrodzenie;
	
    public Pracownik()
    {
    	super();
    	wynagrodzenie = 0;
    }
    
    public Pracownik(Pracownik par)
    {
    	super(par);
    	if( par!= null )
    		wynagrodzenie = par.wynagrodzenie;
    }
    
    public Pracownik(double iq, double tonMowy) {
		super(iq, tonMowy);
	}
    
    public Pracownik(double iq, double tonMowy, double wynagrodzenie) {
		super(iq, tonMowy);
		this.wynagrodzenie = wynagrodzenie;
	}
        
    public String toString()
    {
    	return super.toString()+(String.format("( %#5.1f )",wynagrodzenie));
    }
    
    public String mP()
    {
    	return "mp";
    }
 }  

