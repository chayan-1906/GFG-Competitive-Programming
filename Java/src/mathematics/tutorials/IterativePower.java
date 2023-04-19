package mathematics.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MjEzNw%3D%3D
public class IterativePower {

    public static int power(int n, int pow) {
        int result = 1;
        while (pow > 0) {
            if (pow % 2 != 0) result *= n;
            n *= n;
            pow /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(3, 2)); // 9
        System.out.println(power(3, 3)); // 27
        System.out.println(power(2, 0)); // 1
        System.out.println(power(2, 3)); // 8
        System.out.println(power(3, 5)); // 243
        System.out.println(power(7, 3)); // 343
    }
}
