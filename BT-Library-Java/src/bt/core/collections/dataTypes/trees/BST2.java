package bt.core.collections.dataTypes.trees;

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
		Node2 refToRoot = root;
		refToRoot = search( searchedVal, root);
		return refToRoot != null ? refToRoot.val : null;
	}

	private Node2 search(Object searchedVal, Node2 currNode) {
		if( currNode == null )
			return null;
		else {
			int localOrder = order.compare(searchedVal, currNode.val);
			if( localOrder < 0 )
				currNode.left = search(searchedVal, currNode.left);
			else if( localOrder > 0 )
				currNode.left = search(searchedVal, currNode.right);
			else
				currNode = currNode;
		}
		return currNode;
	}

	@Override
	public void insert(Object insertedVal) {
		root = insert(insertedVal, root);
		size++;
	}
	
	private Node2 insert(Object insertedVal, Node2 currNode) {
		if( currNode == null )
			currNode = new Node2(insertedVal);
		else {
			int localOrder  = order.compare(insertedVal, currNode.val);
			if( localOrder < 0)
				currNode.left = insert(insertedVal, currNode.left);
			else if ( localOrder > 0)
				currNode.right = insert(insertedVal, currNode.right);
			else
				throw new DuplicateItemException( insertedVal.toString());
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
			throw new ItemNotFoundException(searchedVal.toString());
		else {
			int localOrder = order.compare(searchedVal, currNode.val);
			if( localOrder < 0)
				currNode.left = delete(searchedVal, currNode.left);
			else if ( localOrder > 0 )
				currNode.right = delete(searchedVal, currNode.right);
			else if ( currNode.left != null && currNode.right != null)
				currNode.right = detachMin(currNode.right, currNode);
			else
				currNode =  ( currNode.left!= null ) ? currNode.left : currNode.right;
		}
		return currNode;
	}

	private Node2 detachMin(Node2 theMostLeft, Node2 deletedNode) {
		if( theMostLeft.left != null )
			theMostLeft.left = detachMin( theMostLeft.left, deletedNode);
		else {
			deletedNode.val = theMostLeft.val;
			theMostLeft = theMostLeft.right;
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
		BST2 other = (BST2) obj;
		if (root == null) {
			if (other.root != null)
				return false;
		} else if (!root.equals(other.root))
			return false;
		return true;
	}
}
