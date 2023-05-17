package tree.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI4Mw%3D%3D
 *
 * @author padmanabhadas
 */
public class HeightBalancedBinaryTree {

    public static int height(Tree.TreeNode root) {
        if (root == null/* || (root.left == null && root.right == null)*/) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    /* O(n²) */
    public static boolean isHeightBalanced(Tree.TreeNode root) {
        if (root == null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.abs(lh - rh) <= 1 &&
                isHeightBalanced(root.left) &&
                isHeightBalanced(root.right);
    }

    /* O(n) */
    public static int isAVL(Tree.TreeNode root) {
        if (root == null) return 0;
        int lh = isAVL(root.left);
        if (lh == -1) return -1;
        int rh = isAVL(root.right);
        if (rh == -1) return -1;
        return Math.abs(lh - rh) > 1 ? -1 : Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
    }
}
