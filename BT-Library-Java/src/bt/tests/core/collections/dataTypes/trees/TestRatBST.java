package bt.tests.core.collections.dataTypes.trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.core.algorithms.comparators.NaturalComparator;
import bt.core.collections.dataTypes.trees.BST;
import bt.core.collections.dataTypes.trees.RatNode;
import bt.core.collections.interfaces.Tree;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestRatBST extends TestCase {
	
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_CTOR_empty_true()
    {
    	// arrange
    	RatNode root = getMock();
    	
    	// act
    	// assert
    	assertTrue(true);
    }
    
    public RatNode getMock() {
    	return 						new RatNode(4,
    					new RatNode(2,
    				new RatNode(1, 
    	new RatNode(0),null),new RatNode(3)),
    											new RatNode(6,
    										new RatNode(5), new RatNode(7)));
    }// lwp 01234567
}
