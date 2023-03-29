package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

import java.util.LinkedHashSet;

// https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
public class RemoveDuplicatesUnsortedLL {

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 5 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 2 );
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
		SinglyLinkedList.printSinglyLinkedList ( removeDuplicates ( head ) );
	}

	public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<> ( );
		SinglyLinkedListNode prev = head;
		SinglyLinkedListNode current = head;
		while (current.next != null) {
			if (hashSet.contains ( current.data ))
				prev.next = current.next;
			else {
				prev = current;
				hashSet.add ( current.data );
			}
			current = current.next;
		}
		if (hashSet.contains ( current.data )) {
			// delete last node
			prev.next = null;
		}
		return head;
	}
}
