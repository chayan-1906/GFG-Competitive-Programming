package queue.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/problem/implement-queue-using-linked-list
public class MyQueueLLImpl {
    QueueNode front, rear;

    public MyQueueLLImpl() {
        front = null;
        rear = null;
    }

    // Function to push an element into the queue.
    void push(int a) {
        QueueNode newnode = new QueueNode(a);
        if (front == null) {
            front = rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }

    // Function to pop front element from the queue.
    int pop() {
        if (front == null) return -1;
        int poppedData = front.data;
        front = front.next;
        if (front == null) rear = null;
        return poppedData;
    }

    static class QueueNode {
        int data;
        QueueNode next;

        QueueNode(int a) {
            data = a;
            next = null;
        }
    }
}
