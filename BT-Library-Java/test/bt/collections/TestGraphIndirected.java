package bt.collections;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.various.GraphIndirected;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestGraphIndirected extends TestCase{

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
    	GraphIndirected<String,Double> _network = new GraphIndirected<String,Double>(initList(),initMatrix());
        assertTrue(true);
    }
    
    @Test
    public void test_CTOR_Null_Good()
    {
        //act
    	GraphIndirected<String,Double> _network = new GraphIndirected<String,Double>(null,initMatrix());
        assertTrue(true);
    }
    
    @Test
    public void test_CTOR_Good_Null()
    {
        //act
    	GraphIndirected<String,Double> _network = new GraphIndirected<String,Double>(initList(),null);
        assertTrue(true);
    }
    
    @Test
    public void test_Contains_NullTableCtor()
    {
    	// arrange
    	int expectedSize = 0;
    	boolean expectedVal = false;
    	     
        //act
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(null,initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),null);
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(null,initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),null);
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
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
    	GraphIndirected<String,Double> _network = new GraphIndirected<>(initList(),initMatrix());
    	Double reachedEdge = _network.Krawedz("Gdynia", null);
    	Double expectedEdge = null;
    	boolean expectedLogic = true;
    	
        //assert
        boolean reachedLogic = reachedEdge == expectedEdge;
        boolean result = !(expectedLogic ^ reachedLogic);
        assertTrue(result);
    }
}
