package datastructures.practices;

import java.util.ArrayList;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
public class SubarrayWithGivenSum {

    static ArrayList<Integer> subarraySum(int[] array, int n, int s) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int prefixSum = 0;
        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];
            if (s == prefixSum) {
                arrayList.add(1);
                arrayList.add(i + 1);
                return arrayList;
            }
            if (hashMap.containsKey(prefixSum - s)) {
                arrayList.add(hashMap.get(prefixSum - s) + 1);
                arrayList.add(i + 1);
                return arrayList;
            }
            hashMap.put(prefixSum, i + 1);
//            System.out.println(hashMap);
        }
        arrayList.add(-1);
        return arrayList;

        /** 1 - based indexing
         * Testcase Dry Run --> {1, 2, 3, 7, 5} sum = 12
         * 1: prefixSum = 1, hashmap.contains(-1) --> false hashmap.put(1, 1)
         * 2: prefixSum = 3, hashmap.contains(-10) --> false, hashmap.put(3, 2)
         * 3: prefixSum = 6, hashmap.contains(-6) --> false, hashmap.put(6, 3)
         * 7: prefixSum = 13, hashmap.contains(1) --> true
         */

        /** 1 - based indexing
         * Testcase Dry Run --> {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} sum = 15
         * 1: prefixSum = 1, start = 1, end = 1, hashmap.put(1, 1)
         * 2: prefixSum = 3, start = 1, end = 2, hashmap.put(3, 2)
         * 3: prefixSum = 6, start = 1, end = 3, hashmap.put(6, 3)
         * 4: prefixSum = 10, start = 1, end = 4, hashmap.put(10, 4)
         * 5: prefixSum = 15, start = 1, end = 5, hashmap.put(15, 5)
         */
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 2, 3, 7, 5}, 5, 12));   // 2 4
        System.out.println(subarraySum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10, 15));   // 1 5
    }
}
