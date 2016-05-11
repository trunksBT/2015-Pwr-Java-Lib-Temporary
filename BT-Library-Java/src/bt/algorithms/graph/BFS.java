package bt.algorithms.graph;

import bt.collections.graphs.AdjacentList;
import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;
import bt.collections.queues.Queue;

public class BFS<W> {
	private final int startVert = 0;
	public List forAdjacentList(AdjacentList<W> graph) {
		graph.resetVerticesStory();
		ArrayList retVal = new ArrayList(graph.getNumberOfVerts());
		graph.getAdjacentVerts(startVert).setDirty(true);
		Queue pathStory = new Queue();
		pathStory.enqueue(startVert);
		while(!pathStory.isEmpty()) {
			Integer dequeued = (Integer) pathStory.dequeue();
			retVal.add(dequeued);
			Iterator it = graph.getAdjacentVerts(dequeued).iterator();
			for(it.first(); !it.isDone(); it.next())
				if(!graph.isVerticeDirty((int) it.current())) {
					graph.getAdjacentVerts((int) it.current()).setDirty(true);
					pathStory.enqueue(it.current());
				}
		}
		return retVal;
	}
}
