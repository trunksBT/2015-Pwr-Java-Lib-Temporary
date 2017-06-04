package bt.algorithms.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.graph.DFS2;
import bt.collections.graphs.AdjacentList;
import bt.collections.graphs.AdjacentMatrix;
import bt.collections.graphs.Graph;
import bt.collections.interfaces.List;
import bt.collections.lists.LinkedList;
import bt.mock.algorithms.graph.MockAdjacentList;
import bt.mock.algorithms.graph.MockAdjacentMatrix;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_DFS2 extends TestCase
{
	@Test
	public void test_adjacentList_NotEmpty_012356874()
	{
	    //arrange
		List rcVal = null;
		int inSize = 9;
		Graph<Integer,String> graph = 
				new AdjacentList<String>(MockAdjacentList.NotEmpty(inSize));
	    
	    //act
		rcVal = new DFS2<String>()
		    		.forAdjacentShapes((AdjacentList<String>) graph);

		//assert
	    assertEquals(MockAdjacentList.expValForNotEmpty_DFS(), rcVal);
	}

	@Test
	public void test_adjacentList_Null_Empty()
	{
	    //arrange
		List rcVal = null;
		Graph<Integer,String> graph = 
				new AdjacentList<String>(MockAdjacentList.Null(0));
	    
	    //act
		rcVal = new DFS2<String>()
		    		.forAdjacentShapes((AdjacentList<String>) graph);
	    
	    //assert
	    assertEquals(new LinkedList(), rcVal);
	}

	@Test
	public void test_adjacentList_TwoElem_12()
	{
	    //arrange
		List rcVal = null;
		int inSize = 2;
		Graph<Integer,String> graph = 
				new AdjacentList<String>(MockAdjacentList.TwoElem(inSize));
	    
	    //act
		rcVal = new DFS2<String>()
		    		.forAdjacentShapes((AdjacentList<String>) graph);
	    
	    //assert
	    assertEquals(MockAdjacentList.expValForTwoElem_DFSyBFS(), rcVal);
	}

	@Test
	public void test_adjacentMatrix_NotEmpty_012356874()
	{
	    //arrange
		List rcVal = null;
		int inSize = 9;
		Graph<Integer,String> graph = 
				new AdjacentMatrix<String>(MockAdjacentMatrix.notEmpty(inSize));
	    
	    //act
		rcVal = new DFS2<String>()
		    		.forAdjacentShapes((AdjacentMatrix<String>) graph);
	    
	    //assert
	    assertEquals(MockAdjacentList.expValForNotEmpty_DFS(), rcVal);
	}

	@Test
	public void test_adjacentMatrix_Null_Empty()
	{
	    //arrange
		List rcVal = null;
		Graph<Integer,String> graph = 
				new AdjacentMatrix<String>(MockAdjacentMatrix.Null(0));
	    
	    //act
		rcVal = new DFS2<String>()
		    		.forAdjacentShapes((AdjacentMatrix<String>) graph);
	    
	    //assert
	    assertEquals(new LinkedList(), rcVal);
	}

	@Test
	public void test_adjacentMatrix_TwoElem_12()
	{
	    //arrange
		List rcVal = null;
		int inSize = 2;
		Graph<Integer,String> graph = 
				new AdjacentMatrix<String>(MockAdjacentMatrix.twoElem(inSize));
	    
	    //act
		rcVal = new DFS2<String>()
		    		.forAdjacentShapes((AdjacentMatrix<String>) graph);
	    
	    //assert
	    assertEquals(MockAdjacentMatrix.expValForTwoElem_DFSyBFS(), rcVal);
	}
}