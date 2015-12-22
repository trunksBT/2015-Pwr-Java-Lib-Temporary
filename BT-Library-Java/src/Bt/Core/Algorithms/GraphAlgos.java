package Bt.Core.Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import Bt.Core.Collections.IndirectedGraph;
import Bt.Core.Collections.Tuple;
import Bt.Core.Collections.Interfaces.IGraf;

public class GraphAlgos< W,S> implements IGraphAlgo<W,S>{
	
	IGraf<W,S> _graf;
	
	public GraphAlgos(IndirectedGraph<W,S> aGraf)
	{
		_graf = aGraf;
	}
	
	@SuppressWarnings("unused")
	public List<S> dijkstra(W aStart,W aEnd){
		HashMap<W,LinkedList<S>> _mapOfStackTrace = init(_graf);
		ArrayList<W> _dirtyVertices = new ArrayList<>();
		ArrayList<S> _finalStackTrace = new ArrayList<>();
		
		List<W> associations = null;
		
		boolean finished = false;
		
		if( aStart != null && aEnd!= null )
		{
			while(finished == false)
			{
				_dirtyVertices.add(aStart);
				W curr = aStart;
				associations = _graf.Krawedzie(curr);
				associations.removeAll(_dirtyVertices);

				associations
				.forEach(vert -> _mapOfStackTrace.get(vert).add(_graf.Krawedz(curr, vert)));
										
				long ammountOfGood = associations.stream()
						.filter(vert -> vert.equals(aEnd))
						.count();
				
				if(ammountOfGood!= 0)
				{
					List<W> goods =  associations.stream()
							.filter(vert -> vert.equals(aEnd))
							.collect(Collectors.toList());
							
					_finalStackTrace.add((S) _graf.Krawedz(curr, goods.get(0)));
					finished = true;
				}
				else
				{		
					List<Tuple<W,S>> tupleOfVals = new ArrayList<>();
					
					associations
							.forEach(vert -> tupleOfVals.add(new Tuple<W,S>(vert,_graf.Krawedz(curr, vert))));
					
					 Collections.sort(tupleOfVals, new Comparator<Tuple<W,S>>() {
						    public int compare(Tuple<W,S> u1, Tuple<W,S> u2) {
						      return u1.compareTo(u2);
						    }});
					 
					 _finalStackTrace.add((S) tupleOfVals.get(0).value);
					 aStart = tupleOfVals.get(0).key;
				}
			}
		
		}
		return _finalStackTrace;	
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

	@Override
	public boolean ifConnected(W aW1, W aW2) {
		
		List<S> path = dijkstra(aW1,aW2);
		
		boolean retVal = path.isEmpty();
		if(!retVal)
		{
			System.out.println( " Przeszkody po drodze :"+ aW1 + " - " +aW2 );
			path.stream().forEach(val -> System.out.print( val +","));
			System.out.println();
		}else
		{
			System.out.println( "Brak Sciezki miedzy wezlami" );
		}
	
		return true;
	}
}
