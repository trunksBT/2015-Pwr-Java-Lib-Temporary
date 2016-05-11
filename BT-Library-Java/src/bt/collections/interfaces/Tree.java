package bt.collections.interfaces;

public interface Tree {
	public Object find(Object x);
    public void insert(Object x);
    public void delete(Object x);
    public int size();
}
