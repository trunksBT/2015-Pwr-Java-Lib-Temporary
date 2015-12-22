package Bt.Tests.Core.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Collections.SetNatural;
import Bt.Core.Collections.Tuple;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestTuple extends TestCase {
	
	  @Test
	  public void testCTOR_Lower_Higher()
	  {
	      //arrange
	      Tuple<String,Double> _tupA = new Tuple<>("Kot",3.0);
	      Tuple<String,Double> _tupB = new Tuple<>("Ala",4.0);
	      boolean expected = true;
	      
	      //act
	      int reachedVal = _tupA.compareTo(_tupB);
	      boolean reachedRelation = reachedVal < 0;
	      
	      //assert
	      assertTrue(reachedRelation);
	}
	  @Test
	  public void testCTOR_Higher_Lower()
	  {
	      //arrange
	      Tuple<String,Double> _tupA = new Tuple<>("Kot",4.0);
	      Tuple<String,Double> _tupB = new Tuple<>("Kot",3.0);
	      boolean expected = true;
	      
	      //act
	      int reachedVal = _tupA.compareTo(_tupB);
	      boolean reachedRelation = reachedVal > 0;
	      
	      //assert
	      assertTrue(reachedRelation);
	}
	  
	  
	  @Test
	  public void test_TheLowest()
	  {
	      //arrange
		List<Tuple<String,Double>> tupleOfVals = new LinkedList<>();
		tupleOfVals.add(new Tuple<>("Kot",1.0));
		tupleOfVals.add(new Tuple<>("Kot",4.0));
		tupleOfVals.add(new Tuple<>("Kot",3.0));
		tupleOfVals.add(new Tuple<>("Kot",7.0));
		tupleOfVals.add(new Tuple<>("Kot",0.0));
			      
		Optional<Tuple<String, Double>> retVal = tupleOfVals.stream()
			.reduce((tup1,tup2) -> tup1.compareTo(tup2) < 0 ? tup1 : tup2 );
	      
//	      //act
	      double reachedVal = retVal.get().value;
	      double expectedVal = 0.0;
	      
	      //assert
	      assertEquals(reachedVal,expectedVal);
	}
	  
//		
//		Optional<Tuple<W, S>> retVal = tupleOfVals.stream()
//			.reduce((tup1,tup2) -> tup1.compareTo(tup2) > 0 ? tup1 : tup2 );
}