package matrix.problems;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/reversing-the-rows-of-a-matrix-1587115621
 *
 * @author padmanabhadas
 */
public class InterchangeMatrixRows {

    static void interchangeRows(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int low = 0, high = R - 1;
        while (low < high) {
            swap(matrix, low, high);
            low++;
            high--;
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    static void swap(int[][] matrix, int low, int high) {
        int[] tempArr = matrix[low];
        matrix[low] = matrix[high];
        matrix[high] = tempArr;
    }

    public static void main(String[] args) {
        interchangeRows(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                }
        );  // 13 14 15 16 9 10 11 12 5 6 7 8 1 2 3 4
        System.out.println();

        interchangeRows(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                        {10, 11, 12},
                        {13, 14, 15},
                }
        );  // 13 14 15 10 11 12 7 8 9 4 5 6 1 2 3
    }
}
