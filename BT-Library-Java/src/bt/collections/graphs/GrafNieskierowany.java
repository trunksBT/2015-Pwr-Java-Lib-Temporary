package bt.collections.graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bt.algorithms.interfaces.IGrafC07;
import bt.algorithms.interfaces.IKrawedz;

public class GrafNieskierowany<W,S> implements IGrafC07<W, S> {
	private List<IKrawedz<W, S>> krawedzie_;
	private List<W> wierzcholki_;
	
	public GrafNieskierowany(
			List<IKrawedz<W, S>> krawedzie,
			List<W> wierzcholki)
	{
		krawedzie_ = krawedzie == null ? 
				new ArrayList<IKrawedz<W, S>>() : krawedzie;
		wierzcholki_ = wierzcholki == null ? 
				new ArrayList<W>() : wierzcholki;
	}
	
	@Override
	public List<W> wierzcholki() {
		return wierzcholki_;
	}

	@Override
	public List<IKrawedz<W, S>> krawedzie() {
		return krawedzie_;
	}

	@Override
	public List<IKrawedz<W, S>> krawedzie(W w) {
		List<IKrawedz<W, S>> retVal = new ArrayList<>();
		
		for(Iterator it = krawedzie_.iterator(); it.hasNext(); ) {
			IKrawedz<W, S> curr = (IKrawedz<W, S>) it.next();
			if(curr== null)
			{
				return null;
			}
			if(curr.w1() == null || curr.w2() == null || curr.wart() == null)
			{
				return null;
			}
			if(curr.w1() == w || curr.w2() == w)
			{
				retVal.add(curr);
			}
		}
		return retVal;
	}

	@Override
	public S czyKrawedz(W w1, W w2) {
		boolean czyIstniejaKrawedzie =
				wierzcholki_.contains(w1) && wierzcholki_.contains(w2) ;
		
		if( !czyIstniejaKrawedzie )
		{
			return null;
		}
		
		for(Iterator it = krawedzie_.iterator(); it.hasNext(); ) {
			IKrawedz<W, S> curr = (IKrawedz<W, S>) it.next();
			if(curr== null)
			{
				return null;
			}
			if(curr.w1() == w1 && curr.w2() == w2
					|| curr.w2() == w1 && curr.w1() == w2)
			{
				return curr.wart();
			}
		}
		
		return null;
	}

}
