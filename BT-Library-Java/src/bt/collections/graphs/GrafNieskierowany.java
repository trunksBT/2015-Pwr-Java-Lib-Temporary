package bt.collections.graphs;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
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
			wierzcholki_ = new ArrayList<>(unikalneWierzcholki);
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
		List<IKrawedz<W,S>> listaKrawedzi = new ArrayList<>();
		
		Set<Entry<W, Set<W>>> pary = new TreeSet<>();
		
		if(w == null)
		{
			pary = listaSasiedztwa_.entrySet();
		}
		else
		{
			Set<W> wartosciDlaKlucza = listaSasiedztwa_.getOrDefault(w, new TreeSet<>());
			Entry<W, Set<W>> para =  new AbstractMap.SimpleEntry<>(w, wartosciDlaKlucza);
			pary.add(para);
		}
		
		for (Entry<W, Set<W>> para : pary)
		{
			for(W docelowyWierzcholek : para.getValue())
			{
				listaKrawedzi.add(new Krawedz(para.getKey(), docelowyWierzcholek, 0));
			}
		}
		
		listaKrawedzi = wyciagnijZduplikowaneKrawedzie(listaKrawedzi);
		return listaKrawedzi;
	}

	List<IKrawedz<W,S>> wyciagnijZduplikowaneKrawedzie(List<IKrawedz<W,S>> listaKrawedzi)
	{
		List<IKrawedz<W,S>> nieskierowanaListaKrawedzi = 
				new ArrayList<>(listaKrawedzi);
		for(IKrawedz<W,S> krawedz: listaKrawedzi)
		{
			if(krawedz.w1() != krawedz.w2())
			{
				IKrawedz<W,S> mozeZduplikowana = new Krawedz(krawedz.w2(), krawedz.w1());
				if(nieskierowanaListaKrawedzi.contains(mozeZduplikowana))
				{			
					nieskierowanaListaKrawedzi.remove(mozeZduplikowana);		
				}
			}
		}
		return listaKrawedzi;
	}
	
	@Override
	public S czyKrawedz(W w1, W w2) {
		return null;
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private boolean krawedzieZawierajaPoprawneWierzcholki(
			List<IKrawedz<W, S>> krawedzie, List<W> wierzcholki)
	{
		if(argumentyWejscioweSaBadzMajaNulle(krawedzie, wierzcholki))
		{
			return false;
		}
				
		boolean czyOk = true;	
		
		for(Iterator it = krawedzie.iterator(); it.hasNext(); ) {
			IKrawedz<W, S> curr = (IKrawedz<W, S>) it.next();
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
		
		for(Iterator it = krawedzie.iterator(); it.hasNext(); ) {
			IKrawedz<W, S> curr = (IKrawedz<W, S>) it.next();
			listaSasiedztwa.get(curr.w1()).add(curr.w2());
			listaSasiedztwa.get(curr.w2()).add(curr.w1());
		}
		
		return listaSasiedztwa;
	}

}
