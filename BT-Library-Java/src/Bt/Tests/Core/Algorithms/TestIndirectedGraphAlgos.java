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
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestIndirectedGraphAlgos extends TestCase{

	
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
			
			  /*A*/{ null, 3.0,  3.0, null,  5.0, null, null,  1.0, },
			  /*B*/{ 3.0, null, null,  1.0, null,  1.0,  3.0, null, },
			  /*C*/{ 3.0, null, null, null,  1.0,  1.0, null, null, },
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
    	IndirectedGraph<String,Double> _network = new IndirectedGraph<>(initMap(),initMatrix());
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
    public void test_Dijkstra_Dania_Belgia()
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
    public void test_Dijkstra_Dania_Grecja()
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
    public void test_Dijkstra_Dania_Francja()
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