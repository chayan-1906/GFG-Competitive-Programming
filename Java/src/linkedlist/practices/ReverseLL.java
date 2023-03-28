package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
public class ReverseLL {

	public static void main(String[] args) {

	}

	static SinglyLinkedListNode reverseList(SinglyLinkedListNode head) {
		SinglyLinkedListNode currentNode = head;
		SinglyLinkedListNode prevNode = null, nextNode = null;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		return prevNode;
	}
}
