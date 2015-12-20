package Bt.Core.FileOperations;

import java.io.IOException;
import java.io.StreamTokenizer;

public class Artykol extends Publikacja
{  String czasopismo;

    public Artykol(StreamTokenizer st, boolean standard) throws IOException
    {super(st,standard);
     if( standard) {wyj.print(" w czasopismie ");wyj.flush();}
     st.nextToken();
     czasopismo=st.sval;
     }

     public String toString()
    { return super.toString() + String.format(" Artykol w : %s",czasopismo);}
}
