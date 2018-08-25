package q16_checkBinaryTreeSymmetric;

public class MainApp {

	public static void main(String[] args) {
		Node topRoot = new Node(0);
		topRoot.left = new Node(1);
		topRoot.right = new Node(1);
		topRoot.left.left = new Node(2);
		topRoot.left.left.left = new Node(5);
		topRoot.right.right = new Node(2);
		topRoot.left.right = new Node(3);
		topRoot.right.left = new Node(3);
		topRoot.right.right.right = new Node(5);
		
		SymmetricTree st = new SymmetricTree();
		System.out.println("Is tree sysmetric? " + st.isSymmetric(topRoot));
	}
}
