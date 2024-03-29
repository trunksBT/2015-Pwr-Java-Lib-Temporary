package bt.algorithms.graphs;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.GraphAlgos;
import bt.algorithms.graph.GraphIndirected2;
import bt.algorithms.interfaces.IGraf;
import bt.algorithms.interfaces.IGraphAlgo;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Test_GraphAlgos_String_Double_2 extends TestCase{
	
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
    public void testKrawedzieA()
    {    	     
        //act
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	List<String> reachedList = network.Krawedzie("Anglia");
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
    public void testTTDijkstraDaniaBelgia()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	GraphAlgos<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Dania";
    	String end = "Belgia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	boolean expectedVal = true;
    	boolean expectedLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	
        // assert
        boolean reachedLogic = reachedList.containsAll(expectedList) == expectedVal;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
    
    @Test
    public void testTTDijkstraDaniaGrecja()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Dania";
    	String end = "Grecja";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(4.0);
    	boolean expectedVal = true;
    	boolean expectedListLogic = true;
    	
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
//        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testTTDijkstraDaniaFrancja()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Dania";
    	String end = "Francja";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	boolean expectedVal = true;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start, end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testTTDijkstraDaniaAnglia()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	expectedList.add(3.0);
    	boolean expectedVal = true;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testTTDijkstraDaniaAngliaGrammarNull()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(null);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testTTDijkstraDaniaAngliaMapNull()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(null,initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testTTDijkstraDaniaAngliaMatrixNull()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),null);
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testTTDijkstraDaniaAngliaMatrixNullMapNull()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(null,null);
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Dania";
    	String end = "Anglia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testTWDijkstraDaniaNULL()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Dania";
    	String end = null;
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testWTDijkstraDaniaNULL()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = null;
    	String end = "Dania";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testWTDijkstraDaniaNULLNullGrammar()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(null);
    	String start = null;
    	String end = "Dania";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testTTDijkstraDaniaCzechy()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Dania";
    	String end = "Czechy";
    	
    	List<Double> expectedList = new ArrayList<>();
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	expectedList.add(1.0);
    	boolean expectedVal = true;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    

    
    @Test
    public void testTTDijkstraDaniaEstonia()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
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
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testTTDijkstraDaniaHiszpania()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
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
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
      
    @Test
    public void testFTDijkstraPolskaEstonia()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Polska";
    	String end = "Estonia";
    	
    	List<Double> expectedList = new ArrayList<>();
    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testTFDijkstraDaniaRosja()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
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
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testFFDijkstraWlochyRosja()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Wlochy";
    	String end = "Rosja";
    	
    	List<Double> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testWFDijkstraNULLRosja()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = null;
    	String end = "Rosja";
    	
    	List<Double> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testFWDijkstraRosjaNULL()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = "Rosja";
    	String end = null;
    	
    	List<Double> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
    
    @Test
    public void testWWDijkstraNULLNULL()
    {    	     
    	// arrange 
    	IGraf<String,Double> network = new GraphIndirected2<>(initList(),initMatrix());
    	IGraphAlgo<String,Double> walkAcross = new GraphAlgos<>(network);
    	String start = null;
    	String end = null;
    	
    	List<Double> expectedList = new ArrayList<>();

    	boolean expectedVal = false;
    	boolean expectedListLogic = true;
    	
        // act	
    	List<Double> reachedList = walkAcross.dijkstrable(start,end);
    	boolean reachedVal = walkAcross.ifConnected(start, end);
    	
        // assert
        boolean reachedLogic1 = reachedList.containsAll(expectedList) == expectedListLogic;
        boolean reachedLogic2 = expectedVal && reachedVal;
        boolean result1= !(expectedListLogic ^ reachedLogic1);
        boolean result2= !(expectedVal ^ reachedVal);
        assertTrue(result1&&result2);
    }
}