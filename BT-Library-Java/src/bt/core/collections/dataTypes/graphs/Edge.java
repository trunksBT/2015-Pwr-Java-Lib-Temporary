package bt.core.collections.dataTypes.graphs;

public class Edge<V,W> {
	V start;
	V end;
	W wage;
	
	public Edge() {
		start = end = null;
		wage = null;
	}
	public Edge(V start, V end, W wage) {
		this.start = start;
		this.end = end;
		this.wage = wage;
	}

	public V getStart() {
		return start;
	}
	
	public V getEnd() {
		return end;
	}
	
	public W getWeight() {
		return wage;
	}
	
	public String toString() {
		return "St:"+ start + " End:"+ end +" W:"+ wage;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((wage == null) ? 0 : wage.hashCode());
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
		Edge other = (Edge) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (wage == null) {
			if (other.wage != null)
				return false;
		} else if (!wage.equals(other.wage))
			return false;
		return true;
	}
	
	
}
