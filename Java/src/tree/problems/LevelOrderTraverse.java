package tree.problems;

import tree.tutorials.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/level-order-traversal-line-by-line
 *
 * @author padmanabhadas
 */
public class LevelOrderTraverse {

    static ArrayList<ArrayList<Integer>> levelOrder(Tree.TreeNode node) {
        if (node == null) return new ArrayList<>();
        Queue<Tree.TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        queue.add(node);
        ArrayList<Integer> rootArray = new ArrayList<>();
        rootArray.add(node.data);
        arrayList.add(rootArray);
        while (!queue.isEmpty()) {
            int count = queue.size();
            ArrayList<Integer> childArray = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                Tree.TreeNode current = queue.remove();
                childArray.add(current.data);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            childArray.add((int) '$');
            arrayList.add(childArray);
        }
        return arrayList;
    }
}
