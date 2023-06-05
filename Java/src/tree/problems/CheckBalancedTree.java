package tree.problems;

import tree.tutorials.Tree;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/check-for-balanced-tree
 *
 * @author padmanabhadas
 */
public class CheckBalancedTree {

    boolean isBalanced(Tree.TreeNode root) {
        if (root == null) return true;
        return height(root) != -1;
    }

    int height(Tree.TreeNode root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = height(root.right);
        if (rightHeight == -1) return -1;
        return Math.abs(leftHeight - rightHeight) > 1 ? -1 : Math.max(leftHeight, rightHeight) + 1;
    }
}
