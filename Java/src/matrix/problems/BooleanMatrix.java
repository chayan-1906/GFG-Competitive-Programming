package matrix.problems;

import java.util.Arrays;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Matrix/problem/boolean-matrix-problem-1587115620
 *
 * @author padmanabhadas
 */

public class BooleanMatrix {

    public static void main(String[] args) {
        booleanMatrix(new int[][]
                {
                        {1, 0},
                        {0, 0},
                }
        );
        System.out.println();

        booleanMatrix(new int[][]
                {
                        {1, 0, 0},
                        {1, 0, 0},
                        {1, 0, 0},
                        {0, 0, 0},
                }
        );
        System.out.println();

        booleanMatrix(new int[][]
                {
                        {1, 0, 0, 0},
                        {0, 0, 1, 1},
                        {0, 0, 0, 0},
                        {1, 1, 0, 0},
                }
        );
    }

    /*static void booleanMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        ArrayList<MatrixIndex> arrayList = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 1) arrayList.add(new MatrixIndex(i, j));
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            int row = arrayList.get(i).rowNo;
            int col = arrayList.get(i).colNo;
            Arrays.fill(matrix[row], 1);
            for (int j = 0; j < matrix.length; j++) matrix[j][col] = 1;
        }

        System.out.println(Arrays.deepToString(matrix));
    }*/

    static void booleanMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        boolean[] fillRow = new boolean[R];
        boolean[] fillCol = new boolean[C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 1) {
                    fillRow[i] = true;
                    fillCol[j] = true;
                }
            }
        }

        for (int i = 0; i < R; i++) {
            if (fillRow[i]) Arrays.fill(matrix[i], 1);
        }

        for (int j = 0; j < C; j++) {
            if (fillCol[j]) {
                for (int i = 0; i < R; i++) {
                    matrix[i][j] = 1;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    static class MatrixIndex {
        int rowNo;
        int colNo;

        public MatrixIndex(int rowNo, int colNo) {
            this.rowNo = rowNo;
            this.colNo = colNo;
        }

        @Override
        public String toString() {
            return "MatrixNode{" +
                    "rowNo=" + rowNo +
                    ", colNo=" + colNo +
                    '}';
        }
    }
}
