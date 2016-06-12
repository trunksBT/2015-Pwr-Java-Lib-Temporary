package bt.collections.trees;

public class RatBST2 {

	public static int height(RatNode2 root) {
		return root == null ? -1 : 1 + Math.max(height(root.left),height(root.right));
	}

	public static int countInternalNodes(RatNode2 root) {
		return root == null ? 0 : countInternalNodes(root.left) + 1 + 
									countInternalNodes(root.right);
	}

	public static int countExternalNodes(RatNode2 root) {
		return root == null ? 1 : countExternalNodes(root.left) + countExternalNodes(root.right);
	}

	public static int countLeaves(RatNode2 root) {
		if ( root == null )
			return 0;
		else {
			return root.left == null && root.right == null ? 1 : RatBST2.countLeaves(root.left) + 
					RatBST2.countLeaves(root.right);
		}
	}

	public static int assignAndReturnAmountOfLowerNodes(RatNode2 root) {
		if ( root == null)
			return 0;
		else {
			assignAndReturnAmountOfLowerNodesHelp(root);
			return root.ammOfLowerNodes;
		}
	}

	private static int assignAndReturnAmountOfLowerNodesHelp(RatNode2 root) {
		if ( root == null )
			return 0;
		else {
			return (root.ammOfLowerNodes = assignAndReturnAmountOfLowerNodesHelp(root.left))+ 1 +
					assignAndReturnAmountOfLowerNodesHelp(root.right);
		}
	}

	public static int assignAmountOfInternalNodes(RatNode2 root) {
		if ( root == null )
			return 0;
		else {
			assignAmmOfInternalNodesHelper(root);
			return root.ammOfInternalNodes;
		}
	}	

	private static int assignAmmOfInternalNodesHelper(RatNode2 root) {
		if ( root == null )
			return 0;
		else
			return (root.ammOfInternalNodes = 
				assignAmmOfInternalNodesHelper(root.left) + 1 + 
				assignAmmOfInternalNodesHelper(root.right));
	}

	public static int maxVal(RatNode2 root) {
		return root.right == null ? root.val : RatBST2.maxVal(root.right);
	}

	public static void preorder(RatNode2 root) {
		if( root == null )
			System.out.println( "Null" );
		else {
			System.out.println( root.val );
			preorder(root.left);
			preorder(root.right);
		}
	}
}
