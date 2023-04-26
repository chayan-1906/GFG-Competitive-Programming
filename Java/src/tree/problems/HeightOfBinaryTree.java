package tree.problems;

import tree.tutorials.Tree;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/height-of-binary-tree
public class HeightOfBinaryTree {

    public static int height(Tree.TreeNode node) {
        if (node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
