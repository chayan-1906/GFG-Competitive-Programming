package mathematics.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MTg1Mg%3D%3D
public class Factorial {

    public static int findFact(int n) {
        if (n == 0) return 1;
        return n * findFact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(findFact(5));    // 120
        System.out.println(findFact(10));   // 3628800
    }
}
