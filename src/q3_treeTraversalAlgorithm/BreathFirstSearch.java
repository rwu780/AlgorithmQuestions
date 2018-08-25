package q3_treeTraversalAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {
	
	Queue<Node> queue;
	
	BreathFirstSearch(){
		queue = new LinkedList<Node>();
	}
	
	public Node search(Node root, int value) throws Exception {
		
		if(root == null) {
			throw new Exception("Root is null");
		}
		
		queue.clear();
		queue.add(root);
		
		StringBuilder sb = new StringBuilder();
		
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			
			if(node.getValue() == value) {
				sb.append(node.getValue());
				System.out.println(sb.toString());
				
				return node;
			}
			
			sb.append(node.getValue());
			sb.append(" > ");
			
			if(node.getLeft() != null) {
				queue.add(node.getLeft());
			}
			if(node.getRight() != null) {
				queue.add(node.getRight());
			}
		}
		
		throw new Exception("Node not exists");
		
	}

}
