package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1
public class DeleteWithoutHeadPointerLL {

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
		temp5.next = null;
		SinglyLinkedList.printSinglyLinkedList ( head );
		deleteNode ( temp1 );
	}

	static void deleteNode(SinglyLinkedListNode del) {
		SinglyLinkedListNode first = del;
		del.data = del.next.data;
		del.next = del.next.next;
//		while (del.next.next != null) del = del.next;
		SinglyLinkedList.printSinglyLinkedList ( first );
	}
}
