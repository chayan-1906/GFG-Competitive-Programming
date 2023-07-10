package matrix.problems;

import java.util.ArrayList;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/print-matrix-in-snake-pattern-1587115621
 *
 * @author padmanabhadas
 */
public class MatrixSnakePattern {

    static ArrayList<Integer> snakePattern(int[][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) arrayList.add(matrix[i][j]);
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) arrayList.add(matrix[i][j]);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(snakePattern(new int[][]
                        {
                                {45, 48, 54},
                                {21, 89, 87},
                                {70, 78, 15},
                        }
                )
        );  // 45 48 54 87 89 21 70 78 15

        System.out.println(snakePattern(new int[][]
                        {
                                {1, 2},
                                {3, 4},
                        }
                )
        );  // 45 48 54 87 89 21 70 78 15
    }
}
