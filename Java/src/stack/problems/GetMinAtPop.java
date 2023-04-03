package stack.problems;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/get-min-at-pop
public class GetMinAtPop {

    public static Stack<Integer> _push(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        for (int integer : arr) stack.push(integer);
        return stack;
    }

    static void _getMinAtPop(Stack<Integer> s) {
        while (!s.isEmpty()) {
            int minEle = Integer.MAX_VALUE;
            for (int i = 0; i < s.size(); i++)
                if (s.get(i) < minEle) minEle = s.get(i);
            s.pop();
            System.out.print(minEle + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
