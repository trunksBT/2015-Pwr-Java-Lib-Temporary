package bt.collections.lists;

import bt.collections.interfaces.List;
import bt.collections.iterators.Iterator;

public class DirtyListDecorator extends ListDecorator {
	private boolean isDirty;
	public DirtyListDecorator(List tape) {
		super(tape);
		isDirty = false;
	}

	@Override
	public void add(Object val) {
		tape.add(val);
	}

	@Override
	public void clear() {
		tape.clear();
	}

	@Override
	public boolean contains(Object val) {
		return tape.contains(val);
	}

	@Override
	public Object delete(int idx) throws IndexOutOfBoundsException {
		return tape.delete(idx);
	}

	@Override
	public boolean delete(Object val) {
		return tape.delete(val);
	}

	@Override
	public Object get(int idx) throws IndexOutOfBoundsException {
		isDirty = true;
		return tape.get(idx);
	}

	@Override
	public int indexOf(Object val) {
		return tape.indexOf(val);
	}

	@Override
	public void insert(int idx, Object val) throws IndexOutOfBoundsException {
		tape.insert(idx,val);
	}

	@Override
	public boolean isEmpty() {
		return tape.isEmpty();
	}

	@Override
	public Object set(int idx, Object val) throws IndexOutOfBoundsException {
		return tape.set(idx,val);
	}

	@Override
	public int size() {
		return tape.size();
	}

	@Override
	public Iterator iterator() {
		return tape.iterator();
	}
	
	public boolean isDirty() {
		return isDirty;
	}
	public void setDirty(boolean val) {
		isDirty = val;
	}
}
