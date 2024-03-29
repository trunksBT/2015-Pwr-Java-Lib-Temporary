package bt.collections.graphs;

import bt.algorithms.interfaces.IKrawedz;

public class Krawedz<W,S> implements IKrawedz<W, S>, Comparable<Krawedz<W,S>> {
	W wierzcholek1_;
	W wierzcholek2_;
	S polaczenie_;
	
	public Krawedz(W wierzcholek1, W wierzcholek2)
	{
		wierzcholek1_ = wierzcholek1;
		wierzcholek2_ = wierzcholek2;
		polaczenie_ = null;
	}
	
	public Krawedz(W wierzcholek1, W wierzcholek2, S polaczenie)
	{
		wierzcholek1_ = wierzcholek1;
		wierzcholek2_ = wierzcholek2;
		polaczenie_ = polaczenie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		int hashOfW1 = wierzcholek1_ == null ? 0 : wierzcholek1_.hashCode();
		int hashOfW2 = wierzcholek1_ == null ? 0 : wierzcholek2_.hashCode();
		result = prime * hashOfW1 * hashOfW2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Krawedz other = (Krawedz) obj;
		if(wierzcholek1_.equals(other.wierzcholek1_)
				&& wierzcholek2_.equals(other.wierzcholek2_))
			return true;
		else if(wierzcholek1_.equals(other.wierzcholek2_)
				&& wierzcholek2_.equals(other.wierzcholek1_))
			return true;
		else
			return false;
	}

	@Override
	public W w1() {
		return wierzcholek1_;
	}

	@Override
	public W w2() {
		return wierzcholek2_;
	}

	@Override
	public S wart() {
		return polaczenie_;
	}

	@Override
	public int compareTo(Krawedz<W, S> o) {
		if(wierzcholek1_.equals(o.wierzcholek2_)
				&& wierzcholek2_.equals(o.wierzcholek1_))
		{
			return ((Comparable<W>) wierzcholek1_).compareTo((W) o.wierzcholek2_) +
					((Comparable<W>) wierzcholek2_).compareTo((W) o.wierzcholek1_);
		}
		else
		{
			return ((Comparable<W>) wierzcholek1_).compareTo((W) o.wierzcholek1_) +
					((Comparable<W>) wierzcholek2_).compareTo((W) o.wierzcholek2_);
		}
	}
}
