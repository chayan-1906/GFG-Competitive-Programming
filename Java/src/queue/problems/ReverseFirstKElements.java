package queue.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/problem/reverse-first-k-elements-of-queue
public class ReverseFirstKElements {

    public static void main(String[] args) {

    }

    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) stack.push(q.remove());
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.empty()) queue.add(stack.pop());
        while (!q.isEmpty()) queue.add(q.remove());
        return queue;
    }
}
