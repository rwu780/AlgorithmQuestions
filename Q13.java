package algorithmQuestions;

public class Q13 {
	
	private class Node{
		Node left;
		Node right;
		int value;
		
		Node(int v){
			this.value = v;
		}
	}
	
	Node topRoot;
	
	public Node search(int value) throws Exception{
		Node searchNode = searchNode(topRoot, value);
		
		if(searchNode == null){
			throw new Exception("Node does not exists;");
		}
		return searchNode;
	}
	
	// Search
	public Node searchNode(Node root, int value) throws Exception{
		if(root == null){
			return null;
		}
		
		if(root.value == value){
			return root;
		}
		if(root.value > value){
			return searchNode(root.left, value);
		}
		else{
			return searchNode(root.right, value);
		}
		
	}
	
	public void insert(int value){
		topRoot = insertNode(topRoot, value);
		balanceTree();
	}
	
	// Insert
	public Node insertNode(Node root, int value){
		if(root == null){
			root = new Node(value);
			return root;
		}
		
		if(value >= root.value){
			root.right = insertNode(root.right, value);
		}
		if(value < root.value){
			root.left = insertNode(root.left, value);
		}
		return root;
	}
	
	public void balanceTree(){
	
	}
	
	// Delete
	public void delete(int value) throws Exception{
		if(topRoot == null){
			throw new Exception("Root is null");
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		Q13 q13 = new Q13();
		
		q13.insert(10);
		q13.insert(5);
		q13.insert(15);
		
		
	}
}
