package bt.collections.elems;

public class Tuple<W,S> implements Comparable<Tuple<W,S>>{
	public W key;
	public S value;
	
	public Tuple(W key, S value)
	{
		this.key= key;
		this.value= value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tuple<W, S> other = (Tuple<W, S>) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public int compareTo(Tuple<W,S> o) {
		int retVal = 0;
		
		if (value instanceof Double)
		{
			retVal = (int)(((Double)value).doubleValue()-((Double)o.value).doubleValue());
		}else
		if (value instanceof String)
		{
			retVal = ((String) value).compareTo((String) o.value);
		}
		return retVal;
	}
}
