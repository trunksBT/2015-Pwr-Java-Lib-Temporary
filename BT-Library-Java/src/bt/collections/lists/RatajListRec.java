package bt.collections.lists;

public class RatajListRec {
	RatajListRec next;
	int val;
	
	public RatajListRec(int val) {
		this(val,null);
	}

	public RatajListRec(int val, RatajListRec tail) {
		this.val = val;
		this.next = tail;
	}
	
	public int size() {
		return next == null ? 1 : 1 + next.size();
	}

	public static int sum(RatajListRec list) {
		return list == null ? 0 : list.val + sum(list.next);
	}

	public void add(int val) {
		if( next == null )
			next = new RatajListRec(val);		
		else
			next.add(val);
	}

	public int sum() {
		return next == null ? val : val + next.sum();
	}

	public RatajListRec getElem(int searchedVal) {
		if( val == searchedVal )
			return this;
		else
			return next == null ? null : next.getElem(searchedVal);
	}
	
	public RatajListRec delete(int toDel) {
		if( val == toDel )
			return next;
		else {
			if( next != null )
				next = next.delete(toDel);
			return this;		
		}
	}
	
	public int getVal() {
		return val;
	}

	public RatajListRec copy() {
		if( next == null )
			return new RatajListRec(val);
		else
			return new RatajListRec(val, next.copy());
	}
	
	public static RatajListRec copy(RatajListRec root) {
		return root == null ? null : 
			new RatajListRec(root.val,copy(root.next));
	}

	public RatajListRec append(RatajListRec l2) {
		next = (next == null) ? l2 : next.append(l2);
		return this;
	}

	public void deleteEvery2() {	
		if( next != null ) {
			next = next.next;
			next.deleteEvery2();
		}
		else
			next = null;
	}
}
