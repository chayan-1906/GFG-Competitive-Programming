package linkedlist.problems;

import linkedlist.SinglyLinkedList.SinglyLinkedListNode;

public class FindLoopLength {

	static int countNodesinLoop(SinglyLinkedListNode head) {
		if (head == null || head.next == null) return 0;
		SinglyLinkedListNode slowPtr = head;
		SinglyLinkedListNode fastPtr = head.next;
		while (slowPtr != fastPtr) {
			if (fastPtr == null || fastPtr.next == null) return 0;
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		int noOfNodes = 1;
		SinglyLinkedListNode temp = slowPtr;
		while (temp.next != slowPtr) {
			noOfNodes++;
			temp = temp.next;
		}
		return noOfNodes;
	}

	public static void main(String[] args) {

	}
}
