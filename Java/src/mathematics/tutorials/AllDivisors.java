package mathematics.tutorials;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Mathematics/video/MTkwMg%3D%3D
public class AllDivisors {

    // Naive Solution O(n)
    /*public static ArrayList<Integer> findAllDivisors(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) arrayList.add(i);
        }
        return arrayList;
    }*/

    public static ArrayList<Integer> findAllDivisors(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) arrayList.add(i);
        }
        for (; i >= 1; i--) {
            if (n % i == 0) arrayList.add(n / i);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(findAllDivisors(15));    // 1 3 5 15
        System.out.println(findAllDivisors(100));   // 1 2 4 5 10 20 25 50 100
        System.out.println(findAllDivisors(7)); // 1 7
    }
}
