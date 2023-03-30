package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1
public class DeleteNodesGreaterValueLL {

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 12 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 15 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 10 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 11 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 5 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 6 );
		SinglyLinkedListNode temp6 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp7 = new SinglyLinkedListNode ( 3 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		temp5.next = temp6;
		temp6.next = temp7;
		SinglyLinkedList.printSinglyLinkedList ( head );
		SinglyLinkedList.printSinglyLinkedList ( compute ( head ) );
	}

	static SinglyLinkedListNode compute(SinglyLinkedListNode head) {
		if (head == null || head.next == null) return head;
		SinglyLinkedListNode current = head;
		while (current.next != null) {
			if (current.data < current.next.data) {
				current.data = current.next.data;
				current.next = current.next.next;
				current = head;
			} else current = current.next;
		}
		return head;
	}
}
