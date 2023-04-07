package stack.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/implement-stack-using-linked-list
public class MyStackLLImpl {
    static StackNode top;

    // Insert at the end --> O(n)
    /*static void push(int a) {
        StackNode newnode = new StackNode(a);
        if (top == null) {
            top = newnode;
            return;
        }
        StackNode currentNode = top;
        while (currentNode.next != null) currentNode = currentNode.next;
        currentNode.next = newnode;
    }*/

    // Delete from the end --> O(n)
    /*static int pop() {
        if (top == null) return -1;
        else if (top.next == null) {
            int poppedElement = top.data;
            top = null;
            return poppedElement;
        }
        StackNode currentNode = top;
        StackNode prevNode = top;
        while (currentNode.next != null) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        int poppedElement = currentNode.data;
        prevNode.next = null;
        return poppedElement;
    }*/

    // Insert at beginning --> O(1)
    static void push(int a) {
        StackNode newnode = new StackNode(a);
        if (top == null) top = newnode;
        else {
            newnode.next = top;
            top = newnode;
        }
    }

    // Delete from the beginning --> O(1)
    static int pop() {
        if (top == null) return -1;
        /*else if (top.next == null) {
            int poppedElement = top.data;
            top = null;
            return poppedElement;
        }*/
        int poppedElement = top.next.data;
        top = top.next;
        return poppedElement;
    }

    public static void main(String[] args) {
        /*System.out.println(pop());
        push(4);
        push(5);
        System.out.println(pop());*/
        push(2);
        push(3);
        System.out.println(pop());
        push(4);
        System.out.println(pop());
    }

    public static void printSinglyLinkedList(StackNode top) {
        if (top != null) {
            while (top.next != null) {
                System.out.print(top.data + " --> ");
                top = top.next;
            }
            System.out.println(top.data + " --> null");
        } else {
            System.out.println("null...");
            System.out.println("Empty Linked List");
        }
    }

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int a) {
            data = a;
            next = null;
        }
    }
}
