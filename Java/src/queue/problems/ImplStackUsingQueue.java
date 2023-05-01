package queue.problems;

import java.util.LinkedList;
import java.util.Queue;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/problem/stack-using-two-queues
public class ImplStackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Function to push an element into stack using two queues.
    void push(int a) {
        while (!q1.isEmpty()) q2.add(q1.remove());
        q1.add(a);
        while (!q2.isEmpty()) q1.add(q2.remove());
    }

    // Function to pop an element from stack using two queues.
    int pop() {
        return q1.isEmpty() ? -1 : q1.remove();
    }
}
