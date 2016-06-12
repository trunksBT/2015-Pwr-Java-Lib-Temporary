package bt.collections.trees;

public class RatBST {

	public static int countInternalNodes(RatNode root) {
		return root == null ? 0 :
			countInternalNodes(root.left) + 1 + 
				countInternalNodes(root.right);
	}

	public static int countExternalNodes(RatNode root) {
		return root == null ? 1 :
			countExternalNodes(root.left ) +
				countExternalNodes(root.right );
	}

	public static int countLeaves(RatNode root) {
		if ( root == null ) return 0;
		else return ( root.left == null && root.right == null ) ? 1 
						: countLeaves(root.left) + countLeaves(root.right);
	}

	public static int height(RatNode root) {
		return root == null ? -1 : 
				1 + Math.max(height(root.left), height(root.right));
	}

	public static int assignAndReturnAmountOfLowerNodes(RatNode root) {
		innerAssignAmountOfLowerNodes(root);
		if( root != null )
			return root.ammOfLowerNodes;
		else
			return 0;
	}
	
	private static int innerAssignAmountOfLowerNodes(RatNode root) {
		return root == null ? 0 :
			(root.ammOfLowerNodes = innerAssignAmountOfLowerNodes(root.left))
				+1 + innerAssignAmountOfLowerNodes(root.right);
	}
	

	public static int assignAmountOfInternalNodes(RatNode root) {
		return root == null ? 0 :
			(root.ammOfInnerNodes = assignAmountOfInternalNodes( root.left) 
			+ 1 + assignAmountOfInternalNodes(root.right));
	}

	public static void preorder(RatNode root) {
		if( root == null )
			System.out.println( "null" );
		else {
			System.out.println( root.val );
			preorder(root.left);
			preorder(root.right);
		}
		
	}

	public static int maxVal(RatNode root) {
		return root.right == null ? root.val :
			maxVal(root.right);
	}
}
