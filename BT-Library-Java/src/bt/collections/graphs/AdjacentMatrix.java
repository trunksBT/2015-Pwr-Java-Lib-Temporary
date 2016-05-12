package bt.collections.graphs;

import java.util.Arrays;

import bt.collections.lists.DirtyListDecorator;
import bt.collections.lists.LinkedList;
import bt.collections.lists.ListDecorator;

public class AdjacentMatrix<W> implements Graph<Integer, W> {
	W matrix[][];
	boolean []dirtyTable;
	
	public AdjacentMatrix(W[][] matrix) {
		if ( matrix != null )
			this.matrix = matrix;
		else
			this.matrix = (W[][]) new String[0][0];	
		dirtyTable = new boolean[this.matrix.length];
	}
	@Override
	public int getNumberOfVerts() {
		return matrix.length;
	}
	public ListDecorator getAdjacents(int searchedVert) {
		ListDecorator retVal = new DirtyListDecorator(new LinkedList());
		
		if(searchedVert>=0 && searchedVert <matrix.length)
			for(int i = 0 ; i<matrix.length ; i++)
				if(matrix[searchedVert][i]!= null)
					retVal.add(i);
		return retVal;		
	}
	@Override
	public boolean isVerticeDirty(int searchedVert) {
		return dirtyTable[searchedVert];
	}
	public void resetVerticesStory() {
		Arrays.fill(dirtyTable, false);
	}
	@Override
	public void setDirty(int vert, boolean val) {
		if(vert>-1 && vert <matrix.length)
			dirtyTable[vert] = val;
	}
	@Override
	public boolean isDirty(int vert) {
		return dirtyTable[vert];
	}
	@Override
	public boolean isEmpty() {
		return matrix.length==0;
	}
}
