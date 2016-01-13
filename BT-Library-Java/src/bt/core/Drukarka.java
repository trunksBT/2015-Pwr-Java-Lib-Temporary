package bt.core;

import java.util.Collection;

import bt.core.collections.elems.Osoba;

public class Drukarka {
	public static void drukuj(Collection<? extends Osoba> input)
	{
		input.forEach(osoba -> osoba.drukuj());
	}
}
