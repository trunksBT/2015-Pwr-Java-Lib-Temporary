package Bt.Core.ABC;
import java.util.*;

public class OneDimTable {
	
	int []tab;
	int size;
	
	public OneDimTable(int size,int []tab)
	{
		this.size = size;
		this.tab = new int[this.size];
		this.tab = tab;
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
	
	public int GetSize()
	{
		return this.size;
	}
}