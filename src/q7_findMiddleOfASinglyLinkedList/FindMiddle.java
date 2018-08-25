package q7_findMiddleOfASinglyLinkedList;

public class FindMiddle {

	public Node find(Node head) {
		if(head == null) {
			return null;
		}
		Node fastRunner = head;
		Node slowRunner = head;
		
		while(fastRunner.next != null) {
			if(fastRunner.next.next != null) {
				fastRunner = fastRunner.next.next;
				slowRunner = slowRunner.next;
			}
			else {
				return slowRunner.next;
			}
		}
		return slowRunner;
	}
}
