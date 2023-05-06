package queue.problems;

import java.util.Queue;
import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Queue/problem/queue-reversal
public class QueueReversal {

    public Queue<Integer> rev(Queue<Integer> queue) {
        //add code here.
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) stack.push(queue.remove());
        while (!stack.empty()) queue.add(stack.pop());
        return queue;
    }
}
