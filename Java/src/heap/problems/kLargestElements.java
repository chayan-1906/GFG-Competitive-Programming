package heap.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author padmanabhadas
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/problem/k-largest-elements3736
 */

public class kLargestElements {

    static ArrayList<Integer> kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) priorityQueue.offer(arr[i]);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < k; i++) arrayList.add(priorityQueue.poll());
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(kLargest(new int[]{12, 5, 787, 1, 23}, 5, 2));   // 787 23
        System.out.println(kLargest(new int[]{1, 23, 12, 9, 30, 2, 50}, 7, 3)); // 50 30 23
    }
}
