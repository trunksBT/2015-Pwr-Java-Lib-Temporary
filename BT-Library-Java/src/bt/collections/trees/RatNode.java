package bt.collections.trees;

public class RatNode {
	RatNode left,right;
	int val;
	int ammOfLowerNodes;
	int ammOfInnerNodes;
	
	public RatNode(int val) {
		this(val,null,null);
	}
	
	public RatNode(int val, RatNode left, RatNode right) {
		this.left = left;
		this.right = right;
		this.val = val;
	}
}
