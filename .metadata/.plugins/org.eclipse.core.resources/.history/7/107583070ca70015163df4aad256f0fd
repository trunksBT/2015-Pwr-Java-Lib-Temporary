package Bt.Core.FileOperations;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StreamTokenizer;
import java.util.SortedSet;
import java.util.TreeSet;

public class Spis implements Strumien,Serializable
{ 
	SortedSet<Publikacja> s = new TreeSet<Publikacja>();
     
   public String toString()
    {
	   String wynik=new String();
	   for(Publikacja el:s)
          wynik=wynik+String.format("%s %n" ,el);
       return wynik;
     }
     
     public void nowaPublikacja(StreamTokenizer st,boolean standard)throws IOException
     {   String odp="";
         while(!(odp.equals("Ksiazka")||odp.equals("Artykol"))) 
           { if(standard) {wyj.println(" Ksiazka  czy Artykol ");}
             st.nextToken();
             odp=st.sval;
           }    
         s.add(odp.equals("Ksiazka")? new Ksiazka(st,standard) : new Artykol(st,standard));
      }   
     
      public void save()throws IOException
      { ObjectOutputStream plik = new ObjectOutputStream(new BufferedOutputStream( new FileOutputStream("baza.dta")));
        plik.writeObject(this);
        plik.close();
        }
        
       public Spis restore()throws IOException, ClassNotFoundException
      { ObjectInputStream plik = new ObjectInputStream(new BufferedInputStream( new FileInputStream("baza.dta")));
        Spis tmp=(Spis)plik.readObject();
        plik.close();
        return tmp;
        }
         
     public void wczytaj() throws IOException
     { StreamTokenizer plikWej=new StreamTokenizer(new FileReader("dane.txt"));
       while(plikWej.nextToken()!=plikWej.TT_EOF)
         {plikWej.pushBack();
         nowaPublikacja(plikWej,false);
        }
     }    
}
