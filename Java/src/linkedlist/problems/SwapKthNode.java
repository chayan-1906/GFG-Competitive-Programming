package linkedlist.problems;

import linkedlist.SinglyLinkedList;
import linkedlist.SinglyLinkedList.SinglyLinkedListNode;

public class SwapKthNode {

	public static SinglyLinkedListNode swapKthNode(SinglyLinkedListNode head, int length, int k) {
		SinglyLinkedList.printSinglyLinkedList ( head );
		if (head == null || head.next == null) return head;
		SinglyLinkedListNode kthBeginningNode = head;
		SinglyLinkedListNode kthPrevBeginningNode = head;
		SinglyLinkedListNode kthEndNode = head;
		SinglyLinkedListNode kthPrevEndNode = head;
		if (k == 1 || k == length) {
			for (int i = 0; i < length - 1; i++) {
				kthPrevEndNode = kthEndNode;
				kthEndNode = kthEndNode.next;
			}
			kthEndNode.next = head.next;
			head = kthEndNode;
			kthPrevEndNode.next = kthBeginningNode;
			kthBeginningNode.next = null;
			SinglyLinkedList.printSinglyLinkedList ( head );
			return head;
		}
		if (k > length) return head;
		for (int i = 0; i < k - 1; i++) {
			kthPrevBeginningNode = kthBeginningNode;
			kthBeginningNode = kthBeginningNode.next;
		}
		for (int i = 0; i < length - k; i++) {
			kthPrevEndNode = kthEndNode;
			kthEndNode = kthEndNode.next;
		}
		kthPrevBeginningNode.next = kthEndNode;
		kthPrevEndNode.next = kthBeginningNode;
		SinglyLinkedListNode temp = kthBeginningNode.next;
		kthBeginningNode.next = kthEndNode.next;
		kthEndNode.next = temp;
		SinglyLinkedList.printSinglyLinkedList ( head );
		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 1 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 3 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 5 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 60 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
//		temp3.next = temp4;
//		temp4.next = temp5;
//		temp5.next = null;
		swapKthNode ( head, 4, 4 );
	}
}
