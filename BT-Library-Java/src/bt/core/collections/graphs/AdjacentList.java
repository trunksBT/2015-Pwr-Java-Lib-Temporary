package bt.core.collections.graphs;

import bt.core.collections.interfaces.List;
import bt.core.collections.lists.DirtyListDecorator;
import bt.core.collections.lists.LinkedList;

public class AdjacentList<W> implements Graph<Integer,W> {
	DirtyListDecorator[] adjacents;
	
	public AdjacentList(LinkedList[] adjacents) {
		initAdjacentsList(adjacents);	
	}
	
	@Override
	public int numberOfVerts() {
		return adjacents.length;
	}

	@Override
	public int numberOfEdges() {
		throw new UnsupportedOperationException("notImplementedYet");
	}

	public boolean isVerticeDirty(int searchedVert) {
		return adjacents[searchedVert].isDirty();
	}
	
	private void initAdjacentsList(LinkedList[] adjacents) {
		if ( adjacents != null ) {
			int argSize = adjacents.length;
			this.adjacents = new DirtyListDecorator[argSize];
			for(int i = 0; i<argSize; i++)
				this.adjacents[i] = new DirtyListDecorator(adjacents[i]);
		}
		else {
			this.adjacents = new DirtyListDecorator[0];
		}
	}

	public List getAdjacents(int searchedVert) {
		return adjacents[searchedVert];
	}
}
