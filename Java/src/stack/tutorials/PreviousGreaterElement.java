package stack.tutorials;

import java.util.Arrays;
import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/OTAy
public class PreviousGreaterElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(previousGreaterElements(new int[]{15, 10, 18, 12, 4, 6, 2, 8})));    // -1, 15, -1, 18, 12, 12, 6, 12
        System.out.println(Arrays.toString(previousGreaterElements(new int[]{8, 10, 12})));    // -1, -1, -1
        System.out.println(Arrays.toString(previousGreaterElements(new int[]{12, 10, 8})));    // -1, 12, 10
        System.out.println(Arrays.toString(previousGreaterElements(new int[]{10, 4, 2, 20, 40, 12, 30})));    // -1, 10, 4, -1, -1, 40, 40
        System.out.println(Arrays.toString(previousGreaterElements(new int[]{10, 20, 30, 40})));    // -1, -1, -1, -1
        System.out.println(Arrays.toString(previousGreaterElements(new int[]{40, 30, 20, 10})));    // -1, 40, 30, 20
        System.out.println(Arrays.toString(previousGreaterElements(new int[]{20, 30, 10, 5, 15})));    // -1, -1, 30, 10, 30
    }

    public static int[] previousGreaterElements(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[array.length];
        result[0] = -1;
        for (int i = 1; i < array.length; i++) {
            stack.push(array[i - 1]);
//            System.out.print(array[i] + " : " + stack);
            if (stack.peek() > array[i]) result[i] = stack.peek();
            else {
                while (stack.size() != 1 && stack.peek() < array[i]) stack.pop();
                if (!stack.isEmpty() && stack.peek() > array[i]) result[i] = stack.peek();
                else result[i] = -1;
            }
//            System.out.println(Arrays.toString(result) + " ");
        }
        return result;
    }
}
