package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

public class CheckCircularLL {

	public static void main(String[] args) {

	}

	static boolean isCircular(SinglyLinkedListNode head) {
		SinglyLinkedListNode currentNode = head.next;
		while (currentNode != head) {
			if (currentNode == null) return false;
			currentNode = currentNode.next;
		}
		return true;
	}
}
