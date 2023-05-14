package tree.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI3Nw%3D%3D
 *
 * @author padmanabhadas
 */
public class SizeOfBinaryTree {

    public static int getSize(Tree.TreeNode root) {
        if (root == null) return 0;
        return 1 + getSize(root.left) + getSize(root.right);
    }
}
