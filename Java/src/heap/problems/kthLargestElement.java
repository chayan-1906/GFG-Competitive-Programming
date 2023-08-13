package heap.problems;

import java.util.PriorityQueue;

/**
 * @author padmanabhadas
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/problem/kth-largest-element5034
 */

public class kthLargestElement {

    static int KthLargest(int[] arr, int n, int k) {
        // Your code here
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        for (int i = 0; i < k; i++) priorityQueue.offer(arr[i]);
        for (int i = k; i < n; i++) {
            if (arr[i] > priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        System.out.println(KthLargest(new int[]{3, 5, 4, 2, 9}, 5, 3)); // 4
        System.out.println(KthLargest(new int[]{4, 3, 7, 6, 5}, 5, 5)); // 3
    }
}
