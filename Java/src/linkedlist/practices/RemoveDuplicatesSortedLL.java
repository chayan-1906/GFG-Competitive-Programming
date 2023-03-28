package linkedlist.practices;


import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
public class RemoveDuplicatesSortedLL {

	static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
		if (head == null || head.next == null) return head;
		SinglyLinkedListNode firstNode = head;
		SinglyLinkedListNode secondNode = head.next;
		while (secondNode.next != null) {
			if (firstNode.data == secondNode.data) {
				firstNode.next = secondNode.next;
			} else {
				firstNode = secondNode;
			}
			secondNode = secondNode.next;
			System.out.println ( firstNode.data + " " + secondNode.data );
		}
		if (firstNode.data == secondNode.data) firstNode.next = null;
		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 1 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 4 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		temp5.next = null;
		SinglyLinkedList.printSinglyLinkedList ( head );
		SinglyLinkedList.printSinglyLinkedList ( removeDuplicates ( head ) );
	}
}
