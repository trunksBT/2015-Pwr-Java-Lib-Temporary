package bt.collections.graphs;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.graph.GraphIndirected2;
import bt.algorithms.interfaces.IGraf;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Test_GraphIndirected2 extends TestCase{

	public Double[][] initMatrix()
	{
		Double[][] connectionMatrix = new Double[][]{
			/*K*/{ null, 4.0, null, null,},
			/*G*/ { 4.0, null, 3.0, 1.0,},
			/*O*/{ null, 3.0, null, 2.0,},
			/*W*/ { null, 1.0, 2.0, null,},
			};
			
			return connectionMatrix;
	}
	
	public ArrayList<String> initList()
	{
		List<String> vertices = new ArrayList<String>();
		vertices.add("Krakow");
		vertices.add("Gdynia");
		vertices.add("Ostrowiec");
		vertices.add("Wroclaw");
		
		return (ArrayList<String>) vertices;
	}	
	
    @Test
    public void test_CTOR_Good_Good()
    {
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
    	assertNotNull(true);
    }
    
    @Test
    public void test_CTOR_Null_Good()
    {
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(null,initMatrix());
    	assertNotNull(_network);
    }
    
    @Test
    public void test_CTOR_Good_Null()
    {
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),null);
    	assertNotNull(true);
    }
    
    @Test
    public void test_Contains_NullTableCtor()
    {
    	// arrange
    	int expectedSize = 0;
    	boolean expectedVal = false;
    	     
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(null,initMatrix());
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
    public void test_Contains_NullMatrixCtor()
    {
    	// arrange
    	int expectedSize = 4;
    	boolean expectedVal = true;
    	     
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),null);
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
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
    	boolean reachedVal = _network.Wierzcholki().contains(null);
    	
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
    public void test_Krawedzie_ErrorVal()
    {    	     
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
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
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
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
    
    @Test
    public void test_Krawedzie_Null()
    {    	     
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
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
    
    @Test
    public void test_Krawedzie_Wroclaw()
    {    	     
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
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
    	IGraf<String,Double> _network = new GraphIndirected2<>(null,initMatrix());
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
    public void test_Krawedzie_Wroclaw_NullMatrix()
    {    	     
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),null);
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
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
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
    
    @Test
    public void test_Krawedzie_Gdynia()
    {    	     
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
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
   
    @Test
    public void test_Krawedz_Wroclaw_Gdynia()
    {    	     
        //act
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
    	Double reachedEdge = _network.Krawedz("Wroclaw", "Gdynia");
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
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
    	Double reachedEdge = _network.Krawedz("Wroclaw", "Krakow");
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
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
    	Double reachedEdge = _network.Krawedz("Ostrowiec", "Gdynia");
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
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
    	Double reachedEdge = _network.Krawedz(null, "Gdynia");
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
    	IGraf<String,Double> _network = new GraphIndirected2<>(initList(),initMatrix());
    	Double reachedEdge = _network.Krawedz("Gdynia", null);
    	Double expectedEdge = null;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge == expectedEdge;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
}