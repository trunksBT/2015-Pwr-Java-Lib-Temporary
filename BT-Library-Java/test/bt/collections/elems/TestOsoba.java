package bt.collections.elems;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.elems.Osoba;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestOsoba extends TestCase {

	Osoba jan = new Osoba(4,5);
	
	public void init()
	{
		jan = new Osoba(4,5);
	}
	
	@Test
	public void test_Konstruktor()
	{
		Osoba jan = new Osoba(4,5);
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
