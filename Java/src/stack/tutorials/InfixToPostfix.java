package stack.tutorials;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/MTUyMg%3D%3D
public class InfixToPostfix {

    static int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static String findInfixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // if ch is operand add it to postfix
            if (Character.isLetterOrDigit(ch)) postfix.append(ch);

                // if ch is '(', push it to stack
            else if (ch == '(') stack.push(ch);

                // if ch is ')', pop everything until '(' is encountered
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.peek());
                    stack.pop();    // popping all characters between ( and )
                }
                stack.pop();    // popping ')'
            }

            // if ch is an operator
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
        System.out.println(findInfixToPostfix("a+b*c"));    // bc*a+ or abc*+
        System.out.println(findInfixToPostfix("(a+b)*c"));  // ab+c*
        System.out.println(findInfixToPostfix("a^b^c"));    // ab^c^
        System.out.println(findInfixToPostfix("(a+b)*(c+d)"));  // ab+cd+*
        System.out.println(findInfixToPostfix("a+b*(c-d)"));    // abcd-*+
        System.out.println(findInfixToPostfix("a+b*c/d+e"));    // abc*d/+e+
        System.out.println(findInfixToPostfix("a*b/c"));    // ab*c/
        System.out.println(findInfixToPostfix("a*(c+b)/e(f"));  // Invalid Expression
    }
}
