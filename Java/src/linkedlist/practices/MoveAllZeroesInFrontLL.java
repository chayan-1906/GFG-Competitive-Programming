package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/move-all-zeros-to-the-front-of-the-linked-list/1
public class MoveAllZeroesInFrontLL {

	public static SinglyLinkedListNode moveZeroes(SinglyLinkedListNode head) {
		if (head == null) return null;
		SinglyLinkedListNode firstNode = head;
		SinglyLinkedListNode secondNode = head.next;
		while (secondNode != null) {
			if (secondNode.data == 0) {
				SinglyLinkedListNode temp = secondNode;
				secondNode = secondNode.next;
				firstNode.next = secondNode;

				temp.next = head;
				head = temp;
			} else {
				firstNode = secondNode;
				secondNode = secondNode.next;
			}
//			SinglyLinkedList.printSinglyLinkedList ( head );
		}
		return head;
	}

	public static void main(String[] args) {
		/*SinglyLinkedListNode head = new SinglyLinkedListNode ( 0 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 0 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 5 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 0 );
		// 0 --> 4 --> 0 --> 5 --> 0
		*/

		SinglyLinkedListNode head = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 0 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 0 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 5 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 0 );
		// 4 --> 0 --> 0 --> 5 --> 0

		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		SinglyLinkedList.printSinglyLinkedList ( head );
		SinglyLinkedList.printSinglyLinkedList ( moveZeroes ( head ) );
	}
}
