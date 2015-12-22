package Bt.Core.Collections;

import java.util.*;
import java.util.Collections;

import Bt.Core.Collections.Interfaces.IGraf;

public class IndirectedGraph<W,S> implements IGraf<W,S>{

	S[][] matrix;	
	Hashtable<W,Integer> vertices;
	
	public IndirectedGraph(Hashtable<W, Integer> aVertices,S[][] aConnectionMatrix) {
		vertices = aVertices;
		matrix = aConnectionMatrix;
	}

	@Override
	public List<W> Wierzcholki() {	
		List<W> retVal = new ArrayList<W>();
		
		if(vertices!=null)
			retVal = Collections.list(vertices.keys());
		
		return retVal;
	}

	@Override
	public S Krawedz(W aW1, W aW2) {
		S retVal = null;
		
		if(!(aW1 == null || aW2 == null))
			retVal = matrix[vertices.get(aW1)][vertices.get(aW2)];
		
		return retVal;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<W> Krawedzie(W aW) {
		List<W> retVal = new LinkedList<>();
		S lvl = null;
		if(aW!=null && vertices!=null && matrix!= null)
		{
			
			S[] connections = null;
			lvl = (S) vertices.getOrDefault(aW, null);
			
			if(lvl != null)
			{
				connections = matrix[vertices.get(aW)];
			
				for(int i = 0 ; i< connections.length;i++)
					if(connections[i]!=null)
						for(Map.Entry<W, Integer> entry : vertices.entrySet())
							if(entry.getValue().equals(i))
								retVal.add(entry.getKey());
			}
		}		
		return retVal;
	}
}