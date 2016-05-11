package bt.collections.interfaces;

public interface List extends Iterable{
	public void add(Object val);
	public void clear();
	public boolean contains(Object val);
	public Object delete(int idx) throws IndexOutOfBoundsException;
	public boolean delete(Object val);
	public Object get(int idx) throws IndexOutOfBoundsException;
	public int indexOf(Object val);
	public void insert(int idx, Object val) throws IndexOutOfBoundsException;
	public boolean isEmpty();
	public Object set(int idx, Object val) throws IndexOutOfBoundsException;
	public int size();
}
