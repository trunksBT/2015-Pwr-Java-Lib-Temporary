package Bt.Tests.Core.Reflections;

import java.lang.reflect.Field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Collections.SetNatural;
import Bt.Core.Geometry.Elementaries.Point;
import Bt.Core.Geometry.Elementaries.PointSecond;
import Bt.Core.Reflections.Debug;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Test_Reflections extends TestCase {

  @Test
  public void test_Fields()
  {
      //arrange
      PointSecond _a = new PointSecond(3,4);
      
      //act
//      Field[] fields = _a.getClass().getDeclaredFields();
      Debug.fields(_a);
//      Debug.fields2(_a);
      
      //assert
      assertTrue(true);
  }
}
