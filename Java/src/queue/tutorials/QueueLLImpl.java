package queue.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/video/OTA3
public class QueueLLImpl {

    static QueueNode front, rear;

    public QueueLLImpl() {
        front = null;
        rear = null;
    }

    static void enqueue(int data) {
        QueueNode newnode = new QueueNode(data);
        if (front == null) {
            // empty linked list/queue
            front = rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }

    static int dequeue() {
        if (front == null) {
            rear = null;
            return -1;
        }
        QueueNode temp = front;
        front = front.next;
        if (front == null) rear = null;
        return temp.data;
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
