package bt.core.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bt.core.collections.Tuple;
import bt.core.collections.interfaces.IGraf;
import bt.core.collections.interfaces.IGraphAlgo;

public class GraphAlgos<W,S> implements IGraphAlgo<W,S>{
	IGraf<W,S> graf;
	
	public GraphAlgos(IGraf<W,S> graf)
	{
		this.graf = graf;
	}

	public List<S> dijkstra(W aStart,W aEnd){
		List<W> dirtyVertices = new ArrayList<>();	
		boolean finished = false;
		boolean notFound = true;
		
		if( aStart != null 
				&& aEnd!= null 
				&& graf!= null 
				&& !graf.Wierzcholki().isEmpty()
				&& !graf.Krawedzie(aStart).isEmpty()){
			
			while(finished == false){
				dirtyVertices.add(aStart);
								
				W curr = aStart;
				List<W>  associations = graf.Krawedzie(curr);
				associations.removeAll(dirtyVertices);
										
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
								.map(vert -> new Tuple<W,S>(vert,graf.Krawedz(curr,vert)))
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
			dirtyVertices.add(aEnd);
		
		for(int i  = 0 ; i < dirtyVertices.size()-1;i++)
			_final.add(graf.Krawedz(dirtyVertices.get(i),dirtyVertices.get(i+1)));
						
		return _final;	
	}

	@Override
	public boolean ifConnected(W aW1, W aW2) {
		
		List<S> path = dijkstra(aW1,aW2);
		
		boolean isConnect = !path.isEmpty();
		boolean goodPath = true;
		
		if(graf!= null)
			goodPath = path.size()<(graf.Wierzcholki().size()-1);
		
		if(isConnect&&goodPath)
		{
			System.out.println( " Przeszkody po drodze :"+ aW1 + " - " +aW2 );
			path.stream().forEach(val -> System.out.print( val +","));
			System.out.println();
		}else
			System.out.println( "Brak Sciezki miedzy wezlami" );
	
		return isConnect && goodPath;
	}
}