package linkedlist.problems;


import linkedlist.SinglyLinkedList.SinglyLinkedListNode;

public class CountNodesOfLinkedList {

    public static int getCount(SinglyLinkedListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

	public static void main(String[] args) {

	}
}
