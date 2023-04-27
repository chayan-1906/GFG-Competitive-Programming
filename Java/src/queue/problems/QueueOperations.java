package queue.problems;

import java.util.Queue;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/problem/operations-on-queue
public class QueueOperations {

    // Function to push an element in queue.
    void enqueue(Queue<Integer> q, int x) {
        q.add(x);
    }

    // Function to remove front element from queue.
    void dequeue(Queue<Integer> q) {
        q.remove();
    }

    // Function to find the front element of queue.
    int front(Queue<Integer> q) {
        return q.peek();
    }

    // Function to find an element in the queue.
    String find(Queue<Integer> q, int x) {
        if (q.contains(x)) return "Yes";
        else return "No";
    }
}
