package bt.collections.trees;

public class RatBST2 {

	public static void preorder(RatNode2 root) {
		if( root == null )
			System.out.println( "Null" );
		else {
			System.out.println( root.val );
			preorder(root.left);
			preorder(root.right);
		}
	}

	public static int countLowerNodes(RatNode2 root) {
		return countLowerNodesInt(root,false);
	}
	
	private static int countLowerNodesInt(RatNode2 root, boolean isLoop) {
		if ( isLoop ) {
			return root == null ? 0 : 1 + countLowerNodesInt(root.left, true) +
						countLowerNodesInt(root.right,true);
		}else if ( !isLoop && root == null )
			return 0;
		else {
			return countLowerNodesInt(root.left,true);
		}
		
	}

	public static int countLeaves(RatNode2 root) {
		if( root == null )
			return 0;
		else
			return root.left == null && root.right == null ?
					1 : countLeaves(root.left) + countLeaves(root.right);
	}

	public static int countExternalNodes(RatNode2 root) {
		return root == null ? 1 :
			countExternalNodes(root.left) +
			countExternalNodes(root.right);
	}

	public static int countInternalNodes(RatNode2 root) {
		return root == null ? 0 :
			1 + countInternalNodes(root.left) +
				countInternalNodes(root.right);
	}

	public static int assignAmountOfInternalNodes(RatNode2 root) {
		return root == null ?
				0 : (root.ammountNodes = 1 + assignAmountOfInternalNodes(root.left)
						+ assignAmountOfInternalNodes(root.right));
	}

	public static int height(RatNode2 root) {
		return root == null ? -1 :
			Math.max(height(root.left), height(root.right))+1;
	}
}
