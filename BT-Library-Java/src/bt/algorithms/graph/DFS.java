package bt.algorithms.graph;

import bt.collections.graphs.Graph;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;
import bt.collections.lists.ListDecorator;

public class DFS<W> {
	public List forAdjacentShapes(Graph<Integer,W> graph) {
		graph.resetVerticesStory();
		ArrayList retVal = new ArrayList(graph.getNumberOfVerts());
		innerAdjShapes(0, graph, retVal);
		return retVal;
	}
	
	private void innerAdjShapes(int currVert, Graph<Integer,W> graph, List outTape) {
		ListDecorator adjacents = graph.getAdjacents(currVert);
		graph.setDirty(currVert, true);
		outTape.add(currVert);	
		Iterator it = adjacents.iterator();
		for(it.first(); !it.isDone();it.next())
			if(!graph.isVerticeDirty((int) it.current()))
				innerAdjShapes((int) it.current(), graph, outTape);
	}
}