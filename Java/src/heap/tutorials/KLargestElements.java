package heap.tutorials;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/video/MTM4OA%3D%3D
 *
 * @author padmanabhadas
 */

public class KLargestElements {

    static ArrayList<Integer> largestKElement(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) priorityQueue.add(arr[i]);
        System.out.println(priorityQueue.peek());
        for (int i = k; i < arr.length; i++) {
            if (priorityQueue.peek() <= arr[i]) {
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }
        return new ArrayList<>(priorityQueue);
    }

    public static void main(String[] args) {
//        System.out.println(largestKElement(new int[]{5, 15, 10, 20, 8}, 2));  // 15 20
        System.out.println(largestKElement(new int[]{8, 6, 4, 10, 9}, 3));  // 8 10 9
//        System.out.println(largestKElement(new int[]{11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45}, 3));  // 50 96 88
    }
}
