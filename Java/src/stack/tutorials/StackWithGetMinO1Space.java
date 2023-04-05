package stack.tutorials;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/MjAwMg%3D%3D
public class StackWithGetMinO1Space {

    static Stack<Integer> stack = new Stack<>();
    static int min;

    static void push(int x) {
        if (stack.isEmpty()) {
            min = x;
            stack.push(x);
        } else if (x <= min) {
            stack.push(2 * x - min);
            min = x;
        } else stack.push(x);
    }

    static int pop() {
        int t = stack.peek();
        stack.pop();
        if (t <= min) {
            int res = min;
            min = 2 * min - t;
            return res;
        } else return t;
    }

    static int top() {
        int t = stack.peek();
        return Math.max(t, min);
    }

    static int getMin() {
        return min;
    }

    public static void main(String[] args) {
        /*push(5);
        push(10);
        push(20);
        push(2);
        push(6);
        push(4);
        pop();
        pop();
        push(2);
        pop();
        push(1);
        pop();
        pop();
        System.out.println(getMin());*/

        push(4);
        push(5);
        push(8);
        push(1);
        pop();
        System.out.println(getMin());
    }
}
