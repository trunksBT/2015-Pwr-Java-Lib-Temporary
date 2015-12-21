package Bt.Tests.Core.Collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

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
    public void test_CTOR_Good_Good()
    {
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<String,Double>(initMap(),initMatrix());
        assertTrue(true);
    }
    
    @Test
    public void test_CTOR_Null_Good()
    {
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<String,Double>(null,initMatrix());
        assertTrue(true);
    }
    
    @Test
    public void test_CTOR_Good_Null()
    {
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<String,Double>(initMap(),null);
        assertTrue(true);
    }
    
    @Test
    public void test_Contains_NullTableCtor()
    {
    	// arrange
    	int expectedSize = 0;
    	boolean expectedVal = false;
    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(null,initMatrix());
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
    
    @Test
    public void test_Contains_NullMatrixCtor()
    {
    	// arrange
    	int expectedSize = 4;
    	boolean expectedVal = true;
    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),null);
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
    
    @Test
    public void test_Contains_null()
    {
    	// arrange
    	int expectedSize = 4;
    	boolean expectedVal = false;
    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	boolean reachedVal = _network.wierzcholki().contains(null);
    	
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
    public void test_Krawedzie_Null()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	List<String> reachedList = _network.krawedzie(null);
    	List<String> expectedList = new ArrayList<>();
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
    public void test_Krawedzie_Wroclaw_NullMap()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(null,initMatrix());
    	List<String> reachedList = _network.krawedzie("Wroclaw");
    	List<String> expectedList = new ArrayList<>();
    	boolean reachedVal = reachedList.containsAll(expectedList);
    	boolean expectedVal = true;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedVal == expectedVal;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void test_Krawedzie_Wroclaw_NullMatrix()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),null);
    	List<String> reachedList = _network.krawedzie("Wroclaw");
    	List<String> expectedList = new ArrayList<>();
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
    
    @Test
    public void test_Krawedz_Null_Gdynia()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	Double reachedEdge = _network.krawedz(null, "Gdynia");
    	Double expectedEdge = null;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge == expectedEdge;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void test_Krawedz_Gdynia_Null()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	Double reachedEdge = _network.krawedz("Gdynia", null);
    	Double expectedEdge = null;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge == expectedEdge;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
}
