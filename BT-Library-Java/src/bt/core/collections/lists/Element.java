package bt.core.collections.lists;

public class Element {
	Element prev;
	Element next;
	Object val;
	
	public Element(Object val) {
		this.val = val;
	}
	
	public void attachBefore(Element successor) {
		Element succPrev = successor.prev;
		
		next = successor;
		prev = succPrev;
		
		successor.prev = this;
		succPrev.next = this;
	}
	
	public void detach() {
		prev.next = next;
		next.prev = prev;
	}
}
