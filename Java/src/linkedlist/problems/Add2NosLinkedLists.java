package linkedlist.problems;

import linkedlist.SinglyLinkedList.SinglyLinkedListNode;

public class Add2NosLinkedLists {

	// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-LinkedList/problem/add-two-numbers-represented-by-linked-lists
	// TODO: ASKED IN GFG CHAT, FAILED
	public static SinglyLinkedListNode addTwoLists(SinglyLinkedListNode first, SinglyLinkedListNode second) {
		int num1 = 0, num2 = 0;
		while (first.next != null) {
			num1 = num1 * 10 + first.data;
			first = first.next;
		}
		while (second.next != null) {
			num2 = num2 * 10 + second.data;
			second = second.next;
		}
		int num3 = num1 + num2;
		SinglyLinkedListNode head = null, tail = null;
		while (num3 != 0) {
			SinglyLinkedListNode newnode = new SinglyLinkedListNode ( num3 % 10 );
			if (head == null) {
				head = tail = newnode;
			} else {
				tail.next = newnode;
				tail = newnode;
			}
			num3 /= 10;
		}
		return reverseLinkedList ( head );
	}

	public static SinglyLinkedListNode reverseLinkedList(SinglyLinkedListNode head) {
		if (head == null || head.next == null) return head;
		SinglyLinkedListNode currentNode = head;
		SinglyLinkedListNode previousNode = null;
		while (currentNode != null) {
			SinglyLinkedListNode nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
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
	}
}
