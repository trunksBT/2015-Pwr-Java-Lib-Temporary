package bt.reflections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.geometry.elementaries.Point;
import bt.reflections.Debug;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Test_Reflections extends TestCase {

  @Test
  public void test_Fields()
  {
      //arrange
      Point a = new Point(3,4);
      
      //act
      Debug.fields(a);
      
      //assert
      assertTrue(true);
  }
  
  @Test
  public void test_Nill()
  {
      //arrange
	  Point a = new Point(3,4);
      
      //act
      Debug.fields(null);
      
      //assert
      assertTrue(true);
  }
}
