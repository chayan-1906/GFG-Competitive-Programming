package heap.tutorials;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author padmanabhadas
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/video/MTM5MA%3D%3D
 */

public class SortKSortedArray {

    public static int[] sortArray(int[] array, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        /// add all the elements in priority queue
        for (int i = 0; i <= k; i++) priorityQueue.add(array[i]);
        int index = 0;
        for (int i = k + 1; i < array.length; i++) {
            array[index++] = priorityQueue.poll();
            priorityQueue.add(array[i]);
        }
        while (!priorityQueue.isEmpty()) array[index++] = priorityQueue.poll();
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{9, 8, 7, 18, 19, 17}, 2)));  // 7, 8, 9, 17, 18, 19
        System.out.println(Arrays.toString(sortArray(new int[]{9, 8, 7, 18, 19, 17, 24, 21, 20}, 2)));  // 7, 8, 9, 17, 18, 19, 20, 21, 24
        System.out.println(Arrays.toString(sortArray(new int[]{10, 9, 7, 8, 4, 70, 50, 60}, 4)));  // 4, 7, 8, 9, 10, 50, 60, 70
    }
}
