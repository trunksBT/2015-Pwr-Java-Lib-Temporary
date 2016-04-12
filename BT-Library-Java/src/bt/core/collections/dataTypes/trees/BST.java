package bt.core.collections.dataTypes.trees;

import bt.core.algorithms.interfaces.Comparator;
import bt.core.collections.interfaces.Tree;
import bt.core.exceptions.DuplicateItemException;
import bt.core.exceptions.ItemNotFoundException;

public class BST implements Tree {
	private final Comparator order;
	private Node root;
	private int size;
	
	public BST(Comparator order) {
		this.order = order;
		root = null;
	}

	@Override
	public Object find(Object searchedVal) {
		Node refToNode = search(searchedVal);
		return refToNode != null ? refToNode.val : null;
	}

	private Node search(Object searchedVal) {
		Node currNode = root;
		int localOrder = 0;
		while( currNode != null && (localOrder = order.compare(searchedVal,currNode.val))!= 0)
			currNode = localOrder < 0 ? currNode.left : currNode.right;
		return currNode;
	}

	@Override
	public void insert(Object insertedVal) {
		root = insert(insertedVal,root);
		size++;
	}

	private Node insert(Object insertedVal, Node currNode) {
		if(currNode == null)
			currNode = new Node(insertedVal);
		else {
			int localOrder = order.compare(insertedVal,currNode.val);
			if(localOrder<0)
				currNode.left = insert(insertedVal, currNode.left);
			else if( localOrder >0)
				currNode.right = insert(insertedVal,currNode.right);
			else
				throw new DuplicateItemException( insertedVal.toString() );
		}
		return currNode;
	}

	@Override
	public void delete(Object searchedVal) {
		root = delete(searchedVal, root);
		size--;
	}

	private Node delete(Object searchedVal, Node currNode) {
		if( currNode == null )
			throw new ItemNotFoundException(searchedVal.toString());
		else {
			int localOrder = order.compare(searchedVal, currNode.val);
			if(localOrder < 0)
				currNode.left = delete(searchedVal, currNode.left);
			else if(localOrder > 0)
				currNode.right = delete(searchedVal, currNode.right);
			else if(currNode.left != null && currNode.right != null)
				currNode.right = detachMin(currNode.right, currNode);
			else
				currNode = (currNode.left != null) ? currNode.left : currNode.right;
		}
		return currNode;
	}

	private Node detachMin(Node tree, Node del) {
		if( tree.left != null) // if isn't the most left
			tree.left = detachMin(tree.left, del); // go left
		else {
			del.val = tree.val; // interchange values
			tree = tree.right; // delete the most left node 
		}
		return tree;
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
		BST other = (BST) obj;
		if (root == null) {
			if (other.root != null)
				return false;
		} else if (!root.equals(other.root))
			return false;
		return true;
	}

	@Override
	public int size() {
		return size;
	}
}
