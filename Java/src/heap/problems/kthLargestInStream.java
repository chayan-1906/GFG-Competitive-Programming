package heap.problems;

import java.util.PriorityQueue;

public class kthLargestInStream {

    static void kthLargest(int[] arr, int n, int k) {
        // Your code here
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(arr[i]);
            } else if (arr[i] > priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.offer(arr[i]);
            }
            if (priorityQueue.size() < k) System.out.print(-1 + " ");
            else System.out.print(priorityQueue.peek() + " ");
        }
    }

    public static void main(String[] args) {
        kthLargest(new int[]{1, 2, 3, 4, 5, 6}, 6, 4); // -1 -1 -1 1 2 3
        System.out.println();

//        kthLargest(new int[]{3, 4}, 2, 1);    // 3 4
        System.out.println();
    }
}
