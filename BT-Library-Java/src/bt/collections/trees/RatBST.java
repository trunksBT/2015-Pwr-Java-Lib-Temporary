package bt.collections.trees;

public class RatBST {
	// countInternalNodes
	public static int countInternalNodes(RatNode root) { // some type of preoder
		return root == null ? 0 : 1 + countInternalNodes(root.left) +
				countInternalNodes(root.right);
	}
	
	// countExternalNodes
	public static int countExternalNodes(RatNode root) {
		return root == null ? 1 : countExternalNodes(root.left) + countExternalNodes(root.right);
	}
	
	// countLeaves
	public static int countLeaves(RatNode root) {
		if( root == null ) return 0;
		else return root.left == null && root.right == null ?
				1 : countLeaves(root.left) + countLeaves(root.right);
	}
	
	public static int height(RatNode root) { // some type of postOrder
		return ( root == null) ? -1 : Math.max(height(root.left), height(root.right))+1;
	}
	
	public static int countLowerNodes(RatNode root) { // some type of post order
		return root == null ? 0 : (root.ammountLowerNodes = countLowerNodes(root.left)+1);
	}
	
	public static int assignAmountOfNodes(RatNode root) { //  some type of inorder
		return root == null ? 0 : (root.ammountNodes = assignAmountOfNodes(root.left)
													+1+ assignAmountOfNodes(root.right));
	}
	
// Uncomment to see how recurrency on tree works
//	public static int countIN(RatNode root) {
//		if( root != null )
//			System.out.println( "I'm in : "+root.val );
//		else
//			System.out.println( "I'm in : ext node");
//		if( root == null )
//			return 0;
//		else
//			return 1 + countIN(root.left) +
//					countIN(root.right);
//	}
	
	public static void preorder(RatNode root) {
		if( root == null )
			System.out.println( "Nil" );
		else {
			System.out.println( root.val );
			preorder(root.left);
			preorder(root.right);
		}
	}
}
