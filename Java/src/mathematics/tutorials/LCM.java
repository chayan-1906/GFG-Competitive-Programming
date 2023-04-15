package mathematics.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MTg0Nw%3D%3D
public class LCM {

    // a * b = GCD * LCM
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(findLCM(4, 6));   // 12
        System.out.println(findLCM(12, 15));   // 60
        System.out.println(findLCM(2, 8));   // 8
        System.out.println(findLCM(3, 7));   // 21
    }
}
