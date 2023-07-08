package matrix.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/video/MTQ1Nw%3D%3D
 *
 * @author padmanabhadas
 */

public class MatrixSnakePattern {

    static void printSnakeMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = mat.length - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        printSnakeMatrix(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                }
        );
        System.out.println();

        printSnakeMatrix(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                }
        );
    }
}
