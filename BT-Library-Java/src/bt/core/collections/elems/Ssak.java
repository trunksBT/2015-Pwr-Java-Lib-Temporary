package bt.core.collections.elems;

import bt.core.collections.interfaces.IPrintable;
import bt.core.streams.Strumien;

public class Ssak implements IPrintable,Strumien
{
    double iq;

    public Ssak()
    {
        this.iq=0;
    }
    
    public Ssak(Ssak par)
    {
    	if(par != null)
    		this.iq=par.iq;
    }
    
    public Ssak(double iq)
    {
   		this.iq=iq;
    }
        
    public String toString()
    {
    	return (String.format("( %#5.1f )",iq));
    }
    
    @Override
	public void drukuj() {
		wyj.println(toString());
	}
 }  
