package mathematics.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MTg0Ng%3D%3D
public class ComputingPower {

    public static int computePower(int x, int n) {
        if (n == 0) return 1;
        int temp = computePower(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) return temp;
        else return temp * x;
    }

    public static void main(String[] args) {
        System.out.println(computePower(2, 3));  // 8
        System.out.println(computePower(3, 4));  // 81
        System.out.println(computePower(5, 0));  // 1
        System.out.println(computePower(5, 1));  // 5
    }
}
