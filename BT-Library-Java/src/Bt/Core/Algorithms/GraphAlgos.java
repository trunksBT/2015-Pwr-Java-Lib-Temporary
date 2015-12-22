package Bt.Core.Algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import Bt.Core.Collections.IndirectedGraph;

public class GraphAlgos< W,S> {
	
	IndirectedGraph<W,S> _graf;
	
	public GraphAlgos(IndirectedGraph<W,S> aGraf)
	{
		_graf = aGraf;
	}
	
	public List<S> dijkstra(W aStart,W aEnd){
		HashMap<W,LinkedList<S>> _mapOfStackTrace = init(_graf);
		_mapOfStackTrace.get("Dania").add(_graf.krawedz(aStart, aEnd));
		
		
		return null;	
	}
	
	private HashMap<W,LinkedList<S>> init(
			IndirectedGraph<W,S> aGraf)
	{				
		return (HashMap<W, LinkedList<S>>) aGraf.wierzcholki()
				.stream()
				.collect(Collectors.toMap(
						vert-> vert,
						vert-> new LinkedList<S>()));
	}
}
