package tree.problems;

import tree.tutorials.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/maximum-width-of-tree
 *
 * @author padmanabhadas
 */
public class MaximumWidthOfBinaryTree {

    int getMaxWidth(Tree.TreeNode root) {
        int maxWidth = 0;
        Queue<Tree.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            maxWidth = Math.max(maxWidth, count);
            for (int i = 0; i < count; i++) {
                Tree.TreeNode current = queue.remove();
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
        return maxWidth;
    }
}
