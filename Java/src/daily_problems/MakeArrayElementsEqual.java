package daily_problems;

// https://practice.geeksforgeeks.org/problems/1f05c7c12b1084f270c57566b2110967c046730d/1
public class MakeArrayElementsEqual {

    public static long minOperations(int N) {
        /*int avg, sum = 0, count = 0;
        for (int i = 0; i < N; i++) sum += (2 * i) + 1;
        avg = sum / N;
        for (int i = 0; i < N; i++) {
            int no = (2 * i) + 1;
            if (no < avg) count += (avg - no);
        }
        return count;*/
        return (long) N * N / 4;

        /**
         * Testcase Dry Run: N = 3
         * avg = (1+3+5)/3 = 3
         * no = 1, 1 < 3 => count = 3-1 = 2
         * no = 3, 3 = 3
         * no = 5, 5 > 3
         */
    }

    public static void main(String[] args) {
        System.out.println(minOperations(3));   // 2
        System.out.println(minOperations(2));   // 1
    }
}
