package mathematics.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MTg0NQ%3D%3D
public class CheckPrime {

    public static boolean isPrime(int n) {
        /*for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;*/

        /*for (int i = 2; i * i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;*/

        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));    // true
        System.out.println(isPrime(14));    // false
        System.out.println(isPrime(101));    // true
        System.out.println(isPrime(121));    // false
        System.out.println(isPrime(1031));    // true
    }
}
