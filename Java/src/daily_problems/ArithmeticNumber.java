package daily_problems;

import java.util.ArrayList;

/**
 * Given three integers 'A' denoting the first term of an arithmetic sequence ,
 * 'C' denoting the common difference of an arithmetic sequence and an integer 'B'.
 * You need to tell whether 'B' exists in the arithmetic sequence or not.
 * Return 1 if B is present in the sequence. Otherwise, returns 0.
 * <p>
 * Example 1:
 * Input: A = 1, B = 3, C = 2
 * Output: 1
 * Explanation: 3 is the second term of the sequence starting with 1 and having a common difference 2.
 * <p>
 * Example 2:
 * <p>
 * Input: A = 1, B = 2, C = 3
 * Output: 0
 * Explanation: 2 is not present in the sequence.
 * <p>
 * Your Task:
 * You do not need to read input or print anything. Your task is to complete the function inSequence() which takes A, B and C and returns 1 if B is present in the sequence. Otherwise, returns 0.
 * <p>
 * Expected Time Complexity: O(1)
 * Expected Auxiliary Space: O(1)
 */

public class ArithmeticNumber {

    static int inSequence(int A, int B, int C) {
        // TODO: COMPLETE THIS
        ArrayList<Integer> arrayList = new ArrayList<> ( );
        for (int i = A; i < B; i++) {
            int an = A + (i - 1) * C;
            // System.out.println(an);
            arrayList.add ( an );
        }
        // System.out.println(arrayList);
        return arrayList.contains ( B ) ? 1 : 0;
    }

    public static void main(String[] args) {
        inSequence ( 1, 3, 2 );
        inSequence ( 1, 2, 3 );
    }

}
