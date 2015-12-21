package Bt.Core.Collections.Interfaces;

import java.util.List;

public interface IGraf<W, S> {
	List<W> wierzcholki();			//zwraca wszystkie wierzcholki grafu
	S krawedz(W w1, W w2);			//pobiera etykietÄ™ krawÄ™dzi pomiÄ™dzy wierzchoÅ‚kami					
	//wartoÅ›Ä‡ NULL oznacza brak krawÄ™dzi
	List<W> krawedzie(W w);			//zwraca wierzchoÅ‚ki, do ktÃ³rych istnieje krawÄ™dz z w
}
