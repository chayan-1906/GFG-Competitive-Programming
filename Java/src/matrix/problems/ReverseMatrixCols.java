package matrix.problems;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/reversing-the-columns-of-a-matrix-1587115621
 *
 * @author padmanabhadas
 */
public class ReverseMatrixCols {

    static void reverseCol(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        for (int i = 0; i < R; i++) {
            int low = 0, high = C - 1;
            while (low < high) {
                swap(matrix, i, low, high);
                low++;
                high--;
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    static void swap(int[][] matrix, int i, int low, int high) {
        int temp = matrix[i][low];
        matrix[i][low] = matrix[i][high];
        matrix[i][high] = temp;
    }

    public static void main(String[] args) {
        reverseCol(new int[][]
                {
                        {1, 2, 3},
                        {5, 6, 7},
                        {11, 10, 9},
                        {13, 14, 15},
                }
        );  // 3 2 1 7 6 5 9 10 11 15 14 13
        System.out.println();

        reverseCol(new int[][]
                {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                }
        );  // 5 4 3 2 1 10 9 8 7 6
    }
}
