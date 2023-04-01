package stack.problems;

import java.util.Stack;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/removing-consecutive-duplicates-2-1587115621
public class RemovePairDuplicates {

    public static String removePair(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(str.charAt(i));
            } else {
                if (stack.peek() == str.charAt(i)) stack.pop();
                else stack.push(str.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character character : stack) result.append(character);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removePair("aaabbaaccd"));  // ad
        System.out.println(removePair("aaaa"));    // ""
        System.out.println(removePair("abba"));    // ""
        System.out.println(removePair("aac"));    // c
    }
}
