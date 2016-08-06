package bt.collections.trees;

// this entry could be "deleted" and "recovered"
public class BEntry extends EntryPure{
	private boolean isDeleted;
	
	public BEntry( Object key, Object val) {
		super(key, val);
	}
	
	public boolean isDeleted() {
		return isDeleted;
	}
	
	public void setDeleted(boolean val) {
		isDeleted = val;
	}
}
