package tree.problems;

import tree.tutorials.Tree;

import java.util.ArrayList;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/postorder-traversal
 *
 * @author padmanabhadas
 */
public class PostorderTraversal {

    void postorderTraversal(Tree.TreeNode node, ArrayList<Integer> arrayList) {
        if (node != null) {
            postorderTraversal(node.left, arrayList);
            postorderTraversal(node.right, arrayList);
            arrayList.add(node.data);
        }
    }

    ArrayList<Integer> postOrder(Tree.TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        postorderTraversal(root, arrayList);
        return arrayList;
    }
}
