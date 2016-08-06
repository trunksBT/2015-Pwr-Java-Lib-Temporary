package bt.mock.algorithms.graph;

import bt.collections.interfaces.List;
import bt.collections.lists.LinkedList;

public class MockAdjacentMatrix {
	public static String[][] twoElem(int size) {
		String [][] retTab = new String[size][size];
		retTab[0][1] = "ab";
		return retTab;
	}
	
	public static LinkedList expValForTwoElem_DFSyBFS() {
		List tab = new LinkedList();
		tab.add(0);
		tab.add(1);
		return (LinkedList) tab;
	}
	
	public static String[][] Null(int size) {
		return null;
	}
	
	public static LinkedList expValForNull_DFSyBFS() {
		return new LinkedList();
	}
	
	public static String [][] notEmpty(int size) {
		String [][] retTab = new String[size][size];
		retTab[0][1] = "ab";
		retTab[0][3] = "ad";
		retTab[1][2] = "bc";
		retTab[1][4] = "be";
		retTab[2][3] = "cd";
		retTab[2][4] = "ce";
		retTab[3][5] = "df";
		retTab[4][6] = "eg";
		retTab[5][6] = "fg";
		retTab[5][7] = "fh";
		retTab[6][8] = "gi";
		retTab[7][8] = "hi";
		return retTab;
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
