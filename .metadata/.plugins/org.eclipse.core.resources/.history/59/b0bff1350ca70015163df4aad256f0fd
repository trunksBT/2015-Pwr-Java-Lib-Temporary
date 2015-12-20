package Bt.Core.FileOperations;

import java.io.IOException;
import java.io.StreamTokenizer;

public class Ksiazka extends Publikacja 
{  String wydawnictwo;

    public Ksiazka(StreamTokenizer st, boolean standard) throws IOException
    {  super(st,standard);
       if(standard) {wyj.print("  Podaj wydawnictwo ");wyj.flush();}
       st.nextToken();    
       wydawnictwo=st.sval;
     }

    public String toString()
    { return super.toString() + String.format(" Ksiazka wydana przez %s ",wydawnictwo);}
}

