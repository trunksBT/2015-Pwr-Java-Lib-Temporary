package bt.test.collections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.various.OneDimTable;
import bt.collections.various.SetNatural;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestOneDimTableNatural_Imperative extends TestCase {

	public int[] insert(int []tab ,int el){
		
		if(tab!= null)
		{
			int size = tab.length;
	
			int goodIdx = -1;
			int i = 1;
			int j = 0;
			int [] helpTape = new int [ size+1 ];
			
			if( size > 1) {
				while( goodIdx == -1 && i <= size){	
					if (tab[ i-1 ] >= el && i == 1)
						goodIdx = 0;
					
					if ( tab[ i-1 ] <= el && tab[ i ] >= el )
						goodIdx = i;
					
					if ( tab[ i ] <= el && i == size-1)
						goodIdx = i+1;		
		
					i++;
				}
			}
			else if ( size == 1) {
				if ( tab [ 0 ] <= el )
					goodIdx = 1;
				else
					goodIdx = 0;
			}
			else
				goodIdx = 0;
			
			
			i = j = 0;
			
			while(i <= size) {
				if ( i == goodIdx )
					helpTape[ i++ ] = el;
				else
					helpTape[ i++ ]= tab[ j++ ];
			}
	
			return helpTape;
		}
		
		else
			return null;
	}
	
	public boolean equals(int[] fstTab, int[] sndTab)
	{
		boolean result = true;
		
		if(fstTab != null && sndTab != null)
		{
			result&= fstTab.length == sndTab.length;
			
			if(result) {
				for (int i = 0; i < fstTab.length; i++)
					result &= fstTab[i] == sndTab[i];
			}
		}
		else if(fstTab == null && sndTab != null )
		{
			result = false;
		}
		else if(fstTab != null && sndTab == null )
		{
			result = false;
		}
	
		return result;
	}
	
	@Test
	public void test_ASig_Method_TableState_NewElRelation()
	{
	    assertTrue(true);
	}
	
  @Test
  public void test_Equal_TheSame()
  {
      //arrange
	  int[] inTable = {1,2,3,4,5,6};
	  int[] inTable2 = {1,2,3,4,5,6};
      boolean expected = true;
      
      //act
      boolean reached = equals(inTable,inTable2);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Null_0()
  {
      //arrange
	  int[] inTable = null;
	  int[] expectTable = null;
	  
	  int el = 4;
      boolean expected = true;
    
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_Internal()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};  
	  int[] expectTable = {1,2,3,4,5,6};
	  
	  int el = 4;
      boolean expected = true;
    
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_NewLeftLimit()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};
	  int[] expectTable = {0,1,2,3,5,6};
	  int el = 0;
	  
      boolean expected = true;
	  	  
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_EqualToLeftLimit()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};
	  int[] expectTable = {1,1,2,3,5,6};
	  int el = 1;
	  
      boolean expected = true;
	  	  
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_EqualToSecond()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};
	  int[] expectTable = {1,2,2,3,5,6};
	  int el = 2;
	  
      boolean expected = true;
	  	  
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_Latter()
  {
      //arrange
	  int[] inTable = {1,3,4,5,6}; 
	  int[] expectTable = {1,2,3,4,5,6};	  
	  int el = 2;
	  
      boolean expected = true;
	  	  
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_LastButOne()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};	  
	  int[] expectTable = {1,2,3,5,5,6};
	  int el = 5;
	  
      boolean expected = true;
	  	  
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_NewRightLimit()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6}; 
	  int[] expectTable = {1,2,3,5,6,7};	  
	  int el = 7;
	  
      boolean expected = true;
	  	  
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Filled_EqualToRightLimit()
  {
      //arrange
	  int[] inTable = {1,2,3,5,6};
	  int[] expectTable = {1,2,3,5,6,6};
	  int el = 6;
	  
      boolean expected = true;
	  	  
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Empty()
  {
      //arrange
	  int[] inTable = {};
	  int[] expectTable = {4};
	  int el = 4;
	  
      boolean expected = true;
	  	  
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Single_Lower()
  {
      //arrange
	  int[] inTable = {6};
	  int[] expectTable = {4,6};
	  int el = 4;
	  
      boolean expected = true;
      
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Single_Higher()
  {
      //arrange
	  int[] inTable = {6};
	  int[] expectTable = {6,8};
	  int el = 8;
	  
      boolean expected = true;
	  	  
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
  
  @Test
  public void test_Insert_Single_Equal()
  {
      //arrange
	  int[] inTable = {6};
	  int[] expectTable = {6,6};
	  int el = 6;
	  
      boolean expected = true;
	  	  
      //act
      int[] _outTape = insert(inTable,el);
      boolean reached = equals(expectTable,_outTape);
      
      //assert
      boolean result = !(expected ^ reached);
      assertTrue(result);
  }
}
