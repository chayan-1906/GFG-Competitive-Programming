package linkedlist.practices;

import linkedlist.tutorials.SinglyLinkedList;
import linkedlist.tutorials.SinglyLinkedList.SinglyLinkedListNode;

// https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
public class NthNodeFromEndLL {

    public static void main(String[] args) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);
        SinglyLinkedListNode temp1 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode temp2 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode temp3 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode temp4 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode temp5 = new SinglyLinkedListNode(6);
        SinglyLinkedListNode temp6 = new SinglyLinkedListNode(7);
        SinglyLinkedListNode temp7 = new SinglyLinkedListNode(8);
        SinglyLinkedListNode temp8 = new SinglyLinkedListNode(9);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = temp6;
        temp6.next = temp7;
        temp7.next = temp8;
        SinglyLinkedList.printSinglyLinkedList(head);
        System.out.println(getNthFromLast(head, 2));
    }

    static int getNthFromLast(SinglyLinkedListNode head, int n) {
        SinglyLinkedListNode current = head;
        int count = 0;
        for (int i = 0; current != null; i++) {
            count++;
            current = current.next;
        }
        if (count < n) return -1;
        current = head;
        for (int i = 0; i < count - n && current != null; i++) current = current.next;
        return current.data;
    }
}
