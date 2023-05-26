package tree.practices;

import tree.tutorials.Tree;

/**
 * https://practice.geeksforgeeks.org/problems/children-sum-parent/1
 *
 * @author padmanabhadas
 */
public class ChildrenSumParent {

    public static int isSumProperty(Tree.TreeNode root) {
        if (root == null) return 1;
        if (root.left == null && root.right == null) return 1;
        int childSum = 0;
        if (root.left != null) childSum += root.left.data;
        if (root.right != null) childSum += root.right.data;
        return root.data == childSum
                && isSumProperty(root.left) == 1
                && isSumProperty(root.right) == 1 ? 1 : 0;
    }
}
