package bt.core.collections.dataTypes.graphs;

import bt.core.collections.dataTypes.LinkedList;
import bt.core.collections.interfaces.List;

public class GraphAdjacentList<V,W> implements Graph<V,W> {
	List[] adjacents;
	public GraphAdjacentList(LinkedList[] adjacents) {
		if ( adjacents != null )
			this.adjacents = adjacents;
		else
			this.adjacents = new LinkedList[0];
	}

	@Override
	public int numberOfVerts() {
		return adjacents.length;
	}

	@Override
	public int numberOfEdges() {
		throw new UnsupportedOperationException("notImplementedYet");
	}
}
