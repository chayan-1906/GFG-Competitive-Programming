package heap.tutorials;

import heap.Heap;

import java.util.Arrays;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Heap/video/MTUwMjE%3D
 *
 * @author padmanabhadas
 */

public class DecreaseDeleteKey {

    static int deleteKey(int index) {
        decreaseKey(index, Integer.MIN_VALUE);
        return extractMin();
    }

    static void decreaseKey(int index, int key) {
        Heap.arr[index] = key;
        while (index != 0 && Heap.arr[Heap.parent(index)] > Heap.arr[index]) {
            int temp = Heap.arr[index];
            Heap.arr[index] = Heap.arr[Heap.parent(index)];
            Heap.arr[Heap.parent(index)] = temp;
            index = Heap.parent(index);
        }
    }

    static void minHeapify(int index) {
        int lt = Heap.leftChild(index * 2 + 1);
        int rt = Heap.leftChild(index * 2 + 2);
        int smallest = index;
        if (lt < Heap.size && Heap.arr[lt] < Heap.arr[smallest]) smallest = lt;
        if (rt < Heap.size && Heap.arr[rt] < Heap.arr[smallest]) smallest = rt;
        if (smallest != index) {
            swap(Heap.arr[index], Heap.arr[smallest]);
            minHeapify(smallest);
        }
//        System.out.println(Arrays.toString(Heap.arr));
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
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
        return Heap.size;
    }

    public static void main(String[] args) {
        Heap heap1 = new Heap(6);
        heap1.insert(10);
        heap1.insert(20);
        heap1.insert(40);
        heap1.insert(80);
        heap1.insert(100);
        heap1.insert(70);
        decreaseKey(3, 5);  // 5 10 40 20 100 70
        System.out.println(Arrays.toString(heap1.arr));

        Heap heap2 = new Heap(8);
        heap2.insert(20);
        heap2.insert(80);
        heap2.insert(200);
        heap2.insert(90);
        heap2.insert(100);
        heap2.insert(250);
        heap2.insert(500);
        heap2.insert(120);
        decreaseKey(3, 10); // 10 20 200 80 100 250 500 120
        System.out.println(Arrays.toString(Heap.arr));

        Heap heap3 = new Heap(8);
        heap3.insert(10);
        heap3.insert(20);
        heap3.insert(30);
        heap3.insert(40);
        heap3.insert(50);
        heap3.insert(35);
        heap3.insert(38);
        heap3.insert(45);
        int[] arr3 = heap3.arr.clone();
        deleteKey(3); // 10 20 30 45 50 35 38
        System.out.println(Arrays.toString(arr3));

        Heap heap4 = new Heap(7);
        heap4.insert(5);
        heap4.insert(9);
        heap4.insert(8);
        heap4.insert(12);
        heap4.insert(14);
        heap4.insert(20);
        heap4.insert(40);
        int[] arr4 = heap4.arr.clone();
        deleteKey(3); // 5 9 8 40 14 20
        System.out.println(Arrays.toString(arr4));
    }
}
