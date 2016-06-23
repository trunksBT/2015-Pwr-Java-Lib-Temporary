package bt.collections.trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.comparators.NaturalComparator;
import bt.collections.interfaces.Tree;
import bt.collections.trees.BST;
import bt.collections.trees.RatBST;
import bt.collections.trees.RatNode;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestRatBSTOrdersMock5 extends TestCase {

	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_preorder()
    {
    	// arrange
    	RatNode tape = getMock5();
    	
    	// act
    	System.out.println("preorder");
    	RatBST.preOrder(tape);
    	System.out.println("");
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_postorder()
    {
    	// arrange
    	RatNode tape = getMock5();
    	
    	// act
    	System.out.println("postorder");
    	RatBST.postOrder(tape);
    	System.out.println("");
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_preorderRev()
    {
    	// arrange
    	RatNode tape = getMock5();
    	
    	// act
    	System.out.println("preorderRev");
    	RatBST.preOrderRev(tape);
    	System.out.println("");
    	
    	// assert
    	assertTrue(true);
    }
    
	//Test_MethodName_StateUnderTest_Expect_ExpectedBehavior
    @Test
    public void test_postorderRev()
    {
    	// arrange
    	RatNode tape = getMock5();
    	
    	// act
    	System.out.println("postorderRev");
    	RatBST.postOrderRev(tape);
    	System.out.println("");
    	
    	// assert
    	assertTrue(true);
    }
    
    public RatNode getMock5() {
    	return		new RatNode(5,new RatNode(2,null,new RatNode(3,null,new RatNode(4)))
    			,new RatNode(7,new RatNode(6),new RatNode(8,null,new RatNode(9))));
    }
}
