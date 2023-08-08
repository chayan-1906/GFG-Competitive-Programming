package heap.tutorials;

import java.util.PriorityQueue;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/video/MTM3OQ%3D%3D
 *
 * @author padmanabhadas
 */

public class BuyMaxItemsWithGivenSum {

    static int numberOfItems(int[] cost, int sum) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int count = 0;
        for (int c : cost) priorityQueue.add(c);
        for (int i = 0; i < sum; i++) {
            if (priorityQueue.peek() <= sum) {
                sum -= priorityQueue.poll();
                count++;
            } else break;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfItems(new int[]{1, 12, 5, 11, 200}, 10));  // 2
        System.out.println(numberOfItems(new int[]{20, 10, 5, 30, 100}, 35));  // 3
    }
}
