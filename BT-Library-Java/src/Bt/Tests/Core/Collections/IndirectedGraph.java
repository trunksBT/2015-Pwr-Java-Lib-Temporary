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
		return Collections.list(vertices.keys());
	}

	@Override
	public S krawedz(W w1, W w2) {
		return matrix[vertices.get(w1)][vertices.get(w2)];
	}

	@Override
	public List<W> krawedzie(W w) {
		List<W> retVal = new LinkedList<>();
		S[] connections = matrix[vertices.get(w)];
		
		for(int i = 0 ; i< connections.length;i++)
			if(connections[i]!=null)
				for(Map.Entry<W, Integer> entry : vertices.entrySet())
					if(entry.getValue().equals(i))
						retVal.add(entry.getKey());
			
		return retVal;
	}
}
