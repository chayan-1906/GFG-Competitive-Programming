package stack.tutorials;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/MTUxOQ%3D%3D
public class EvaluatePostfix {

    public static long evaluatePostfix(String postfix) {
        Stack<String> stack = new Stack<>();
        String[] postfixs = postfix.split(" ");
        for (String ch : postfixs) {
            if (Character.isDigit(ch.charAt(0))) stack.push(ch);
            else {
                int op1 = Integer.parseInt(stack.pop());
                int op2 = Integer.parseInt(stack.pop());
                long result = 0;
                if (ch.charAt(0) == '+') {
                    result = op2 + op1;
                } else if (ch.charAt(0) == '-') {
                    result = op2 - op1;
                } else if (ch.charAt(0) == '*') {
                    result = (long) op2 * op1;
                } else if (ch.charAt(0) == '/') {
                    result = op2 / op1;
                } else if (ch.charAt(0) == '^') {
                    result = (long) Math.pow(op2, op1);
                }
                stack.push(String.valueOf(result));
            }
//            System.out.println(stack);
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostfix("10 2 * 3 +"));  // 23
        System.out.println(evaluatePostfix("10 2 + 3 *"));  // 36
        System.out.println(evaluatePostfix("10 2 3 ^ ^"));  // 100000000
        System.out.println(evaluatePostfix("2 3 1 * + 9 -"));  // -4
    }
}
