package linkedlist.tutorials;

public class DoublyLinkedList {

	public static void printDoublyLinkedList(DListNode head) {
		if (head != null) {
			while (head.next != null) {
				System.out.print ( head.data + " --> " );
				head = head.next;
			}
			System.out.println ( head.data + " --> null" );
		} else {
			System.out.println ( "null..." );
			System.out.println ( "Empty Linked List" );
		}
	}

	public static DListNode insertNodeAtBeginning(DListNode head, int data) {
		printDoublyLinkedList ( head );
		DListNode newnode = new DListNode ( data );
		if (head != null) {
			newnode.next = head;
			head.prev = newnode;
		}
		head = newnode;
		printDoublyLinkedList ( head );
		return head;
	}

	public static DListNode insertNodeAtEnd(DListNode head, int data) {
		printDoublyLinkedList ( head );
		DListNode newnode = new DListNode ( data );
		if (head == null) {
			head = newnode;
			printDoublyLinkedList ( head );
			return head;
		} else if (head.next == null) {
			newnode.prev = head;
			head.next = newnode;
			printDoublyLinkedList ( head );
			return head;
		}
		DListNode currentNode = head;
		while (currentNode.next != null) currentNode = currentNode.next;
		newnode.prev = currentNode;
		currentNode.next = newnode;
		printDoublyLinkedList ( head );
		return head;
	}

	public static DListNode reverseDoublyLinkedList(DListNode head) {
		printDoublyLinkedList ( head );
		if (head == null || head.next == null) return head;
		DListNode previousNode = null;
		DListNode currentNode = head;
		while (currentNode != null) {
			previousNode = currentNode.prev;
			currentNode.prev = currentNode.next;
			currentNode.next = previousNode;
			currentNode = currentNode.prev;
		}
		printDoublyLinkedList ( previousNode.prev );
		return previousNode.prev;
	}

	public static DListNode deleteFromBeginning(DListNode head) {
		printDoublyLinkedList ( head );
		if (head != null) {
			if (head.next == null) {
				head = null;
				printDoublyLinkedList ( head );
				return head;
			}
			DListNode currentNode = head;
			currentNode.next.prev = null;
			head = head.next;
			printDoublyLinkedList ( head );
		}
		return head;
	}

	public static DListNode deleteFromLast(DListNode head) {
		printDoublyLinkedList ( head );
		if (head != null) {
			if (head.next == null) {
				head = null;
				printDoublyLinkedList ( head );
				return head;
			}
			DListNode currentNode = head;
			DListNode previousNode = head;
			while (currentNode.next != null) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			previousNode.next = null;
		}
		printDoublyLinkedList ( head );
		return head;
	}

	public static void main(String[] args) {
		DListNode head = new DListNode ( 10 );
		DListNode temp1 = new DListNode ( 20 );
		DListNode temp2 = new DListNode ( 30 );
		DListNode temp3 = new DListNode ( 40 );
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		temp2.next = temp3;
		temp3.prev = temp2;
		temp3.next = null;  // optional statement
//		printDoublyLinkedList ( head );
		/**
		 * INSERT AT BEGINNING
		 */
		/*insertNodeAtBeginning ( head, 5 );
//		insertNodeAtBeginning ( null, 5 );*/

		/**
		 * INSERT AT LAST
		 */
		/*insertNodeAtEnd ( head, 5 );
//		insertNodeAtLast ( null, 5 );*/

		/**
		 * REVERSE LINKED LIST
		 */
		/*reverseDoublyLinkedList ( head );
//		reverseDoublyLinkedList ( null );*/

		/**
		 * DELETE FIRST
		 */
		/*deleteFromBeginning ( head );
//		deleteFromBeginning ( null );*/

		/**
		 * DELETE LAST
		 */
		/*deleteFromLast ( head );
//		deleteFromLast ( null );*/
	}

	public static class DListNode {
		public int data;
		public DListNode prev;
		public DListNode next;

		public DListNode() {
		}

		public DListNode(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
}
