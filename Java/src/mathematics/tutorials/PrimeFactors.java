package mathematics.tutorials;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MTg0OQ%3D%3D
public class PrimeFactors {

    public static ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (n <= 1) return arrayList;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                arrayList.add(i);
                n /= i;
            }
        }
        if (n > 1) arrayList.add(n);
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(12));   // 2 2 3
        System.out.println(primeFactors(13));   // 13
        System.out.println(primeFactors(315));  // 3 3 5 7
    }
}
