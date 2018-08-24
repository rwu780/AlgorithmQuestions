package algorithmQuestions;

public class Q7 {
	
	public LinkedListNode findMiddle(LinkedListNode head){
		if(head == null){
			return null;
		}
		if(head.next == null){
			return head;
		}
		if(head.next.next == null){
			return head.next;
		}
		
		LinkedListNode fastRunner = head.next.next;
		LinkedListNode slowRunner = head.next;
		
		while(fastRunner.next != null){
			if(fastRunner.next.next == null){
				return slowRunner.next;
			}
			if(fastRunner.next.next != null){
				fastRunner = fastRunner.next.next;
				slowRunner = slowRunner.next;
			}
		}
		
		return slowRunner;
	}

	public static void main(String[] args) {
		Q7 q7 = new Q7();
		LinkedListNode head = new LinkedListNode(0);
		LinkedListNode nextNode = new LinkedListNode(1);
		head.next = nextNode;
		
		for (int i = 2; i < 10; i++) {
			LinkedListNode newNode = new LinkedListNode(i);
			nextNode.next = newNode;
			nextNode = newNode;
		}
		head.printNode(head);
		LinkedListNode middleNode = q7.findMiddle(head);
		System.out.println("Node Value: " +middleNode.value);
	}
}
