package bt.test.collections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.elems.Bezrobotny;
import bt.collections.elems.Osoba;
import bt.collections.elems.Pracownik;
import bt.collections.elems.Programista;
import bt.collections.elems.Ssak;
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
    	Ssak[] grupaSpecjalizujaca = grupa;
    	
        assertTrue(true);
    }
    
    @Test
    public void test_getPerson_()
    {
    	Osoba os1 = new Osoba();
    	Bezrobotny os2 = new Bezrobotny();
    	
    	Osoba os3 = os1.getPerson();
    	Osoba os4 = os2.getPerson();
    	
        assertTrue(true);
    }
    
    @Test
    public void test_CTORArray_Cowariant_Exception_1()
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
    
    @Test
    public void test_CTORArray_Cowariant_Exception_2()
    {
    	Osoba[] grupa = { new Osoba(0,1),new Osoba(3,4)};
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
    
    @Test
    public void test_CTORArray_Cowariant_Exception_12()
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
    
    public void test_CTOR_Cowariant_Exception_5()
    {
//    	Pracownik grupa = new Pracownik(0,1,2);
//    	Osoba grupaSpecjalizujaca = grupa;    	
//    //	((Pracownik) grupaSpecjalizujaca).mP();
//    	
//    	//((Bezrobotny) grupaSpecjalizujaca).drukuj();
//    	
////        try
////        {
//    	System.out.println( grupaSpecjalizujaca.getClass() );
//        grupaSpecjalizujaca= new Bezrobotny(6,7);
//        
//        System.out.println( grupaSpecjalizujaca.getClass() );
//        	
//        Pracownik grupa2 = new Pracownik(0,1,2);
//        Osoba grupaSpecjalizujaca2 = grupa2;
//
//        grupaSpecjalizujaca2= new Osoba(6,7);
//        	
//        	System.out.println( "ClassCastException" );
        	
        	/////////////////////////////////////////
        	
        	Pracownik grupa = new Pracownik(0,1,2);
        	Osoba grupaSpecjalizujaca = grupa;    	
        //	((Pracownik) grupaSpecjalizujaca).mP();
        	
        	//((Bezrobotny) grupaSpecjalizujaca).drukuj();
        	
//            try
//            {
        	System.out.println( grupaSpecjalizujaca.getClass());
            grupaSpecjalizujaca= new Bezrobotny(6,7);
            
            System.out.println( grupaSpecjalizujaca.getClass() );
            	
            Pracownik grupa2 = new Pracownik(0,1,2);
            Osoba grupaSpecjalizujaca2 = grupa2;

            grupaSpecjalizujaca2= new Osoba(6,7);
            	
            System.out.println( "ClassCastException" );

    	
        assertTrue(true);
    }
    
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
