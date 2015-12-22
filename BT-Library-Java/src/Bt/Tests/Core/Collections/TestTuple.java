package Bt.Tests.Core.Collections;

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
}