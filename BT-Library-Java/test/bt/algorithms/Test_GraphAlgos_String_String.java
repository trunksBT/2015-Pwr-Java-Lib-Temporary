package bt.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.GraphAlgos;
import bt.algorithms.interfaces.IGraf;
import bt.algorithms.interfaces.IGraphAlgo;
import bt.collections.various.GraphIndirected;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Test_GraphAlgos_String_String extends TestCase{	
	public ArrayList<String> initList()
	{
		List<String> vertices = new ArrayList<String>();
		vertices.add("Anglia");
		vertices.add("Belgia");
		vertices.add("Czechy");
		vertices.add("Dania");
		vertices.add("Estonia");
		vertices.add("Francja");
		vertices.add("Grecja");
		vertices.add("Hiszpania");
		
		return (ArrayList<String>) vertices;
	}
	
	public String[][] initMatrix()
	{
		String[][] connectionMatrix = new String[][]{
			
			  /*A*/{ null,  "3.0", "2.0", null,  "5.0", null,  null,  "1.0", },
			  /*B*/{ "3.0", null,  null,  "1.0", null,  "1.0", "3.0", null,  },
			  /*C*/{ "2.0", null,  null,  null,  "1.0", "1.0", null,  null,  },
			  /*D*/{ null,  "1.0", null,  null,  null,  null,  "4.0", null,  },
			  /*E*/{ "5.0", null,  "1.0", null,  null,  null,  null,  "6.0", },
			  /*F*/{ null,  "1.0", "1.0", null,  null,  null,  null,  null,  },
			  /*G*/{ null,  "3.0", null,  "4.0", null,  null,  null,  "2.0," },
			  /*H*/{ "1.0", null,  null,  null,  "6.0", null,  "2.0", null,  },
			};
			
			return connectionMatrix;
	}
    
    @Test
    public void test_Krawedzie_A()
    {    	     
        //act
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	GraphAlgos<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Belgia";
    	
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("1.0");
    	boolean expectedLogic = true;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	
        // assert
        boolean reachedLogic = reachedList.containsAll(expectedList);
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Grecja()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Grecja";
    	
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("4.0");
    	boolean expectedVal = true;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Francja()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Francja";
    	
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	boolean expectedVal = true;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start, end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Anglia()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("1.0");
    	expectedList.add("3.0");
    	boolean expectedVal = true;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_TW_Dijkstra_Dania_NULL()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = null;
    	
    	List<String> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_WT_Dijkstra_NULL_Dania()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = null;
    	String end = "Dania";
    	
    	List<String> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Czechy()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Czechy";
    	
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	boolean expectedVal = true;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Estonia()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Estonia";
    	
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	boolean expectedVal = true;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_TT_Dijkstra_Dania_Hiszpania()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Hiszpania";
    	
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	expectedList.add("6.0");
    	boolean expectedVal = true;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
      
    @Test
    public void test_FT_Dijkstra_Polska_Estonia()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Polska";
    	String end = "Estonia";
    	
    	List<String> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_TF_Dijkstra_Dania_Rosja()
    {    	     
    	System.out.println( "compare String" );
    	System.out.println( "5.0".compareTo("1.0") );
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Dania";
    	String end = "Rosja";
    	
    	List<String> expectedList = new ArrayList<>();
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	expectedList.add("1.0");
    	expectedList.add("5.0");
    	expectedList.add("1.0");
    	expectedList.add("2.0");

    	boolean expectedVal = false;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_FF_Dijkstra_Wlochy_Rosja()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Wlochy";
    	String end = "Rosja";
    	
    	List<String> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_WF_Dijkstra_NULL_Rosja()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = null;
    	String end = "Rosja";
    	
    	List<String> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_FW_Dijkstra_Rosja_NULL()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = "Rosja";
    	String end = null;
    	
    	List<String> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
    
    @Test
    public void test_WW_Dijkstra_NULL_NULL()
    {    	     
    	// arrange 
    	IGraf<String,String> _network = new GraphIndirected<>(initList(),initMatrix());
    	IGraphAlgo<String,String> _walkAcross = new GraphAlgos<>(_network);
    	String start = null;
    	String end = null;
    	
    	List<String> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	
        // act	
    	List<String> reachedList = _walkAcross.dijkstrable(start,end);
    	boolean reachedVal = _walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(reachedLogic1&&result2);
    }
}
