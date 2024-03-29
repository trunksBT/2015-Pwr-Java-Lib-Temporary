package bt.collections.graphs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;

import bt.algorithms.interfaces.IGrafC07;
import bt.algorithms.interfaces.IKrawedz;
import bt.algorithms.interfaces.IGraphComponents;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_GrafCwiczenia_SkladoweSpojne {
		String wierzchA = "A";
		String wierzchB = "B";
		String wierzchC = "C";
		String wierzchD= "D";
		String wierzchE= "E";
		String wierzchF= "F";
		String wierzchG= "G";
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
		IKrawedz<String,Double> krawedzB_C = new Krawedz<>(
				wierzchB, wierzchC,  waga0);
		IKrawedz<String,Double> krawedzB_F = new Krawedz<>(
				wierzchB, wierzchF,  waga0);
		IKrawedz<String,Double> krawedzD_E = new Krawedz<>(
				wierzchD, wierzchE,  waga0);
		IKrawedz<String,Double> krawedzNull_Null = new Krawedz<>(
				wierzchNull, wierzchNull,  wagaNull);
		
		public List<IKrawedz<String, Double>> TC1_krawedzie()
		{
			List<IKrawedz<String, Double>> retVal = new ArrayList<>();
			retVal.add(krawedzA_B);
			retVal.add(krawedzA_C);
			return retVal;
		}
		
		public List<String> TC1_wierzcholki()
		{
			ArrayList<String> retVal = new ArrayList<String>();
			retVal.add(wierzchA);
			retVal.add(wierzchB);
			retVal.add(wierzchC);
			return retVal;
		}
		
		public List<IKrawedz<String, Double>> TC2_krawedzie()
		{
			List<IKrawedz<String, Double>> retVal = new ArrayList<>();
			retVal.add(krawedzA_B);
			retVal.add(krawedzA_C);
			retVal.add(krawedzB_C);
			retVal.add(krawedzB_F);
			retVal.add(krawedzD_E);
			return retVal;
		}
		
		public List<String> TC2_wierzcholki()
		{
			ArrayList<String> retVal = new ArrayList<String>();
			retVal.add(wierzchA);
			retVal.add(wierzchB);
			retVal.add(wierzchC);
			retVal.add(wierzchD);
			retVal.add(wierzchE);
			retVal.add(wierzchF);
			return retVal;
		}
		
		public List<IKrawedz<String, Double>> TC3_krawedzie()
		{
			List<IKrawedz<String, Double>> retVal = new ArrayList<>();
			retVal.add(krawedzA_B);
			retVal.add(krawedzA_C);
			retVal.add(krawedzB_C);
			retVal.add(krawedzB_F);
			retVal.add(krawedzD_E);
			return retVal;
		}
		
		public List<String> TC3_wierzcholki()
		{
			ArrayList<String> retVal = new ArrayList<String>();
			retVal.add(wierzchA);
			retVal.add(wierzchB);
			retVal.add(wierzchC);
			retVal.add(wierzchD);
			retVal.add(wierzchE);
			retVal.add(wierzchF);
			retVal.add(wierzchG);
			return retVal;
		}
		
		public List<IKrawedz<String, Double>> TC4_krawedzie()
		{
			List<IKrawedz<String, Double>> retVal = new ArrayList<>();
			return retVal;
		}
		
		public List<String> TC4_wierzcholki()
		{
			ArrayList<String> retVal = new ArrayList<String>();
			retVal.add(wierzchA);
			retVal.add(wierzchB);
			retVal.add(wierzchC);
			retVal.add(wierzchD);
			retVal.add(wierzchE);
			retVal.add(wierzchF);
			retVal.add(wierzchG);
			return retVal;
		}
		
		@Test
		public void test_TC1_CTOR_OneConsistentGraph()
		{
		    //arrange	    
			IGrafC07<String, Double> graf = new GrafNieskierowany<>(
					TC1_krawedzie(), TC1_wierzcholki());
			
		    //act
			IGraphComponents<String, Double> algorytmyDoSkladowych = new GraphComponents(graf);
					
		    //assert
			assertNotNull(algorytmyDoSkladowych);
			assertEquals(1, algorytmyDoSkladowych.spojneSkladowe().size());
		}
		
		@Test
		public void test_TC2_CTOR_TwoSubGraphs()
		{
		    //arrange	    
			IGrafC07<String, Double> graf = new GrafNieskierowany<>(
					TC2_krawedzie(), TC2_wierzcholki());
			
		    //act
			IGraphComponents<String, Double> algorytmyDoSkladowych = new GraphComponents(graf);
					
		    //assert
			assertNotNull(algorytmyDoSkladowych);
			assertEquals(2, algorytmyDoSkladowych.spojneSkladowe().size());
		}

		@Test
		public void test_TC3_CTOR_ThreeSubGraphs()
		{
		    //arrange	    
			IGrafC07<String, Double> graf = new GrafNieskierowany<>(
					TC3_krawedzie(), TC3_wierzcholki());
			
		    //act
			IGraphComponents<String, Double> algorytmyDoSkladowych = new GraphComponents(graf);
					
		    //assert
			assertNotNull(algorytmyDoSkladowych);
			assertEquals(3, algorytmyDoSkladowych.spojneSkladowe().size());
			assertFalse(algorytmyDoSkladowych.czySaPolaczone(wierzchD, wierzchC));
			assertTrue(algorytmyDoSkladowych.czySaPolaczone(wierzchA, wierzchC));
		}
		
		@Test
		public void test_TC4_CTOR_NotConsistentGraph()
		{
		    //arrange	    
			IGrafC07<String, Double> graf = new GrafNieskierowany<>(
					TC4_krawedzie(), TC4_wierzcholki());
			
		    //act
			IGraphComponents<String, Double> algorytmyDoSkladowych = new GraphComponents(graf);
					
		    //assert
			assertNotNull(algorytmyDoSkladowych);
			assertEquals(7, algorytmyDoSkladowych.spojneSkladowe().size());
			assertFalse(algorytmyDoSkladowych.czySaPolaczone(wierzchD, wierzchC));
		}
}
