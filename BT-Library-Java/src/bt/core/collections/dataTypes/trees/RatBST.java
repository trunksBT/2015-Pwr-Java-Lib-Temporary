package bt.core.collections.dataTypes.trees;

public class RatBST {
	// countInternalNodes
	public static int countIN(RatNode root) {
		return root == null ? 0 : 1 + countIN(root.left) +
				countIN(root.right);
	}
	
	// countExternalNodes
	public static int countEN(RatNode root) {
		return root == null ? 1 : countEN(root.left) + countEN(root.right);
	}
	
	// countLeaves
	public static int countL(RatNode root) {
		if( root == null ) return 0;
		else return root.left == null && root.right == null ?
				1 : countL(root.left) + countL(root.right);
	}
	
	public static int height(RatNode root) {
		return ( root == null) ? -1 : Math.max(height(root.left), height(root.right))+1;
	}
	
	public static int countLowerNodes(RatNode root) {
		return root == null ? 0 : (root.ammountLowerNodes = countLowerNodes(root.left)+1);
	}
	
	public static int assignNodes(RatNode root) {
		return root == null ? 0 : (root.ammountNodes = assignNodes(root.left)
													+1+ assignNodes(root.right));
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