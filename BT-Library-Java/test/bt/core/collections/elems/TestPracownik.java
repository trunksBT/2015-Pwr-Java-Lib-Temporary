package bt.core.collections.elems;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.elems.Pracownik;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestPracownik extends TestCase {

	Pracownik jan = new Pracownik(4,5,6);
	
	public void init()
	{
		jan = new Pracownik(4,5,6);
	}
	
	@Test
	public void test_Konstruktor()
	{
		Pracownik jan = new Pracownik(4,5,6);
	    assertTrue(jan != null);
	}
	
	@Test
	public void test_Konstruktor_Domyslny()
	{
		Pracownik jan = new Pracownik(null);
	    assertTrue(jan != null);
	}
	
	@Test
	public void test_Drukuj()
	{
		init();
		jan.drukuj();
	    assertTrue(true);
	}
}
