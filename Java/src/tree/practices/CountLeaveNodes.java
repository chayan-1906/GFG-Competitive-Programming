package tree.practices;

import tree.tutorials.Tree;

/**
 * https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1
 *
 * @author padmanabhadas
 */
public class CountLeaveNodes {

    static int count = 0;

    int countLeaves(Tree.TreeNode node) {
        if (node == null) return 0;
        else if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }
}
