package Bt.Tests.Core.Algorithms;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Algorithms.GraphAlgos;
import Bt.Core.Algorithms.IGraphAlgo;
import Bt.Core.Collections.IndirectedGraph;
import Bt.Core.Collections.Interfaces.IGraf;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Test_GraphAlgos_String_Double extends TestCase{

	
	public Hashtable<String, Integer> initMap()
	{
		Hashtable<String,Integer> vertices = new Hashtable<String,Integer>();
		vertices.put("Anglia", 0); // Anglia
		vertices.put("Belgia", 1); // Belgia
		vertices.put("Czechy", 2); // Czechy
		vertices.put("Dania", 3); // Dania
		vertices.put("Estonia", 4); // Estonia
		vertices.put("Francja", 5); // Francja
		vertices.put("Grecja", 6); // Grecja
		vertices.put("Hiszpania", 7); // Hiszpania
		
		return vertices;
	}
	
	public Double[][] initMatrix()
	{
		Double[][] connectionMatrix = new Double[][]{
			
			  /*A*/{ null, 3.0,  2.0, null,  5.0, null, null,  1.0, },
			  /*B*/{ 3.0, null, null,  1.0, null,  1.0,  3.0, null, },
			  /*C*/{ 2.0, null, null, null,  1.0,  1.0, null, null, },
			  /*D*/{ null, 1.0, null, null, null, null,  4.0, null, },
			  /*E*/{ 5.0, null,  1.0, null, null, null, null,  6.0, },
			  /*F*/{ null, 1.0,  1.0, null, null, null, null, null, },
			  /*G*/{ null, 3.0, null,  4.0, null, null, null,  2.0, },
			  /*H*/{ 1.0, null, null, null,  6.0, null,  2.0, null, },
			};
			
			return connectionMatrix;
	}
    
    @Test
    public void test_Krawedzie_A()
    {    	     
        //act
    	IGraf<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	List<String> reachedList = _network.Krawedzie("Anglia");
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("Belgia");
    	expectedList.add("Czechy");
    	expectedList.add("Estonia");
    	expectedList.add("Hiszpania");
    	
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
    public void test_TT_Dijkstra_Dania_Belgia()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	GraphAlgos<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Belgia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	boolean expectedVal = true;
    	boolean expectedLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	
        // assert
        boolean reachedLogic = reachedList.containsAll(expectedList) == expectedVal;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Grecja()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Grecja";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(4.0);
    	boolean expectedVal = true;
    	boolean expectedListLogic = true;
    	
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
//        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Francja()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Francja";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	boolean expectedVal = true;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start, end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Anglia()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	expectedList.add(3.0);
    	boolean expectedVal = true;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Anglia_GrammarNull()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(null);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Anglia_MapNull()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(null,initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Anglia_MatrixNull()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),null);
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Anglia_MatrixNull_MapNull()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(null,null);
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_TW_Dijkstra_Dania_NULL()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = null;
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_WT_Dijkstra_Dania_NULL()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = null;
    	String end = "Dania";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_WT_Dijkstra_Dania_NULL_NullGrammar()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(null);
    	String start = null;
    	String end = "Dania";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Czechy()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Czechy";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	boolean expectedVal = true;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    

    
    @Test
    public void test_TT_Dijkstra_Dania_Estonia()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Estonia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	boolean expectedVal = true;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Hiszpania()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Hiszpania";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	expectedList.add(6.0);
    	boolean expectedVal = true;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
      
    @Test
    public void test_FT_Dijkstra_Polska_Estonia()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Polska";
    	String end = "Estonia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_TF_Dijkstra_Dania_Rosja()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Rosja";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	expectedList.add(5.0);
    	expectedList.add(1.0);
    	expectedList.add(2.0);

    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_FF_Dijkstra_Wlochy_Rosja()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Wlochy";
    	String end = "Rosja";
    	
    	List<Double> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_WF_Dijkstra_NULL_Rosja()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = null;
    	String end = "Rosja";
    	
    	List<Double> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_FW_Dijkstra_Rosja_NULL()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Rosja";
    	String end = null;
    	
    	List<Double> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void test_WW_Dijkstra_NULL_NULL()
    {    	     
    	// arrange 
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
    	IGraphAlgo<String,Double> _walkAcross = new GraphAlgos<>(_network);
    	String start = null;
    	String end = null;
    	
    	List<Double> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = _walkAcross.dijkstra(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
}