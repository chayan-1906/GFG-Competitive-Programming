package stack.problems;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/implement-stack-using-array
public class MyStackArrayImpl {
    static int top;
    static int[] arr = new int[1000];

    MyStackArrayImpl() {
        top = -1;
        System.out.println(Arrays.toString(arr));
    }

    static void push(int a) {
        if (top == 999) return;
        arr[++top] = a;
    }

    static int pop() {
        if (top == -1) return -1;
        int poppedElement = arr[top];
        top--;
        return poppedElement;
    }

    public static void main(String[] args) {
//        new MyStack();
        push(2);
        push(3);
        pop();
        push(4);
        pop();
        new MyStackArrayImpl();
    }
}
