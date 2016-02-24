package bt.core.algorithms;

public class Arrays {
	public static int sumValsOnMultiOfK( int [][] matrix, int mult ) {
		if(matrix == null)
			throw new NullPointerException();
		else{
			int sum = 0;
			int size = matrix.length;
			
			for(int i = 0 ; i<size; i++)
				for(int j = ( mult - (i % mult)) % mult; j<size; j+=mult )				
					sum+= matrix[i][j];
			
			return sum;
		}
	}
}