package mathematics.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/problem/modular-multiplicative-inverse-158711562
public class ModularMultiplicativeInverse {

    public static int modInverse(int a, int m) {
        for (int i = 0; i < m; i++) {
            if ((a * i) % m == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(modInverse(3, 11));    // 4
        System.out.println(modInverse(10, 17));    // 12
    }
}
