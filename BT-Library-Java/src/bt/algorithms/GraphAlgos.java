package bt.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bt.algorithms.interfaces.IGraf;
import bt.algorithms.interfaces.IGraphAlgo;
import bt.collections.elems.Tuple;

public class GraphAlgos<W,S> implements IGraphAlgo<W,S>{
	IGraf<W,S> graf;
	
	public GraphAlgos(IGraf<W,S> graf)
	{
		this.graf = graf;
	}

	public List<S> dijkstrable(W aStart,W aEnd){
		List<W> dirtyValues = new ArrayList<>();
		boolean finished = false;
		boolean notFound = true;
		
		if( aStart != null && aEnd!= null && graf!= null && !graf.Wierzcholki().isEmpty()
				&& !graf.Krawedzie(aStart).isEmpty()){
			
			while(finished == false){
				dirtyValues.add(aStart);
								
				W curr = aStart;
				List<W>  associations = graf.Krawedzie(curr);
				associations.removeAll(dirtyValues);
										
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
			dirtyValues.add(aEnd);
		
		for(int i  = 0 ; i < dirtyValues.size()-1;i++)
			_final.add(graf.Krawedz(dirtyValues.get(i),dirtyValues.get(i+1)));
						
		return _final;	
	}

	@Override
	public boolean ifConnected(W aW1, W aW2) {
		
		List<S> path = dijkstrable(aW1,aW2);
		
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
