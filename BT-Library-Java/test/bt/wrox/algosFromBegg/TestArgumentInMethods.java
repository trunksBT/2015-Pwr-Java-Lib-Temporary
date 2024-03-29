package bt.wrox.algosFromBegg;

import java.util.Arrays;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.collections.interfaces.List;
import bt.collections.lists.ArrayList;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestArgumentInMethods extends TestCase{
	
		@Test
		public void test_addVal_expectedChanged_true()
		{
			//arrange
			ArrayList inVal1 = new ArrayList();
			inVal1.add(1);
			int expSize = 2;
	      
			//act
			addTwo(inVal1);
			
			//assert
			assertEquals(expSize,inVal1.size());
		}	
		
		@Test
		public void test_repointToNewObject_expectedNotChanged_true()
		{
			//arrange
			ArrayList inVal1 = new ArrayList();
			inVal1.add(1);
			int expSize = 1;
	      
			//act
			setNewObject(inVal1);
			
			//assert
			assertEquals(expSize,inVal1.size());
		}
		
		@Test
		public void test_copyRefAndAddValToMainObject_expectedNotChanged_true()
		{
			//arrange
			ArrayList inVal1 = new ArrayList();
			inVal1.add(1);
			int expSize = 2;
	      
			//act
			ArrayList inValRef = inVal1;
			inValRef.add(2);
			
			//assert
			assertEquals(expSize,inVal1.size());
		}
		
		@Test
		public void test_copyRefAndAddValToMainObject_AndChangeRefferedObject_expectedNotChanged_true()
		{
			//arrange
			ArrayList inVal1 = new ArrayList();
			inVal1.add(1);
			int expSize = 3;
	      
			//act
			ArrayList inValRef = inVal1;
			inValRef.add(2);
			inValRef = new ArrayList();
			inValRef = inVal1;
			inValRef.add(3);
			
			//assert
			assertEquals(expSize,inVal1.size());
		}
		
		public void addTwo(List arg) {
			arg.add(2);
		}	
		
		public void setNewObject(List arg) {
			arg = new ArrayList();
			arg.add(1);
			arg.add(2);
			arg.add(3);
		}	
}
