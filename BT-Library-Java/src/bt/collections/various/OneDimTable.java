package bt.collections.various;
import java.util.*;

public class OneDimTable {

	int []tab;
	int size;
	
	public OneDimTable(int size,int []tab)
	{
		if(tab != null)
		{
			this.size = size;
			this.tab = new int[this.size];
			this.tab = tab;
		}
		else
		{
			this.size = 0;
			this.tab = null;
		}
	}

		
	public void wczytaj()
	{
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		while(scanner.hasNextInt())
		{
			tab[n++]=scanner.nextInt();
		}
		
		scanner.close();
	}
//	
//	void usunPowt()
//	{
//		for(int i = 0 ;i<n;i++)
//		{	
//			for (int j = i+1;j < n; ++j) {
//								
//				if(tab[i] == tab[j])
//				{
//					for(int l = j;l<n-1;)
//						tab[l] = tab[++l];
//					
//					--n;
//				}	
//			}
//		}
//	}
	
	public void druk()
	{
		System.out.println("Tablica");
		
		for(int i = 0;i<size;i++)
		{
				System.out.print(tab[i]);
		}
		
		System.out.println();
		System.out.println("Koniec");
	}
	
	public OneDimTable insert(int el)
	{
		if(tab != null)
		{
			int goodIdx = -1;
			int i = 1;
			int j = 0;
			int [] helpTape = new int [ size+1 ];
			
			if( size > 1) {
				while( goodIdx == -1 && i <= size){	
					if (tab[ i-1 ] >= el && i == 1)
						goodIdx = 0;
					
					if ( tab[ i-1 ] <= el && tab[ i ] >= el )
						goodIdx = i;
					
					if ( tab[ i ] <= el && i == size-1)
						goodIdx = i+1;		
		
					i++;
				}
			}
			else if ( size == 1) {
				if ( tab [ 0 ] <= el )
					goodIdx = 1;
				else
					goodIdx = 0;
			}
			else
				goodIdx = 0;
			
			
			i = j = 0;
			
			while(i <= size) {
				if ( i == goodIdx )
					helpTape[ i++ ] = el;
				else
					helpTape[ i++ ]= tab[ j++ ];
			}
			
			return new OneDimTable(size+1,helpTape);
		}

		return new OneDimTable(0,null);
	}
	
	public int GetSize()
	{
		return this.size;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
		result = prime * result + Arrays.hashCode(tab);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OneDimTable other = (OneDimTable) obj;
		if (size != other.size)
			return false;
		if (!Arrays.equals(tab, other.tab))
			return false;
		return true;
	}
}
