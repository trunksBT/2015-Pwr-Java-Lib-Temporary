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
	public W w2() {
		return wierzcholek2_;
	}

	@Override
	public S wart() {
		return polaczenie_;
	}

}
