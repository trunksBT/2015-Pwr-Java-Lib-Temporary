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

	public static void preOrder(RatNode root) {
		if( root != null ) {
			System.out.print( root.val +" " );
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void postOrder(RatNode root) {
		if( root != null ) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print( root.val + " " );
		}
	}

	public static void preOrderRev(RatNode root) {
		if( root != null ) {
			System.out.print( root.val +" " );
			preOrderRev(root.right);
			preOrderRev(root.left);
		}
	}
	
	public static void postOrderRev(RatNode root) {
		if( root != null ) {
			postOrderRev(root.right);
			postOrderRev(root.left);
			System.out.print( root.val + " " );
		}
	}
	

	public static int maxVal(RatNode root) {
		return root.right == null ? root.val :
			maxVal(root.right);
	}
}
