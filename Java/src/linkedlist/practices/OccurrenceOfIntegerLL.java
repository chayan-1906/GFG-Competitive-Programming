package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1
public class OccurrenceOfIntegerLL {

    public static int count(SinglyLinkedListNode head, int search_for) {
        SinglyLinkedListNode current = head;
        int count = 0;
        while (current != null) {
            if (current.data == search_for) count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
