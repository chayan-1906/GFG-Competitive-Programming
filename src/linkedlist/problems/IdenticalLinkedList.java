package linkedlist.problems;


import linkedlist.SinglyLinkedList.SinglyLinkedListNode;

public class IdenticalLinkedList {

    public static void main(String[] args) {

    }

    public boolean isIdentical(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        if ((head1 != null && head2 == null) || (head1 == null && head2 != null)) return false;
        return true;
    }
}
