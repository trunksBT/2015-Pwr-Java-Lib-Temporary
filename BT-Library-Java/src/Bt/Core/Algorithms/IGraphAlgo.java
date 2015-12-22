package Bt.Core.Algorithms;

import java.util.List;

public class IGraphAlgo<S> {
	void printStackTrace(List<S> aPath)
	{
		if(!aPath.isEmpty())
			aPath.stream().forEach(val -> System.out.println( val ));
		else
			System.out.println( "Brak Sciezki miedzy wezlami" );
	}
}
