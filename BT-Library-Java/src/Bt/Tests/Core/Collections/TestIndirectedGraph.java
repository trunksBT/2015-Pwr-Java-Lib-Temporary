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

	public Double[][] initMatrix()
	{
		Double[][] connectionMatrix = new Double[][]{
			  { null, 4.0, null, null,},
			  { 4.0, null, 3.0, 1.0,},
			  { null, 3.0, null, 2.0,},
			  { null, 1.0, 2.0, null,},
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
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<String,Double>(initMap(),initMatrix());
        assertTrue(true);
    }
    
    @Test
    public void test_Contains()
    {
    	// arrange
    	int expectedSize = 4;
    	boolean expectedVal = true;
    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	boolean reachedVal = _network.wierzcholki().contains("Krakow");
    	reachedVal &= _network.wierzcholki().contains("Gdynia");
    	reachedVal &= _network.wierzcholki().contains("Ostrowiec");
    	reachedVal &= _network.wierzcholki().contains("Wroclaw");
    	
    	int reachedSize = _network.wierzcholki().size();
	
        //assert
        boolean reachedLogic = reachedVal == expectedVal;
        boolean reachedLogic2 = reachedSize == expectedSize;
        boolean expectedLogic = true;
        boolean result = !(expectedLogic ^ (reachedLogic&&reachedLogic2));
        assertTrue(result);
    }
//    
    @Test
    public void test_Krawedzie_Krakow()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	List<String> reachedList = _network.krawedzie("Krakow");
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("Gdynia");
    	boolean reachedVal = reachedList.containsAll(expectedList);
    	boolean expectedVal = true;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedVal == expectedVal;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void test_Krawedzie_Wroclaw()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
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
    public void test_Krawedzie_Ostrowiec()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	List<String> reachedList = _network.krawedzie("Ostrowiec");
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("Gdynia");
    	expectedList.add("Wroclaw");
    	boolean reachedVal = reachedList.containsAll(expectedList);
    	boolean expectedVal = true;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedVal == expectedVal;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void test_Krawedzie_Gdynia()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	List<String> reachedList = _network.krawedzie("Gdynia");
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("Krakow");
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
    public void test_Krawedz_Wroclaw_Gdynia()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	Double reachedEdge = _network.krawedz("Wroclaw", "Gdynia");
    	Double expectedEdge = 1.0;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge.doubleValue() == expectedEdge.doubleValue();
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void test_Krawedz_Wroclaw_Krakow()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	Double reachedEdge = _network.krawedz("Wroclaw", "Krakow");
    	Double expectedEdge = null;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge == expectedEdge;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void test_Krawedz_Ostrowiec_Gdynia()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	Double reachedEdge = _network.krawedz("Ostrowiec", "Gdynia");
    	Double expectedEdge = 3.0;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge.doubleValue() == expectedEdge.doubleValue();
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
}
