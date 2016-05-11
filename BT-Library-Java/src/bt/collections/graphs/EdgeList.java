package bt.collections.graphs;

import bt.algorithms.sorting.QuickSort;
import bt.collections.interfaces.List;
import bt.collections.lists.LinkedList;

public class EdgeList<W> implements Graph<Integer,W>{
	List edgeList;
	
	public EdgeList(LinkedList edgeList) {
		if(edgeList!=null) {
			this.edgeList = new QuickSort(null).sort(edgeList);		
			// sortuj Liste
		}		
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
}