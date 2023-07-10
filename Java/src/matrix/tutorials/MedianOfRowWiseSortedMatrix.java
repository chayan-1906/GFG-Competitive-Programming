package matrix.tutorials;

import java.util.Arrays;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/video/MjI2Mw%3D%3D
 *
 * @author padmanabhadas
 */
public class MedianOfRowWiseSortedMatrix {

    static int findMedian(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int min = matrix[0][0]; // first element of first row
        int max = matrix[0][C - 1]; // last element of first row
        for (int i = 1; i < R; i++) {
            if (matrix[i][0] < min) min = matrix[i][0];
            if (matrix[i][C - 1] > max) max = matrix[i][C - 1];
        }
        int midPos = (R * C + 1) / 2;
        while (min < max) {
            int mid = (min + max) / 2;
            midPos = 0;
            // TODO: Can't understand for loop logic
            for (int i = 0; i < R; i++) {
                int pos = Arrays.binarySearch(matrix[i], mid) + 1;
                midPos += Math.abs(pos);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMedian(new int[][]
                        {
                                {1, 10, 20},
                                {15, 25, 35},
                                {5, 30, 40},
                        }
                )
        );  // 20
        System.out.println(findMedian(new int[][]
                        {
                                {2, 4, 6, 8, 10},
                                {1, 3, 5, 7, 9},
                                {100, 200, 400, 500, 800},
                        }
                )
        );  // 8
        System.out.println(findMedian(new int[][]
                        {
                                {5, 10, 20, 30, 40},
                                {1, 2, 3, 4, 6},
                                {11, 13, 15, 17, 19},
                        }
                )
        );  // 8
    }
}
