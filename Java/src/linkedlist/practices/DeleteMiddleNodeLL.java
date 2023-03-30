package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1
public class DeleteMiddleNodeLL {

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 6 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 7 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 5 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 1 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		SinglyLinkedList.printSinglyLinkedList ( head );
		SinglyLinkedList.printSinglyLinkedList ( deleteMid ( head ) );
	}

	static SinglyLinkedListNode deleteMid(SinglyLinkedListNode head) {
		if (head == null || head.next == null) return null;
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head;
		SinglyLinkedListNode prevPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			prevPtr = slowPtr;
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		prevPtr.next = prevPtr.next.next;
		return head;
	}
}
