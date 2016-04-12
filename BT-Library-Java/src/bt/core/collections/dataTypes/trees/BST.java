package bt.core.collections.dataTypes.trees;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.collections.interfaces.Tree;

public class BST implements Tree {
	private final Comparator order;
	private Node root;
	
	public BST(Comparator order) {
		this.order = order;
		root = null;
	}

	@Override
	public Object find(Object x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Object x) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object x) {
		// TODO Auto-generated method stub

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((root == null) ? 0 : root.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BST other = (BST) obj;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (root == null) {
			if (other.root != null)
				return false;
		} else if (!root.equals(other.root))
			return false;
		return true;
	}
}
