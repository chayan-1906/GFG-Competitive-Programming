package mathematics.tutorials;

import java.util.ArrayList;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MTg1MA%3D%3D
public class SieveOfEratosthenes {

    public static ArrayList<Integer> findPrimeNumbers(int n) {
        boolean[] isPrime = new boolean[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
                for (int j = i * i; j <= n; j += i) isPrime[j] = false;
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(findPrimeNumbers(10));   // 2 3 5 7
        System.out.println(findPrimeNumbers(9));   // 2 3 5 7
    }
}
