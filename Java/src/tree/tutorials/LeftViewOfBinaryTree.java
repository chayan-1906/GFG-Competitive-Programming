package tree.tutorials;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI4MQ%3D%3D
 *
 * @author padmanabhadas
 */
public class LeftViewOfBinaryTree {

    static int maxLevel = 0;

    public static void recursivePrintLeftView(Tree.TreeNode root, int level) {
        if (root == null) return;
        if (maxLevel < level) {
            System.out.print(root.data + " ");
            maxLevel = level;
        }
        recursivePrintLeftView(root.left, level + 1);
        recursivePrintLeftView(root.right, level + 1);
    }

    public static void iterativePrintLeftView(Tree.TreeNode root) {
        if (root == null) return;
        Queue<Tree.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Tree.TreeNode current = queue.remove();
                if (i == 0) System.out.print(current.data + " "); /* Extra statement over level order traversal */
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
    }
}
