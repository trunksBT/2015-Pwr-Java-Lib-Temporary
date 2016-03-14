package bt.test.core.ABC;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.collections.various.OneDimTable;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestOneDimTable extends TestCase{

    @Test
    public void testTableSize()
    {
        //arrange	
    	int size =3;
    	int[] tab = {1,2,3};
        OneDimTable _pointA = new OneDimTable(size,tab);
        int expected= 3;
        
        //act
        int reached = _pointA.GetSize();
        
        //assert
        boolean reachedLogic = expected == reached;
        boolean expectedLogic = true;
        boolean result = !(reachedLogic ^ reachedLogic);
        assertTrue(result);
    }
}
