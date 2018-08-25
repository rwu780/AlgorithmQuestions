package q7_findMiddleOfASinglyLinkedList;

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
		
		FindMiddle fm = new FindMiddle();
		Node mNode = fm.find(head);
		System.out.println(mNode.getValue());
		
		head = new Node(1);
		nextNode = new Node(2);
		head.next = nextNode;
		
		for (int i = 3; i <= 10; i++) {
			Node newNode = new Node(i);
			nextNode.next = newNode;
			nextNode = newNode;
		}
		head.printNode(head);
		
		mNode = fm.find(head);
		System.out.println(mNode.getValue());
		
	}
}
