package bt.core.collections.elems;

import bt.core.collections.interfaces.IPrintable;
import bt.core.streams.Strumien;

public class Programista extends Pracownik implements IPrintable,Strumien 
{	
	double projectId;
	
    public Programista()
    {
    	super();
    	projectId = 0;
    }
	
    public Programista(Programista p)
    {
    	super(p);
    }
    
    public Programista(double x, double y) {
		super(x, y);
	}
    
    public Programista(double x, double y, double salary) {
		super(x, y,salary);
	}
    
    public Programista(double x, double y, double salary,double projectId) {
		super(x, y,salary);
		this.projectId = projectId;
	}
        
    public String toString()
    {
    	return super.toString()+(String.format("( %#5.1f )",projectId));
    }
 }  

