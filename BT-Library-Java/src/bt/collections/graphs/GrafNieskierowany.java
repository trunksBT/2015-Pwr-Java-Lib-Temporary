package bt.collections.graphs;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import bt.algorithms.interfaces.IGrafC07;
import bt.algorithms.interfaces.IKrawedz;
import bt.exceptions.EdgeContainsWrongVerticeException;

// MAX COMPLEXITY OF ANY METHOD IS O(n^2)
public class GrafNieskierowany<W,S> implements IGrafC07<W, S> {
	private Map<W, Set<W>> listaSasiedztwa_;
	private List<W> wierzcholki_;
	
	public GrafNieskierowany(
			List<IKrawedz<W, S>> krawedzie,
			List<W> wierzcholki)
	{
		if(krawedzie == null || wierzcholki == null)
		{
			listaSasiedztwa_ = new TreeMap<>();
			wierzcholki_ = new LinkedList<>();
		}
		else
		{
			// w przypadku gdy argumenty sa nullami stworzyc puste kolekcje
			if(!krawedzieZawierajaPoprawneWierzcholki(krawedzie, wierzcholki))
			{
				throw new EdgeContainsWrongVerticeException();
			}
			Set<W> unikalneWierzcholki = new TreeSet<>(wierzcholki);
			wierzcholki_ = new LinkedList<>(unikalneWierzcholki);
			listaSasiedztwa_ = wypelnijListeSasiedztwa(krawedzie, wierzcholki);
		} 
	}
	
	@Override
	public List<W> wierzcholki() {
		return wierzcholki_;
	}

	@Override
	public List<IKrawedz<W, S>> krawedzie() {
		return krawedzie(null);
	}
	
	@Override
	public List<IKrawedz<W, S>> krawedzie(W w) {
		Set<IKrawedz<W,S>> zbiorKrawedzi = new TreeSet<>();
		Set<Entry<W, Set<W>>> pary = new HashSet<>();
		
		if(w == null)
		{
			pary = listaSasiedztwa_.entrySet();
		}
		else
		{
			Set<W> wartosciDlaKlucza = listaSasiedztwa_.getOrDefault(w, new TreeSet<>());
			pary.add(new AbstractMap.SimpleEntry<>(w, wartosciDlaKlucza));
		}
		
		for (Entry<W, Set<W>> para : pary)
		{
			for(W docelowyWierzcholek : para.getValue())
			{
				zbiorKrawedzi.add(new Krawedz(para.getKey(), docelowyWierzcholek, 0));
			}
		}
		
		return new ArrayList<>(zbiorKrawedzi);
	}
	
	@Override
	public S dajWage(W w1, W w2) {
		throw new UnsupportedOperationException();
	}
	
	private boolean krawedzieZawierajaPoprawneWierzcholki(
			List<IKrawedz<W, S>> krawedzie, List<W> wierzcholki)
	{
		if(argumentyWejscioweSaBadzMajaNulle(krawedzie, wierzcholki))
		{
			return false;
		}
				
		boolean czyOk = true;	
		
		for(IKrawedz<W, S> curr : krawedzie)
		{
			if(curr.w1() == null || curr.w2() == null || curr.wart() == null)
			{
				return false;
			}
			czyOk &= wierzcholki.contains(curr.w1());
			czyOk &= wierzcholki.contains(curr.w2());
		}
		return czyOk;
	}

	private boolean argumentyWejscioweSaBadzMajaNulle(List<IKrawedz<W, S>> krawedzie, List<W> wierzcholki) {
		return wierzcholki == null || krawedzie == null ||
				wierzcholki.contains(null) || krawedzie.contains(null);
	}
	
	private Map<W, Set<W>> wypelnijListeSasiedztwa(
			List<IKrawedz<W, S>> krawedzie,
			List<W> wierzcholki) {
		
		Map<W, Set<W>> listaSasiedztwa =
				wypelnijListeSasiedztwaKluczami(wierzcholki);
		listaSasiedztwa = dodajWartosciDoKluczy(
				krawedzie, listaSasiedztwa);
		
		return listaSasiedztwa;
	}
	
	private Map<W, Set<W>> wypelnijListeSasiedztwaKluczami(
			List<W> wierzcholki) {
		Map<W, Set<W>> listaSasiedztwa = new TreeMap<>();
		
		for(Iterator it = wierzcholki.iterator(); it.hasNext();) {
			W curr = (W) it.next();
			listaSasiedztwa.put(curr, new TreeSet<W>());
		}
		
		return listaSasiedztwa;
	}
	
	private Map<W, Set<W>> dodajWartosciDoKluczy(
			List<IKrawedz<W, S>> krawedzie,
			Map<W, Set<W>> listaSasiedztwa) {
		
		for(IKrawedz<W, S> curr : krawedzie)
		{
			listaSasiedztwa.get(curr.w1()).add(curr.w2());
			listaSasiedztwa.get(curr.w2()).add(curr.w1());
		}
		
		return listaSasiedztwa;
	}

}
