package bt.algorithms.graph;

import java.util.*;

import bt.algorithms.interfaces.IGraf;

public class GraphIndirected<W,S> implements IGraf<W,S>{
	S[][] matrix;
	Hashtable<W,Integer> vertIntoPosition;
	ArrayList<W> vertices;
	
	public GraphIndirected(ArrayList<W> vertices,S[][] connectionMatrix) {
		this.vertices = vertices;	
		this.matrix = connectionMatrix;	
		this.vertIntoPosition = new Hashtable<> ();

		if(this.vertices!= null)
			for(int i = 0 ; i < this.vertices.size();i++)
				vertIntoPosition.put(this.vertices.get(i), i);
	}

	@Override
	public List<W> Wierzcholki() {
		List<W> retVal = new ArrayList<W>();// CTOR make it
				
		if(vertices != null)		
			retVal = vertices;
		
		return retVal;
	}
	
	@Override
	public S Krawedz(W aW1, W aW2) {
		S retVal = null;
		
		if(!(aW1 == null || aW2 == null))
			retVal = matrix[vertIntoPosition.get(aW1)][vertIntoPosition.get(aW2)];
		
		return retVal;
	}

	@Override
	public List<W> Krawedzie(W aW) {
		List<W> retVal = new LinkedList<>();
		
		if(aW!=null && vertIntoPosition!=null && matrix!= null && vertIntoPosition.getOrDefault(aW, null) != null)
		{						
				int idxOfLvl = vertIntoPosition.get(aW);
				
				for(int i = 0 ; i < vertices.size();i++)
					if(matrix[idxOfLvl][i]!= null)
						retVal.add(vertices.get(i));
		}
		
		return retVal;
	}
}