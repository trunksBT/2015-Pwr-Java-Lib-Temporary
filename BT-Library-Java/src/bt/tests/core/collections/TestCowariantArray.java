package bt.tests.core.collections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.elems.Bezrobotny;
import bt.core.collections.elems.Osoba;
import bt.core.collections.elems.Pracownik;
import bt.core.collections.elems.Programista;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestCowariantArray extends TestCase{
	
    @Test
    public void test_CTOR_Array_Cowariant()
    {
    	Pracownik[] grupa = { new Pracownik(3,4,5)};
    	Osoba[] grupaSpecjalizujaca = grupa;
    	int a = 3;
    	
        assertTrue(true);
    }
    
    @Test
    public void test_CTOR_Array_Cowariant_Exception()
    {
    	Pracownik[] grupa = { new Pracownik(0,1,2),new Pracownik(3,4,5)};
    	Osoba[] grupaSpecjalizujaca = grupa;
        try
        {
        	grupaSpecjalizujaca[0] = new Bezrobotny(6,7);
        }catch(ArrayStoreException e)
        {
        	System.out.println( "ArrayStoreException" );
        }
    	
        assertTrue(true);
    }
}
