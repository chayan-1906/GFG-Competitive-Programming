package stack.problems;

import java.util.ArrayList;
import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/evaluation-of-postfix-expression1735
public class EvaluatePostfix {

    public static int evaluatePostfix(String postfix) {
        Stack<String> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (!isOperator(ch)) stack.push(String.valueOf(ch));
            else {
                int op1 = Integer.parseInt(stack.pop());
                int op2 = Integer.parseInt(stack.pop());
                if (ch == '+') result = op2 + op1;
                else if (ch == '-') result = op2 - op1;
                else if (ch == '*') result = op2 * op1;
                else if (ch == '/') result = op2 / op1;
                else if (ch == '^') result = (int) Math.pow(op2, op1);
                stack.push(String.valueOf(result));
            }
        }
        return result;
    }

    public static boolean isOperator(Character character) {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('+');
        characters.add('-');
        characters.add('*');
        characters.add('/');
        characters.add('^');
        return characters.contains(character);
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostfix("231*+9-")); // -4
        System.out.println(evaluatePostfix("123+*8-")); // -3
    }
}
