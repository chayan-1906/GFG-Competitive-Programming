package tree.practices;

import tree.tutorials.Tree;

/**
 * https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
 *
 * @author padmanabhadas
 */
public class HeightOfBinaryTree {

    int height(Tree.TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
