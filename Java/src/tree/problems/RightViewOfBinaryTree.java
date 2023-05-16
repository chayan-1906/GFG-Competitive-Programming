package tree.problems;

import tree.tutorials.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/right-view-of-binary-tree
 *
 * @author padmanabhadas
 */
public class RightViewOfBinaryTree {

    ArrayList<Integer> rightView(Tree.TreeNode node) {
        if (node == null) return new ArrayList<>();
        Queue<Tree.TreeNode> queue = new LinkedList<>();
        queue.add(node);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Tree.TreeNode current = queue.remove();
                if (i == count - 1) arrayList.add(current.data);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
        return arrayList;
    }
}
