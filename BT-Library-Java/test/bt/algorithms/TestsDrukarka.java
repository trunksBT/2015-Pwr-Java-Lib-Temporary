package bt.algorithms;

import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.Drukarka;
import bt.collections.elems.Bezrobotny;
import bt.collections.elems.Osoba;
import bt.collections.elems.Pracownik;
import bt.collections.elems.Programista;
import bt.collections.elems.Ssak;
import bt.streams.Strumien;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestsDrukarka extends TestCase implements Strumien{
	
    @Test
    public void test_Drukarka_Null_Osoba()
    {
    	ArrayList<Osoba> grupa = new ArrayList<>(3);
    	
    	grupa.add(new Osoba(0,1));
    	grupa.add(new Osoba(3,4));
    	grupa.add(new Osoba(6,7));
    	
    	wyj.println( "SysOut L11_Ex3_1" );
    	Drukarka.drukuj(null);
    	wyj.println();
    	
        assertTrue(true);
    }
    
    @Test
    public void test_Drukarka_ArrayList_Osoba()
    {
    	ArrayList<Osoba> grupa = new ArrayList<>(3);
    	
    	grupa.add(new Osoba(0,1));
    	grupa.add(new Osoba(3,4));
    	grupa.add(new Osoba(6,7));
    	
    	wyj.println( "SysOut L11_Ex3_1" );
    	Drukarka.drukuj(grupa);
    	wyj.println();
    	
        assertTrue(true);
    }
    
    @Test
    public void test_Drukarka_ArrayList_Pracownik()
    {
    	ArrayList<Pracownik> grupa = new ArrayList<>(3);
    	
    	grupa.add(new Pracownik(0,1,2));
    	grupa.add(new Pracownik(3,4,5));
    	grupa.add(new Pracownik(6,7,8));
    	
    	wyj.println( "SysOut L11_Ex3_2" );
    	Drukarka.drukuj(grupa);
    	wyj.println();
    	
        assertTrue(true);
    }
    
    @Test
    public void test_Drukarka_ArrayList_Bezrobotny()
    {
    	ArrayList<Bezrobotny> grupa = new ArrayList<>(3);
    	
    	grupa.add(new Bezrobotny(0,1));
    	grupa.add(new Bezrobotny(3,4));
    	grupa.add(new Bezrobotny(6,7));
    	
    	wyj.println( "SysOut L11_Ex3_3" );
    	Drukarka.drukuj(grupa);
    	wyj.println();
    	
        assertTrue(true);
    }
    
    @Test
    public void test_Drukarka_ArrayList_Programista()
    {
    	ArrayList<Programista> grupa = new ArrayList<>(3);
    	
    	grupa.add(new Programista(0,1,2,3));
    	grupa.add(new Programista(3,4,5,6));
    	grupa.add(new Programista(6,7,8,7));
    	
    	wyj.println( "SysOut L11_Ex3_4" );
    	Drukarka.drukuj(grupa);
    	wyj.println();
    	
        assertTrue(true);
    }
    
    @Test
    public void test_Drukarka_ArrayList_Ssak()
    {
    	ArrayList<Ssak> grupa = new ArrayList<>(3);
    	
    	grupa.add(new Ssak(0));
    	grupa.add(new Ssak(3));
    	grupa.add(new Ssak(6));
    	
    	wyj.println( "SysOut L11_Ex3_5" );
//    	Drukarka.drukuj(grupa);
    	wyj.println();
    	
        assertTrue(true);
    }
    
    
}
