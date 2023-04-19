package mathematics.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/problem/addition-under-modulo
public class AdditionModulo {

    public static long sumUnderModulo(long a, long b) {
        return (a % 1000000007 + b % 1000000007) % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(sumUnderModulo(9223372036854775807L, 9223372036854775807L)); // 582344006
        System.out.println(sumUnderModulo(1000000007L, 1000000007L)); // 0
    }
}
