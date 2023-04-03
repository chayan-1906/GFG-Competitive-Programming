package stack.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/NzAzNA%3D%3D
// TODO: COULDN'T UNDERSTAND
public class ImplKStacksInArray {

    int[] array, top, next;
    int capacity, freeTop = 0, k;

    ImplKStacksInArray(int k, int n) {
        this.k = k;
        capacity = n;
        array = new int[n];
        top = new int[k];
        next = new int[n];
        for (int i = 0; i < k; i++) top[i] = -1;
        for (int i = 0; i < n - 1; i++) next[i] = i + 1;
        next[n - 1] = -1;
    }

    void push(int sn, int x) {
        int i = freeTop;
        freeTop = next[i];
    }
}
