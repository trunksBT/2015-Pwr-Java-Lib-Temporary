package Bt.Tests.Core.Collections;

import java.util.*;
import java.util.Collections;

import Bt.Core.Collections.Interfaces.IGraf;

public class IndirectedGraph<W,S> implements IGraf<W,S>{

	S[][] matrix;	
	Hashtable<W,Integer> vertices;
	
	public IndirectedGraph(Hashtable<W, Integer> aVertices,S[][] aConnectionMatrix) {
		matrix = aConnectionMatrix;
		vertices = aVertices;
	}

	@Override
	public List<W> wierzcholki() {
		
		List<W> retVal = new ArrayList<W>();
		
		if(vertices!=null)
			retVal = Collections.list(vertices.keys());
		
		return retVal;

	}

	@Override
	public S krawedz(W w1, W w2) {
		S retVal = null;
		
		if(!(w1 == null || w2 == null))
			retVal = matrix[vertices.get(w1)][vertices.get(w2)];
		
		return retVal;
	}

	@Override
	public List<W> krawedzie(W w) {
		List<W> retVal = new LinkedList<>();
		if(w!=null && vertices!=null && matrix!= null)
		{
			S[] connections = matrix[vertices.getOrDefault(w, null)];
			
			for(int i = 0 ; i< connections.length;i++)
				if(connections[i]!=null)
					for(Map.Entry<W, Integer> entry : vertices.entrySet())
						if(entry.getValue().equals(i))
							retVal.add(entry.getKey());
		}
			
		return retVal;
	}
}
