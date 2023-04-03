package stack.practices;

import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1
public class ParenthesisChecker {

    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                else if (c == ')' && stack.peek() != '(') return false;
                else if (c == '}' && stack.peek() != '{') return false;
                else if (c == ']' && stack.peek() != '[') return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ispar("{([])}"));    // true
        System.out.println(ispar("()"));    // true
        System.out.println(ispar("([]")); // false
    }
}
