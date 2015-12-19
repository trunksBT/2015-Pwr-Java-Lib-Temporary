package Bt.Tests.FileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestFileInput_and_Output extends TestCase{

    @Test
    public void testCreateStream() throws FileNotFoundException
    {
    	// arrange
    	BufferedReader wej= new BufferedReader( new FileReader("dane.txt"));
    	StreamTokenizer st = new StreamTokenizer(wej);
    	
//    	ObjectInputStream wejOb= new ObjectInputStream(wej);
//    	ObjectOutputStream wyjOb= new ObjectOutputStream(wyj);

    		
    	
    	// assert	
    	assertEquals(3,3);
    }
}

