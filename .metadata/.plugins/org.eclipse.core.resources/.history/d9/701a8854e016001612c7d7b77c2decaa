package bt.core.collections.graphs;

public class AdjacentMatrix<W> implements Graph<Integer, W> {
	W matrix[][];
	public AdjacentMatrix(W[][] matrix) {
		if ( matrix != null )
			this.matrix = matrix;
		else
			this.matrix = (W[][]) new String[0][0];	
	}
	@Override
	public int numberOfVerts() {
		return matrix.length;
	}
	@Override
	public int numberOfEdges() {
		throw new UnsupportedOperationException("notImplementedYet");
	}
}
