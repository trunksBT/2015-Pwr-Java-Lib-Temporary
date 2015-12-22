package Bt.Core.Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import Bt.Core.Collections.IndirectedGraph;
import Bt.Core.Collections.Tuple;
import Bt.Core.Collections.Interfaces.IGraf;
import Bt.Core.Geometry.Shapes.Shape;

public class GraphAlgos< W,S> implements IGraphAlgo<W,S>{
	
	IGraf<W,S> _graf;
	
	public GraphAlgos(IGraf<W,S> aGraf)
	{
		_graf = aGraf;
	}

	public List<S> dijkstra(W aStart,W aEnd){
		ArrayList<W> _dirtyVertices = new ArrayList<>();	
		boolean finished = false;
		boolean notFound = true;
		
		if( aStart != null && aEnd!= null ){
			while(finished == false){
				_dirtyVertices.add(aStart);
								
				W curr = aStart;
				List<W>  associations = _graf.Krawedzie(curr);
				associations.removeAll(_dirtyVertices);
										
				List<W> appropriate = associations.stream()
						.filter(vert -> vert.equals(aEnd))
						.collect(Collectors.toList());
				
				if(!associations.isEmpty()) {
					if(!appropriate.isEmpty()) {
							finished = true;
							notFound = false;
						}
					else{
						Optional<Tuple<W, S>> theLowestWage = associations
								.stream()
								.map(vert -> new Tuple<W,S>(vert,_graf.Krawedz(curr,vert)))
								.reduce((tup1,tup2) -> tup1.compareTo(tup2) < 0 ? tup1 : tup2 );
								
						aStart = theLowestWage.get().key;
					}
				}
				else
					finished = true;
			}		
		}	
		
		ArrayList<S> _final = new ArrayList<>();
		if(!notFound)
			_dirtyVertices.add(aEnd);
		
		for(int i  = 0 ; i < _dirtyVertices.size()-1;i++)
			_final.add(_graf.Krawedz(_dirtyVertices.get(i),_dirtyVertices.get(i+1)));
						
		return _final;	
	}
//	
//	public List<S> dijkstra(W aStart,W aEnd){
//		ArrayList<W> _dirtyVertices = new ArrayList<>();
//		ArrayList<S> _finalStackTrace = new ArrayList<>();
//		
//		List<W> associations = null;
//		
//		boolean finished = false;
//		
//		if( aStart != null && aEnd!= null )
//		{
//			while(finished == false)
//			{
//				_dirtyVertices.add(aStart);
//				W curr = aStart;
//				associations = _graf.Krawedzie(curr);
//				associations.removeAll(_dirtyVertices);
//										
//				List<W> appropriate = associations.stream()
//						.filter(vert -> vert.equals(aEnd))
//						.collect(Collectors.toList());
//				
//				if(!appropriate.isEmpty())
//				{
//					_finalStackTrace.add((S) _graf.Krawedz(curr, appropriate.get(0)));
//					finished = true;
//				}
//				else
//					aStart = loopWithNewVertice(_finalStackTrace, associations, curr);
//			}
//		
//		}
//		return _finalStackTrace;	
//	}
	

//	
//	
//	private W loopWithNewVertice(ArrayList<S> _finalStackTrace, List<W> associations, W curr) {
//		
//		List<Tuple<W,S>> tupleOfVals = associations
//				.stream()
//				.map(vert -> new Tuple<W,S>(vert,_graf.Krawedz(curr,vert)))
//				.collect(Collectors.toList());
//		
//		 Collections.sort(tupleOfVals, new Comparator<Tuple<W,S>>() {
//			    public int compare(Tuple<W,S> u1, Tuple<W,S> u2) {
//			      return u1.compareTo(u2);
//			    }});
//		 
//		 _finalStackTrace.add((S) tupleOfVals.get(0).value);
//		return tupleOfVals.get(0).key;
//	}

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
