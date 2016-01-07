package Bt.Core.Collections;

import java.util.*;
import Bt.Core.Collections.Interfaces.IGraf;

public class IndirectedGraph<W,S> implements IGraf<W,S>{
	S[][] matrix;	
	Hashtable<W,Integer> nodes;
	ArrayList<W> vertices;

	public IndirectedGraph(Hashtable<W, Integer> aNodes,S[][] aConnectionMatrix) {
		nodes = aNodes;
		matrix = aConnectionMatrix;
	}
	
	public IndirectedGraph(ArrayList<W> aVertices,S[][] aConnectionMatrix,boolean aFlag) {
		vertices = aVertices;	
		matrix = aConnectionMatrix;	
		nodes = new Hashtable<> ();

		if(aVertices!= null)
			for(int i = 0 ; i < aVertices.size();i++)
				nodes.put(aVertices.get(i), i);
		
	}

	@Override
	public List<W> Wierzcholki() {
		List<W> retVal = new ArrayList<W>();
				
		if(vertices != null)		
			retVal = vertices;
		
		return retVal;
	}
	
	@Override
	public S Krawedz(W aW1, W aW2) {
		S retVal = null;
		
		if(!(aW1 == null || aW2 == null))
			retVal = matrix[nodes.get(aW1)][nodes.get(aW2)];
		
		return retVal;
	}

	@Override
	public List<W> Krawedzie(W aW) {
		List<W> retVal = new LinkedList<>();
		
		if(aW!=null && nodes!=null && matrix!= null && nodes.getOrDefault(aW, null) != null)
		{						
				int idxOfLvl = nodes.get(aW);
				
				for(int i = 0 ; i < vertices.size();i++)
					if(matrix[idxOfLvl][i]!= null)
						retVal.add(vertices.get(i));
		}
		
		return retVal;
	}
}
