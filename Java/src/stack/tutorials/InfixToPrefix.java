package stack.tutorials;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/MTU0OQ%3D%3D
// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/MTU1MA%3D%3D
public class InfixToPrefix {

    public static String findInfixToPrefix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder infixStringBuilder = new StringBuilder(infix);
        infixStringBuilder.reverse();
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < infixStringBuilder.length(); i++) {
            if (infixStringBuilder.charAt(i) == ')') infixStringBuilder.setCharAt(i, '(');
            else if (infixStringBuilder.charAt(i) == '(') infixStringBuilder.setCharAt(i, ')');
        }
        for (int i = 0; i < infixStringBuilder.length(); i++) {
            char ch = infixStringBuilder.charAt(i);
            // if ch is operand add it to postfix
            if (Character.isLetterOrDigit(ch)) postfix.append(ch);

                // if ch is '(', push it to stack
            else if (ch == '(') stack.push(ch);

                // if ch is ')', pop everything until '(' is encountered
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.peek());
                    stack.pop();
                }
                stack.pop(); // pop ')'
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
            postfix.append(stack.pop());
        }
        return postfix.reverse().toString();
    }

    static int precedence(char ch) {
        /*if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '^') return 3;
        else return -1;*/
        if (ch == '-') return 1;
        else if (ch == '+') return 2;
        else if (ch == '*') return 3;
        else if (ch == '/') return 4;
        else if (ch == '^') return 5;
        else return -1;
    }

    public static void main(String[] args) {
        System.out.println(findInfixToPrefix("x+y*z")); // +x*yz
        System.out.println(findInfixToPrefix("(x+y)*z"));  // *+xyz
        System.out.println(findInfixToPrefix("x^y^z"));  // ^x^yz
        System.out.println(findInfixToPrefix("(x+y)*(z+w)"));  // *+xy+zw
        System.out.println(findInfixToPrefix("x+y*(z-w)")); // +x*y-zw
        System.out.println(findInfixToPrefix("x+y*z/w+u")); // +x+*y/zwu
    }
}
