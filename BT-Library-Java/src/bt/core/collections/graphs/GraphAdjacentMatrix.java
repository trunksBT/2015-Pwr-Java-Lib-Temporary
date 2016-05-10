package bt.core.collections.graphs;

public class GraphAdjacentMatrix<W> implements Graph<Integer, W> {
	W matrix[][];
	public GraphAdjacentMatrix(W[][] matrix) {
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
