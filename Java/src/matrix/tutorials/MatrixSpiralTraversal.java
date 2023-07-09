package matrix.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/video/MTQ1Mg%3D%3D
 *
 * @author padmanabhadas
 */
public class MatrixSpiralTraversal {

    static void printSpiralTraversal(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int top = 0, bottom = R - 1;
        int left = 0, right = C - 1;

        while (top <= bottom && left <= right) {
            // top row
            for (int i = left; i <= right; i++) System.out.print(matrix[top][i] + " ");
            top++;

            // right col
            for (int i = top; i <= bottom; i++) System.out.print(matrix[i][right] + " ");
            right--;

            // bottom row (reverse order)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            // left col (reverse order)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }

    public static void main(String[] args) {
        printSpiralTraversal(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                }
        );  // 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        System.out.println();

        printSpiralTraversal(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                }
        );  // 1 2 3 6 5 4
        System.out.println();

        printSpiralTraversal(new int[][]
                {
                        {10, 20, 30},
                }
        );  // 10 20 30
        System.out.println();

        printSpiralTraversal(new int[][]
                {
                        {10},
                        {20},
                        {30},
                }
        );  // 10 20 30
        System.out.println();
    }
}
