package stack.problems;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/operations-on-stack
public class StackOperations {

    public static void insert(Stack<Integer> st, int x) {
        // Your code here
        st.push(x);
    }

    //Function to remove top element from stack.
    public static void remove(Stack<Integer> st) {
        // Your code here
        st.pop();
    }

    //Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st) {
        // Your code here
        System.out.println(st.peek());
    }

    //Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val) {
        // Your code here
        for (int i = 0; i < st.size(); i++) {
            if (st.contains(val)) return true;
        }
        return false;
    }
}
