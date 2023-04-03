package searching.practices;

// https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
public class SearchInARotatedArray {

    public static void main(String[] args) {
        System.out.println(search(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 0, 8, 10));    // 5
        System.out.println(search(new int[]{3, 5, 1, 2}, 0, 3, 6));    // -1
    }

    static int search(int[] A, int l, int h, int key) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (A[mid] == key) return mid;
            else if (A[l] < A[mid]) {
                // left array sorted
                if (A[l] <= key && key < A[mid]) h = mid - 1;
                else if (A[l] == key) return l;
                else l = mid + 1;
            } else {
                // right array sorted
                if (A[mid] < key && key <= A[h]) l = mid + 1;
                else if (A[h] == key) return h;
                else h = mid - 1;
            }
        }
        return -1;
    }
}
