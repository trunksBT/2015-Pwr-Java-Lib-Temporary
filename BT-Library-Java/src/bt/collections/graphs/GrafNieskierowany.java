package bt.collections.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
		// w przypadku gdy argumenty sa nullami stworzyc puste kolekcje
		if(!krawedzieZawierajaPoprawneWierzcholki(krawedzie, wierzcholki))
		{
			throw new EdgeContainsWrongVerticeException();
		}
		Set<W> unikalneWierzcholki = new TreeSet<>(wierzcholki);
		wierzcholki_ = new ArrayList<>(unikalneWierzcholki);
		listaSasiedztwa_ = wypelnijListeSasiedztwa(krawedzie, wierzcholki);
	}
	
	@Override
	public List<W> wierzcholki() {
		return wierzcholki_;
	}

	@Override
	public List<IKrawedz<W, S>> krawedzie() {
		return null;
	}
	
	private List<IKrawedz<W,S>> konwertujNaListeKrawedzi()
	{
		List<IKrawedz<W,S>> listaKrawedzi = 
				new LinkedList<>();
		for(Iterator it = wierzcholki_.iterator(); it.hasNext(); ) {
			W curr = (W) it.next();
			
		}
		return null;
	}

	@Override
	public List<IKrawedz<W, S>> krawedzie(W w) {
//		List<IKrawedz<W, S>> retVal = new ArrayList<>();
//		
//		for(Iterator it = krawedzie_.iterator(); it.hasNext(); ) {
//			IKrawedz<W, S> curr = (IKrawedz<W, S>) it.next();
//			if(curr== null)
//			{
//				return null;
//			}
//			if(curr.w1() == null || curr.w2() == null || curr.wart() == null)
//			{
//				return null;
//			}
//			if(curr.w1() == w || curr.w2() == w)
//			{
//				retVal.add(curr);
//			}
//		}
		return null;
	}

	@Override
	public S czyKrawedz(W w1, W w2) {
//		boolean czyIstniejaKrawedzie =
//				wierzcholki_.contains(w1) && wierzcholki_.contains(w2) ;
//		
//		if( !czyIstniejaKrawedzie )
//		{
//			return null;
//		}
//		
//		for(Iterator it = krawedzie_.iterator(); it.hasNext(); ) {
//			IKrawedz<W, S> curr = (IKrawedz<W, S>) it.next();
//			if(curr== null)
//			{
//				return null;
//			}
//			if(curr.w1() == w1 && curr.w2() == w2
//					|| curr.w2() == w1 && curr.w1() == w2)
//			{
//				return curr.wart();
//			}
//		}
//		
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
