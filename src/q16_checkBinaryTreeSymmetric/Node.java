package q16_checkBinaryTreeSymmetric;

class Node {
	Node left;
	Node right;
	int value;
	
	Node(int v){
		this.value = v;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
}
