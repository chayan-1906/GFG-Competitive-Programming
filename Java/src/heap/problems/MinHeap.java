package heap.problems;

import java.util.Arrays;

public class MinHeap {
    static int[] harr;
    static int capacity;
    static int heap_size;

    MinHeap(int cap) {
        heap_size = 0;
        capacity = cap;
        harr = new int[cap];
    }

    static int parent(int i) {
        return (i - 1) / 2;
    }

    static int left(int i) {
        return (2 * i + 1);
    }

    static int right(int i) {
        return (2 * i + 2);
    }

    //Function to extract minimum value in heap and then to store
    //next minimum value at first index.
    static int extractMin() {
        // Your code here.
        if (heap_size == 0) return -1;
        if (heap_size == 1) {
            heap_size--;
            return harr[0];
        }
        int minKey = harr[0];
        int tmp = harr[0];
        harr[0] = harr[heap_size - 1];
        harr[heap_size - 1] = tmp;
        heap_size--;
        minHeapify(0);
        return minKey;
    }

    //Function to insert a value in Heap.
    static void insertKey(int k) {
        // Your code here.
        if (capacity == heap_size) return;
        heap_size++;
        harr[heap_size - 1] = k;
        for (int i = heap_size - 1; i != 0 && harr[parent(i)] > harr[i]; ) {
            int tmp = harr[i];
            harr[i] = parent(i);
            harr[parent(i)] = tmp;
            i = parent(i);
        }
    }

    //Function to delete a key at ith index.
    static void deleteKey(int i) {
        // Your code here.
        decreaseKey(i, -1);
    }

    //Function to change value at ith index and store that value at first index.
    static void decreaseKey(int i, int new_val) {
        harr[i] = new_val;
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = parent(i);
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }

    /* You may call below MinHeapify function in
      above codes. Please do not delete this code
      if you are not writing your own MinHeapify */
    static void minHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l] < harr[smallest]) smallest = l;
        if (r < heap_size && harr[r] < harr[smallest]) smallest = r;
        if (smallest != i) {
            int temp = harr[i];
            harr[i] = harr[smallest];
            harr[smallest] = temp;
            minHeapify(smallest);
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(3);
        insertKey(4);
        System.out.println("after inserting 4 " + Arrays.toString(harr));
        insertKey(2);
        System.out.println("after inserting 2 " + Arrays.toString(harr));
        System.out.println(extractMin());
        System.out.println("after extract min " + Arrays.toString(harr));
        insertKey(6);
        System.out.println("after inserting 6 " + Arrays.toString(harr));
        deleteKey(0);
        System.out.println("after delete 0 " + Arrays.toString(harr));
        System.out.println(extractMin());
        System.out.println("after extract min " + Arrays.toString(harr));
        System.out.println(extractMin());
        System.out.println("after extract min " + Arrays.toString(harr));
    }
}
