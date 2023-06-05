package tree.problems;

import tree.tutorials.Tree;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/determine-if-two-trees-are-identical
 *
 * @author padmanabhadas
 */
public class CheckTreesIdentical {

    boolean isIdentical(Tree.TreeNode root1, Tree.TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        else if (root1 != null && root2 != null) {
            return root1.data == root2.data
                    && isIdentical(root1.left, root2.left)
                    && isIdentical(root1.right, root2.right);
        } else return false;
    }
}
