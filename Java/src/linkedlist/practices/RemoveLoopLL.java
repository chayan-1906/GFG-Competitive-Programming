package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
public class RemoveLoopLL {

	public static void removeLoop(SinglyLinkedListNode head) {
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head.next;
		while (slowPtr != fastPtr) {
			if (fastPtr == null || fastPtr.next == null) return;
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		slowPtr = head;
		while (slowPtr != fastPtr.next) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		fastPtr.next = null;
	}

	public static void main(String[] args) {

	}
}
