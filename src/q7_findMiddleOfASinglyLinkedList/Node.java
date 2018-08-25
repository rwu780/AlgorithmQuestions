package q7_findMiddleOfASinglyLinkedList;

class Node {
	Node next;
	int value;
	
	public Node(int value){
		this.value = value;
	}
	
	public void printNode(Node head){

		while(head != null){
			if(head.next == null){
				// Handle Last Value
				System.out.println(head.value);
			}
			else{
				// Handle intermediate Values
				System.out.print(head.value + " -> ");
			}
			head = head.next;
		}
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}	
}


