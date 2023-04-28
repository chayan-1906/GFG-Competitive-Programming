package queue.tutorials;

import java.util.LinkedList;
import java.util.Queue;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/video/OTEw
public class ImplStackUsingQueue {

    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();
    static int currentSize;

    ImplStackUsingQueue() {
        currentSize = 0;
    }

    static void push(int data) {
        currentSize++;
        queue2.add(data);
        while (!queue1.isEmpty()) queue2.add(queue1.remove());
        Queue<Integer> queue = queue1;
        queue1 = queue2;
        queue2 = queue;
    }

    static int pop() {
        if (queue1.isEmpty()) return -1;
        currentSize--;
        return queue1.remove();
    }

    static int top() {
        if (queue1.isEmpty()) return -1;
        return queue1.peek();
    }

    public static void main(String[] args) {
        ImplStackUsingQueue stack = new ImplStackUsingQueue();
        push(10);
        push(5);
        push(15);
        push(20);
        System.out.println("Current size: " + currentSize);
        System.out.println(top());
        pop();
        System.out.println(top());
        pop();
        System.out.println(top());
        System.out.println("Current size: " + currentSize);
    }
}
