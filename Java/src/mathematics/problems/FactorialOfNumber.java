package mathematics.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/problem/factorial-of-number
public class FactorialOfNumber {

    public static long factorial(int N) {
        // Your code here
        if (N == 0) return 1L;
        return N * factorial(N - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));   // 24
        System.out.println(factorial(13));  // 6227020800
    }
}
