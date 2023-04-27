package queue.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/problem/implement-queue-using-array
public class MyQueueArrayImpl {

    int front, rear;
    int[] arr = new int[100005];
    int capacity;

    MyQueueArrayImpl() {
        front = 0;
        rear = 100004;
        capacity = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        if (isFull()) return;
        rear = (rear + 1) % 100005;
        arr[rear] = x;
        capacity++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if (isEmpty()) return -1;
        int poppedElement = arr[front];
        front = (front + 1) % 100005;
        capacity--;
        return poppedElement;
    }

    boolean isFull() {
        return capacity == 100005;
    }

    boolean isEmpty() {
        return capacity == 0;
    }
}
