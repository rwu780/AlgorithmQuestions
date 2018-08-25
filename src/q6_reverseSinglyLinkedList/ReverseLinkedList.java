package q6_reverseSinglyLinkedList;

public class ReverseLinkedList {

	public Node reverse(Node head) {
		if(head == null) {
			return null;
		}
		
		if(head.getNext() == null) {
			return head;
		}
		
		Node currentNode = new Node(head.getValue());
		
		while(head.next != null) {
			Node prevNode = new Node(head.getNext().getValue());
			prevNode.next = currentNode;
			
			currentNode = prevNode;
			head = head.next;
		}
		
		return currentNode;
	}	
}
