package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1
public class LinkedListInsertion {

	public static void main(String[] args) {

	}

	SinglyLinkedListNode insertAtBeginning(SinglyLinkedListNode head, int x) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode ( x );
		newnode.next = head;
		head = newnode;
		return head;
	}

	SinglyLinkedListNode insertAtEnd(SinglyLinkedListNode head, int x) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode ( x );
		SinglyLinkedListNode current = head;
		while (current.next != null) current = current.next;
		current.next = newnode;
		return head;
	}
}
