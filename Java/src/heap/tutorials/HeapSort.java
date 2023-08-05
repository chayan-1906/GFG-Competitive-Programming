package heap.tutorials;

import heap.Heap;

import java.util.Arrays;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/video/MTQyNg%3D%3D
 *
 * @author padmanabhadas
 */

public class HeapSort {

    static int[] heapSort(int[] arr) {
        buildMaxHeap(arr);
        for (int i = arr.length - 1; i >= 1; i--) {
            swap(arr, 0, i);
            maxHeapify(arr, i, 0);
        }
        return arr;
    }

    static void maxHeapify(int[] arr, int n, int i) {
        int left = Heap.leftChild(i);
        int right = Heap.rightChild(i);
        int largest = i;
        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;
        if (largest != i) {
            swap(arr, i, largest);
            maxHeapify(arr, n, largest);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static void buildMaxHeap(int[] arr) {
        for (int i = (arr.length - 2) / 2; i >= 0; i--) maxHeapify(arr, arr.length, i);
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(buildMaxHeap(new int[]{10, 15, 50, 4, 20}))); // 4, 10 15 20 50
        System.out.println(Arrays.toString(heapSort(new int[]{10, 15, 50, 4, 20}))); // 4, 10 15 20 50
//        System.out.println(Arrays.toString(buildMaxHeap(new int[]{12, 11, 13, 5, 6, 7})));   // 5 6 7 11 12 13
        System.out.println(Arrays.toString(heapSort(new int[]{12, 11, 13, 5, 6, 7})));   // 5 6 7 11 12 13
    }
}
