package bt.core.collections.lists;

public class RatajList {
	RatajElem poc;
	
	public RatajList() {
		this.poc = null;
	}
	
	public RatajList(RatajElem poc) {
		this.poc = poc;
	}
	
	public static void print(RatajElem l) {
		while(l != null) {
			System.out.println( l.val + ',' );
			l = l.next;
		}
	}
	
	public int maxVal() {
		if( poc == null)
			throw new NullPointerException();
		
		int max = poc.val;	
		RatajElem l = poc.next;
		
		while( l != null ) {
			if( l.val > max )
				max = l.val;
			l = l.next;
		}
		
		return max;
	}

	public void add(int val) {
		RatajElem newElem = new RatajElem(val);
		
		if(poc == null) poc = newElem;
		else {
			RatajElem l = poc;
			while(l.next != null)
				l = l.next;
			
			l.next = newElem;
		}
	}

	public int size() {
		int retVal = 0;
		RatajElem l = poc;
		
		while(l != null) {
			l = l.next;
			retVal++;
		}
		
		return retVal;
	}

	public RatajElem getElem(int val) {
		RatajElem l = poc;
		
		while( l != null && l.val!= val)
			l = l.next;
		
		return l;
	}

	public void attachAfter(RatajElem afterWhich, int val) {
		if( afterWhich == null )
			poc = new RatajElem(val,poc);
		else
			afterWhich.next = new RatajElem(val, afterWhich.next);
	}

	public void delete(int toDel) {
		if( poc != null) {
			if( poc.val == toDel ) poc = poc.next;
			else {
				RatajElem l = poc;
				while( l.next != null && l.next.val != toDel)
					l = l.next;
				
				if( l.next != null )
					l.next = l.next.next;
			}
		}
	}
}















