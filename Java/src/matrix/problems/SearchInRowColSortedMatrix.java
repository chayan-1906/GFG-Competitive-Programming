package matrix.problems;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/search-in-a-matrix-1587115621
 *
 * @author padmanabhadas
 */

public class SearchInRowColSortedMatrix {

    static boolean search(int[][] matrix, int n, int m, int x) {
        int i = 0, j = m - 1;   // start from top-right corner
        while (i < n && j >= 0) {
            if (matrix[i][j] == x) return true;
            else if (matrix[i][j] > x) j--; // move towards left
            else i++;   // move towards bottom
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[][]
                {
                        {3, 30, 38},
                        {36, 43, 60},
                        {40, 51, 69},
                }, 3, 3, 62)
        );  // 0

        System.out.println(search(new int[][]{{18, 21, 27, 38, 55, 67}}, 1, 6, 55));  // 1
    }
}
