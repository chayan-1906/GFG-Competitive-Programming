package tree.practices;

import tree.tutorials.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://practice.geeksforgeeks.org/problems/level-order-traversal/1
 *
 * @author padmanabhadas
 */
public class LevelOrderTraversal {

    static ArrayList<Integer> levelOrder(Tree.TreeNode node) {
        if (node == null) return new ArrayList<>();
        Queue<Tree.TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Tree.TreeNode current = queue.remove();
                arrayList.add(current.data);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
        return arrayList;
    }
}
