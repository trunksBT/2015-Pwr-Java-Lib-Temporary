package Bt.Tests.Core.Collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Collections.OneDimTable;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestIndirectedGraph extends TestCase{

	public int[][] initMatrix()
	{
		int[][] connectionMatrix = new int[][]{
			  { 0, 4, 0, 0,},
			  { 4, 0, 3, 1,},
			  { 0, 3, 0, 2,},
			  { 0, 1, 2, 0,},
			};
			
			return connectionMatrix;
	}
	
	public Hashtable<String, Integer> initMap()
	{
		Hashtable<String,Integer> vertices = new Hashtable<String,Integer>();
		vertices.put("Krakow", 0);
		vertices.put("Gdynia", 1);
		vertices.put("Ostrowiec", 2);
		vertices.put("Wroclaw", 3);
		return vertices;
	}
	
    @Test
    public void test_CTOR()
    {
        //act
    	IndirectedGraph<String,Integer> _network = new IndirectedGraph<>(initMatrix(),initMap());
        assertTrue(true);
    }
    
    @Test
    public void test_Contains()
    {
    	boolean expectedVal = true;
    	     
        //act
    	IndirectedGraph<String,Integer> _network = new IndirectedGraph<>(initMatrix(),initMap());
    	boolean reachedVal = _network.wierzcholki().contains("Krakow");
    	reachedVal &= _network.wierzcholki().contains("Gdynia");
    	reachedVal &= _network.wierzcholki().contains("Ostrowiec");
    	reachedVal &= _network.wierzcholki().contains("Wroclaw");
    	
        //assert
        boolean reachedLogic = reachedVal == expectedVal;
        boolean expectedLogic = true;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void test_Krawedzie()
    {    	     
        //act
    	IndirectedGraph<String,Integer> _network = new IndirectedGraph<>(initMatrix(),initMap());
    	List<String> reachedList = _network.krawedzie("Wroclaw");
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("Gdynia");
    	expectedList.add("Ostrowiec");
    	boolean reachedVal = reachedList.containsAll(expectedList);
    	boolean expectedVal = true;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedVal == expectedVal;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void test_Krawedz()
    {    	     
        //act
    	IndirectedGraph<String,Integer> _network = new IndirectedGraph<>(initMatrix(),initMap());
    	int reachedEdge = _network.krawedz("Wroclaw", "Gdynia");
    	int expectedEdge = 1;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge == expectedEdge;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
}
