package linkedlist.problems;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

public class SegregateLinkedList012 {

	// https://www.codingninjas.com/codestudio/problems/sort-linked-list-of-0s-1s-2s_1071937
	static SinglyLinkedListNode segregate(SinglyLinkedListNode head) {
		SinglyLinkedList.printSinglyLinkedList ( head );
		if (head == null || head.next == null) return head;
		SinglyLinkedListNode start0 = null, end0 = null, start1 = null, end1 = null, start2 = null, end2 = null;
		for (SinglyLinkedListNode currentNode = head; currentNode != null; currentNode = currentNode.next) {
			int data = currentNode.data;
			if (data == 0) {
				if (start0 == null) start0 = end0 = currentNode;
				else {
					end0.next = currentNode;
					end0 = end0.next;
				}
			} else if (data == 1) {
				if (start1 == null) start1 = end1 = currentNode;
				else {
					end1.next = currentNode;
					end1 = end1.next;
				}
			} else if (data == 2) {
				if (start2 == null) start2 = end2 = currentNode;
				else {
					end2.next = currentNode;
					end2 = end2.next;
				}
			}
		}
//		if (start0 == null || start1 == null || start2 == null) return head;
		SinglyLinkedList.printSinglyLinkedList ( start0 );
		SinglyLinkedList.printSinglyLinkedList ( start1 );
		SinglyLinkedList.printSinglyLinkedList ( start2 );
		if (start0 == null && start1 != null && start2 != null) {
			/// if no 0s, (1s & 2s) present
			end1.next = start2;
			end2.next = null;
			return start1;
		}
		if (start0 != null && start1 == null && start2 != null) {
			/// if no 1s, (0s & 2s) present
			end0.next = start2;
			end2.next = null;
			return start0;
		}
		if (start0 != null && start1 != null && start2 == null) {
			/// if no 2s, (0s & 1s) present
			end0.next = start1;
			end1.next = null;
			return start0;
		}
		if (start0 != null && start1 == null && start2 == null) {
			/// if no (1s & 2s), only 0s present
			end0.next = null;
			return start0;
		}
		if (start0 == null && start1 != null && start2 == null) {
			/// if no (0s & 2s), only 1s present
			end1.next = null;
			return start1;
		}
		if (start0 == null && start1 == null && start2 != null) {
			/// if no (0s & 1s), only 2s present
			end2.next = null;
			return start2;
		}
		end0.next = start1;
		end1.next = start2;
		end2.next = null;
		SinglyLinkedList.printSinglyLinkedList ( head );
		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp1 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp2 = new SinglyLinkedListNode ( 1 );
		SinglyLinkedListNode temp3 = new SinglyLinkedListNode ( 2 );
		SinglyLinkedListNode temp4 = new SinglyLinkedListNode ( 1 );
//		SinglyLinkedListNode temp5 = new SinglyLinkedListNode ( 60 );
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
//		temp4.next = temp5;
//		temp5.next = null;
		segregate ( head );
	}
}
