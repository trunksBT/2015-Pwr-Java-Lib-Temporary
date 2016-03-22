package bt.core.collections.dataTypes;

public class RatajListRec {
	RatajListRec tail;
	int val;
	
	public RatajListRec(int val, RatajListRec next) {
		this.tail = next;
		this.val = val;
	}
	
	public RatajListRec(int val) {
		this.tail = null;
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}

	public void add(int toAdd) {
		if ( tail == null ) tail = new RatajListRec(toAdd);
		else tail.add(toAdd);	
	}

	public RatajListRec getElem(int searchedVal) {
		if ( val == searchedVal ) return this;
		else return tail == null ? null : tail.getElem(searchedVal);
	}

	public int size() {
		return tail == null ? 1 : 1+ tail.size();
	}

	public RatajListRec delete(int toDel) {
		if( val == toDel )
			return tail;
		else {
			if ( tail != null )
				tail = tail.delete(toDel);
			return this;
		}
	}
	
	public static int sum(RatajListRec list1) {
		return list1 == null ? 0 : list1.val + RatajListRec.sum(list1.tail);
	}

	public int sum() {
		return tail == null ? val : val + tail.sum();
	}
}
