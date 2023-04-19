package mathematics.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/problem/multiplication-under-modulo
public class MultiplicationModulo {

    static long multiplicationUnderModulo(long a, long b) {
        return ((a % 1000000007) * (b % 1000000007)) % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(multiplicationUnderModulo(92233720368547758L, 92233720368547758L));  // 484266119
        System.out.println(multiplicationUnderModulo(1000000007L, 1000000007L));    // 0
    }
}
