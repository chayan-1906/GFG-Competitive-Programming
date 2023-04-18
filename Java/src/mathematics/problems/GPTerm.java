package mathematics.problems;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/problem/gp-term
public class GPTerm {

    public static double termOfGP(int A, int B, int N) {
        return A * Math.pow((double) B / A, N - 1);
    }

    public static void main(String[] args) {
        System.out.println(termOfGP(2, 3, 1));  // 2
        System.out.println(termOfGP(1, 2, 5));  // 16 -> 1 2 4 8 16
        System.out.println(termOfGP(84, 87, 3));  // 90
    }
}
