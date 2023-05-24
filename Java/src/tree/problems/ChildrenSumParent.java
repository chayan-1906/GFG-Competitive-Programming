package tree.problems;

import tree.tutorials.Tree;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/children-sum-parent
 *
 * @author padmanabhadas
 */
public class ChildrenSumParent {

    int isSumProperty(Tree.TreeNode root) {
        if (root == null) return 1;
        if (root.left == null && root.right == null) return 1;
        int cSum = 0;
        if (root.left != null) cSum += root.left.data;
        if (root.right != null) cSum += root.right.data;
        return root.data == cSum && isSumProperty(root.left) == 1 && isSumProperty(root.right) == 1 ? 1 : 0;
    }
}
