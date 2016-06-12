package bt.collections.lists;

public class RatajListRec2 {
	int val;
	RatajListRec2 next;
	
	public RatajListRec2(int val) {
		this(val,null);
	}

	public RatajListRec2(int val, RatajListRec2 next) {
		this.val = val;
		this.next = next;
	}

	public int size() {
		return next == null ? 1 : 1+ next.size();
	}

	public static int sum(RatajListRec2 root) {
		return root == null ? 0 : root.val + RatajListRec2.sum(root.next);
	}

	public void add(int newVal) {
		if( next == null)
			next = new RatajListRec2(newVal);		
		else
			next.add(newVal);
	}

	public int sum() {
		return next == null ? val : val + next.sum();
	}

	public RatajListRec2 getElem(int searchedVal) {
		if( val == searchedVal )
			return this;
		else
			return next == null ? null : next.getElem(searchedVal);
	}

	public int getVal() {
		return val;
	}

	public RatajListRec2 copy() {
		if( next == null )
			return new RatajListRec2(val);
		else
			return new RatajListRec2(val, next.copy());
	}

	public RatajListRec2 delete(int toDel) {
		if( val == toDel )
			return next;
		else {
			if ( next != null )
				next = next.delete(toDel);
			return this;
		}
	}

	public RatajListRec2 append(RatajListRec2 root2) {
		if ( next == null )
			next = root2 ;
		else 
			next.append(root2);
	
		return this;
	}

	public static RatajListRec2 copy(RatajListRec2 root2) {
		if( root2 == null )
			return null;
		else
			return new RatajListRec2(root2.val, RatajListRec2.copy(root2.next));
	}

}
