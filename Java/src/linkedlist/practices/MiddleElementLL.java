package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
public class MiddleElementLL {

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 33 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 84 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 96 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 41 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 67 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 60 );
		SinglyLinkedListNode temp6 = new SinglyLinkedListNode ( 45 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		temp5.next = temp6;
		SinglyLinkedList.printSinglyLinkedList ( head );
		System.out.println ( getMiddle ( head ) );
	}

	static int getMiddle(SinglyLinkedListNode head) {
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr.data;
	}
}
