package linkedlist.problems;

import linkedlist.SinglyLinkedList.SinglyLinkedListNode;

public class InsertInMiddle {

	public static void printSingleLinkedList(SinglyLinkedListNode head) {
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
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 219 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 690 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 315 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 427 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 285 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 163 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		temp5.next = null;
		insertInMid ( head, 146 );
//		insertInMid ( null, 146 );
	}

	// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-LinkedList/problem/insert-in-middle-of-linked-list
	// TODO: FAILING FOR SOME TEST CASES, ASKED IN GFG
	public static SinglyLinkedListNode insertInMid(SinglyLinkedListNode head, int data) {
		printSingleLinkedList ( head );
		SinglyLinkedListNode newNode = new SinglyLinkedListNode ( data );
		if (head == null) {
			head = newNode;
			return head;
		}
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head.next;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		newNode.next = slowPtr.next;
		slowPtr.next = newNode;

		/*SinglyLinkedListNode currentNode = head;
		int count = 0;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		currentNode = head;
		count = (count % 2 != 0) ? count / 2 : count / 2 - 1;
		for (int i = 0; i < count; i++) currentNode = currentNode.next;
		newnode.next = currentNode.next;
		currentNode.next = newnode;*/
		printSingleLinkedList ( head );
		return head;
	}
}
