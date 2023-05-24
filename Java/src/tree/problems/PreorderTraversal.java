package tree.problems;

import tree.tutorials.Tree;

import java.util.ArrayList;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/preorder-traversal
 *
 * @author - padmanabha.das
 */
public class PreorderTraversal {

    static void preorderTraversal(Tree.TreeNode root, ArrayList<Integer> arrayList) {
        if (root != null) {
            arrayList.add(root.data);
            preorderTraversal(root.left, arrayList);
            preorderTraversal(root.right, arrayList);
        }
    }

    static ArrayList<Integer> preorder(Tree.TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        preorderTraversal(root, arrayList);
        return arrayList;
    }
}
