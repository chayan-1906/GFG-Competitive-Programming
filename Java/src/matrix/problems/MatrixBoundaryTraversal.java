package matrix.problems;

import java.util.ArrayList;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/boundary-traversal-of-matrix-1587115620
 *
 * @author padmanabhadas
 */
public class MatrixBoundaryTraversal {

    static ArrayList<Integer> boundaryTraversal(int[][] matrix, int R, int C) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < C; i++) arrayList.add(matrix[0][i]);
        for (int i = 1; i < R; i++) arrayList.add(matrix[i][C - 1]);
        if (R > 1) for (int i = C - 2; i >= 0; i--) arrayList.add(matrix[R - 1][i]);
        if (C > 1) for (int i = R - 2; i > 0; i--) arrayList.add(matrix[i][0]);
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(boundaryTraversal(new int[][]
                        {
                                {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12},
                                {13, 14, 15, 16},
                        }, 4, 4
                )
        );  // 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5

        System.out.println(boundaryTraversal(new int[][]
                        {
                                {12, 11, 10, 9},
                                {8, 7, 6, 5},
                                {4, 3, 2, 1},
                        }, 3, 4
                )
        );  // 12, 11, 10, 9, 5, 1, 2, 3, 4, 8

        System.out.println(boundaryTraversal(new int[][]
                        {
                                {1, 2},
                                {5, 17},
                        }, 2, 2
                )
        );  // 1, 2, 17, 5
    }
}
