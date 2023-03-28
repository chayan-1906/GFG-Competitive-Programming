package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/remove-all-occurences-of-duplicates-in-a-linked-list/1
public class RemoveAllDuplicatesSortedLL {

	public static SinglyLinkedListNode removeAllDuplicates(SinglyLinkedListNode head) {
		SinglyLinkedListNode dummyPtr = new SinglyLinkedListNode ( 0 );
		dummyPtr.next = head;
		SinglyLinkedListNode currentPtr = head;
		SinglyLinkedListNode prevPtr = dummyPtr;
		while (currentPtr != null) {
			while (currentPtr.next != null && prevPtr.next.data == currentPtr.next.data)
				currentPtr = currentPtr.next;
			if (prevPtr.next == currentPtr) prevPtr = prevPtr.next;
			else prevPtr.next = currentPtr.next;
			currentPtr = currentPtr.next;
		}
		head = dummyPtr.next;
		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 23 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 28 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 28 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 35 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 49 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 49 );
		SinglyLinkedListNode temp6 = new SinglyLinkedListNode ( 49 );
		SinglyLinkedListNode temp7 = new SinglyLinkedListNode ( 53 );
		SinglyLinkedListNode temp8 = new SinglyLinkedListNode ( 53 );
		SinglyLinkedListNode temp9 = new SinglyLinkedListNode ( 53 );
		// 23 --> 28 --> 28 --> 35 --> 49 --> 49 --> 53 --> 53

		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		temp5.next = temp6;
		temp6.next = temp7;
		temp7.next = temp8;
		temp8.next = temp9;

		SinglyLinkedList.printSinglyLinkedList ( head );
		SinglyLinkedList.printSinglyLinkedList ( removeAllDuplicates ( head ) );
	}
}
