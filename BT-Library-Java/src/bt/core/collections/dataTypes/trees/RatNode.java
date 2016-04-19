package bt.core.collections.dataTypes.trees;

public class RatNode{
	int val;
	RatNode left;
	RatNode right;
	public RatNode(int val) {
		this.val = val;
		left = right = null;
	}
	public RatNode(int val, RatNode left, RatNode right) {
		this(val);
		this.left = left;
		this.right = right;
	}
	public void setLeft(RatNode left) {
		this.left = left;
	}
	public void setRight(RatNode right) {
		this.right = right;
	}
}
