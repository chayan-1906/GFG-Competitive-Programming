package matrix.problems;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/transpose-of-matrix-1587115621
 *
 * @author padmanabhadas
 */
public class MatrixTranspose {

    static void printTranspose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                swap(matrix, i, j);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void main(String[] args) {
        printTranspose(new int[][]{
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4},
        });
        /*
             {1, 2, 3, 4},
             {1, 2, 3, 4},
             {1, 2, 3, 4},
             {1, 2, 3, 4},
        */
        System.out.println();

        printTranspose(new int[][]{
                {1, 2},
                {-9, -2},
        });
        /*
            {1, -9},
            {2, -2},
        */
    }
}
