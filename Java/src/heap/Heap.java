package heap;

/**
 * @author padmanabhadas
 */
public class Heap {

    public static int[] arr;

    public static int size;

    public static int capacity;

    public Heap(int cap) {
        size = 0;
        capacity = cap;
        arr = new int[cap];
    }

    public static void insert(int x) {
        if (size == capacity) return;
        size++;
        arr[size - 1] = x;

        for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i]; ) {
            int temp = arr[i];
            arr[i] = parent(i);
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public static int leftChild(int i) {
        return 2 * i + 1;
    }

    public static int rightChild(int i) {
        return 2 * i + 2;
    }

    public static int parent(int i) {
        return (i - 1) / 2;
    }
}
