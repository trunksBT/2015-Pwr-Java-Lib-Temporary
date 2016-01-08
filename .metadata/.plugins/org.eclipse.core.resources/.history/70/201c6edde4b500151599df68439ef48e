package Bt.Core.Collections;
import java.util.*;

public class TwoDimTable {
	
	int [][]tab;
	int x;
	int y;
	
	TwoDimTable(int aXSize,int aYSize)
	{
		x = aXSize;
		y = aYSize;
		tab = new int[x][y];
	}
	
	void walkThrough()
	{
		int xC=0;
		int yC=0;
		
		int cV = 0;
		
		
		tab[xC][yC] = cV++;
		
	}
		
//	void wczytaj()
//	{
//		Scanner scanner = new Scanner(System.in);
//		n = 0;
//		
//		while(scanner.hasNextInt())
//		{
//			tab[n++]=scanner.nextInt();
//		}
//	}
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
	
	void druk()
	{
		System.out.println("Tablica");
		
		for(int i = 0;i<y;i++)
		{
			for (int j = 0; j < x; j++) {
				System.out.print(tab[i][j]);
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("Koniec");
	}
}
