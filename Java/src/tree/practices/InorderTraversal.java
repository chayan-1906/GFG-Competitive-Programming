package tree.practices;

import tree.tutorials.Tree;

import java.util.ArrayList;

/**
 * https://practice.geeksforgeeks.org/problems/inorder-traversal/1
 *
 * @author padmanabhadas
 */
public class InorderTraversal {

    ArrayList<Integer> inOrder(Tree.TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        inorderTraversal(root, arrayList);
        return arrayList;
    }

    void inorderTraversal(Tree.TreeNode root, ArrayList<Integer> arrayList) {
        if (root == null) return;
        inorderTraversal(root.left, arrayList);
        arrayList.add(root.data);
        inorderTraversal(root.right, arrayList);
    }
}
