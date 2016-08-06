package bt.algorithms.graph;

import bt.collections.graphs.Graph;
import bt.collections.interfaces.IQueue;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;
import bt.collections.lists.LinkedList;
import bt.collections.queues.Queue;

public class BFS<W> {
	final int startVert = 0;
	public List forAdjacentShapes(Graph<Integer,W> graph) {
		if(graph == null || graph.isEmpty())
			return new LinkedList();
		else {
			List retVal = new ArrayList(graph.getNumberOfVerts());
			graph.resetVerticesStory();
			IQueue queueOfTrace = new Queue();
			queueOfTrace.enqueue(startVert);
			
			while(!queueOfTrace.isEmpty()) {
				Integer curr = (Integer) queueOfTrace.dequeue();
				if(!graph.isDirty(curr)) {
					retVal.add(curr);
					graph.setDirty(curr, true);
					Iterator it = graph.getAdjacents(curr).iterator();
					for(it.first(); !it.isDone(); it.next() )
						queueOfTrace.enqueue(it.current());
				}
			}
			return retVal;
		}
	}
}
