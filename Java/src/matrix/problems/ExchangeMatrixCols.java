package matrix.problems;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/exchange-matrix-columns-1587115620
 *
 * @author padmanabhadas
 */

public class ExchangeMatrixCols {

    static void exchangeColumns(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        for (int i = 0; i < R; i++) {
            swap(matrix, i, C - 1);
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    static void swap(int[][] matrix, int i, int C) {
        int temp = matrix[i][0];
        matrix[i][0] = matrix[i][C];
        matrix[i][C] = temp;
    }

    public static void main(String[] args) {
        exchangeColumns(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                }
        );  // 4 2 3 1 8 6 7 5 12 10 11 9 16 14 15 13
        System.out.println();

        exchangeColumns(new int[][]
                {
                        {4, 3, 2},
                        {1, 5, 6},
                }
        );  // 2 3 4 6 5 1
    }
}
