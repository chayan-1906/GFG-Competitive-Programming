package stack.problems;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/parenthesis-checker2744
public class ParenthesisChecker {

    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        for (Character character : x.toCharArray()) {
            if (character == '(' || character == '{' || character == '[')
                stack.push(character);
            else {
                if (stack.isEmpty()) return false;
                else if (character == ')' && stack.peek() != '(') return false;
                else if (character == '}' && stack.peek() != '{') return false;
                else if (character == ']' && stack.peek() != '[') return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ispar("{([])}"));    // true
        System.out.println(ispar("()"));    // true
        System.out.println(ispar("([]"));    // false
    }
}
