package stack.problems;

import java.util.Arrays;
import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/OTAx
public class StockSpan {

    public static int[] findStockSpan(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[array.length];
        Arrays.fill(result, 1);
        result[0] = 1;
        for (int i = 1; i < array.length; i++) {
            stack.push(i - 1);
            while (!stack.isEmpty() && array[stack.peek()] <= array[i]) stack.pop();
            if (!stack.isEmpty() && array[stack.peek()] > array[i]) result[i] = i - stack.peek();
            else result[i] = i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findStockSpan(new int[]{13, 15, 12, 14, 16, 8, 6, 4, 10, 30}))); // 1 2 1 2 5 1 1 1 1 4 10
        System.out.println(Arrays.toString(findStockSpan(new int[]{10, 20, 30, 40})));  // 1 2 3 4
        System.out.println(Arrays.toString(findStockSpan(new int[]{40, 30, 20, 10})));  // 1 1 1 1
        System.out.println(Arrays.toString(findStockSpan(new int[]{30, 20, 25, 28, 27, 29})));  // 1 1 2 3 1 5
        System.out.println(Arrays.toString(findStockSpan(new int[]{18, 12, 13, 14, 11, 16})));  // 1 1 2 3 1 5
        System.out.println(Arrays.toString(findStockSpan(new int[]{60, 10, 20, 40, 35, 30, 50, 70, 65})));  // 1 1 2 3 1 1 6 8 1
        System.out.println(Arrays.toString(findStockSpan(new int[]{10, 10, 10, 10})));  // 1 2 3 4
    }
}
