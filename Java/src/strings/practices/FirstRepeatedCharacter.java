package strings.practices;

// https://practice.geeksforgeeks.org/problems/find-first-repeated-character4108/1
public class FirstRepeatedCharacter {

    static String firstRepChar(String s) {
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            if (count[s.charAt(i)] > 1) return String.valueOf(s.charAt(i));
        }
        return "-1";
    }

    public static void main(String[] args) {
        System.out.println(firstRepChar("hellogeeks")); // l
        System.out.println(firstRepChar("abc"));    // -1
    }
}
