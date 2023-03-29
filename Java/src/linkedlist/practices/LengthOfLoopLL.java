package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/find-length-of-loop/1
public class LengthOfLoopLL {

	static int countNodesinLoop(SinglyLinkedListNode head) {
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head.next;
		int length = 1;
		while (slowPtr != fastPtr) {
			if (fastPtr == null || fastPtr.next == null) return 0;
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		SinglyLinkedListNode temp = slowPtr;
		while (temp.next != slowPtr) {
			temp = temp.next;
			length++;
		}
		return length;
	}

	public static void main(String[] args) {

	}
}
