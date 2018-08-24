package algorithmQuestions;

public class LinkedListNode {
	LinkedListNode next;
	int value;
	
	public LinkedListNode(int value){
		this.value = value;
	}
	
	public void nextNode(LinkedListNode n){
		this.next = n;
	}	
	
	public void printNode(LinkedListNode head){
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
}
