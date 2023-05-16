package tree.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI3OA%3D%3D
 *
 * @author padmanabhadas
 */
public class MaximumInBinaryTree {

    public static int getMax(Tree.TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        /*return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));*/
        int leftMax = getMax(root.left);
        int rightMax = getMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
}
