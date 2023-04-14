package stack.problems;

import java.util.Arrays;
import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/next-larger-element-1587115620
public class NextGreaterElement {

    public static long[] nextLargerElement(long[] arr, int n) {
        /* both solutions are correct */
        Stack<Long> stack = new Stack<>();
        stack.push(0L);
        long[] result = new long[arr.length];
        Arrays.fill(result, -1);
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                if (stack.peek() <= arr[i]) stack.pop();
                else {
                    result[i] = stack.peek();
                    break;
                }
            }
            stack.push(arr[i]);
        }
        return result;

        /*Stack<Long> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);
        long[] result = new long[arr.length];
        result[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < stack.peek()) result[i] = stack.peek();
            else {
                while (!stack.isEmpty() && arr[i] >= stack.peek()) stack.pop();
                if (stack.isEmpty()) result[i] = -1;
                else result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;*/

        /**
         * Testcase Dry Run --> {1, 3, 2, 4}
         * stack = [0], result = {-1, -1, -1, -1}
         * i: 3 0 <= 4 => true stack.pop(), stack.push(4) -> stack = [4]
         * i: 2 4 <= 2 => false, result[2] = 4, stack.push(2) -> stack = [4, 2]
         * i: 1 2 <= 3 => true, stack.pop(), 4 <= 3 => false, result[1] = 4, stack.push(3) -> stack = [4, 3]
         * i: 0 3 <= 1 => false, result[0] = 3
         */
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextLargerElement(new long[]{1, 3, 2, 4}, 4)));   // 3 4 4 -1
        System.out.println(Arrays.toString(nextLargerElement(new long[]{6, 8, 0, 1, 3}, 5)));   // 8 -1 1 3 -1
    }
}
