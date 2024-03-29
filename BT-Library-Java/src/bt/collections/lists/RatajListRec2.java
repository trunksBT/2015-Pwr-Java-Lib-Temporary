package bt.collections.lists;

public class RatajListRec2 {
	RatajListRec2 next;
	int val;

	public RatajListRec2(int val) {
		this(val, null);
	}

	public RatajListRec2(int val, RatajListRec2 tail) {
		this.val = val;
		this.next = tail;
	}

	public static boolean equals(RatajListRec2 expList, RatajListRec2 rcList, int inSize) {
		boolean retVal = true;
		
		for(int i = 0; i< inSize; i++)
			retVal = expList.getElem(i).val == rcList.getElem(i).val;
		
		return retVal;
	}

	public static void print(RatajListRec2 rcList) {
		if( rcList!= null) {
			System.out.println(rcList.val);
			print(rcList.next);
		}
	}

	public static RatajListRec2 revAndRetList(int[] inTab, int inSize) {
		return helpRev( inTab, 0, inSize -1);
	}

	private static RatajListRec2 helpRev(int[] inTab, int idxSt, int idxEnd) {
		if(idxSt < idxEnd)
			return helpRev(inTab, idxSt+1, idxEnd);
		else if( idxEnd == -1 || inTab.length == 0)
			return null;
		else
			return new RatajListRec2(inTab[idxSt], helpRev(inTab, idxSt-1, idxEnd-1));			
	}

	public RatajListRec2 deleteEach2From1(RatajListRec2 l1) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		return next == null ? 1 : 1 + next.size();
	}
	
	public RatajListRec2 append(RatajListRec2 l2) {
		if( next == null )
			next = l2;
		else
			next.append(l2);
		return this;
	}

	public RatajListRec2 delete(int toDel) {
		if( val == toDel)
			return next;
		else {
			if( next != null )
				next = next.delete(toDel);
			
			return this;
		}
	}

	public RatajListRec2 getElem(int searchedVal) {
		if(next == null && val != searchedVal)
			return null;
		else
			return val == searchedVal ? this : next.getElem(searchedVal);
	}

	public int getVal() {
		return val;
	}

	public RatajListRec2 copy() {
		return next == null ? new RatajListRec2( val) : new RatajListRec2(val, next.copy());
	}

	public static RatajListRec2 copy(RatajListRec2 list) {
		return list == null ? null : new RatajListRec2( list.val, RatajListRec2.copy(list.next));
	}

	public void deleteEvery2() {
		// TODO Auto-generated method stub
		
	}

	public void add(int toAdd) {
		if( next == null )
			next = new RatajListRec2(toAdd);
		else
			next.add(toAdd);
	}

	public int sum() {
		return next == null ? val : val + next.sum();
	}

	public static int sum(RatajListRec2 list) {
		return list == null ? 0 : list.val + RatajListRec2.sum(list.next);
	}

}
