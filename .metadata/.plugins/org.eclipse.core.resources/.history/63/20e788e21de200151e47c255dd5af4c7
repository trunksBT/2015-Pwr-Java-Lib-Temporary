package bt.core.collections.dataTypes;

public class Element {
	Object val;
	Element prev;
	Element next;
	
	public Element(Object val) {
		this.val = val;
	}
	
	public void attachBefore(Element successor) {
		Element succPrev = successor.prev;
		
		this.next = successor;
		this.prev= succPrev;
		
		successor.prev = this;
		prev.next = this;
	}
	
	public void detach() {
		prev.next = next;
		next.prev = prev; 
	}
}
