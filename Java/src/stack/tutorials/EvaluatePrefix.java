package stack.tutorials;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/MTUyMA%3D%3D
public class EvaluatePrefix {

    static long evaluatePrefix(String prefix) {
        Stack<String> stack = new Stack<>();
        String[] prefixs = prefix.split(" ");
        for (int i = prefixs.length - 1; i >= 0; i--) {
            String ch = prefixs[i];
            if (Character.isDigit(ch.charAt(0))) stack.push(ch);
            else {
                int op1 = Integer.parseInt(stack.pop());
                int op2 = Integer.parseInt(stack.pop());
                long result = 0;
                if (ch.charAt(0) == '+') result = op1 + op2;
                else if (ch.charAt(0) == '-') result = op1 - op2;
                else if (ch.charAt(0) == '*') result = (long) op1 * op2;
                else if (ch.charAt(0) == '/') result = op1 / op2;
                else if (ch.charAt(0) == '^') result = (long) Math.pow(op1, op2);
                stack.push(String.valueOf(result));
            }
//            System.out.println(stack);
        }
        return Integer.parseInt(String.valueOf(stack.pop()));
    }

    public static void main(String[] args) {
        System.out.println(evaluatePrefix("+ * 10 2 3")); // 23
        System.out.println(evaluatePrefix("* + 10 2 3")); // 36
        System.out.println(evaluatePrefix("^ 10 ^ 2 3")); // 100000000
//        System.out.println(evaluatePrefix("")); //
    }
}
