package heap.problems;

import java.util.Arrays;

/**
 * @author padmanabhadas
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/problem/heap-sort
 */

public class HeapSort {

    // Function to build a Heap from array.
    static void buildHeap(int[] arr, int n) {
        // Your code here
        for (int i = (n - 2) / 2; i >= 0; i--) heapify(arr, n, i);
    }

    // Heapify function to maintain heap property.
    static void heapify(int[] arr, int n, int i) {
        // Your code here
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;
        if (i != largest) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // Function to sort an array using Heap Sort.
    static int[] heapSort(int[] arr, int n) {
        //code here
        buildHeap(arr, n);
        for (int i = n - 1; i >= 1; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(heapSort(new int[]{4, 1, 3, 9, 7}, 5)));  // 1 3 4 7 9
        System.out.println(Arrays.toString(heapSort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 10)));  // 1 2 3 4 5 6 7 8 9 10
    }
}
