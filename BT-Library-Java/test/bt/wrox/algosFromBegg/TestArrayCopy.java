package bt.wrox.algosFromBegg;

import java.util.Arrays;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestArrayCopy extends TestCase{
	
		@Test
		public void test_arrayCopy_WithRefs_True()
		{
			//arrange
			Double tab1[] = {
					new Double(3.0),
					new Double(3.0),
					new Double(3.0),
			};
			
			Double tab2[] = {
					new Double(4.0),
					new Double(4.0),
					new Double(4.0),
			};
	      
			//act
			System.arraycopy(tab1,0,tab2,0,tab1.length);
			
			//assert
			assertSame(tab1[0],tab2[0]);
		}
		
		@Test
		public void test_arrayCopy_WithRefs_AsInArrayList_True()
		{
			//arrange
			Double tab1[] = {
					new Double(3.0),
					new Double(3.0),
					new Double(3.0),
			};
			
			Double tab2[] = {
					new Double(4.0),
					new Double(4.0),
					new Double(4.0),
			};
	      
			//act
			System.arraycopy(tab1,1,tab2,1,1);
			
			Arrays.asList(tab2).stream().forEach(val -> System.out.println( val ));
			
			//assert
			assertSame(tab1[0],tab2[0]);
		}
}
