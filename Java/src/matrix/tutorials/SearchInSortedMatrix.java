package matrix.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/video/MTQ1OQ%3D%3D
 *
 * @author padmanabhadas
 */
public class SearchInSortedMatrix {

    static String search(int[][] matrix, int x) {
        int R = matrix.length;
        int C = matrix[0].length;
        int i = 0, j = C - 1;

        while (i < R && j >= 0) {
            if (matrix[i][j] == x) return "(" + i + ", " + j + ")";
            else if (matrix[i][j] > x) j--;
            else i++;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        System.out.println(search(new int[][]
                        {
                                {10, 20, 30, 40},
                                {15, 25, 35, 45},
                                {27, 29, 37, 48},
                                {32, 33, 39, 50},
                        },
                29)
        );  // (2, 1)

        System.out.println(search(new int[][]
                        {
                                {10, 20},
                                {12, 30},
                        },
                15)
        );  // Not Found
    }
}
