package heap.problems;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;

/**
 * @author padmanabhadas
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/problem/most-occurring-elements-1587115620
 */

public class kMostOccurringElements {

    static int kMostFrequent(int[] arr, int n, int k) {
        // your code here
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i : arr) hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
//        System.out.println(hashMap);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        hashMap.forEach((key, value) -> priorityQueue.add(value));
//        System.out.println(priorityQueue);
        int sum = 0;
        for (int i = 0; i < k; i++) sum += priorityQueue.poll();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(kMostFrequent(new int[]{3, 1, 4, 4, 5, 2, 6, 1}, 8, 2));   // 2 + 2 = 4
        System.out.println(kMostFrequent(new int[]{3, 3, 3, 4, 1, 1, 6, 1}, 8, 2));   // 3 + 3 = 6
        System.out.println(kMostFrequent(new int[]{3, 1, 5, 5, 5, 1, 7, 8}, 8, 3));   // 5 + 1 = 6
    }
}
