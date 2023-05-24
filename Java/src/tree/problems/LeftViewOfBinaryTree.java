package tree.problems;

import tree.tutorials.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/left-view-of-binary-tree
 *
 * @author padmanabhadas
 */
public class LeftViewOfBinaryTree {

    ArrayList<Integer> leftView(Tree.TreeNode root) {
        if (root == null) return new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<Tree.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Tree.TreeNode current = queue.remove();
                if (i == 0) arrayList.add(current.data);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
        return arrayList;
    }
}
