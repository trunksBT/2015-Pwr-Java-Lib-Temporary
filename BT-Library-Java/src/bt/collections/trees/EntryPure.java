package bt.collections.trees;

import bt.collections.interfaces.IEntry;

public class EntryPure implements IEntry{
	private final Object key;
	private Object val;
	
	public EntryPure(Object key, Object val) {
		assert key != null : "empty key";
		this.key = key;
		setValue(val);
	}
	
	public Object setValue(Object val) {
		Object oldVal = this.val;
		this.val = val;
		return oldVal;
	}
	
	@Override
	public Object getKey() {
		return key;
	}
	
	@Override
	public Object getVal() {
		return val;
	}
	
	public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;
            
        EntryPure other = (EntryPure) obj;
        return key.equals(other.key) && val.equals(other.val);
	}
	
	public int hashCode() {
		return key.hashCode() ^ val.hashCode();
	}
	
	public String toString() {
		return key + "->" + val;
	}
}
