package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
public class DetectLoopLL {

	public static boolean detectLoop(SinglyLinkedListNode head) {
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head.next;
		while (fastPtr != null && fastPtr.next != null) {
			if (slowPtr == fastPtr) return true;
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return false;
	}

	public static void main(String[] args) {

	}
}
