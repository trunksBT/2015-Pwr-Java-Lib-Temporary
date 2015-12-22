package Bt.Core.Algorithms;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import Bt.Core.Collections.IndirectedGraph;
import Bt.Core.Collections.Interfaces.IGraf;

public class GraphAlgos< W,S> extends IGraphAlgo{
	
	IGraf<W,S> _graf;
	
	public GraphAlgos(IndirectedGraph<W,S> aGraf)
	{
		_graf = aGraf;
	}
	
	public List<S> dijkstra(W aStart,W aEnd){
		HashMap<W,LinkedList<S>> _mapOfStackTrace = init(_graf);
		
		boolean finished = false;
		
		if( aStart != null && aEnd!= null )
		{
			while(finished == false)
			{
				W buffStart = aStart;
				W curr = aStart;
				
				List<W> associations = _graf.Krawedzie(aStart);
				associations.stream()
				.forEach(assoc -> _mapOfStackTrace.get(assoc).add(_graf.Krawedz(curr, assoc)));
				
				long ammountOfGood = associations.stream()
						.filter(vert -> vert.equals(aEnd))
						.count();
				
				if(ammountOfGood!= 0) 
					finished = true;
			}
		
		}
		return _mapOfStackTrace.get(aEnd);	
	}
	
	private HashMap<W,LinkedList<S>> init(
			IGraf<W,S> aGraf)
	{				
		return (HashMap<W, LinkedList<S>>) aGraf.Wierzcholki()
				.stream()
				.collect(Collectors.toMap(
						vert-> vert,
						vert-> new LinkedList<S>()));
	}
}
