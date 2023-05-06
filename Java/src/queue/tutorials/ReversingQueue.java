package queue.tutorials;

import java.util.Queue;
import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/video/MTQ3Mzc%3D
public class ReversingQueue {

    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) stack.push(queue.remove());
        while (!stack.empty()) queue.add(stack.pop());
    }

    public static void main(String[] args) {

    }
}
