package q13_binarySearchTree;

public class BinarySearchTree {
	
	Node topRoot;
	
	public Node search(int value) {
		return searchNode(topRoot, value);
	}
	
	public Node searchNode(Node root, int value) {
		if(root.getValue() == value) {
			return root;
		}
		if(root.getValue() > value) {
			if(root.left == null) {
				return null;
			}
			return searchNode(root.getLeft(), value);
		}
		
		if(root.getValue() < value) {
			if(root.right == null) {
				return null;
			}
			return searchNode(root.getRight(), value);
		}
		return null;
	}
	
	public void insert(int value) {
		if(topRoot == null) {
			topRoot = new Node(value);
			return;
		}
		insertNode(topRoot, value);
	};
	
	public void insertNode(Node root, int value) {
		if(value >= root.getValue()) {
			if(root.getRight() == null) {
				root.setRight(new Node(value));
				return;
			}
			else {
				insertNode(root.getRight(), value);
			}	
		}
		if(value < root.getValue()) {
			if(root.getLeft() == null) {
				root.setLeft(new Node(value));
				return;
			} else {
				insertNode(root.getLeft(), value);
			}
		}
	}
	
	public void delete(int value) {
		if(search(value) == null) {
			return;
		}
		deleteNode(topRoot, value);
	}
	
	public Node deleteNode(Node root, int value) {
		if(root == null) {
			return null;
		}
		
		if(root.getValue() == value) {
			if(root.getLeft() == null && root.getRight() == null) {
				// Both Left and Right Child are null
				// Directly Remove
				return null;
			}
			else if(root.getLeft() == null && root.getRight() != null) {
				// Replace with right child
				return root.getRight();
			}
			else if(root.getLeft() != null && root.getRight() == null) {
				// Replace with Left Child
				return root.getLeft();
			}
			else {
				//Replace with Smallest value on the right sub tree;
				int minValue = smallest(root.right);
				root.setValue(minValue);
				root.setRight(deleteNode(root.right, minValue));
				return root;
			}
		}
		if(root.getValue() > value) {
			root.setLeft(deleteNode(root.left, value));
		}
		if(root.getValue() < value) {
			root.setRight(deleteNode(root.right, value));
		}
		
		return root;
	}
	
	public int smallest(Node root) {
		if(root.left != null) {
			return smallest(root.left);
		}
		else {
			return root.getValue();
		}
	}
}
