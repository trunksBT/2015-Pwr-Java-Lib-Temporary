package bt.core.collections.dataTypes.trees;

public class RatBST {
	static int cc = 0;
	public static int countInternalNods(RatNode root) {
		cc++;
		if( root != null )
			System.out.println( "Lp:"+cc+root.val );
		else
			System.out.println( "Lp:"+cc);
		if( root == null )
			return 0;
		else
			return 1 + countInternalNods(root.left) +
					countInternalNods(root.right);
//		return root == null ? 0 : 1 + countInternalNods(root.left) +
//										countInternalNods(root.right);
	}
	
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
