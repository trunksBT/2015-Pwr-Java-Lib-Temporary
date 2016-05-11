package bt.collections.graphs;

import bt.collections.interfaces.Edgable;

public abstract class EdgeDecorator<V,W> implements Edgable<V,W> {
	protected Edge<V,W> decorated;
	
	public EdgeDecorator(Edge<V,W> edge) {
		if( edge != null)
			decorated = edge;
		else
			decorated = new Edge<V,W>();
	}
}
