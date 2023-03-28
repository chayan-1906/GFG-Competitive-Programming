package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
public class DeleteNodeLL {

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 1 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 6 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 3 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 9 );
//		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 5 );
//		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 60 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
//		temp3.next = temp4;
//		temp4.next = temp5;
//		temp5.next = null;
		SinglyLinkedList.printSinglyLinkedList ( head );
		SinglyLinkedList.printSinglyLinkedList ( deleteNode ( head, 2 ) );
	}

	static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int x) {
		SinglyLinkedListNode currentNode = head;
		SinglyLinkedListNode prevNode = head;
		if (x == 1) return head.next;
		for (int i = 1; currentNode.next != null && i < x; i++) {
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		prevNode.next = currentNode.next;
		return head;
	}
}
