package Bt.Tests.Core.Collections;

import java.util.*;
import java.util.Collections;

import Bt.Core.Collections.Interfaces.IGraf;
import Bt.Core.Geometry.Shapes.Shape;

public class IndirectedGraph<W,S> implements IGraf<W,S>{

	int[][] connectionMatrix;	
	Hashtable<W,S> vertices;
	
	public IndirectedGraph(int[][] aConnectionMatrix, Hashtable<W, S> aVertices) {
		connectionMatrix = aConnectionMatrix;
		vertices = aVertices;
	}

	@Override
	public List<W> wierzcholki() {
		return Collections.list(vertices.keys());
	}

	@Override
	public S krawedz(W w1, W w2) {
		S reachY = vertices.get(w1);
		S reachX = vertices.get(w2);

		S reachedLvl = vertices.get(w1);
		
		List<W> kraw1 = krawedzie(w1);
		List<W> kraw2 = krawedzie(w2);
		
		kraw1.retainAll(kraw2);
		
////		int retVal = (connectionMatrix[(int) reachX][(int) reachY]);
//		
////		int[] _vertices = Arrays.asList(connectionMatrix[(int) reachedLvl]).get(0);
////		
////		for(int i = 0; i< _vertices.length; i++)
////		{ 
////			int buff = _vertices[i];
////			if(_vertices[i] == (int)reachedLvlY)
////			{
////				for(Map.Entry<W, S> entry: vertices.entrySet())
////				{
////					if(entry.getValue().equals(_vertices[i]))
////					{
////						retVal = entry.getValue();
////					}
////				}
////			}
////		}
//		
		return vertices.get(kraw1.get(0));
	}

	@Override
	public List<W> krawedzie(W w) {
		S reachedLvl = vertices.get(w);
		List<W> retVal = new LinkedList<>();
		
		int[] _vertices = Arrays.asList(connectionMatrix[(int) reachedLvl]).get(0);
		
		for(int i = 0; i< _vertices.length; i++)
		{ 
			if(_vertices[i] != 0)
			{
				for(Map.Entry<W, S> entry: vertices.entrySet())
				{
					if(entry.getValue().equals(_vertices[i]))
					{
						retVal.add((W) entry.getKey());
					}
				}
			}
		}
		
		return retVal;
	}
}
