package bt.algorithms.graph;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import bt.algorithms.interfaces.IGraf;

public class GraphIndirected2<W,S> implements IGraf<W,S>
{
	private List<W> wierzcholki_;
	private S[][] krawedzie_;
	private Hashtable<W, Integer> indexyWierzcholkow;
	
	public GraphIndirected2(List<W> wierzcholki, S[][] krawedzie)
	{
		wierzcholki_ = wierzcholki == null ? new ArrayList<W>():wierzcholki;
		krawedzie_ = krawedzie;
		
		indexyWierzcholkow = ustawIndexyWierzcholkow();
	}
	
	Hashtable<W, Integer> ustawIndexyWierzcholkow()
	{
		Hashtable<W, Integer> mapaIndexow = new Hashtable<W, Integer>();
		int idx = 0;
		Iterator it = wierzcholki_.iterator();
		
		while(it.hasNext())
		{
			W curr = (W) it.next();
			if(curr == null)
			{
				throw new NullPointerException();
			}
			else
			{
				mapaIndexow.put(curr, idx++);
			}
		}
		
		return mapaIndexow;
	}
	
	@Override
	public List<W> Wierzcholki() {
		return wierzcholki_;
	}

	@Override
	public S Krawedz(W w1, W w2) {
		if(krawedzie_ != null && w1 != null && w2 != null && wierzcholki_.contains(w1) && wierzcholki_.contains(w2))
		{
			return krawedzie_[indexyWierzcholkow.get(w1)][indexyWierzcholkow.get(w2)];
		}
		return null;
	}

	@Override
	public List<W> Krawedzie(W w) {
		List<W> krawedzie = new LinkedList<>();
		if(w != null && krawedzie_ != null && indexyWierzcholkow != null && wierzcholki_.contains(w))
		{
			S[] polaczoneWierzcholki = krawedzie_[indexyWierzcholkow.get(w)];
			for(int i = 0; i < wierzcholki_.size(); i++)
			{
				if(polaczoneWierzcholki[i] != null)
				{
					krawedzie.add(wierzcholki_.get(i));
				}
			}
		}
		return krawedzie;
	}
}