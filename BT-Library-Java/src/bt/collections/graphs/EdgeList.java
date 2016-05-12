package bt.collections.graphs;

import bt.collections.interfaces.List;
import bt.collections.lists.LinkedList;
import bt.collections.lists.ListDecorator;

public class EdgeList<V,W> implements Graph<V,W>{
	List edgeList;
	
	public EdgeList(LinkedList edgeList) {
		if(edgeList!=null)
			this.edgeList = edgeList;
		else
			this.edgeList = new LinkedList();
	}

	public int size() {
		return edgeList.size();
	}

	@Override
	public int getNumberOfVerts() {
		throw new UnsupportedOperationException("notImplementedYet");
	}

	@Override
	public int numberOfEdges() {
		return edgeList.size();
	}

	@Override
	public ListDecorator getAdjacents(int searchedVert) {
		throw new UnsupportedOperationException("notImplementedYet");
	}

	@Override
	public boolean isVerticeDirty(int searchedVert) {
		throw new UnsupportedOperationException("notImplementedYet");
	}

	@Override
	public void resetVerticesStory() {
		throw new UnsupportedOperationException("notImplementedYet");	
	}

	@Override
	public void setDirty(int vert, boolean val) {
		throw new UnsupportedOperationException("notImplementedYet");
	}

	@Override
	public boolean isDirty(int vert) {
		// TODO Auto-generated method stub
		return false;
	}
}
