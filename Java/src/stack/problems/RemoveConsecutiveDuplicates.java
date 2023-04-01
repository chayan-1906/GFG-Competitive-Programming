package stack.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/problem/removing-consecutive-duplicates-1587115621
public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            char character = stringBuilder.charAt(i);
            if (character == stringBuilder.charAt(i + 1)) {
                stringBuilder.delete(i, i + 1);
                i--;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aaaaaabaabccccccc"));
        System.out.println(removeConsecutiveDuplicates("abbccbcd"));
    }
}
