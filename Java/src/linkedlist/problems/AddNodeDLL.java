package linkedlist.problems;

import linkedlist.DoublyLinkedList.DListNode;

public class AddNodeDLL {

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

	public static void main(String[] args) {
		DListNode head = new DListNode ( 2 );
		DListNode temp1 = new DListNode ( 4 );
		DListNode temp2 = new DListNode ( 5 );
//		DListNode temp3 = new DListNode ( 40 );
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
//		temp2.next = temp3;
//		temp3.prev = temp2;
//		temp3.next = null;  // optional statement
		addNode ( head, 2, 6 );
	}

	public static void addNode(DListNode head_ref, int pos, int data) {
		printDoublyLinkedList ( head_ref );
		DListNode newnode = new DListNode ( data );
		if (pos == 0) {
			newnode.next = head_ref;
			head_ref = newnode;
			printDoublyLinkedList ( head_ref );
			return;
		}
		DListNode currentNode = head_ref;
		for (int i = 0; i <= pos && currentNode.next != null; i++)
			currentNode = currentNode.next;
		newnode.prev = currentNode;
		newnode.next = currentNode.next;
		currentNode.next = newnode;
		currentNode.next.prev = newnode;
		printDoublyLinkedList ( head_ref );
	}
}
