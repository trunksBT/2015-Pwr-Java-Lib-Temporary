package bt.collections.graphs;

import bt.collections.lists.ListDecorator;

public interface Graph<V,W> {
	public int getNumberOfVerts();
	public ListDecorator getAdjacents(int searchedVert);
	public boolean isVerticeDirty(int searchedVert);
	public void resetVerticesStory();
	public void setDirty(int vert, boolean val);
	public boolean isDirty(int vert);
	public boolean isEmpty();
}
