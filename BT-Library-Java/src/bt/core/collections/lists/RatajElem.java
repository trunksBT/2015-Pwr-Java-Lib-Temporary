package bt.core.collections.lists;

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
	
	public int getVal() {
		return val;
	}
	
	public void setNext(RatajElem next) {
		this.next = next;
	}
}
