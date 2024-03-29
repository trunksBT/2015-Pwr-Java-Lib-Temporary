package bt.collections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.various.OneDimTable;
import bt.collections.various.SetNatural;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestOneDimTableNatural_Object extends TestCase {

	@Test
	public void test_ASig_Method_TableState_NewElRelation()
	{
	    assertTrue(true);
	}
  
  @Test
  public void test_Insert_Filled_Internal()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};

	  int inSize = 5;
	  
	  int[] expectTable = {1,2,3,4,5,6};
	  int expectSize = 6;
	  
	  int el = 4;
      boolean expected = true;
      	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expectSize,expectTable);
      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_NewLeftLimit()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};
	  int inSize = 5;
	  
	  int[] expectTable = {0,1,2,3,5,6};
	  int expectSize = 6;
	  
	  int el = 0;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expectSize,expectTable);  

      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_EqualToLeftLimit()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};
	  int inSize = 5;
	  
	  int[] expectTable = {1,1,2,3,5,6};
	  int expectSize = 6;
	  
	  int el = 1;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expectSize,expectTable);  

      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_EqualToSecond()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};
	  int inSize = 5;
	  
	  int[] expectTable = {1,2,2,3,5,6};
	  int expectSize = 6;
	  
	  int el = 2;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expectSize,expectTable);  

      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_Latter()
  {
      //arrange
	  int[] inTable = {1,3,4,5,6};
	  int inSize = 5;
	  
	  int[] expectTable = {1,2,3,4,5,6};
	  int expectSize = 6;
	  
	  int el = 2;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expectSize,expectTable);  

      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_LastButOne()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};
	  int inSize = 5;
	  
	  int[] expectTable = {1,2,3,5,5,6};
	  int expectSize = 6;
	  
	  int el = 5;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expectSize,expectTable);  

      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_NewRightLimit()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};
	  int inSize = 5;
	  
	  int[] expectTable = {1,2,3,5,6,7};
	  int expectSize = 6;
	  
	  int el = 7;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expectSize,expectTable);  

      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_EqualToRightLimit()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};
	  int inSize = 5;
	  
	  int[] expectTable = {1,2,3,5,6,6};
	  int expectSize = 6;
	  
	  int el = 6;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expectSize,expectTable);  

      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Empty()
  {
      //arrange
	  int[] inTable = {};
	  int inSize = 0;

	  int[] expectTable = {4};
	  int expSize = 1;
	  int el = 4;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expSize,expectTable);  

      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Single_Lower()
  {
      //arrange
	  int[] inTable = {6};
	  int inSize = 1;

	  int[] expectTable = {4,6};
	  int expSize = 2;
	  int el = 4;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expSize,expectTable);  
      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Single_Higher()
  {
      //arrange
	  int[] inTable = {6};
	  int inSize = 1;

	  int[] expectTable = {6,8};
	  int expSize = 2;
	  int el = 8;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expSize,expectTable);  

      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Single_Equal()
  {
      //arrange
	  int[] inTable = {6};
	  int inSize = 1;

	  int[] expectTable = {6,6};
	  int expSize = 2;
	  int el = 6;
      boolean expected = true;
	  	  
      OneDimTable _inTape = new OneDimTable(inSize,inTable);  
      OneDimTable _expectedTape = new OneDimTable(expSize,expectTable);  

      
      //act
      OneDimTable _outTape = _inTape.insert(el);
      boolean reached = _expectedTape.equals(_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
}
