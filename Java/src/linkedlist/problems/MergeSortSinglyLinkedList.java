package linkedlist.problems;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;


public class MergeSortSinglyLinkedList {

	public static SinglyLinkedListNode findMiddle(SinglyLinkedListNode head) {
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head.next;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}

	public static SinglyLinkedListNode merge(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		SinglyLinkedListNode merged = new SinglyLinkedListNode ( -1 );
		SinglyLinkedListNode current = merged;
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				current.next = head1;
				head1 = head1.next;
			} else {
				current.next = head2;
				head2 = head2.next;
			}
			current = current.next;
		}
		while (head1 != null) {
			current.next = head1;
			head1 = head1.next;
			current = current.next;
		}
		while (head2 != null) {
			current.next = head2;
			head2 = head2.next;
			current = current.next;
		}
		return merged.next;
	}


	public static SinglyLinkedListNode mergeSort(SinglyLinkedListNode head) {
		if (head == null || head.next == null) return head;
		SinglyLinkedListNode midNode = findMiddle ( head );
		SinglyLinkedListNode head2 = midNode.next;
		midNode.next = null;
		SinglyLinkedListNode newHead1 = mergeSort ( head );
		SinglyLinkedListNode newHead2 = mergeSort ( head2 );
		return merge ( newHead1, newHead2 );
	}

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 1 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 1 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 60 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		temp5.next = null;
		SinglyLinkedList.printSinglyLinkedList ( head );
		head = mergeSort ( head );
		SinglyLinkedList.printSinglyLinkedList ( head );
	}
}
