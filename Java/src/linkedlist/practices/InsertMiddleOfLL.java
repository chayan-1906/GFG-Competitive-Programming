package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1
public class InsertMiddleOfLL {

	public static SinglyLinkedListNode insertInMid(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode ( data );
		if (head == null) {
			newnode.next = head;
			head = newnode;
			return head;
		} else if (head.next == null) {
			head.next = newnode;
			return head;
		}
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head;
		SinglyLinkedListNode prevNode = head;
		while (fastPtr != null && fastPtr.next != null) {
			prevNode = slowPtr;
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		// handle odd length
		if (fastPtr != null) {
			prevNode = slowPtr;
			slowPtr = slowPtr.next;
		}
		newnode.next = prevNode.next;
		prevNode.next = newnode;
		return head;
	}

	public static void main(String[] args) {
		/*SinglyLinkedListNode head = new SinglyLinkedListNode ( 10 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 20 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 40 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 50 );*/
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 242 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 748 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 114 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 441 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 751 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		SinglyLinkedList.printSinglyLinkedList ( head );
//		SinglyLinkedList.printSinglyLinkedList ( insertInMid ( head, 30 ) );
		SinglyLinkedList.printSinglyLinkedList ( insertInMid ( head, 909 ) );
	}
}
