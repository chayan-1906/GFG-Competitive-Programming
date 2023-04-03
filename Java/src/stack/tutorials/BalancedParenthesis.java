package stack.tutorials;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/ODk4
public class BalancedParenthesis {

    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '(' || character == '{' || character == '[')
                stack.push(character);
            else {
                if (stack.isEmpty()) return false;  // openings are more than closings
                else if (character == ')' && stack.peek() != '(') return false;
                else if (character == '}' && stack.peek() != '{') return false;
                else if (character == ']' && stack.peek() != '[') return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{([])}"));    // true
        System.out.println(isBalanced("()"));    // true
        System.out.println(isBalanced("([]"));    // false
        System.out.println(isBalanced("([])")); // true
        System.out.println(isBalanced("((())"));    // false
        System.out.println(isBalanced("([)]")); // false
        System.out.println(isBalanced("{}([()])")); // true
        System.out.println(isBalanced("(()))"));    // false
    }
}
