package matrix.problems;

import java.util.ArrayList;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/spirally-traversing-a-matrix-1587115621
 *
 * @author padmanabhadas
 */

public class MatrixSpiralTraversal {

    static ArrayList<Integer> spirallyTraverse(int[][] matrix, int r, int c) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int lowR = 0, highR = r - 1, lowC = 0, highC = c - 1;
        while (lowR <= highR && lowC <= highC) {
            for (int i = lowC; i <= highC; i++) arrayList.add(matrix[lowR][i]);
            lowR++;
            for (int i = lowR; i <= highR; i++) arrayList.add(matrix[i][highC]);
            highC--;
            if (lowR <= highR) {
                for (int i = highC; i >= lowC; i--) arrayList.add(matrix[highR][i]);
                highR--;
            }
            if (lowC <= highC) {
                for (int i = highR; i >= lowR; i--) arrayList.add(matrix[i][lowC]);
                lowC++;
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(spirallyTraverse(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                }, 4, 4)
        );  // 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10

        System.out.println(spirallyTraverse(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                }, 3, 4)
        );  // 1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7
    }
}
