package mathematics.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MTg1Mw%3D%3D
public class PalindromeNumber {

    public static boolean isPalindrome(int n) {
        int revNo = 0;
        int originalNumber = n;
        while (originalNumber != 0) {
            revNo = revNo * 10 + originalNumber % 10;
            originalNumber /= 10;
        }
        return revNo == n;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(4553)); // false
        System.out.println(isPalindrome(1)); // true
    }
}
