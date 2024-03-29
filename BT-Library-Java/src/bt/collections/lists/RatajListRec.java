package bt.collections.lists;

public class RatajListRec {
	RatajListRec next;
	Integer val;
	
	public RatajListRec(int val) {
		this(val,null);
	}
	
	public RatajListRec() {
		this(null,null);
	}

	public RatajListRec(Integer val, RatajListRec tail) {
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
		if( next == null && this.val == null)
			next = new RatajListRec(val);		
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

	public static void print(RatajListRec rcList) {
		if( rcList != null ) {
			System.out.println(rcList.val+" ");
			RatajListRec.print(rcList.next);
		}
	}

	public RatajListRec deleteEach2From1(RatajListRec a) {
		if( a== null || a.next == null)
			return null;
		a.next.next = deleteEach2From1(a.next.next);
		return a.next;
	}

	public static RatajListRec revAndRetList(int[] inTab, int inSize) {
		return helpRev(inTab, 0, inSize-1);
	}
	
	public static RatajListRec revAndRetList(int[] inTab) {
		return helpRev(inTab, 0, inTab.length-1);
	}
	
	public static RatajListRec helpRev(int [] inTab, int idxSt, int idxEnd) {
		if( idxSt < idxEnd )
			return helpRev( inTab, idxSt+1, idxEnd);
		else if(idxEnd < 0 || inTab.length < 0)
			return null;
		else
			return new RatajListRec(inTab[idxSt], helpRev(inTab, idxSt-1, idxEnd-1));
	}
	
	public static boolean equals(RatajListRec l1, RatajListRec l2, int size) {
		boolean retVal = true;
		
		for( int i =0 ; i < size; i++)
			retVal &= l1.getElem(i).val == l2.getElem(i).val;
		
		return retVal;
	}
}
