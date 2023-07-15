package matrix.problems;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/multiply-the-matrices-1587115620
 *
 * @author padmanabhadas
 */
public class MultiplyMatrices {

    static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int R1 = A.length;
        int C1 = A[0].length;
        int R2 = B.length;
        int C2 = B[0].length;
        int[][] ans = new int[R1][C2];
        if (R2 != C1) return new int[][]{{-1}};
        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C2; j++) {
                ans[i][j] = 0;
                for (int k = 0; k < R2; k++) {
                    ans[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        /*for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C2; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }*/
        return ans;
    }

    public static void main(String[] args) {

    }
}
