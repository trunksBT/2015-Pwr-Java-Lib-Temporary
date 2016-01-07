package Bt.Tests.Core.Collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Collections.IndirectedGraph;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestIndirectedGraphWithListCTOR extends TestCase{

	public ArrayList<String> initList()
	{
		List<String> vertices = new ArrayList<String>();
		vertices.add("Krakow");
		vertices.add("Gdynia");
		vertices.add("Ostrowiec");
		vertices.add("Wroclaw");
		
		return (ArrayList<String>) vertices;
	}   
	
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

	
    @Test
    public void test_CTOR_Good_Good()
    {
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<String,Double>(initList(),initMatrix(),true);
        assertTrue(true);
    }
    
    @Test
    public void test_CTOR_Null_Good()
    {
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<String,Double>(null,initMatrix(),true);
        assertTrue(true);
    }
//    
    @Test
    public void test_CTOR_Good_Null()
    {
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<String,Double>(initList(),null,true);
        assertTrue(true);
    }
//    
    @Test
    public void test_Contains_NullTableCtor()
    {
    	// arrange
    	int expectedSize = 0;
    	boolean expectedVal = false;
    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(null,initMatrix(),true);
    	boolean reachedVal = _network.Wierzcholki().contains("Krakow");
    	reachedVal &= _network.Wierzcholki().contains("Gdynia");
    	reachedVal &= _network.Wierzcholki().contains("Ostrowiec");
    	reachedVal &= _network.Wierzcholki().contains("Wroclaw");
    	
    	int reachedSize = _network.Wierzcholki().size();
	
        //assert
        boolean reachedLogic = reachedVal == expectedVal;
        boolean reachedLogic2 = reachedSize == expectedSize;
        boolean expectedLogic = true;
        boolean result = !(expectedLogic ^ (reachedLogic&&reachedLogic2));
        assertTrue(result);
    }
//    
    @Test
    public void test_Contains_NullMatrixCtor()
    {
    	// arrange
    	int expectedSize = 4;
    	boolean expectedVal = true;
    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),null,true);
    	boolean reachedVal = _network.Wierzcholki().contains("Krakow");
    	reachedVal &= _network.Wierzcholki().contains("Gdynia");
    	reachedVal &= _network.Wierzcholki().contains("Ostrowiec");
    	reachedVal &= _network.Wierzcholki().contains("Wroclaw");
    	
    	int reachedSize = _network.Wierzcholki().size();
	
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
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	boolean reachedVal = _network.Wierzcholki().contains(null);
    	
    	int reachedSize = _network.Wierzcholki().size();
	
        //assert
        boolean reachedLogic = reachedVal == expectedVal;
        boolean reachedLogic2 = reachedSize == expectedSize;
        boolean expectedLogic = true;
        boolean result = !(expectedLogic ^ (reachedLogic&&reachedLogic2));
        assertTrue(result);
    }
    
    
    @Test
    public void test_Krawedzie_ErrorVal()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	List<String> reachedList = _network.Krawedzie("Ala");
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
    public void test_Krawedzie_Krakow()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	List<String> reachedList = _network.Krawedzie("Krakow");
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
//    
    @Test
    public void test_Krawedzie_Null()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	List<String> reachedList = _network.Krawedzie(null);
    	List<String> expectedList = new ArrayList<>();
    	boolean reachedVal = reachedList.containsAll(expectedList);
    	boolean expectedVal = true;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedVal == expectedVal;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
//    
    @Test
    public void test_Krawedzie_Wroclaw()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	List<String> reachedList = _network.Krawedzie("Wroclaw");
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
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(null,initMatrix(),true);
    	List<String> reachedList = _network.Krawedzie("Wroclaw");
    	List<String> expectedList = new ArrayList<>();
    	boolean reachedVal = reachedList.containsAll(expectedList);
    	boolean expectedVal = true;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedVal == expectedVal;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
//    
    @Test
    public void test_Krawedzie_Wroclaw_NullMatrix()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(null,initMatrix(),true);
    	List<String> reachedList = _network.Krawedzie("Wroclaw");
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
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	List<String> reachedList = _network.Krawedzie("Ostrowiec");
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
//    
    @Test
    public void test_Krawedzie_Gdynia()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	List<String> reachedList = _network.Krawedzie("Gdynia");
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
//   
    @Test
    public void test_Krawedz_Wroclaw_Gdynia()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	Double reachedEdge = _network.Krawedz("Wroclaw", "Gdynia");
    	Double expectedEdge = 1.0;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge.doubleValue() == expectedEdge.doubleValue();
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
//    
    @Test
    public void test_Krawedz_Wroclaw_Krakow()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	Double reachedEdge = _network.Krawedz("Wroclaw", "Krakow");
    	Double expectedEdge = null;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge == expectedEdge;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
//    
    @Test
    public void test_Krawedz_Ostrowiec_Gdynia()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	Double reachedEdge = _network.Krawedz("Ostrowiec", "Gdynia");
    	Double expectedEdge = 3.0;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge.doubleValue() == expectedEdge.doubleValue();
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
//    
    @Test
    public void test_Krawedz_Null_Gdynia()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	Double reachedEdge = _network.Krawedz(null, "Gdynia");
    	Double expectedEdge = null;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge == expectedEdge;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
//    
    @Test
    public void test_Krawedz_Gdynia_Null()
    {    	     
        //act
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initList(),initMatrix(),true);
    	Double reachedEdge = _network.Krawedz("Gdynia", null);
    	Double expectedEdge = null;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge == expectedEdge;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
}

//public ArrayList<String> initListBigger()
//{
//	List<String> vertices = new ArrayList<String>();
//	vertices.add("Krakow");
//	vertices.add("B");
//	vertices.add("C");
//	vertices.add("D");
//	vertices.add("E");
//	vertices.add("F");
//	vertices.add("G");
//	vertices.add("H");
//	
//	return (ArrayList<String>) vertices;
//}

//public Double[][] initMatrixBigger()
//{
//	Double[][] connectionMatrix = new Double[][]{
//		
//		  /*A*/{ null, 3.0,  3.0, null,  5.0, null, null,  1.0, },
//		  /*B*/{ 3.0, null, null,  1.0, null,  1.0,  3.0, null, },
//		  /*C*/{ 3.0, null, null, null,  1.0,  1.0, null, null, },
//		  /*D*/{ null, 1.0, null, null, null, null,  4.0, null, },
//		  /*E*/{ 5.0, null,  1.0, null, null, null, null,  6.0, },
//		  /*F*/{ null, 1.0,  1.0, null, null, null, null, null, },
//		  /*G*/{ null, 3.0, null,  4.0, null, null, null,  2.0, },
//		  /*H*/{ 1.0, null, null, null,  6.0, null,  2.0, null, },
//		};
//		
//		return connectionMatrix;
//}
//
//public Hashtable<String, Integer> initMap()
//{
//	Hashtable<String,Integer> vertices = new Hashtable<String,Integer>();
//	vertices.put("Krakow", 0);
//	vertices.put("Gdynia", 1);
//	vertices.put("Ostrowiec", 2);
//	vertices.put("Wroclaw", 3);
//	return vertices;
//}
