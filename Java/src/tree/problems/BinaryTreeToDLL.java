package tree.problems;

import tree.tutorials.Tree;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/binary-tree-to-dll
 *
 * @author padmanabhadas
 */

public class BinaryTreeToDLL {

    static Tree.TreeNode previous = null;

    Tree.TreeNode bToDLL(Tree.TreeNode root) {
        if (root == null) return null;
        Tree.TreeNode head = bToDLL(root.left);
        if (previous == null) head = root;
        else {
            root.left = previous;
            previous.right = root;
        }
        previous = root;
        bToDLL(root.right);
        return head;
    }
}
