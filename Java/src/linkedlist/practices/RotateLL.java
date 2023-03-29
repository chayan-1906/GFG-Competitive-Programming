package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1
public class RotateLL {

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 1 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 3 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 5 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 60 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		SinglyLinkedList.printSinglyLinkedList ( head );
//		SinglyLinkedList.printSinglyLinkedList ( reverseLL ( head ) );
		SinglyLinkedList.printSinglyLinkedList ( rotate ( head, 3 ) );
//		1 --> 2 --> 3 --> 4 --> 5 --> 60 --> null            k = 2
//      2 --> 3 --> 4 --> 5 --> 60 --> 1 --> null
//      3 --> 4 --> 5 --> 60 --> 1 --> 2 --> null
	}

	public static SinglyLinkedListNode rotate(SinglyLinkedListNode head, int k) {
		SinglyLinkedListNode current = head;
		SinglyLinkedListNode temp;
		while (current.next != null) current = current.next;
		current.next = head;    // making circular linked list
		for (int i = 0; i < k; i++) current = current.next;
		temp = current.next;
		head = temp;
		current.next = null;
		return head;
	}

	/*public static SinglyLinkedListNode reverseLL(SinglyLinkedListNode head) {
		SinglyLinkedListNode prevNode = null;
		SinglyLinkedListNode current = head;
		SinglyLinkedListNode nextNode = null;
		while (current != null) {
			nextNode = current.next;
			current.next = prevNode;
			prevNode = current;
			current = nextNode;
		}
		return prevNode;
	}*/
}
