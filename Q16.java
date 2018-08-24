package algorithmQuestions;

public class Q16 {
	
	private class Node{
		Node left;
		Node right;
		int value;
		
		Node(int v){
			this.value = v;
		}
	}
	
	Node topRoot;
	
	public boolean isSymetric(){
		if(topRoot == null){
			return true;
		}
		
		return isMirror(topRoot, topRoot);
	}
	
	public void createTree(){
		
		topRoot = new Node(0);
		topRoot.left = new Node(1);
		topRoot.right = new Node(1);
//		topRoot.left.left = new Node(2);
//		topRoot.right.right = new Node(2);
		topRoot.left.right = new Node(3);
		topRoot.right.left = new Node(3);
	}
	
	public boolean isMirror(Node root1, Node root2){
		
		if(root1.value != root2.value){
			return false;
		}
		
		if(root1.left == null &&
				root1.right == null &&
				root2.left == null &&
				root2.right == null)
			return true;
		if(root1.left.value == root2.right.value && root2.left.value == root1.right.value){
			return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Q16 q16 = new Q16();
		
		q16.createTree();
		System.out.println("Is tree sysmetric? " + q16.isSymetric());
		
	}

}
