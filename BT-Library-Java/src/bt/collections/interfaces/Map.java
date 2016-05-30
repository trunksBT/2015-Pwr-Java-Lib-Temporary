package bt.collections.interfaces;

public interface Map extends Iterable {
	public Object get(Object key);
	public Object set(Object key, Object val);
	public Object delete(Object key);
	public boolean contains(Object key);
	public void clear();
	public int size();
	public boolean isEmpty();
}
