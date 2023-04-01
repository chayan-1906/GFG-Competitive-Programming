package stack.problems;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/delete-middle-element-of-a-stack
public class DeleteMiddleElementStack {

    public static void deleteMid(Stack<Integer> stack, int sizeOfStack) {
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i <= sizeOfStack / 2; i++) tempStack.push(stack.pop());
        tempStack.pop();
        while (!tempStack.isEmpty()) stack.push(tempStack.pop());
    }

    public static void main(String[] args) {

    }
}
