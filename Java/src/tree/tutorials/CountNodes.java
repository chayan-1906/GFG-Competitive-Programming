package tree.tutorials;

/**
 * @author padmanabhadas
 */

public class CountNodes {

    // O(n)
    static int countNodes(Tree.TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // O(logn * logn)
    static int countNoOfNodes(Tree.TreeNode root) {
        int lh = 0, rh = 0;
        Tree.TreeNode current = root;
        while (current != null) {
            lh++;
            current = current.left;
        }
        current = root;
        while (current != null) {
            rh++;
            current = current.right;
        }
        if (lh == rh) return (int) (Math.pow(2, lh) - 1);
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
