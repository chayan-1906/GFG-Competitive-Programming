package tree.practices;

import tree.tutorials.Tree;

/**
 * https://practice.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1
 *
 * @author padmanabhadas
 */
public class CheckTwoTreesIdentical {

    boolean isIdentical(Tree.TreeNode root1, Tree.TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 != null && root2 != null)
            return root1.data == root2.data &&
                    isIdentical(root1.left, root2.left) &&
                    isIdentical(root2.right, root2.right);
        else return false;
    }
}
