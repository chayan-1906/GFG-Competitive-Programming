package linkedlist.problems;

import linkedlist.SinglyLinkedList;
import linkedlist.SinglyLinkedList.SinglyLinkedListNode;

import java.util.HashSet;

public class RemoveDuplicatesUnsortedLL {

	public static SinglyLinkedListNode removeDuplicatedUnsortedLL(SinglyLinkedListNode head) {
		SinglyLinkedList.printSinglyLinkedList ( head );
		if (head == null || head.next == null) return head;
		SinglyLinkedListNode currentNode = head;
		HashSet<Integer> hashSet = new HashSet<> ( );
		int i = 1;
		while (currentNode.next != null) {
			hashSet.add ( currentNode.data );
			if (hashSet.contains ( currentNode.next.data ))
				currentNode.next = currentNode.next.next;
			else currentNode = currentNode.next;
		}
		SinglyLinkedList.printSinglyLinkedList ( head );
		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 5 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 4 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 6 );
		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 3 );
		SinglyLinkedListNode temp6 = new SinglyLinkedListNode ( 6 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
//		temp3.next = temp4;
//		temp4.next = temp5;
//		temp5.next = temp6;
		removeDuplicatedUnsortedLL ( head );
	}
}
