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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((prev == null) ? 0 : prev.hashCode());
		result = prime * result + ((val == null) ? 0 : val.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (prev == null) {
			if (other.prev != null)
				return false;
		} else if (!prev.equals(other.prev))
			return false;
		if (val == null) {
			if (other.val != null)
				return false;
		} else if (!val.equals(other.val))
			return false;
		return true;
	}
}
