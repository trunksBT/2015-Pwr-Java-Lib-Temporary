package bt.collections.trees;

public class RatBST2 {

	public static void preorder(RatNode2 root) {
		if( root == null )
			System.out.println( " Nil ");
		else {
			System.out.println( root.val );
			RatBST2.preorder(root.left);
			RatBST2.preorder(root.right);
		}
	}

	public static int countLowerNodes(RatNode2 root) {
		return root == null ? 0 : 
				(root.ammountLowerNodes= 
				 countLowerNodes(root.left)+1);
	}

	public static int height(RatNode2 root) {
		return root == null ? -1 :
			Math.max( height(root.left), height(root.right))+1;
	}

	public static int countLeaves(RatNode2 root) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int countExternalNodes(RatNode2 root) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int countInternalNodes(RatNode2 root) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int assignAmountOfNodes(RatNode2 root) {
		// TODO Auto-generated method stub
		return 0;
	}

}
