package bt.algorithms;

import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;

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
//	
//	private static int calculateSizeOfDestinyTab(List multiplierCollection)
//	{
//		int retVal = 0;
//		for(int i = 0; i< multiplierCollection.size(); i++)
//		{
//			retVal += (int)multiplierCollection.get(i);
//		}
//		return retVal;
//	}
//	
//	private static List createMultiplications(int toMultiplicate, int multiplier)
//	{
//		List multiplies = new ArrayList(multiplier);
//		for(int i = 0; i< multiplier; i++)
//		{
//			multiplies.add(toMultiplicate);
//		}
//		return multiplies;
//	}
//	
//	private static void appendCollection(List appendTo, List appendFrom)
//	{
//		for(int i = 0; i< appendFrom.size(); i++)
//		{
//			appendTo.add(appendFrom.get(i));
//		}
//	}
//	
//	public static List duplicate(List srcCollection, List multiplierCollection)
//	{
//		if(srcCollection == null || multiplierCollection == null)
//			return null;
//		
//		int srcCollectionSize = srcCollection.size();
//		int sizeOfDestCollection = calculateSizeOfDestinyTab(multiplierCollection);
//		List retCollection = new ArrayList(sizeOfDestCollection);
//		
//		for(int i = 0; i< srcCollectionSize && i < multiplierCollection.size(); i++)
//		{
//			appendCollection(retCollection, 
//					createMultiplications((int)srcCollection.get(i), (int)multiplierCollection.get(i)));
//		}
//		
//		return retCollection;
//	}
//	
//
	private static int calculateSizeOfDestinyTab(List multiplierCollection)
	{
		int retVal = 0;
		return retVal;
	}
	
	private static List createMultiplications(int toMultiplicate, int multiplier)
	{
		List multiplies = new ArrayList(multiplier);
		return multiplies;
	}
	
	private static void appendCollection(List appendTo, List appendFrom)
	{
	}
	
	public static List duplicate(List srcCollection, List multiplierCollection)
	{
		return null;
	}
}
