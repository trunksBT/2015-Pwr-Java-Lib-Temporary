package bt.core.collections.dataTypes;

public class RatajListCopy {
	private RatajElemCopy poc ;
	
	public RatajListCopy() {
		poc = null;
	}
	
	public RatajListCopy(RatajElemCopy poc) {
		this.poc = poc;
	}
	
	public static void print(RatajElemCopy poc) {
		while(poc!= null) {
			System.out.println( poc.val );
			poc = poc.next;
		}
	}
	
	public int maxVal() {
		RatajElemCopy it = poc.next;
		
		int max = poc.val;
		while(it!= null) {
			if( max < it.val) max = it.val;
			it = it.next;
		}
		
		return max;
	}
	
	public int size() {
		int retVal = 0;
		RatajElemCopy it = poc;
		
		while(it!= null	) {
			retVal++;
			it = it.next;
		}
		
		return retVal;
	}
	
	public void add(int val) {
		RatajElemCopy newElem = new RatajElemCopy(val);
		
		if(poc == null) poc = newElem;
		else {
			RatajElemCopy it = poc;
			while(it.next!= null) it = it.next;
			it.next = new RatajElemCopy(val);
		}
	}
	
	public RatajElemCopy getElem(int x) {
		RatajElemCopy it = poc;
		
		while( it != null && it.val != x)
				it = it.next;
		
		return it;
	}
}

