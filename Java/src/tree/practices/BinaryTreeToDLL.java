package tree.practices;

import tree.tutorials.Tree;

/**
 * https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
 *
 * @author padmanabhadas
 */

public class BinaryTreeToDLL {

    Tree.TreeNode previous = null;

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
