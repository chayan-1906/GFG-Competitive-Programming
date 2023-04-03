package strings.practices;

import java.util.Arrays;
import java.util.LinkedHashSet;

// https://practice.geeksforgeeks.org/problems/uncommon-characters4932/1
public class UncommonCharacters {

    static String UncommonChars(String A, String B) {
        LinkedHashSet<Character> hashSetA = new LinkedHashSet<>();
        LinkedHashSet<Character> hashSetB = new LinkedHashSet<>();
        for (int i = 0; i < A.length(); i++) hashSetA.add(A.charAt(i));
        for (int i = 0; i < B.length(); i++) hashSetB.add(B.charAt(i));
        StringBuilder result = new StringBuilder();
        for (Character character : hashSetA) {
            if (!hashSetB.contains(character)) result.append(character);
        }
        for (Character character : hashSetB) {
            if (!hashSetA.contains(character)) result.append(character);
        }
        char[] str = result.toString().toCharArray();
        Arrays.sort(str);
        result = new StringBuilder(new String(str));
        return (result.length() == 0) ? "-1" : result.toString();
    }

    public static void main(String[] args) {
        System.out.println(UncommonChars("geeksforgeeks", "geeksquiz")); // fioqruz
        System.out.println(UncommonChars("characters", "alphabets")); // bclpr
    }
}
