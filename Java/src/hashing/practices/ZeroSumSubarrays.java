package hashing.practices;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1
public class ZeroSumSubarrays {

    public static long findSubarray(long[] arr, int n) {
        HashMap<Long, Integer> hashMap = new HashMap<>();
        long prefixSum = 0;
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0) count++;
            if (hashMap.containsKey(prefixSum)) count += hashMap.get(prefixSum);
            hashMap.put(prefixSum, hashMap.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findSubarray(new long[]{0, 0, 5, 5, 0, 0}, 6));  // 6
        System.out.println(findSubarray(new long[]{6, -1, -3, 4, -2, 2, 4, 6, -12, -7}, 10));  // 4
    }
}
