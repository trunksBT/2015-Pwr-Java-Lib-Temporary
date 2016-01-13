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
    public void test_CTOR_Array_Cowariant_1()
    {
    	Pracownik[] grupa = { new Pracownik(3,4,5)};
    	Osoba[] grupaSpecjalizujaca = grupa;
    	
        assertTrue(true);
    }
    
    @Test
    public void test_CTOR_Array_Cowariant_2()
    {
    	Programista[] grupa = { new Programista(3,4,5)};
    	Pracownik[] grupaSpecjalizujaca = grupa;
    	
        assertTrue(true);
    }
    
    @Test
    public void test_CTOR_Array_Cowariant_3()
    {
    	Osoba[] grupa = { new Osoba(3,4)};
    	Object[] grupaSpecjalizujaca = grupa;
    	
        assertTrue(true);
    }
    
    @Test
    public void test_CTOR_Array_Cowariant_Exception_1()
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
    } // wnioski : po zwiazaniu zmiennej z wartoscia
      // nie mozna sie cofnac z dziedziczeniem?
    
    @Test
    public void test_CTOR_Array_Cowariant_Exception_2()
    {
    	Pracownik[] grupa = { new Pracownik(0,1,2),new Pracownik(3,4,5)};
    	Osoba[] grupaSpecjalizujaca = grupa;
    	
        try
        {
        	grupaSpecjalizujaca[0] = new Osoba(6,7);
        }catch(ArrayStoreException e)
        {
        	System.out.println( "ArrayStoreException" );
        }
        
        assertTrue(true);
    }
    
    @Test
    public void test_CTOR_Array_Cowariant_NotException_2()
    {
    	Pracownik[] grupa = { new Pracownik(0,1,2),new Pracownik(3,4,5)};
    	Osoba[] grupaSpecjalizujaca = grupa;
    	
        grupaSpecjalizujaca[0] = new Programista(6,7);
        
        assertTrue(true);
    }
    
}
