package q6_reverseSinglyLinkedList;

class MainApp {

	public static void main(String[] args) {
		Node head = new Node(0);
		Node nextNode = new Node(1);
		head.next = nextNode;
		
		for (int i = 2; i <= 10; i++) {
			Node newNode = new Node(i);
			nextNode.next = newNode;
			nextNode = newNode;
		}
		head.printNode(head);
		
		ReverseLinkedList rll = new ReverseLinkedList();
		
		Node newHead = rll.reverse(head);
		newHead.printNode(newHead);
		
		//Only one node
		newHead = rll.reverse(new Node(10));
		newHead.printNode(newHead);
	}
}
