package bt.algorithms.graph;

import bt.collections.graphs.AdjacentList;
import bt.collections.graphs.DirtyEdgeDecorator;
import bt.collections.graphs.EdgeList;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;
import bt.collections.lists.DirtyListDecorator;
import bt.collections.lists.LinkedList;
import bt.collections.lists.ListDecorator;

public class DFS<W> {
	private final int startVert = 0;
	
	public List forAdjacentList(AdjacentList<W> graph) {
		graph.resetVerticesStory();
		ArrayList retVal = new ArrayList(graph.getNumberOfVerts());
		innerAdjList(startVert, graph, retVal);
		return retVal;
	}
	
	private void innerAdjList(int currVert, AdjacentList<W> graph, List outTape) {
		DirtyListDecorator adjacents = graph.getAdjacentVerts(currVert);
		adjacents.setDirty(true);
		outTape.add(currVert);	
		Iterator it = adjacents.iterator();
		for(it.first(); !it.isDone();it.next())
			if(!graph.isVerticeDirty((int) it.current()))
				innerAdjList((int) it.current(), graph, outTape);
	}

	public ArrayList forEdgeList(EdgeList<String> graph) {
		graph.resetVerticesStory();
		
		List outTape = new LinkedList();
		int currVert = startVert;
		List adjacentEdges = graph.getAdjacentEdges(currVert);
		Iterator it = adjacentEdges.iterator();
		for(it.first(); !it.isDone(); it.next() )
			if( !((DirtyEdgeDecorator<Integer, W>)it.current()).isDirty() ) {
				outTape.add(((DirtyEdgeDecorator<Integer, W>)it.current()).getStart());
			}
		
		return null;
	}
	
	// TO_ASK_WHICH_IS_BETTER
//		public List forAdjacentList(AdjacentList<W> graph) {
//			graph.resetVerticesStory();
//			return innerAdjList(0, graph, new ArrayList(graph.numberOfVerts()));
//		}
	//	
//		private List innerAdjList(int currVert, AdjacentList<W> graph, List outTape) {
//			ListDecorator adjacents = graph.getAdjacents(currVert);
//			adjacents.setDirty(true);
//			outTape.add(currVert);	
//			Iterator it = adjacents.iterator();
//			for(it.first(); !it.isDone();it.next())
//				if(!graph.isVerticeDirty((int) it.current()))
//					innerAdjList((int) it.current(), graph, outTape);
//			return outTape;
//		}
}
