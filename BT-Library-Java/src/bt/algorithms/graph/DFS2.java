package bt.algorithms.graph;

import bt.collections.graphs.Graph;
import bt.collections.interfaces.IQueue;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;
import bt.collections.lists.LinkedList;
import bt.collections.lists.ListDecorator;
import bt.collections.queues.Stack;

public class DFS2<W> {
	private int startVert = 0;
	public List forAdjacentShapes(Graph<Integer,W> graph) {
		if(graph == null || graph.isEmpty())
			return new LinkedList();
		else {
			List retVal = new ArrayList(graph.getNumberOfVerts());
			graph.resetVerticesStory();
			IQueue queueOfTrace = new Stack();
			queueOfTrace.enqueue(startVert);
			
			while(!queueOfTrace.isEmpty()) {
				Integer curr = (Integer) queueOfTrace.dequeue();
				if(!graph.isDirty(curr)) {
					retVal.add(curr);
					graph.setDirty(curr, true);
					Iterator it = graph.getAdjacents(curr).iterator();
					for(it.first(); !it.isDone(); it.next() ) {
						if(!graph.isDirty((int) it.current())) {
							queueOfTrace.enqueue(it.current());
						}
					}
				}
			}
			return retVal;
		}
//	public List forAdjacentShapes(Graph<Integer,W> graph) {
//		graph.resetVerticesStory();
//		List retVal = new ArrayList(graph.getNumberOfVerts());
//		innerForAdjacentShapes(graph, retVal, startVert);
//		return retVal;
//	}
//	
//	void innerForAdjacentShapes(Graph<Integer,W> graph, List listOfVerts, Integer currVert) {
//		graph.getAdjacents(currVert);
//	}
}

}
