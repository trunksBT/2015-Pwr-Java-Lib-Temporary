package bt.tests.core;

import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.Drukarka;
import bt.core.collections.elems.Bezrobotny;
import bt.core.collections.elems.Pracownik;
import bt.core.collections.elems.Programista;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestsDrukarka extends TestCase{
	
    @Test
    public void test_Drukarka_ArrayList_Pracownik()
    {
    	ArrayList<Pracownik> grupa = new ArrayList<>(3);
    	
    	grupa.add(new Pracownik(0,1,2));
    	grupa.add(new Pracownik(3,4,5));
    	grupa.add(new Pracownik(6,7,8));
    	
    	Drukarka.drukuj(grupa);
    	
        assertTrue(true);
    }
    
    @Test
    public void test_Drukarka_ArrayList_Bezrobotny()
    {
    	ArrayList<Bezrobotny> grupa = new ArrayList<>(3);
    	
    	grupa.add(new Bezrobotny(0,1));
    	grupa.add(new Bezrobotny(3,4));
    	grupa.add(new Bezrobotny(6,7));
    	
    	Drukarka.drukuj(grupa);
    	
        assertTrue(true);
    }
    
    @Test
    public void test_Drukarka_ArrayList_Programista()
    {
    	ArrayList<Programista> grupa = new ArrayList<>(3);
    	
    	grupa.add(new Programista(0,1,2,3));
    	grupa.add(new Programista(3,4,5,6));
    	grupa.add(new Programista(6,7,8,7));
    	
    	Drukarka.drukuj(grupa);
    	
        assertTrue(true);
    }
}
