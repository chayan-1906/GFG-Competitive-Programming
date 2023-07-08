package matrix.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/video/MTQ1NA%3D%3D
 *
 * @author padmanabhadas
 */

public class RotateMatrixAntiClock90 {

    static void rotateMatrix90(int[][] matrix) {
        /// transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                swap(matrix, i, j);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /// reverse rows
        for (int i = 0; i < matrix.length; i++) {
            int low = 0, high = matrix.length - 1;
            while (low < high) {
                reverse(matrix, low, high, i);
                low++;
                high--;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    static void reverse(int[][] matrix, int low, int high, int i) {
        int temp = matrix[low][i];
        matrix[low][i] = matrix[high][i];
        matrix[high][i] = temp;
    }

    public static void main(String[] args) {
        rotateMatrix90(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                }
        );
        /*
         * {4, 8, 12, 16},
         * {3, 7, 11, 15},
         * {2, 6, 10, 14},
         * {1, 5, 9, 13}
         */
    }
}
