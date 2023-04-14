package stack.practices;

import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
public class ReverseString {

    public static String reverse(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            stack.push(ch);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) stringBuilder.append(stack.pop());
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("GeeksforGeeks"));   // skeeGrofskeeG
    }
}
