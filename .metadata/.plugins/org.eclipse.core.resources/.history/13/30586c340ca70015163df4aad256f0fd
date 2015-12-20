package Bt.Core.FileOperations;

import java.io.IOException;
import java.io.Serializable;
import java.io.StreamTokenizer;

public abstract class Publikacja implements Comparable, Cloneable, Serializable, Strumien
{   String tytul;
    String autor;
    int rok;

    Publikacja(StreamTokenizer st,boolean standard)throws IOException
    {  if(standard){wyj.print(" Podaj Tytul  Autora i Rok "); wyj.flush();}
       st.nextToken();
       tytul=st.sval;
       st.nextToken();
       autor=st.sval;
       while(st.nextToken()!=st.TT_NUMBER);
       rok=(int)st.nval;
     }

     public Publikacja clone() 
    { try{ Publikacja p=(Publikacja)super.clone();
           p.tytul= new String(tytul);
           p.autor=new String(autor);
           return p;
      } catch(CloneNotSupportedException e){return null;}    
     }
     
     public String toString()
     { return String.format("%-30s %-15s %6d  ", tytul,autor,rok); }
     
     public boolean equals(Publikacja p)
     { return p!=null && tytul.equals(p.tytul) && autor.equals(p.autor) ; }
     
     public int hashCode()
     { return tytul.hashCode() & autor.hashCode(); }
          
     public int compareTo(Object p1)
     {   Publikacja p=(Publikacja)p1;
         return (tytul.compareTo(p.tytul)!=0 ? tytul.compareTo(p.tytul) : autor.compareTo(p.autor));
     }
}

