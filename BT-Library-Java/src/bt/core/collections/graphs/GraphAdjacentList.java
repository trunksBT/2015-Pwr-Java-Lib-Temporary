package bt.core.collections.graphs;

import bt.core.collections.interfaces.List;
import bt.core.collections.iterators.Iterator;
import bt.core.collections.lists.ArrayList;
import bt.core.collections.lists.LinkedList;

public class GraphAdjacentList<W> implements Graph<Integer,W> {
	List[] adjacents;
	ArrayList dirty;
	
	public GraphAdjacentList(LinkedList[] adjacents) {
		initAdjacentsList(adjacents);	
		initDirtyTable();
	}
	
	@Override
	public int numberOfVerts() {
		return adjacents.length;
	}

	@Override
	public int numberOfEdges() {
		throw new UnsupportedOperationException("notImplementedYet");
	}
	
	private void initAdjacentsList(LinkedList[] adjacents) {
		if ( adjacents != null )
			this.adjacents = adjacents;
		else
			this.adjacents = new LinkedList[0];
	}

	private void initDirtyTable() {
		dirty = new ArrayList(this.adjacents.length);
		for(int i = 0 ;i<dirty.size();i++)
			dirty.set(i, false);
	}
}
