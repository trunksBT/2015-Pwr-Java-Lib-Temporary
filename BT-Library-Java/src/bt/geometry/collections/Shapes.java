package bt.geometry.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import bt.geometry.shapes.Shape;

@SuppressWarnings("serial")
public class Shapes extends HashSet<Shape> implements Set<Shape> {

	@Override
	public boolean add(Shape arg0) {
		return super.add(arg0);
	}

	@Override
	public boolean addAll(Collection<? extends Shape> arg0) {
		return super.addAll(arg0);
	}

	@Override
	public void clear() {
		super.clear();
	}

	@Override
	public boolean contains(Object arg0) {
		return super.contains(arg0);
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		return super.containsAll(arg0);
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	@Override
	public Iterator<Shape> iterator() {
		return super.iterator();
	}

	@Override
	public boolean remove(Object arg0) {
		return super.remove(arg0);
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		return super.removeAll(arg0);
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		return super.retainAll(arg0);
	}

	@Override
	public int size() {
		return super.size();
	}

	@Override
	public Object[] toArray() {
		return super.toArray();
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		return super.toArray(arg0);
	}
}
