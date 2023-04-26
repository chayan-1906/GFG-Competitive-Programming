package tree.problems;

import tree.tutorials.Tree;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/problem/preorder-traversal
public class PreorderTraversal {

    static ArrayList<Integer> arrayList = new ArrayList<>();

    static ArrayList<Integer> preorder(Tree.TreeNode root) {
        if (root != null) {
            arrayList.add(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        return arrayList;
    }
}
