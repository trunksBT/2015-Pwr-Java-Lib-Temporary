package bt.algorithms;

public class Arrays {
	public static int sumValsOnMultiOfK( int [][] matrix, int mult ) {
		if( matrix != null) {
			int size = matrix.length;
			int acc = 0;
			
			for(int i = 0 ; i<size; i++)
				for(int j = ( mult - (i % mult)) % mult; j<size; j+=mult )				
					acc += matrix[i][j];
			
			return acc;
		}else
			throw new NullPointerException();
	}
}
