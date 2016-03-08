package bt.core.collections.dataTypes;

public class RatajElem {
	RatajElem next;
	int val;
	
	public RatajElem(int val, RatajElem next) {
		this.next = next;
		this.val = val;
	}
	
	public RatajElem(int val) {
		this.next = null;
		this.val = val;
	}
}
