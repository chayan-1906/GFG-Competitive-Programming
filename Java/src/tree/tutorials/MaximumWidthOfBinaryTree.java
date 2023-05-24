package tree.tutorials;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI4NA%3D%3D
 *
 * @author padmanabhadas
 */
public class MaximumWidthOfBinaryTree {

    public static int getMaxWidth(Tree.TreeNode root) {
        if (root == null) return 0;
        int maxWidth = Integer.MIN_VALUE;
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
