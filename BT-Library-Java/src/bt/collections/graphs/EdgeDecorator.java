package bt.collections.graphs;

public abstract class EdgeDecorator<V,W> extends Edge<V,W> {
	protected Edge<V,W> decorated;
	
	public EdgeDecorator(Edge<V,W> edge) {
		if( edge != null)
			decorated = edge;
		else
			decorated = new Edge<V,W>();
	}
}
