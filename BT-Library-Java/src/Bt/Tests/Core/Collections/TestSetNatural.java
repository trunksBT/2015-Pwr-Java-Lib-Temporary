package Bt.Tests.Core.Collections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Collections.SetNatural;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestSetNatural extends TestCase {

  @Test
  public void testEmptyCTORandCTOR()
  {
      //arrange
      SetNatural _setA = new SetNatural();
      SetNatural _setB = new SetNatural();
      boolean expected = true;
      
      //act
      boolean reached = _setA.equals(_setB);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void testUnrepetiveCTORandUnsequence1()
  {
      //arrange
      SetNatural _setA = new SetNatural(234);
      SetNatural _setB = new SetNatural(432);
      boolean expected = true;
      
      //act
      boolean reached = _setA.equals(_setB);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void testUnrepetiveCTORandUnsequence2()
  {
      //arrange
      SetNatural _setA = new SetNatural(234);
      SetNatural _setB = new SetNatural(234);
      boolean expected = true;
      
      //act
      boolean reached = _setA.equals(_setB);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
//  @Test
//  public void testAddUnrepetitedValue()
//  {
//      //arrange
//      SetNatural _setA = new SetNatural(21);
//      SetNatural _setB = new SetNatural(214);
//      int val = 4;
//      boolean expectedLogic = true;
//      
//      //act
//      _setA.Add(val);
//      boolean reachedLogic = _setA.equals(_setB);
//      
//      //assert
//      boolean resultLogic = !(expectedLogic ^ reachedLogic);
//      assertTrue(resultLogic);
//  }
  
//  @Test
//  public void testAddUnrepetitedValue()
//  {
//      //arrange
//      SetNatural _setA = new SetNatural(21);
//      SetNatural _setB = new SetNatural(214);
//      int val = 4;
//      boolean expectedLogic = true;
//      
//      //act
//      _setA.Add(val);
//      boolean reachedLogic = _setA.equals(_setB);
//      
//      //assert
//      boolean resultLogic = !(expectedLogic ^ reachedLogic);
//      assertTrue(resultLogic);
//  }
	
//    @Test
//    public void testEqualsSetsTheSameTrue()
//    {
//        //arrange
//        SetNatural _setA = new SetNatural(21);
//        SetNatural _setB = new SetNatural(21);
//        boolean expected = true;
//        
//        //act
//        boolean reached = _setA.equals(_setB);
//        
//        //assert
//        boolean result = !(expected ^ reached);
//        assertTrue(result);
//    }//TODO
    
//    @Test
//    public void testEqualsQueuesTheSameFalse()
//    {
//        //arrange
//        SetNatural _setA = new SetNatural(21);
//        SetNatural _setB = new SetNatural(23);
//        boolean expected = false;
//        
//        //act
//        boolean reached = _setA.equals(_setB);
//        
//        //assert
//        boolean result = !(expected ^ reached);
//        assertTrue(result);
//    }//TODO
    
//    @Test
//    public void testRemoveTrue()
//    {
//        //arrange
//        SetNatural _setA = new SetNatural(21);
//        SetNatural _setB = new SetNatural(2);
//        int element = 2;
//        boolean expectLogic = true;
//        boolean expectedAfter = true;
//        
//        //act
//        boolean reachedLogic = _setA.Remove(element);
//        boolean reachedAfter = _setA.equals(_setB);
//        
//        //assert
//        boolean resultLogic = !(reachedLogic ^ expectLogic);
//        boolean resultAfter = !(expectedAfter ^ reachedAfter);
//        assertTrue(resultLogic);
//        assertTrue(resultAfter);
//    }//TODO
//    
//    @Test
//    public void testRemoveFalse1()
//    {
//        //arrange
//        SetNatural _setA = new SetNatural(21);
//        SetNatural _setB = new SetNatural(21);
//        int element = 1;
//        boolean expectLogic = true;
//        boolean expectedAfter = false;
//        
//        //act
//        boolean reachedLogic = _setA.Remove(element);
//        boolean reachedAfter = _setA.equals(_setB);
//        
//        //assert
//        boolean resultLogic = !(reachedLogic ^ expectLogic);
//        boolean resultAfter = !(expectedAfter ^ reachedAfter);
//        assertTrue(resultLogic);
//        assertTrue(resultAfter);
//    }//TODO
    
//    @Test
//    public void testRemoveFalse2()
//    {
//        //arrange
//        SetNatural _setA = new SetNatural(21);
//        SetNatural _setB = new SetNatural(21);
//        int element = 3;
//        boolean expectLogic = false;
//        boolean expectedAfter = true;
//        
//        //act
//        boolean reachedLogic = _setA.Remove(element);
//        boolean reachedAfter = _setA.equals(_setB);
//        
//        //assert
//        boolean resultLogic = !(reachedLogic ^ expectLogic);
//        boolean resultAfter = !(expectedAfter ^ reachedAfter);
//        assertTrue(resultLogic);
//        assertTrue(resultAfter);
//    }//TODO
    

    
//    @Test
//    public void testAddFalse1()
//    {
//        //arrange
//        SetNatural _setA = new SetNatural(21);
//        SetNatural _setB = new SetNatural(21);
//        int val = 2;
//        boolean expectedLogic = false;
//        boolean expectedAfter = true;
//        
//        //act
//        boolean reachedLogic = _setA.add(val);
//        boolean reachedAfter = _setA.equals(_setB);
//        
//        //assert
//        boolean resultLogic = !(expectedLogic ^ reachedLogic);
//        boolean resultAfter = !(expectedAfter ^ reachedAfter);
//        assertTrue(resultAfter);
//        assertTrue(resultLogic);
//    }//TODO
}
