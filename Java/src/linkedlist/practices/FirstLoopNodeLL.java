package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/44bb5287b98797782162ffe3d2201621f6343a4b/1
public class FirstLoopNodeLL {

	public static int findFirstNode(SinglyLinkedListNode head) {
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head.next;
		while (slowPtr != fastPtr) {
			if (fastPtr == null || fastPtr.next == null) return -1;
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		slowPtr = head;
		while (slowPtr != fastPtr.next) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		return slowPtr.data;
	}

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 1 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 3 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 5 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp1;
//		SinglyLinkedList.printSinglyLinkedList ( head );
//		System.out.println ( findFirstNode ( head ) );
	}
}
