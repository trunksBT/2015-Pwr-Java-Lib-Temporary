package bt.collections.interfaces;

import bt.collections.trees.BEntry;

public interface IBNode {
	public void traverse(List outTape);
	public Object set(Object key, Object val);
	public BEntry search(Object key);
	public boolean isFull();
}
