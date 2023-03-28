package linkedlist.practices;

import linkedlist.tutorials.DoublyLinkedList;
import linkedlist.tutorials.DoublyLinkedList.DListNode;

// https://practice.geeksforgeeks.org/problems/insert-in-sorted-way-in-a-sorted-dll/1
// TODO: ASKED IN GFG CHAT
public class SortedInsertDLL {

	public static DListNode sortedInsert(DListNode head, int x) {
		DListNode current = head;
		DListNode newnode = new DListNode ( x );
		// add node at head pos
		if (head.data > x) {
			newnode.prev = null;
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
			return head;
		}
		while (current.next != null) {
			if (current.data > x) {
				System.out.println ( current.data );
				newnode.prev = current.prev;
				newnode.next = current;
				current.prev.next = newnode;
				current.prev = newnode;
				return head;
			}
			current = current.next;
		}
		// add node at tail pos
		if (current.data <= x) {
			newnode.prev = current;
			newnode.next = null;
			current.next = newnode;
		}
		return head;
	}

	public static void main(String[] args) {
		DListNode head = new DListNode ( 2 );
		DListNode temp1 = new DListNode ( 3 );
		DListNode temp2 = new DListNode ( 4 );
		DListNode temp3 = new DListNode ( 5 );
		DListNode temp4 = new DListNode ( 6 );
		/*DListNode head = new DListNode ( 3 );
		DListNode temp1 = new DListNode ( 5 );
		DListNode temp2 = new DListNode ( 8 );
		DListNode temp3 = new DListNode ( 10 );*/
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		temp2.next = temp3;
		temp3.prev = temp2;
		temp3.next = temp4;
		temp4.prev = temp3;
		temp4.next = null;
		DoublyLinkedList.printDoublyLinkedList ( head );
		DoublyLinkedList.printDoublyLinkedList ( sortedInsert ( head, 0 ) );
	}
}
