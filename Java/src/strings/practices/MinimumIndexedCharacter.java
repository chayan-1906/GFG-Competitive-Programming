package strings.practices;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1
public class MinimumIndexedCharacter {

    public static int minIndexChar(String str, String patt) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < patt.length(); i++) hashSet.add(patt.charAt(i));
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];
            if (hashSet.contains(character)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minIndexChar("geeksforgeeks", "set"));   // 1
        System.out.println(minIndexChar("adcffaet", "onkl"));    // -1
    }
}
