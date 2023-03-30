package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
public class IntersectionOfTwoSortedLL {

	public static SinglyLinkedListNode findIntersection(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		SinglyLinkedListNode node1 = head1;
		SinglyLinkedListNode node2 = head2;
		SinglyLinkedListNode node = new SinglyLinkedListNode ( -1 );
		SinglyLinkedListNode temp = node;
		while (node1 != null && node2 != null) {
			if (node1.data < node2.data) {
				node1 = node1.next;
			} else if (node1.data > node2.data) {
				node2 = node2.next;
			} else {
				node.next = new SinglyLinkedListNode ( node1.data );
				node = node.next;
				node1 = node1.next;
				node2 = node2.next;
			}
		}
		return temp.next;
	}

	public static void main(String[] args) {

	}
}
