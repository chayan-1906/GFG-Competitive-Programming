package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/eae1fbd0ac8f213a833d231e26ba4d829e79dd9c/1
public class IntersectionPointYLL {

	static int intersectPoint(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		SinglyLinkedListNode current1 = head1;
		SinglyLinkedListNode current2 = head2;
		int count1 = 0, count2 = 0;
		while (current1 != null) {
			count1++;
			current1 = current1.next;
		}
		while (current2 != null) {
			count2++;
			current2 = current2.next;
		}
		current1 = head1;
		current2 = head2;
		int absDiff = Math.abs ( count1 - count2 );
		if (count1 > count2) {
			for (int i = 0; i < absDiff; i++) current1 = current1.next;
		} else {
			for (int i = 0; i < absDiff; i++) current2 = current2.next;
		}
		while (current1 != null && current2 != null) {
			if (current1 == current2) return current1.data;
			current1 = current1.next;
			current2 = current2.next;
		}
		return -1;
	}

	public static void main(String[] args) {

	}
}
