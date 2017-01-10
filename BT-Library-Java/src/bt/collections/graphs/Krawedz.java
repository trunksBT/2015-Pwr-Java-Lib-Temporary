package bt.collections.graphs;

import bt.algorithms.interfaces.IKrawedz;

public class Krawedz<W,S> implements IKrawedz<W, S> {
	W wierzcholek1_;
	W wierzcholek2_;
	S polaczenie_;
	
	public Krawedz(W wierzcholek1, W wierzcholek2, S polaczenie)
	{
		wierzcholek1_ = wierzcholek1;
		wierzcholek2_ = wierzcholek2;
		polaczenie_ = polaczenie;
	}
	
	@Override
	public W w1() {
		return wierzcholek1_;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((polaczenie_ == null) ? 0 : polaczenie_.hashCode());
		result = prime * result + ((wierzcholek1_ == null) ? 0 : wierzcholek1_.hashCode());
		result = prime * result + ((wierzcholek2_ == null) ? 0 : wierzcholek2_.hashCode());
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
		if (polaczenie_ == null) {
			if (other.polaczenie_ != null)
				return false;
		} else if (!polaczenie_.equals(other.polaczenie_))
			return false;
		if (wierzcholek1_ == null) {
			if (other.wierzcholek1_ != null)
				return false;
		} else if (!wierzcholek1_.equals(other.wierzcholek1_))
			return false;
		if (wierzcholek2_ == null) {
			if (other.wierzcholek2_ != null)
				return false;
		} else if (!wierzcholek2_.equals(other.wierzcholek2_))
			return false;
		return true;
	}

	@Override
	public W w2() {
		return wierzcholek2_;
	}

	@Override
	public S wart() {
		return polaczenie_;
	}

}