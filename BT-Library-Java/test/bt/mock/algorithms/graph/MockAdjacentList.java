package bt.mock.algorithms.graph;

import bt.collections.interfaces.List;
import bt.collections.lists.LinkedList;

public class MockAdjacentList {
	public static LinkedList[] TwoElem(int size) {
		LinkedList [] tab = new LinkedList[size];
		for(int i = 0; i < size ; i++)
			tab[i] = new LinkedList();
		tab[0].add(1);
		return tab;
	}
	
	public static LinkedList expValForTwoElem_DFSyBFS() {
		List tab = new LinkedList();
		tab.add(0);
		tab.add(1);
		return (LinkedList) tab;
	}
	
	public static LinkedList[] Null(int size) {
		return null;
	}
	
	public static LinkedList expValForNull_DFSyBFS() {
		return new LinkedList();
	}
	
	public static LinkedList[] NotEmpty(int size) {
		LinkedList [] tab = new LinkedList[size];
		for(int i = 0; i < size ; i++)
			tab[i] = new LinkedList();
		tab[0].add(1);
		tab[0].add(3);		
		tab[1].add(2);
		tab[1].add(4);	
		tab[2].add(3);
		tab[2].add(4);	
		tab[3].add(5);
		tab[4].add(6);
		tab[5].add(6);
		tab[5].add(7);
		tab[6].add(8);
		tab[7].add(8);
		return tab;
	}	
	public static LinkedList expValForNotEmpty_DFS() {
		List tab = new LinkedList();
		tab.add(0);
		tab.add(1);
		tab.add(2);
		tab.add(3);
		tab.add(5);
		tab.add(6);
		tab.add(8);
		tab.add(7);
		tab.add(4);
		return (LinkedList) tab;
	}
	public static LinkedList expValForNotEmpty_BFS() {
		List tab = new LinkedList();
		tab.add(0);
		tab.add(1);
		tab.add(3);
		tab.add(2);
		tab.add(4);
		tab.add(5);
		tab.add(6);
		tab.add(7);
		tab.add(8);
		return (LinkedList) tab;
	}
}
