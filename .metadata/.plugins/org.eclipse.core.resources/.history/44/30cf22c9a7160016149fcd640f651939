package bt.core.collections.graphs;

import bt.core.collections.interfaces.List;
import bt.core.collections.lists.LinkedList;

public class GraphEdgeList<V,W> implements Graph<V,W>{
	List edgeList;
	
	public GraphEdgeList(LinkedList edgeList) {
		if(edgeList!=null)
			this.edgeList = edgeList;
		else
			this.edgeList = new LinkedList();
	}

	public int size() {
		return edgeList.size();
	}

	@Override
	public int numberOfVerts() {
		throw new UnsupportedOperationException("notImplementedYet");
	}

	@Override
	public int numberOfEdges() {
		return edgeList.size();
	}
}
