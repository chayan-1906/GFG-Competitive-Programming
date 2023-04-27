package queue.tutorials;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/video/OTA2
public class QueueArrayImpl {

    static int front;
    static int rear;
    static int size;
    static int capacity;
    static int[] array;

    public QueueArrayImpl(int capacity) {
        front = 0;
        rear = capacity - 1;
        size = 0;
        QueueArrayImpl.capacity = capacity;
        array = new int[capacity];
    }

    static void enqueue(int data) {
        if (isFull()) return;
        rear = (rear + 1) % capacity;
        array[rear] = data;
        size++;
        System.out.println(data + " is enqueued");
    }

    static int dequeue() {
        if (isEmpty()) return -1;
        int dequeuedData = array[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(dequeuedData + " is dequeued");
        return dequeuedData;
    }

    static int getFront(QueueArrayImpl queue) {
        if (isEmpty()) return -1;
        return array[front];
    }

    static int getRear() {
        if (isEmpty()) return -1;
        return array[rear];
    }

    static boolean isFull() {
        return size == capacity;
    }

    static boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        enqueue(10);
        System.out.println(Arrays.toString(array));
        enqueue(20);
        System.out.println(Arrays.toString(array));
        enqueue(30);
        System.out.println(Arrays.toString(array));
        enqueue(40);
        System.out.println(Arrays.toString(array));
        dequeue();
        System.out.println("size: " + size);
        dequeue();
        System.out.println("size: " + size);
        dequeue();
        System.out.println("size: " + size);
    }
}
