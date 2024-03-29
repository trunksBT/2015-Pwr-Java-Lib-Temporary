package bt.collections.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.interfaces.IGrafC07;
import bt.algorithms.interfaces.IKrawedz;
import bt.exceptions.EdgeContainsWrongVerticeException;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_GrafCwiczenia extends TestCase
{
	String wierzchA = "A";
	String wierzchB = "B";
	String wierzchC = "C";
	String wierzchNull = null;
	Double waga0 = new Double(0.0);
	Double waga1 = new Double(1.0);
	Double wagaNull = null;
	
	IKrawedz<String,Double> krawedzA_A = new Krawedz<>(
			wierzchA, wierzchA,  waga0);
	IKrawedz<String,Double> krawedzA_B = new Krawedz<>(
			wierzchA, wierzchB,  waga0);
	IKrawedz<String,Double> krawedzB_A = new Krawedz<>(
			wierzchB, wierzchA,  waga0);
	IKrawedz<String,Double> krawedzA_C= new Krawedz<>(
			wierzchA, wierzchC,  waga0);
	IKrawedz<String,Double> krawedzNull_Null = new Krawedz<>(
			wierzchNull, wierzchNull,  wagaNull);
	
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
		retVal.add(krawedzA_A);
		return retVal;
	}
	
	public List<String> TC2_wierzcholki()
	{
		ArrayList<String> retVal = new ArrayList<String>();
		retVal.add(wierzchA);
		return retVal;
	}
	
	public List<IKrawedz<String, Double>> TC3_krawedzie()
	{
		List<IKrawedz<String, Double>> retVal = new ArrayList<>();
		retVal.add(krawedzA_B);
		return retVal;
	}
	
	public List<String> TC3_wierzcholki()
	{
		ArrayList<String> retVal = new ArrayList<String>();
		retVal.add(wierzchA);
		retVal.add(wierzchB);
		return retVal;
	}
	
	public List<IKrawedz<String, Double>> TC4_krawedzie()
	{
		List<IKrawedz<String, Double>> retVal = new ArrayList<>();
		retVal.add(krawedzA_B);
		retVal.add(krawedzA_C);
		return retVal;
	}
	
	public List<String> TC4_wierzcholki()
	{
		ArrayList<String> retVal = new ArrayList<String>();
		retVal.add(wierzchA);
		retVal.add(wierzchB);
		retVal.add(wierzchC);
		return retVal;
	}
	
	public List<IKrawedz<String, Double>> TC5_krawedzie()
	{
		List<IKrawedz<String, Double>> retVal = new ArrayList<>();
		retVal.add(krawedzNull_Null);
		retVal.add(krawedzNull_Null);
		return retVal;
	}
	
	public List<String> TC5_wierzcholki()
	{
		ArrayList<String> retVal = new ArrayList<String>();
		retVal.add(wierzchNull);
		retVal.add(wierzchNull);
		retVal.add(wierzchNull);
		return retVal;
	}
	
	@Test
	public void test_SprawdzEqualsDlaKrawedzi()
	{
		Set<IKrawedz<String, Double>> retVal = new HashSet<>();
		retVal.add(krawedzA_B);
		retVal.add(krawedzB_A);
		retVal.add(krawedzA_C);
		
		Set<IKrawedz<String, Double>> retVal2 = new TreeSet<>();
		retVal2.add(krawedzA_B);
		retVal2.add(krawedzB_A);
		retVal2.add(krawedzA_C);
		
		System.out.println(retVal.size());
		System.out.println(retVal2.size());
	}
	
	@Test
	public void test_CTOR_GetOrDefault()
	{
	    //arrange	    
		Map<Integer, Set<String>>  temp = new HashMap<>();
		Set<String> tempSet = new TreeSet<>();
		tempSet.add(new String("3"));
		tempSet.add(new String("4"));
		
		temp.put(3, tempSet);
	    //act
	    
	    //assert                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		assertEquals(0, temp.getOrDefault(null, new TreeSet<>()).size());
		assertEquals(2, temp.getOrDefault(3, new TreeSet<>()).size());
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
		assertTrue(graf.krawedzie().containsAll(TC1_krawedzie())
				&& TC1_krawedzie().containsAll(graf.krawedzie()));
	}
	
	@Test
	public void test_TC2_CTOR_One_One()
	{
	    //arrange	    
		IGrafC07<String, Double> graf = new GrafNieskierowany<>(
				TC2_krawedzie(), TC2_wierzcholki());
		
	    //act
	    
	    //assert
		assertNotNull(graf);
		assertEquals(1, graf.wierzcholki().size());
		assertEquals(1, graf.krawedzie().size());
		assertTrue(graf.krawedzie().containsAll(TC2_krawedzie())
				&& TC2_krawedzie().containsAll(graf.krawedzie()));
	}
	
	@Test
	public void test_TC3_CTOR_One_Two()
	{
	    //arrange	    
		IGrafC07<String, Double> graf = new GrafNieskierowany<>(
				TC3_krawedzie(), TC3_wierzcholki());
		
	    //act
	    
	    //assert
		assertNotNull(graf);
		assertEquals(2, graf.wierzcholki().size());
		assertEquals(1, graf.krawedzie().size());
	}
	
	@Test
	public void test_TC4_CTOR_Two_Three()
	{
	    //arrange	    
		IGrafC07<String, Double> graf = new GrafNieskierowany<>(
				TC4_krawedzie(), TC4_wierzcholki());
		
	    //act
	    
	    //assert
		assertNotNull(graf);
		assertEquals(3, graf.wierzcholki().size());
		assertEquals(2, graf.krawedzie().size());
		assertTrue(graf.krawedzie(wierzchA).containsAll(TC4_krawedzie()));
		assertFalse(graf.krawedzie(wierzchB).containsAll(TC4_krawedzie()));
		assertTrue(graf.krawedzie().containsAll(TC4_krawedzie())
				&& TC4_krawedzie().containsAll(graf.krawedzie()));
	}
//	
	@Test
	public void test_TC5_CTOR_With_Null()
	{
	    //arrange	    
		try
		{
		IGrafC07<String, Double> graf = new GrafNieskierowany<>(
				TC5_krawedzie(), TC5_wierzcholki());
		}catch(EdgeContainsWrongVerticeException e)
		{
			assertTrue(true);
		}
	}
}