package bt.collections.elems;

import bt.collections.interfaces.IPrintable;
import bt.streams.Strumien;

public class Osoba extends Ssak implements IPrintable,Strumien
{
    double tonMowy;

    public Osoba()
    {
        this.tonMowy=0;
    }
    
    public Osoba(Osoba par)
    {
    	super(par);
    	if(par != null )
    		this.tonMowy=par.tonMowy;
    }
    
    public Osoba(double iq,double tonMowy)
    {
    	super(iq);
    	this.tonMowy=tonMowy;
    }
    
    public Osoba getPerson()
    {
    	return new Osoba();
    }
        
    public String toString()
    {
    	return super.toString() + (String.format("( %#5.1f )",iq));
    }
    
    @Override
	public void drukuj() {
		wyj.println(toString());
	}
 }  

