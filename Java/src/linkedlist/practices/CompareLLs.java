package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/compare-two-linked-lists/1
public class CompareLLs {

	public static void main(String[] args) {

	}

	static int compare(SinglyLinkedListNode node1, SinglyLinkedListNode node2) {
		SinglyLinkedListNode current1 = node1;
		SinglyLinkedListNode current2 = node2;
		while (current1 != null || current2 != null) {
			if (current1.data < current2.data) return -1;
			else if (current1.data > current2.data) return 1;
			current1 = current1.next;
			current2 = current2.next;
		}
		return 0;
	}
}
