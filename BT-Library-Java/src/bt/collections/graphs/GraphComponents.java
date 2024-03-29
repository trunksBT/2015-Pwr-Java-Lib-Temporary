package bt.collections.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;

import bt.algorithms.interfaces.IGrafC07;
import bt.algorithms.interfaces.IGraphComponents;
import bt.algorithms.interfaces.IKrawedz;

public class GraphComponents<W,S> implements IGraphComponents<W,S>{
	private List<Set<W>> spojneSkladowe_;
	
	public GraphComponents(IGrafC07<W, S> graph)
	{
		spojneSkladowe_ = spojneSkladowe(graph);
	}
	
	@Override
	public List<Set<W>> spojneSkladowe()
	{
		return spojneSkladowe_;
	}
	
	@Override // Algorytm z Wykladow SP. Dr. Janusza Ratajczaka ( Lasy zbiorow rozlacznych )
	public List<Set<W>> spojneSkladowe(IGrafC07<W, S> graph) {
		List<Set<W>> listaZbiorow = wypelnijListeZbiorow(graph.wierzcholki());
		
		for(IKrawedz<W,S> krawedz : graph.krawedzie())
		{
			zlaczZbioryZawierajaceWierzcholkiPolaczoneKrawedzia(listaZbiorow, krawedz);
		}
		
		return listaZbiorow;
	}

	private void zlaczZbioryZawierajaceWierzcholkiPolaczoneKrawedzia(List<Set<W>> listaZbiorow, IKrawedz<W, S> krawedz) {
		Set<W> zbiorPierwszy = listaZbiorow.stream()
		          .filter(it -> it.contains(krawedz.w1()))
		          .findFirst().get();
		
		Set<W> zbiorDrugi = listaZbiorow.stream()
		          .filter(it -> it.contains(krawedz.w2()))
		          .findFirst().get();
		
		listaZbiorow.remove(zbiorPierwszy);
		listaZbiorow.remove(zbiorDrugi);
		
		zbiorPierwszy.addAll(zbiorDrugi);
		
		listaZbiorow.add(zbiorPierwszy);
	}
	
	@Override
	public boolean czySaPolaczone(W w1, W w2) {	
		return spojneSkladowe_.stream()
	              .filter(it -> it.contains(w1))
	              .filter(it -> it.contains(w2))
	              .count() != 0;
	}
	
	@Override
	public boolean czySaPolaczone(IGrafC07<W, S> graph, W w1, W w2) {	
		return spojneSkladowe(graph).stream()
	              .filter(it -> it.contains(w1))
	              .filter(it -> it.contains(w2))
	              .count() != 0;
	}
	
	private List<Set<W>>  wypelnijListeZbiorow(List<W> wierzcholki)
	{
		List<Set<W>> kolejkaZbiorow = new LinkedList<>();
		for(W wierzcholek : wierzcholki)
		{
			Set<W> zbiorJednoelementowy = new HashSet<W>();
			zbiorJednoelementowy.add(wierzcholek);
			kolejkaZbiorow.add(zbiorJednoelementowy);
		}
		return kolejkaZbiorow;
	}

}
