package bt.collections.lists;

public class RatajList {
	RatajElem root;
	
	public RatajList(RatajElem head) {
		this.root = head;
	}

	public RatajList() {
		this(null);
	}

	public static void print(RatajElem hd) {
		while(hd != null) {
			System.out.println( hd.val );
			hd = hd.next;
		}
	}
	
	public int maxVal() {
		int max = root.val;
		RatajElem l = root.next;
		
		while( l!= null ) {
			if( l.val > max )
				max = l.val;
			l = l.next;
		}
		
		return max;
	}

	public void add(int val) {
		RatajElem newElem = new RatajElem(val);
		
		if( root == null )
			root = newElem;
		else {
			RatajElem hd = root;
			
			while( hd.next != null )
				hd = hd.next;
			
			hd.next = newElem;
		}
	}

	public int size() {
		RatajElem hd = root;
		int retVal = 0;
		
		while(hd != null) {
			retVal++;
			hd = hd.next;
		}
		
		return retVal;
	}

	public RatajElem getElem(int searchedVal) {
		RatajElem hd = root;
		RatajElem retVal = null;
		
		while(hd != null && retVal == null) {
			if(hd.val == searchedVal)
				retVal = hd;
			hd = hd.next;
		}
		
		return retVal;
	}
		
	public void attachAfter(RatajElem afterWhich, int val) {
		if( afterWhich == null )
			root = new RatajElem( val, root );
		else
			afterWhich.next = new RatajElem(val, afterWhich.next);
	}

	public void delete(int toDel) {
		if ( root != null ) {
			if( root.val == toDel )
				root = root .next;
			else {
				RatajElem hd = root;	
				
				while( hd.next!= null && hd.next.val != toDel )
					hd = hd.next;
				
				if ( hd.next != null )
					hd.next = hd.next.next;
			}
		}
	}
}















