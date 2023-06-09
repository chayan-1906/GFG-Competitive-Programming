package tree.practices;

import tree.tutorials.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://practice.geeksforgeeks.org/problems/level-of-a-node-in-binary-tree/1
 *
 * @author padmanabhadas
 */
public class NodeLevelOfBT {

    int getLevel(TreeNode node, int data) {
        if (node == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        int level = 1;
        if (node.data == data) return 1;
        while (!queue.isEmpty()) {
            int count = queue.size();
            level++;
            for (int i = 0; i < count; i++) {
                TreeNode current = queue.remove();
                if (current.data == data) return level;
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
        return 0;
    }
}
