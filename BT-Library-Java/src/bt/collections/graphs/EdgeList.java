package bt.collections.graphs;

import bt.algorithms.comparators.EdgeComparator;
import bt.algorithms.sorting.QuickSort;
import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;
import bt.collections.graphs.DirtyEdgeDecorator;

public class EdgeList<W> implements Graph<Integer,W>{
	ArrayList edgeList;
	
	public EdgeList(List edgeList) {
		if(edgeList!=null)
			this.edgeList = (ArrayList) new QuickSort(new EdgeComparator()).sort(edgeList);		
		else
			this.edgeList = new ArrayList();
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
	
	@SuppressWarnings("unchecked")
	public void resetVerticesStory() {
		for(int i = 0 ; i<edgeList.size();i++)
			((DirtyEdgeDecorator<Integer, W>)edgeList.get(i)).setDirty(false);
	}
}
