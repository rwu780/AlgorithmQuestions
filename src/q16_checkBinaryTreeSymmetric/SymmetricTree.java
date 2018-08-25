package q16_checkBinaryTreeSymmetric;

public class SymmetricTree {
	
	public boolean isSymmetric(Node root) {
		if(root == null) {
			return true;
		}
		return isMirror(root, root);
	}
	
	public boolean isMirror(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		else if(root1 == null || root2 == null) {
			return false;
		}
		
		if(root1.getValue() != root2.getValue()) {
			return false;
		}
		
		return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left); 
	}
}
