package bt.core.collections.dataTypes.trees;

import bt.core.algorithms.comparators.NaturalComparator;
import bt.core.algorithms.interfaces.Comparator;
import bt.core.collections.interfaces.Tree;
import bt.core.exceptions.DuplicateItemException;
import bt.core.exceptions.ItemNotFoundException;

public class BST2 implements Tree {
	private final Comparator order;
	private int size;
	private Node2 root;
	
	public BST2(Comparator order) {
		this.order = order;
		size = 0;
		root = null;
	}

	@Override
	public Object find(Object searchedVal) {
		Node2 copyOfRoot = root;
		copyOfRoot = find( searchedVal, root);
		return copyOfRoot != null ? copyOfRoot.val : null;
	}

	private Node2 find(Object searchedVal, Node2 currNode) {
		int localOrder;
		while( currNode != null && (localOrder = order.compare( searchedVal, currNode.val )) != 0) {
			if ( localOrder < 0)
				currNode.left = find( searchedVal, currNode.left);
			else
				currNode.right = find( searchedVal ,currNode.right);
		}
		return currNode;
	}

	@Override
	public void insert(Object newVal) {
		root = insert( newVal, root	);
		size++;
	}

	private Node2 insert(Object newVal, Node2 currNode) {
		if( currNode == null )
			currNode = new Node2( newVal);
		else {
			int localOrder = order.compare( newVal, currNode.val);
			if( localOrder< 0 )
				currNode.left = insert( newVal, currNode.left );
			else if( localOrder >0)
				currNode.right = insert( newVal, currNode.right);
			else
				throw new DuplicateItemException( newVal.toString() );		
		}
		return currNode;
	}

	@Override
	public void delete(Object searchedVal) {
		root = delete( searchedVal, root);
		size--;
	}

	private Node2 delete(Object searchedVal, Node2 currNode) {
		if( currNode == null )
			throw new ItemNotFoundException( searchedVal.toString());
		else {
			int localOrder = order.compare( searchedVal, currNode.val);
			if( localOrder < 0 )
				currNode.left = delete( searchedVal, currNode.left );
			else if( localOrder > 0 )
				currNode.right = delete(searchedVal, currNode.right);
			else if( currNode.left != null && currNode.right != null )
				currNode.right = detachMin( currNode.right, currNode);
			else
				currNode = ( currNode.left != null )? currNode.left : currNode.right;
		}
		return currNode;
	}

	private Node2 detachMin(Node2 theMostLeft, Node2 toDel) {
		if( theMostLeft.left != null )
			theMostLeft = detachMin( theMostLeft.left, toDel	);
		else {
			toDel.val = theMostLeft.val	;
			theMostLeft = theMostLeft.left;
		}
		return theMostLeft;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((root == null) ? 0 : root.hashCode());
		result = prime * result + size;
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
		BST2 other = (BST2) obj;
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
		if (size != other.size)
			return false;
		return true;
	}


}
