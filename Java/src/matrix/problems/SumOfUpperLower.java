package matrix.problems;

import java.util.ArrayList;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/sum-of-upper-and-lower-triangles-1587115621
 *
 * @author padmanabhadas
 */

public class SumOfUpperLower {

    static ArrayList<Integer> sumTriangles(int[][] matrix, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int upperSum = 0;
        int lowerSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) upperSum += matrix[i][j];
                if (i >= j) lowerSum += matrix[i][j];
            }
        }
        arrayList.add(upperSum);
        arrayList.add(lowerSum);
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(sumTriangles(new int[][]
                {
                        {6, 5, 4},
                        {1, 2, 5},
                        {7, 9, 7},
                }, 3)
        );

        System.out.println(sumTriangles(new int[][]
                {
                        {1, 2},
                        {3, 4},
                }, 2)
        );
    }
}
