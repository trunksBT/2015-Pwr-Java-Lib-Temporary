package bt.collections.graphs;

import bt.algorithms.comparators.EdgeComparator;
import bt.algorithms.sorting.QuickSort;
import bt.collections.interfaces.Edgable;
import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;
import bt.collections.lists.LinkedList;
import bt.collections.graphs.DirtyEdgeDecorator;

public class EdgeList<W> implements Graph<Integer,W>{
	ArrayList edgeList;
	int size;
	
	@SuppressWarnings("rawtypes")
	public EdgeList(List edgeList) {
		if(edgeList!=null)
			this.edgeList = (ArrayList) new QuickSort(new EdgeComparator()).sort(edgeList);	
		else
			this.edgeList = new ArrayList();
		size = edgeList.size();
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

	@SuppressWarnings("unchecked")
	public LinkedList getAdjacentEdges(int currVert) {
		LinkedList retVal = new LinkedList();
		int i = 0;
		boolean found = false;
		// found first good idx ( some shape of indexOf )
		for( ; i < size && !found; i++) {
			if(((Edgable<Integer,W>)edgeList.get(i)).getStart() == currVert) {
				retVal.add(edgeList.get(i));	
				found = true;
			}
		}
		// add while is good ( sorted collection )
		while(((Edgable<Integer,W>)edgeList.get(i)).getStart() == currVert)
			retVal.add(edgeList.get(i++));
		
		// big amount of code but no linear complexity
		return retVal;
	}
}