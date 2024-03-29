package bt.collections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.various.SetNatural;
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
  public void testUnrepetiveCTORandSequence()
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
      SetNatural _setB = new SetNatural(423);
      boolean expected = true;
      
      //act
      boolean reached = _setA.equals(_setB);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void testAddUnrepetitedValue1()
  {
      //arrange
      SetNatural _setA = new SetNatural(21);
      SetNatural _setB = new SetNatural(214);
      int val = 4;
      boolean expectedLogic = true;
      boolean expectedResult = true;
      
      
      //act
      boolean reachedResult = _setA.add(val);
      boolean reachedLogic = _setA.equals(_setB);
      
      //assert
      boolean resultLogic = !(expectedLogic ^ reachedLogic);
      boolean result = !(expectedResult ^ reachedResult);
      assertTrue(resultLogic);
      assertTrue(result);
  }
  
  @Test
  public void testAddUnrepetitedValue2()
  {
      //arrange
      SetNatural _setA = new SetNatural(21);
      SetNatural _setB = new SetNatural(421);
      int val = 4;
      boolean expectedLogic = true;
      boolean expectedResult = true;
      
      
      //act
      boolean reachedResult = _setA.add(val);
      boolean reachedLogic = _setA.equals(_setB);
      
      //assert
      boolean resultLogic = !(expectedLogic ^ reachedLogic);
      boolean result = !(expectedResult ^ reachedResult);
      assertTrue(resultLogic);
      assertTrue(result);
  }
  
  @Test
  public void testAddRepetitedValue()
  {
      //arrange
      SetNatural _setA = new SetNatural(21);
      SetNatural _setB = new SetNatural(21);
      int val = 1;
      boolean expectedLogic = true;
      boolean expectedResult = false;
      
      //act
      boolean reachedResult = _setA.add(val);
      boolean reachedLogic = _setA.equals(_setB);
      
      //assert
      boolean resultLogic = !(expectedLogic ^ reachedLogic);
      boolean result = !(expectedResult ^ reachedResult);
      assertTrue(resultLogic);
      assertTrue(result);
  }
  
  	@Test
  	public void testAddToEmpty()
  	{
	    //arrange
	    SetNatural _setA = new SetNatural();
	    SetNatural _setB = new SetNatural(1);
	    int val = 1;
	    boolean expectedLogic = true;
	    boolean expectedResult = true;
	    
	    //act
	    boolean reachedResult = _setA.add(val);
	    boolean reachedLogic = _setA.equals(_setB);
	    
	    //assert
	    boolean resultLogic = !(expectedLogic ^ reachedLogic);
	    boolean result = !(expectedResult ^ reachedResult);
	    assertTrue(resultLogic);
	    assertTrue(result);
  	}
  
  	@Test
  	public void testRemoveFromEmpty()
  	{
	    //arrange
	    SetNatural _setA = new SetNatural();
	    SetNatural _setB = new SetNatural();
	    int val = 1;
	    boolean expectedLogic = true;
	    boolean expectedResult = false;
	    
	    //act
	    boolean reachedResult = _setA.remove(val);
	    boolean reachedLogic = _setA.equals(_setB);
	    
	    //assert
	    boolean resultLogic = !(expectedLogic ^ reachedLogic);
	    boolean result = !(expectedResult ^ reachedResult);
	    assertTrue(resultLogic);
	    assertTrue(result);
  	}
    @Test
    public void testRemoveOnesOccurenceTrue1()
    {
        //arrange
        SetNatural _setA = new SetNatural(21);
        SetNatural _setB = new SetNatural(2);
        int element = 2;
        boolean expectLogic = true;
        boolean expectedAfter = true;
        
        //act
        boolean reachedLogic = _setA.remove(element);
        boolean reachedAfter = _setA.equals(_setB);
        
        //assert
        boolean resultLogic = !(reachedLogic ^ expectLogic);
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(resultLogic);
        assertTrue(resultAfter);
    }//TODO
//    
    @Test
    public void testRemoveMultiOccurenceTrue1()
    {
        //arrange
        SetNatural _setA = new SetNatural(1232321);
        SetNatural _setB = new SetNatural(21);
        int element = 3;
        boolean expectLogic = true;
        boolean expectedAfter = true;
        
        //act
        boolean reachedLogic = _setA.remove(element);
        boolean reachedAfter = _setA.equals(_setB);
        
        //assert
        boolean resultLogic = !(reachedLogic ^ expectLogic);
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(resultLogic);
        assertTrue(resultAfter);
    }
    
    @Test
    public void testRemoveFalse2()
    {
        //arrange
        SetNatural _setA = new SetNatural(1232321);
        SetNatural _setB = new SetNatural(1232321);
        int element = 5;
        boolean expectLogic = false;
        boolean expectedAfter = true;
        
        //act
        boolean reachedLogic = _setA.remove(element);
        boolean reachedAfter = _setA.equals(_setB);
        
        //assert
        boolean resultLogic = !(reachedLogic ^ expectLogic);
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(resultLogic);
        assertTrue(resultAfter);
    }
    
    @Test
    public void testRemoveFalse1()
    {
        //arrange
        SetNatural _setA = new SetNatural(1232321);
        SetNatural _setB = new SetNatural(1232321);
        int element = 4;
        boolean expectLogic = false;
        boolean expectedAfter = true;
        
        //act
        boolean reachedLogic = _setA.remove(element);
        boolean reachedAfter = _setA.equals(_setB);
        
        //assert
        boolean resultLogic = !(reachedLogic ^ expectLogic);
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(resultLogic);
        assertTrue(resultAfter);
    }
}
