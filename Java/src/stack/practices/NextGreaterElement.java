package stack.practices;

import java.util.Arrays;
import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
public class NextGreaterElement {

    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Long> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);
        long[] result = new long[arr.length];
        result[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < stack.peek()) result[i] = stack.peek();
            else {
                while (!stack.isEmpty() && arr[i] > stack.peek()) stack.pop();
                if (stack.isEmpty()) result[i] = -1;
                else result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextLargerElement(new long[]{1, 3, 2, 4}, 4)));  // 3 4 4 -1
        System.out.println(Arrays.toString(nextLargerElement(new long[]{6, 8, 0, 1, 3}, 5))); // 8 -1 1 3 -1
    }
}
