package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/identical-linked-lists/1
public class IdenticalLL {

	public static void main(String[] args) {

	}

	public boolean isIdentical(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		while (head1 != null && head2 != null) {
			if (head1.data != head2.data) return false;
			head1 = head1.next;
			head2 = head2.next;
		}
		if (head1 == null && head2 != null) return false;
		if (head1 != null && head2 == null) return false;
		return true;
	}
}
