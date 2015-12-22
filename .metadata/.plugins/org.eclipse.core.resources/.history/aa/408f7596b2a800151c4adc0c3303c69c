package Bt.Core.Collections;

public class Tuple<W,S> implements Comparable<Tuple<W,S>>{
	public W key;
	public S value;
	
	public Tuple(W aKey, S aValue)
	{
		key= aKey;
		value= aValue;
	}

	@Override
	public int compareTo(Tuple<W,S> o) {
		int retVal = 0;
		
		if (value instanceof Double)
		{
			retVal = (int)(((Double)value).doubleValue()-((Double)o.value).doubleValue());
		}
		return retVal;
	}
}
