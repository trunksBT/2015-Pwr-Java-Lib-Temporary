package bt.collections.graphs;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.interfaces.IGrafC07;
import bt.algorithms.interfaces.IKrawedz;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_GrafCwiczenia extends TestCase
{
	String wierzchA = "A";
	Double waga1 = new Double(1.0);
	
	IKrawedz<String,Double> krawedzA_A = new Krawedz<>(
			wierzchA, wierzchA,  new Double(0));
	
	public List<IKrawedz<String, Double>> TC1_krawedzie()
	{
		List<IKrawedz<String, Double>> retVal = new ArrayList<>();
		return retVal;
	}
	
	public List<String> TC1_wierzcholki()
	{
		ArrayList<String> retVal = new ArrayList<String>();
		retVal.add(wierzchA);
		return retVal;
	}
	
	public List<IKrawedz<String, Double>> TC2_krawedzie()
	{
		List<IKrawedz<String, Double>> retVal = new ArrayList<>();
		retVal.add(new Krawedz<String, Double>(wierzchA, wierzchA, waga1));
		return retVal;
	}
	
	public List<String> TC2_wierzcholki()
	{
		ArrayList<String> retVal = new ArrayList<String>();
		retVal.add(wierzchA);
		return retVal;
	}
	
	@Test
	public void test_CTOR_Null_Null()
	{
	    //arrange	    
		IGrafC07<String, Double> graf = new GrafNieskierowany<>(null, null);
		
	    //act
	    
	    //assert
		assertNotNull(graf);
		assertEquals(0, graf.wierzcholki().size());
	}
	
	@Test
	public void test_TC1_CTOR_Zero_One()
	{
	    //arrange	    
		IGrafC07<String, Double> graf = new GrafNieskierowany<>(
				TC1_krawedzie(), TC1_wierzcholki());
		
	    //act
	    
	    //assert
		assertNotNull(graf);
		assertEquals(1, graf.wierzcholki().size());
		assertEquals(0, graf.krawedzie().size());
		assertEquals(null, graf.czyKrawedz(wierzchA, wierzchA));
	}
	
	@Test
	public void test_TC1_CTOR_One_One()
	{
	    //arrange	    
		IGrafC07<String, Double> graf = new GrafNieskierowany<>(
				TC2_krawedzie(), TC2_wierzcholki());
		
	    //act
	    
	    //assert
		assertNotNull(graf);
		assertEquals(1, graf.wierzcholki().size());
		assertEquals(1, graf.krawedzie().size());
		assertEquals(waga1, graf.czyKrawedz(wierzchA, wierzchA));
	}
	
//	@Test
//	public void test_TC1_CTOR_Empty()
//	{
//	    //arrange	    
//		IGrafC07<Double, String> graf = new GrafNieskierowany<>(TC1_krawedzie(), TC1_wierzcholki());
//	    //act
//	    
//	    //assert
//	}
}