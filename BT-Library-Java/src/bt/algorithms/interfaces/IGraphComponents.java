package bt.algorithms.interfaces;

import java.util.List;
import java.util.Set;

public interface IGraphComponents<W,S> {
	List<Set<W>> spojneSkladowe();
	List<Set<W>> spojneSkladowe(IGrafC07<W, S> graph);
	boolean czySaPolaczone(W w1, W w2);
	boolean czySaPolaczone(IGrafC07<W, S> graph, W w1, W w2);
}
