package bt.collections.trees;

public class RatNode2 {
	RatNode2 left,right;
	int val;
	int ammountLowerNodes;
	int ammountNodes;
	
	public RatNode2(int val, RatNode2 left, RatNode2 right) {
		this.left = left;
		this.right = right;
		this.val = val;
	}

	public RatNode2(int val) {
		this.val = val;
	}
}
