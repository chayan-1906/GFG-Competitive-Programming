package stack.tutorials;

import java.util.Arrays;
import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/next-larger-element-1587115620
public class NextGreaterElement {

    public static int[] nextGreaterElements(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int n = array.length;
        int[] result = new int[array.length];
        result[n - 1] = -1;
        stack.push(array[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && array[i] >= stack.peek()) stack.pop();
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(array[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{5, 15, 10, 8, 6, 12, 9, 18})));    // 15, 18, 12, 12, 12, 18, 18, -1
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{10, 15, 20, 25})));    // 15, 20, 25, -1
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{25, 20, 15, 10})));    // -1, -1, -1, -1
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{5, 5, 5, 5})));    // -1, -1, -1, -1
    }
}
