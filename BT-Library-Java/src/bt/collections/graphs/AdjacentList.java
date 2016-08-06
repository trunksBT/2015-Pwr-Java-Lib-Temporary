package bt.collections.graphs;

import bt.collections.lists.DirtyListDecorator;
import bt.collections.lists.LinkedList;
import bt.collections.lists.ListDecorator;

public class AdjacentList<W> implements Graph<Integer,W> {
	DirtyListDecorator[] adjacents;
	
	public AdjacentList(LinkedList[] adjacents) {
		initAdjacentsList(adjacents);	
	}
	
	@Override
	public int getNumberOfVerts() {
		return adjacents.length;
	}

	public boolean isVerticeDirty(int searchedVert) {
		return adjacents[searchedVert].isDirty();
	}

	public ListDecorator getAdjacents(int searchedVert) {
		if (searchedVert >= 0 && searchedVert < adjacents.length)
			return adjacents[searchedVert];
		else
			return new DirtyListDecorator(null);
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

	public void resetVerticesStory() {
		for(DirtyListDecorator it: adjacents)
			it.setDirty(false);
	}

	@Override
	public void setDirty(int vert, boolean val) {
		getAdjacents(vert).setDirty(val);	
	}

	@Override
	public boolean isDirty(int vert) {
		return getAdjacents(vert).isDirty();
	}	
	// little idealized graph when keys are Integers and it's no holes sequence

	@Override
	public boolean isEmpty() {
		return adjacents.length==0;
	}
}
