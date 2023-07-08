package matrix.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/video/MTQ1OA%3D%3D
 *
 * @author padmanabhadas
 */
public class MatrixBoundaryTraversal {

    static void printBoundaryTraversal(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        if (R == 1) {
            for (int i = 0; i < C; i++) System.out.print(matrix[0][i] + " ");
        } else if (C == 1) {
            for (int i = 0; i < R; i++) System.out.print(matrix[i][0] + " ");
        } else {
            for (int i = 0; i < C; i++) System.out.print(matrix[0][i] + " ");
            for (int i = 1; i < R; i++) System.out.print(matrix[i][C - 1] + " ");
            for (int i = C - 2; i >= 0; i--) System.out.print(matrix[R - 1][i] + " ");
            for (int i = R - 2; i >= 1; i--) System.out.print(matrix[i][0] + " ");
        }
    }

    public static void main(String[] args) {
        printBoundaryTraversal(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                }
        );  // 1 2 3 4 8 12 16 15 14 13 9 5
        System.out.println();

        printBoundaryTraversal(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                }
        );  // 1 2 3 4 8 7 6 5
        System.out.println();

        printBoundaryTraversal(new int[][]
                {
                        {1, 2, 3, 4},
                }
        );  // 1 2 3 4
        System.out.println();

        printBoundaryTraversal(new int[][]
                {
                        {1}, {2}, {3},
                }
        );  // 1 2 3
        System.out.println();

        printBoundaryTraversal(new int[][]
                {
                        {1, 2},
                        {3, 4},
                        {5, 6},
                }
        );  // 1 2 4 6 5 3
        System.out.println();
    }
}
