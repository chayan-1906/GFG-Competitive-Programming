package linkedlist;

public class CircularLinkedList {

	public static void printCircularSingleLinkedList(CircularLinkedListNode head) {
		if (head != null) {
			CircularLinkedListNode currentNode = head;
			while (currentNode.next != head && currentNode.next != null) {
				System.out.print ( currentNode.data + " --> " );
				currentNode = currentNode.next;
			}
			System.out.println ( currentNode.data + " --> head" );
		} else {
			System.out.println ( "null..." );
			System.out.println ( "Empty Linked List" );
		}
	}

	public static CircularLinkedListNode insertNodeAtBeginning(CircularLinkedListNode head, int data) {
		printCircularSingleLinkedList ( head );
		CircularLinkedListNode newnode = new CircularLinkedListNode ( data );
		/// TC = O(n)
		if (head == null) {
			newnode.next = head;
			head = newnode;
			printCircularSingleLinkedList ( head );
			return head;
		}
		CircularLinkedListNode currentNode = head;
		while (currentNode.next != head) currentNode = currentNode.next;
		currentNode.next = newnode;
		newnode.next = head;
		head = newnode;
		printCircularSingleLinkedList ( head );
		/// TC = O(1) --> Hint: Add the newnode as the second node (pos = 2) and swap head & newnode data
		return head;
	}

	public static CircularLinkedListNode insertNodeAtEnd(CircularLinkedListNode head, int data) {
		printCircularSingleLinkedList ( head );
		CircularLinkedListNode newnode = new CircularLinkedListNode ( data );
		/// TC = O(n)
		if (head == null) {
			newnode.next = head;
			head = newnode;
			printCircularSingleLinkedList ( head );
			return head;
		}
		CircularLinkedListNode currentNode = head;
		while (currentNode.next != head) currentNode = currentNode.next;
		currentNode.next = newnode;
		newnode.next = head;
		printCircularSingleLinkedList ( head );
		/// TC = O(1) --> Hint: Add the newnode as the second node (pos = 2) and swap head & newnode data
		return head;
	}

	public static CircularLinkedListNode deleteFromBeginning(CircularLinkedListNode head) {
		printCircularSingleLinkedList ( head );
		if (head == null || head.next == head) {
			head = null;
			printCircularSingleLinkedList ( head );
			return head;
		}
		/// TC = O(n)
		CircularLinkedListNode currentNode = head;
		while (currentNode.next != head) currentNode = currentNode.next;
		currentNode.next = head.next;
		head = head.next;
		printCircularSingleLinkedList ( head );
		/// TC = O(1) --> Hint: Delete the second node (pos = 2) and copy deleted node's data in head
		return head;
	}

	public static CircularLinkedListNode deleteFromPosition(CircularLinkedListNode head, int pos) {
		printCircularSingleLinkedList ( head );
		if (head == null || head.next == head) {
			head = null;
			printCircularSingleLinkedList ( head );
			return head;
		} else if (pos == 1) {
			head = head.next;
			head.next = head;
			printCircularSingleLinkedList ( head );
			return head;
		}
		CircularLinkedListNode previousNode = head;
		CircularLinkedListNode currentNode = head;
		for (int i = 1; i < pos; i++) {
			if (currentNode.next == head) {
				System.out.println ( "Invalid position" );
				return head;
			}
			System.out.println ( previousNode );
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		previousNode.next = currentNode.next;
		printCircularSingleLinkedList ( head );
		return head;
	}

	public static void main(String[] args) {
		CircularLinkedListNode head = new CircularLinkedListNode ( 10 );
//		head.next = head;
		CircularLinkedListNode temp1 = new CircularLinkedListNode ( 20 );
//		CircularLinkedListNode temp2 = new CircularLinkedListNode ( 30 );
//		CircularLinkedListNode temp3 = new CircularLinkedListNode ( 40 );
		head.next = temp1;
		temp1.next = head;
//		temp1.next = temp2;
//		temp2.next = temp3;
//		temp3.next = head;
//		printCircularSingleLinkedList ( head );

		/**
		 * INSERT AT BEGINNING
		 */
		/*insertNodeAtBeginning ( head, 5 );
//		insertNodeAtBeginning ( null, 5 );*/

		/**
		 * INSERT AT END
		 */
		/*insertNodeAtEnd ( head, 5 );
//		insertNodeAtEnd ( null, 5 );*/

		/**
		 * DELETE FROM BEGINNING
		 */
		/*deleteFromBeginning ( head );
//		deleteFromBeginning ( null );*/

		/**
		 * DELETE FROM SPECIFIC FROM POS
		 */
		/*deleteFromPosition ( head, 1 );
//		deleteFromPosition ( null, 2 );*/
	}

	public static class CircularLinkedListNode {
		int data;
		CircularLinkedListNode next;

		public CircularLinkedListNode() {
		}

		public CircularLinkedListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
}
