package algorithmQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q3 {

	public Node depthFirst(Node root, int value){
		if (root == null){
			return null;
		}
		
		Stack<Node> stack = new Stack<Node>();
		
		stack.add(root);
		while(!stack.isEmpty()){
			Node node = stack.pop();
			
			if(node.value == value){
				System.out.print(node.value);

				return node;
			}
			
			if(node.right != null){
				stack.add(node.right);
			}
			if(node.left != null){
				stack.add(node.left);
			}
			System.out.print(node.value + " > ");

		}
		
		
		return null;
	}
	
	public Node breathFirst(Node root, int value) throws Exception{
		if(root == null){
//			throw new Exception();
			return null;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		while(!queue.isEmpty()){
			Node node = queue.remove();
			if(node.value == value){
				System.out.print(node.value);
				return node;
			}
			
			if(node.left != null){
				queue.add(node.left);
			}
			if(node.right != null){
				queue.add(node.right);
			}
			System.out.print(node.value + " > ");
		}
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		Q3 q3 = new Q3();
		Node root = new Node(5);
		Node left = new Node(3);
		Node right = new Node(8);
		root.left = left;
		root.right = right;
		
		left.left = new Node(1);
		left.right = new Node(4);
		
		right.left = new Node(6);
		right.right = new Node(10);
		
		int value = 8;
		
		Node node = q3.breathFirst(root, value);
		System.out.println(" Value: " + node.value);
		
		node = q3.depthFirst(root, value);
		System.out.println(" Value: " + node.value);
	}
}

class Node
{
	int value;
	Node left;
	Node right;
	
	Node(int value)
	{
		this.value = value;
		left = null;
		right = null;
	}
}

