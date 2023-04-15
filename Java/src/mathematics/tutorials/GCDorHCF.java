package mathematics.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MTgzOQ%3D%3D
public class GCDorHCF {

    public static int findGCD(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    public static int recursiveGCD(int a, int b) {
        if (b == 0) return a;
        return recursiveGCD(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(findGCD(10, 15));    // 5
        System.out.println(recursiveGCD(10, 15));    // 5
        System.out.println(findGCD(12, 15));    // 3
        System.out.println(recursiveGCD(12, 15));    // 3
    }
}
