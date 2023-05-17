package tree.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI4Mg%3D%3D
 *
 * @author padmanabhadas
 */
public class ChildrenSumProperty {

    public static boolean isChildrenSum(Tree.TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;   // if leaf node, return true
        int cSum = 0;
        if (root.left != null) cSum += root.left.data;
        if (root.right != null) cSum += root.right.data;
        return root.data == cSum && isChildrenSum(root.left) && isChildrenSum(root.right);
    }
}
