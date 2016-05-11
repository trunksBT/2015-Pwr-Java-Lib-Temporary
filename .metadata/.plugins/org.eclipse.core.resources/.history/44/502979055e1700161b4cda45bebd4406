package bt.core;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

import bt.core.collections.elems.Osoba;

public class Drukarka {
	public static void drukuj(Collection<? extends Osoba> input)
	{
		Optional<Collection<? extends Osoba >> maybeNull = Optional.ofNullable(input);
		maybeNull.orElse(new LinkedList<>()).forEach(osoba -> osoba.drukuj());
	}
}
