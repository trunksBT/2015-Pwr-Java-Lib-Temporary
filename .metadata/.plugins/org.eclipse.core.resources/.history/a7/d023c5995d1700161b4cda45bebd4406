package bt.core.wrox.algosFromBegg;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.elems.Tuple;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAssertEqualsAndSame {
	
		@Test
		public void test_assertSame_Aliasing_True()
		{
			//arrange
			Tuple<String,Double> _tupA = new Tuple<>("Kot",3.0);
			Tuple<String,Double> _tupB = _tupA;
	      
			//act
	      
			//assert
			assertSame(_tupA,_tupB);
		}
		
		  @Test
		  public void test_assertSame_DifferentObj_False()
		  {
		      //arrange
		      Tuple<String,Double> _tupA = new Tuple<>("Kot",3.0);
		      Tuple<String,Double> _tupB = new Tuple<>("Kot",3.0);
		      
		      //act
		      
		      //assert
		      assertNotSame(_tupA,_tupB);
		  }
		  
		  @Test
		  public void test_assertEquals_DifferentObj_True()
		  {
		      //arrange
		      Tuple<String,Double> _tupA = new Tuple<>("Kot",3.0);
		      Tuple<String,Double> _tupB = new Tuple<>("Kot",3.0);
		      
		      //act
		      
		      //assert
		      assertEquals(_tupA,_tupB);
		  }
}
