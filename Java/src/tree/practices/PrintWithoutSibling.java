package tree.practices;

import tree.tutorials.Tree;

import java.util.ArrayList;
import java.util.Collections;

/**
 * https://practice.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1
 *
 * @author padmanabhadas
 */
public class PrintWithoutSibling {

    ArrayList<Integer> noSibling(Tree.TreeNode node) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        noSib(node, arrayList);
        if (arrayList.isEmpty()) arrayList.add(-1);
        Collections.sort(arrayList);
        return arrayList;
    }

    void noSib(Tree.TreeNode node, ArrayList<Integer> arrayList) {
        if (node != null) {
            if (node.left != null && node.right != null) {
                noSib(node.left, arrayList);
                noSib(node.right, arrayList);
            } else if (node.left != null && node.right == null) {
                arrayList.add(node.left.data);
                noSib(node.left, arrayList);
            } else if (node.left == null && node.right != null) {
                arrayList.add(node.right.data);
                noSib(node.right, arrayList);
            }
        }
    }
}
