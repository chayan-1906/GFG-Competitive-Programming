package stack.problems;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/infix-to-postfix-1587115620
public class InfixToPostfix {

    static int precedence(Character character) {
        if (character == '+' || character == '-') return 1;
        else if (character == '*' || character == '/') return 2;
        else if (character == '^') return 3;
        return -1;
    }

    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            // add letter/digit to postfix
            if (Character.isLetterOrDigit(ch)) postfix.append(ch);

                // push '(' to stack
            else if (ch == '(') stack.push(ch);

                // pop and add character to postfix until '(' occurs
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.peek());
                    stack.pop();
                }
                stack.pop();    // pop )
            }

            // character is operator
            else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.peek());
                    stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') return "Invalid Expression";
            postfix.append(stack.peek());
            stack.pop();
        }
        return postfix.toString();
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));    // abcd^e-fgh*+^*+i-
        System.out.println(infixToPostfix("A*(B+C)/D"));    // ABC+*D/
    }
}
