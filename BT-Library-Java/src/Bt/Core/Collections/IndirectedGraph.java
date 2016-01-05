package Bt.Core.Collections;

import java.util.*;
import java.util.Map.Entry;

import Bt.Core.Collections.Interfaces.IGraf;

public class IndirectedGraph<W,S> implements IGraf<W,S>{

	S[][] matrix;	
	Hashtable<W,Integer> vertices;
	
	public IndirectedGraph(Hashtable<W, Integer> aVertices,S[][] aConnectionMatrix) {
		vertices = aVertices;
		matrix = aConnectionMatrix;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<W> Wierzcholki() {			

		List<W> retVal = new ArrayList<W>();
				
		if(vertices!=null)		
			retVal = new ArrayList<W>((Collection<? extends W>) (vertices.entrySet()));
		
		return retVal;
	}
	
	@Override
	public S Krawedz(W aW1, W aW2) {
		S retVal = null;
		
		if(!(aW1 == null || aW2 == null))
			retVal = matrix[vertices.get(aW1)][vertices.get(aW2)];
		
		return retVal;
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<W> Krawedzie(W aW) {
//		List<W> retVal = new LinkedList<>();
//		S lvl = null;
//		if(aW!=null && vertices!=null && matrix!= null)
//		{
//			
//			S[] connections = null;
//			lvl = (S) vertices.getOrDefault(aW, null);
//			
//			if(lvl != null)
//			{
//				connections = matrix[vertices.get(aW)];
//			
//				for(int i = 0 ; i< connections.length;i++)
//					if(connections[i]!=null)
//						for(Map.Entry<W, Integer> entry : vertices.entrySet())
//							if(entry.getValue().equals(i))
//								retVal.add(entry.getKey());
//			}
//		}		
//		return retVal;
//	}
	
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<W> Krawedzie(W aW) {
//		List<W> retVal = new LinkedList<>();
//		S lvl = null;
//		if(aW!=null && vertices!=null && matrix!= null)
//		{
//			
//			S[] connections = null;
//			lvl = (S) vertices.getOrDefault(aW, null);
//			
//			if(lvl != null)
//			{
//				connections = matrix[vertices.get(aW)];
//			
//				for(int i = 0 ; i< connections.length;i++)
//					if(connections[i]!=null)
//						for(Map.Entry<W, Integer> entry : vertices.entrySet())
//							if(entry.getValue().equals(i))
//								retVal.add(entry.getKey());
//			}
//		}		
//		return retVal;
//	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<W> Krawedzie(W aW) {
		List<W> retVal = new LinkedList<>();
		ArrayList<Integer> idxes = new ArrayList<>();
		List<Tuple<Integer,W>> entrySet = entrySetToListOfTuple();
		PriorityQueue<Tuple<Integer,W>> prioQueue = toPriorityQueue(entrySet);
		
		if(aW!=null && vertices!=null && matrix!= null)
		{						
			if(vertices.getOrDefault(aW, null) != null)
			{
				S[] connections = matrix[vertices.get(aW)];
				int len = connections.length;
				int iter = -1;
				
				while(++iter<len)
					if(connections[iter]!=null)
						idxes.add(iter);
				
										
				for(int i = 0 ; i < idxes.size() ;)
				{
					Tuple<Integer,W> searchedEl = prioQueue.poll();
					int searchedVerticeIdx = idxes.get(i);
					
//					W searchedKey = (W) connections[searchedEl.value];
					
					if(searchedVerticeIdx == searchedEl.key)
					{
						retVal.add(searchedEl.value);
						i++;
					}
				}


//				if(connections[iter]!=null && iter < len)
//				if(iter < len)
//				{
//					Set<Entry<W, Integer>> buff = vertices.entrySet();
//					int a = 0;
					
//					for(Map.Entry<W, Integer> entry : vertices.entrySet())
//						if(entry.getValue().equals(iter++))
//							retVal.add(entry.getKey());
				
			}
		}		
		return retVal;
	}
	
	private List<Tuple<Integer,W>> entrySetToListOfTuple()
	{
		List<Tuple<Integer,W>> retVal = new LinkedList<>();
		
		for(Map.Entry<W, Integer> entry : vertices.entrySet())
			retVal.add(new Tuple<Integer,W>(entry.getValue(),entry.getKey()));
		
		return retVal;
	}
	
	private PriorityQueue<Tuple<Integer,W>> toPriorityQueue(List<Tuple<Integer,W>> aInput)
	{
		PriorityQueue<Tuple<Integer,W>> retVal = new PriorityQueue<>();
		
		for(Tuple<Integer,W> buff : aInput)
			retVal.add(buff);
		
		return retVal;
	}
}
