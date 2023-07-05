package matrix.problems;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/adding-two-matrices3512
 *
 * @author padmanabhadas
 */

public class AddingTwoMatrices {

    static int[][] sumMatrix(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) return new int[][]{{-1}};
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args) {

    }
}
