package bt.core.collections.elems;

import bt.core.collections.interfaces.IPrintable;
import bt.core.streams.Strumien;

public class Pracownik extends Osoba implements IPrintable,Strumien 
{
	double salary;
	
    public Pracownik()
    {
    	super();
    	salary = 0;
    }
    
    public Pracownik(Pracownik p)
    {
    	super(p);
    }
    
    public Pracownik(double x, double y) {
		super(x, y);
	}
    
    public Pracownik(double x, double y, double salary) {
		super(x, y);
		this.salary = salary;
	}
        
    public String toString()
    {
    	return super.toString()+(String.format("( %#5.1f )",salary));
    }
 }  

