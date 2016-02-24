package bt.core.algorithms;

public class Arrays {
	public static int sumValsOnMultiOfK( int [][] mac, int mult ) {
		if(mac == null)
			throw new NullPointerException();
		else{
			int sum = 0;
			int size = mac.length;
			
			for(int i = 0 ; i<size; i++)
				for(int j = ( mult - (i % mult)) % mult; j<size; j+=mult )				
					sum+= mac[i][j];
			
			return sum;
		}
	}
}
