package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1
public class NodeAtGivenIndexLL {

	public static int getNth(SinglyLinkedListNode node, int ind) {
		for (int i = 1; i < ind; i++) node = node.next;
		return node.data;
	}

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 1 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 3 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 657 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 76 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		SinglyLinkedList.printSinglyLinkedList ( head );
		System.out.println ( getNth ( head, 5 ) );
	}
}
