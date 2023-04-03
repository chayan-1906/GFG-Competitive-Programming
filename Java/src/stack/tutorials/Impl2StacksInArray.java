package stack.tutorials;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Stack/video/NzAyNQ%3D%3D
public class Impl2StacksInArray {

    int[] array;
    int capacity, top1, top2;

    Impl2StacksInArray(int n) {
        capacity = n;
        top1 = -1;
        top2 = -1;
        array = new int[n];
    }

    boolean push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            array[top1] = x;
            return true;
        }
        return false;
    }

    boolean push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            return true;
        }
        return false;
    }

    Integer pop1() {
        if (top1 >= 0) {
            int x = array[top1];
            top1--;
            return x;
        }
        return null;
    }

    Integer pop2() {
        if (top2 < capacity) {
            int x = array[top2];
            top2++;
            return x;
        }
        return null;
    }

    int size1() {
        return top1 + 1;
    }

    int size2() {
        return capacity - top2;
    }
}
