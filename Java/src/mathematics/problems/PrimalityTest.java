package mathematics.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/problem/primality-test
public class PrimalityTest {

    public static boolean isPrime(int N) {
        if (N == 2 || N == 3) return true;
        else if (N == 1 || N % 2 == 0 || N % 3 == 0) return false;
        else {
            for (int i = 5; i * i <= N; i += 6) {
                if (N % i == 0 || N % (i + 2) == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(4)); // false
    }
}
