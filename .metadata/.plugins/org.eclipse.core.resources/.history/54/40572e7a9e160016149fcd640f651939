package bt.core.collections.graphs;

import bt.core.collections.interfaces.List;
import bt.core.collections.lists.LinkedList;

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
