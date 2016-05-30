package bt.collections.trees;

import bt.algorithms.interfaces.Comparator;
import bt.collections.interfaces.IEntry;
import bt.collections.interfaces.List;
import bt.collections.interfaces.Map;
import bt.collections.iterators.Iterator;
import bt.collections.lists.ArrayList;

public class BTreeMap implements Map{
	private static final int MIN_KEYS_PER_NODE = 2;
	private final Comparator order;
	private final int MAX_KEYS_PER_NODE;
	private BNode root;
	private int size;
	
	public BTreeMap(Comparator order, int maxKeysPerNode) {
		assert order != null : "comparatorNotDefined";
		assert maxKeysPerNode >= MIN_KEYS_PER_NODE :
			"upper limit of keys per node is lower than required";
		
		this.order = order;	
		MAX_KEYS_PER_NODE = maxKeysPerNode;
		clear();
	}
	
	@Override
	public Iterator iterator() {
		List temp = new ArrayList(size);
		root.traverse(temp);
		return temp.iterator();
	}

	@Override
	public Object get(Object key) {
		IEntry entry = root.search(key);
		return entry!=null ? entry.getVal() : null;
	}

	@Override
	public Object set(Object key, Object val) {
		Object oldVal = root.set(key,val);
		if(root.isFull()) {
			BNode newRoot = new BNode(false);
			root.split(newRoot, 0);
			root = newRoot;
		}
		return oldVal;
	}

	@Override
	public Object delete(Object key) {
		BEntry entry = root.search(key);	
		if(entry == null)
			return null;
		
		entry.setDeleted(true);
		--size;
		
		return entry.setValue(null);
	}

	@Override
	public boolean contains(Object key) {
		return root.search(key) != null;
	}

	@Override
	public void clear() {
		root = new BNode(true);
		size = 0 ;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	public final class BNode {
		private final List entries = new ArrayList(MAX_KEYS_PER_NODE+1);
		private final List children;
		
		public BNode(boolean isLeaf) {
			children = !isLeaf 
					? new ArrayList(MAX_KEYS_PER_NODE+2)
							: new ArrayList();
		}	
		
		public boolean isFull() {
			return entries.size() > MAX_KEYS_PER_NODE;
		}
		
		public BEntry search(Object key) {
			int idx = indexOf(key);
			if(idx >=0) {
				BEntry entry = (BEntry) entries.get(idx);
				return !entry.isDeleted() ? entry : null;
			}
			return !isLeaf() ? 
					((BNode)children.get(-(idx+1)) ).search(key) : 
						null;
		}
		
		public Object set(Object key, Object val) {
			int idx = indexOf(key);
			if(idx >= 0)
				return ((EntryPure)entries.get(idx)).setValue(val);
			return set(key, val, -(idx+1));
		}
		
		private Object set(Object key, Object val, int idx) {
			if( isLeaf()) {
				entries.insert(idx, new BEntry(key,val));
				++size;
				return null;
			}
			BNode child = ((BNode) children.get(idx));
			Object oldVal = child.set(key,val);
			
			if(child.isFull()){
				child.split(this,idx);
			}
			
			return oldVal;
		}
		
		private void split(BNode parent, int insertionPoint) {
			
			BNode sibling = new BNode(isLeaf());
			
			int middle = entries.size() /2;
			
			move(entries, middle+1, sibling.entries);
			move(children, middle+1, sibling.children);
			
			parent.entries.insert(insertionPoint, entries.delete(middle));
			
			if(parent.children.isEmpty())
				parent.children.insert(insertionPoint, this);
			parent.children.insert(insertionPoint +1, sibling);
		}

		private void move(List source, int idxFrom, List target) {
			assert source != null : "source is null";
			assert target != null : "targe is null";
			
			while(idxFrom < source.size())
				target.add(source.delete(idxFrom));
		}
		
		public void traverse(List outTape) {
			assert outTape != null : "outputListNull";
			
			Iterator itChild = children.iterator();
			Iterator itEntry = entries.iterator();
			itChild.first();	itEntry.first();
			while(!itChild.isDone() || !itEntry.isDone()) {
				if( !itChild.isDone() ) {
					((BNode)itChild.current()).traverse(outTape);
					itChild.next();
				}
				if( !itEntry.isDone() ) {
					BEntry entry = ((BEntry)itEntry.current());
					if( !entry.isDeleted() )
						outTape.add(entry);
					itEntry.next();
				}
			}
		}
		
		private int indexOf(Object key) {
			int lowerIdx = 0;
			int upperIdx = entries.size() -1;
			while(lowerIdx <= upperIdx) {
				int idx = lowerIdx + (upperIdx - lowerIdx)/2;
				int comp = order.compare(key, ((IEntry)entries.get(idx)).getKey());
				if(comp == 0)
					return idx;
				else if(comp < 0)
					upperIdx = idx - 1;
				else
					lowerIdx = idx + 1;
			}
			return -(lowerIdx+1);
		}
		
		private boolean isLeaf() {
			return children.size() == 0;
		}
	}
}
