package bt.core.collections.elems;

public class Tuple<W,S> implements Comparable<Tuple<W,S>>{
	public W key;
	public S value;
	
	public Tuple(W key, S value)
	{
		this.key= key;
		this.value= value;
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
