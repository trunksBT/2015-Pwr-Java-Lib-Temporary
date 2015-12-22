package Bt.Tests.Core.Collections;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Hashtable;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import Bt.Core.Collections.Tuple;
//import junit.framework.TestCase;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//
//public class TestReduce extends TestCase {
//	
//	public Double[][] initMatrix()
//	{
//		Double[][] connectionMatrix = new Double[][]{
//			  { null, 4.0, null, null,},
//			  { 4.0, null, 3.0, 1.0,},
//			  { null, 3.0, null, 2.0,},
//			  { null, 1.0, 2.0, null,},
//			};
//			
//			return connectionMatrix;
//	}
////	
////	public List<W> Krawedzie(W aW) {
////		List<W> retVal = new LinkedList<>();
////		S lvl = null;
////		if(aW!=null && vertices!=null && matrix!= null)
////		{
////			
////			S[] connections = null;
////			lvl = (S) vertices.getOrDefault(aW, null);
////			
////			if(lvl != null)
////			{
////				connections = matrix[vertices.get(aW)];
////			
////				for(int i = 0 ; i< connections.length;i++)
////					if(connections[i]!=null)
////						for(Map.Entry<W, Integer> entry : vertices.entrySet())
////							if(entry.getValue().equals(i))
////								retVal.add(entry.getKey());
////			}
////		}		
////		return retVal;
////	}
//	
//	public Hashtable<String, Integer> initMapBigger()
//	{
//		Hashtable<String,Integer> vertices = new Hashtable<String,Integer>();
//		vertices.put("A", 0);
//		vertices.put("B", 1);
//		vertices.put("C", 2);
//		vertices.put("D", 3);
//		vertices.put("E", 4);
//		vertices.put("F", 5);
//		vertices.put("G", 6);
//		vertices.put("H", 7);
//		
//		return vertices;
//	}
//	
//	List<Person> persons = Arrays.asList(
//	    new Person("Max", 18),
//	    new Person("Peter", 23),
//	    new Person("Pamela", 23),
//	    new Person("David", 12));
//	  
//	LinkedList<String> vertices ()
//	{
//		LinkedList<String> _dirtyVertices = new LinkedList<>();
//		_dirtyVertices.add("D");
//		_dirtyVertices.add("B");
//		_dirtyVertices.add("F");
//		_dirtyVertices.add("C");
//		_dirtyVertices.add("E");
//		
//		return _dirtyVertices;
//	}
//	
//	  
//	LinkedList<Double> verticesWage ()
//	{
//		LinkedList<Double> _dirtyVertices = new LinkedList<>();
//		_dirtyVertices.add(1.0);
//		_dirtyVertices.add(1.0);
//		_dirtyVertices.add(1.0);
//		_dirtyVertices.add(1.0);
//		_dirtyVertices.add(1.0);
//		
//		return _dirtyVertices;
//	}
//	
////	Optional<Tuple<W, S>> theLowestWage = associations
////			.stream()
////			.map(vert -> new Tuple<W,S>(vert,_graf.Krawedz(curr,vert)))
////			.reduce((tup1,tup2) -> tup1.compareTo(tup2) < 0 ? tup1 : tup2 );
//	
////	  @Test
////	  public void test_FoldLeftWithAccInList()
////	  {
//////		  Double sumEnd = verticesWage().stream()
//////		    .reduce(1.0,
//////			        (sum, p) -> sum += p);
////		  
////		  List<Double> edges = verticesWage().stream().
////	                map(res -> resultToEdges(res)).
////	                reduce(
////	                		new LinkedList<Double>(), (list, res) -> 
////	                { 
////	                	list.addAll(res); 
////	                	return list; 
////	                });
////		  
////		  LinkedList<Double> idx = verticesWage().stream()
////				    .reduce(new LinkedList<Double>(),
////					        (sum, p) -> ((LinkedList<Double>)sum).add(p));
//		  
////		  Double sumEnd = verticesWage().stream()
////				    .reduce(0.0,
////					        (sum, p) -> sum += p);
////		  
////		Integer ageSum = persons
////			    .parallelStream()
////			    .reduce(0,
////			        (sum, p) -> {
////			            System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
////			            return sum += p.age;
////			        },
////			        (sum1, sum2) -> {
////			            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
////			            return sum1 + sum2;
////			        });
//
////	      //act
//////	      double reachedVal = retVal.get().value;
////		  double expected = 6.0;
////		  
////	      assertEquals(sumEnd,expected);
////	}
////	  
//////		
////		Optional<Tuple<W, S>> retVal = tupleOfVals.stream()
////			.reduce((tup1,tup2) -> tup1.compareTo(tup2) > 0 ? tup1 : tup2 );
//}
