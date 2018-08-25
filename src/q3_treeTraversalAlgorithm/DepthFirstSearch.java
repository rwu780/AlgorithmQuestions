package q3_treeTraversalAlgorithm;

import java.util.Stack;

public class DepthFirstSearch {
	
	Stack<Node> stack;
	
	DepthFirstSearch(){
		stack = new Stack<Node>();
	}
	
	public Node search(Node root, int value) throws Exception{
		
		if(root == null) {
			throw new Exception("Root is null");
		}
		
		stack.clear();
		stack.add(root);
		
		StringBuilder sb = new StringBuilder();
		
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			if(node.getValue() == value) {
				
				sb.append(node.getValue());
				System.out.println(sb.toString());
				
				return node;
			}
			
			sb.append(node.getValue());
			sb.append(" > ");
			
			if(node.getRight() != null) {
				stack.add(node.getRight());
			}
			if(node.getLeft() != null) {
				stack.add(node.getLeft());
			}
		}
		
		throw new Exception("Node not exists");
	}

}
