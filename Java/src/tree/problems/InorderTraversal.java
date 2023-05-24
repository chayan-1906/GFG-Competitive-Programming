package tree.problems;

import tree.tutorials.Tree;

import java.util.ArrayList;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/inorder-traversal
 *
 * @author padmanabhadas
 */
public class InorderTraversal {

    void inorderTraversal(Tree.TreeNode node, ArrayList<Integer> arrayList) {
        if (node != null) {
            inorderTraversal(node.left, arrayList);
            arrayList.add(node.data);
            inorderTraversal(node.right, arrayList);
        }
    }

    ArrayList<Integer> inOrder(Tree.TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        inorderTraversal(root, arrayList);
        ;
        return arrayList;
    }
}
