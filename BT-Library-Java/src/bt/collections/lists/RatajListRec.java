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
}
