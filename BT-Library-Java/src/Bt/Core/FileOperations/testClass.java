package Bt.Core.FileOperations;

import java.io.IOException;
import java.io.PrintWriter;

public class testClass implements Strumien 
{      
    public testClass() throws IOException,ClassNotFoundException
    { 
    	PrintWriter plikWyj= new PrintWriter("wyniki.txt");
    	Spis spis=new Spis();
    	spis.wczytaj();
    	char odp = ' ';
    	
    	do 
    	{ 
    		wyj.println(" Co chcesz robic : Dodaj publikacje, Wypisz liste, Save, Restore, Koniec ");
    		st.nextToken(); 
    	
    		odp=st.sval.toLowerCase().charAt(0);
    	
	    	switch(odp)
	    	{
		    	case 'd' : spis.nowaPublikacja(st,true);break;
		    	case 'w' : plikWyj.printf("%s %n",spis); break;
		    	case 's' : spis.save(); break;
		    	case 'r' : spis=spis.restore(); break;
		    	case 'k' : break;
		    	default  : wyj.printf(" Nie ma takiej opcji %n");
	    	}
         } while (odp!='k');
        
      if(plikWyj != null) plikWyj.close();  
     }
}


