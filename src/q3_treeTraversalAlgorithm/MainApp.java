package q3_treeTraversalAlgorithm;

public class MainApp {

	public static void main(String[] args) throws Exception{
		Node root = new Node(5);
		Node left = new Node(3);
		Node right = new Node(8);
		root.left = left;
		root.right = right;
		
		left.left = new Node(1);
		left.right = new Node(4);
		
		right.left = new Node(6);
		right.right = new Node(10);
		
		int value = 10;
		
		BreathFirstSearch bfs = new BreathFirstSearch();
		Node node = bfs.search(root, value);
		System.out.println("Value: " + node.value);
		
		DepthFirstSearch dfs = new DepthFirstSearch();
		node = dfs.search(root, value);
		System.out.println("Value: " + node.value);
	}
}
