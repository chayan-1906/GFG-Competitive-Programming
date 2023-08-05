package heap.tutorials;

import heap.Heap;

import java.util.Arrays;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/video/MTUwMjE%3D
 *
 * @author padmanabhadas
 */

public class BuildHeap {

    static int[] buildHeap(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            minHeapify(arr, i);
        }
        return arr;
    }

    static void minHeapify(int[] arr, int i) {
        int lt = Heap.leftChild(i);
        int rt = Heap.rightChild(i);
        int smallest = i;
        if (lt < arr.length && arr[lt] < arr[smallest]) smallest = lt;
        if (rt < arr.length && arr[rt] < arr[smallest]) smallest = rt;
        if (smallest != i) {
            swap(arr, i, smallest);
            minHeapify(arr, smallest);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildHeap(new int[]{10, 5, 20, 2, 4, 8})));   // 2, 4, 8, 5, 10, 20
        System.out.println(Arrays.toString(buildHeap(new int[]{30, 20, 10}))); // 10, 20, 30
    }
}
