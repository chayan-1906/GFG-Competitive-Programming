package matrix.problems;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/rotate-by-90-degree-1587115621
 *
 * @author padmanabhadas
 */

public class RotateMatrix90 {

    static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    static void swapRow(int[][] matrix, int i, int low, int high) {
        int temp = matrix[low][i];
        matrix[low][i] = matrix[high][i];
        matrix[high][i] = temp;
    }

    static void rotateby90(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                swap(matrix, i, j);
            }
        }

        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while (low < high) {
                swapRow(matrix, i, low, high);
                low++;
                high--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rotateby90(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                }, 3);
        /*
            {3 6 9}
            {2 5 8}
            {1 4 7}
        */

        rotateby90(new int[][]
                {
                        {1, 2},
                        {3, 4},
                }, 2);
        /*
            {2 4}
            {1 3}
        */
    }
}
