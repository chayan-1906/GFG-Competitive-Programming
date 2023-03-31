package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1
public class PrintElementsLL {

    public static void main(String[] args) {

    }

    static void display(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data);
    }
}
