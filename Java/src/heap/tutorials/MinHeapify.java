package heap.tutorials;

import heap.Heap;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/video/MTM4Ng%3D%3D
 *
 * @author padmanabhadas
 */

public class MinHeapify {

    static void minHeapify(int i) {
        int lt = Heap.leftChild(i);
        int rt = Heap.rightChild(i);
        int smallest = i;
        if (lt < Heap.size && Heap.arr[lt] < Heap.arr[smallest]) smallest = lt;
        if (rt < Heap.size && Heap.arr[rt] < Heap.arr[smallest]) smallest = rt;
        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    static int extractMin() {
        if (Heap.size == 0) return Integer.MAX_VALUE;
        if (Heap.size == 1) {
            Heap.size--;
            return Heap.arr[0];
        }
        swap(0, Heap.size - 1);
        Heap.size--;
        minHeapify(0);
        return Heap.arr[Heap.size];
    }

    public static void main(String[] args) {
        Heap heap = new Heap(11);
        heap.insert(3);
        heap.insert(2);
        heap.insert(15);
        heap.insert(20);
        System.out.println(extractMin());
    }

    static void swap(int i, int j) {
        int tmp = Heap.arr[i];
        Heap.arr[i] = Heap.arr[j];
        Heap.arr[j] = tmp;
    }
}
