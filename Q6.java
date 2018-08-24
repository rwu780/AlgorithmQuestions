package algorithmQuestions;

public class Q6 {
	
	public LinkedListNode reverseList(LinkedListNode head){
		
		
		
		if(head == null){
			return null;
		}
		
		LinkedListNode currentNode = new LinkedListNode(head.value);
		
		while(head.next != null){
			LinkedListNode prevNode = new LinkedListNode(head.next.value);
			prevNode.next = currentNode;
			
			currentNode = prevNode;
			head = head.next;
		}
		
		
		return currentNode;
		
	}
	
	public static void main(String[] args) {
		Q6 q6 = new Q6();
		LinkedListNode head = new LinkedListNode(0);
		LinkedListNode nextNode = new LinkedListNode(1);
		head.next = nextNode;
		
		for (int i = 2; i <= 10; i++) {
			LinkedListNode newNode = new LinkedListNode(i);
			nextNode.next = newNode;
			nextNode = newNode;
		}
		head.printNode(head);
		
		LinkedListNode newNode = q6.reverseList(head);
		head.printNode(newNode);
	}
}

