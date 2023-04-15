package mathematics.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MTg0MQ%3D%3D
public class TrailingZeroesInFactorial {

    public static int countTrailingZeroes(int n) {
        int count = 0;
        for (int i = 5; i < n; i++) count = count + n / i;
        return count;

        /**
         * Testcase Dry Run --> 251
         * i = 5: count = 0 + 251/5 = 50
         * i = 25: count = 50 + 251/25 = 60
         * i = 125: count = 60 + 251/125 = 62
         */
    }

    public static void main(String[] args) {
        System.out.println(countTrailingZeroes(5)); // 1
        System.out.println(countTrailingZeroes(10));    // 2
        System.out.println(countTrailingZeroes(100));   // 24
        System.out.println(countTrailingZeroes(251));   // 62
    }
}
