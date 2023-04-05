package stack.tutorials;

import java.util.Objects;
import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/MTM3Ng%3D%3D
public class StackWithGetMin {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> auxiliaryStack = new Stack<>();

    public StackWithGetMin() {
        stack = new Stack<>();
        auxiliaryStack = new Stack<>();
    }

    public static int findGetMinO1() {
        return auxiliaryStack.peek();
    }

    public static int top() {
        return stack.peek();
    }

    public static void push(int x) {
        if (stack.isEmpty()) auxiliaryStack.push(x);
        stack.push(x);
        if (auxiliaryStack.peek() >= stack.peek()) auxiliaryStack.push(x);
    }

    public static void pop() {
        if (Objects.equals(stack.peek(), auxiliaryStack.peek())) auxiliaryStack.pop();
        stack.pop();
    }

    public static void main(String[] args) {
        /*push(20);
        push(10);
        System.out.println(findGetMinO1()); // 10
        push(5);
        System.out.println(findGetMinO1()); // 5
        pop();
        System.out.println(findGetMinO1()); // 10
        pop();
        System.out.println(findGetMinO1()); // 20*/


        push(5);
        push(4);
        push(3);
        System.out.println(findGetMinO1()); // 3
        pop();
        System.out.println(findGetMinO1()); // 4
        push(2);
        System.out.println(findGetMinO1()); // 2
    }
}
