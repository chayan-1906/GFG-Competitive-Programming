package tree.tutorials;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI3NQ%3D%3D
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI3Ng%3D%3D
 *
 * @author padmanabhadas
 */
public class LevelOrderTraversal {

    public static void printLevelOrderTraversal(Tree.TreeNode root) {
        if (root == null) return;
        Queue<Tree.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
//                Tree.TreeNode current = queue.poll();
                Tree.TreeNode current = queue.remove();
                System.out.print(current.data + " ");
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
