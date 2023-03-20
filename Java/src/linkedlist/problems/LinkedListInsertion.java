package linkedlist.problems;

import linkedlist.SinglyLinkedList.SinglyLinkedListNode;

public class LinkedListInsertion {

    public static void main(String[] args) {

    }

    SinglyLinkedListNode insertAtBeginning(SinglyLinkedListNode head, int x) {
        SinglyLinkedListNode newnode = new SinglyLinkedListNode ( x );
        if (head == null) {
            head = newnode;
            return head;
        }
        newnode.next = head;
        head = newnode;
        return head;
    }

    SinglyLinkedListNode insertAtEnd(SinglyLinkedListNode head, int x) {
        SinglyLinkedListNode newnode = new SinglyLinkedListNode ( x );
        SinglyLinkedListNode currentNode = head;
        if (head == null) {
            head = newnode;
            return head;
        }
        while (currentNode.next != null) currentNode = currentNode.next;
        currentNode.next = newnode;
        return head;
    }
}
