package tree.practices;

/**
 * https://practice.geeksforgeeks.org/problems/inorder-traversal-and-bst5855/1
 *
 * @author padmanabhadas
 */

public class InorderTraversalAndBST {

    static int isRepresentingBST(int[] arr, int N) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) return 0;
        }
        return 1;
    }
}
