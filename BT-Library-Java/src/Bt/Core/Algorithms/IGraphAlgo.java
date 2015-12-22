package Bt.Core.Algorithms;

import java.util.List;

public interface IGraphAlgo<W,S> {
	boolean ifConnected(W aW1,W aW2);
	public List<S> dijkstra(W aStart,W aEnd);
}
