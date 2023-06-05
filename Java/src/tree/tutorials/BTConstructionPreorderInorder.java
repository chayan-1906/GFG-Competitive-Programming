package tree.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI4Ng%3D%3D
 *
 * @author padmanabhadas
 */

public class BTConstructionPreorderInorder {

    static int preIndex = 0;

    // O(n²)
    static Tree.TreeNode constructBTPreorderInorder(int[] inorder, int[] preorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        Tree.TreeNode root = new Tree.TreeNode(preorder[preIndex + 1]);
        int inIndex = inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.data) {
                inIndex = i;
                break;
            }
        }
        root.left = constructBTPreorderInorder(inorder, preorder, inStart, inIndex - 1);    // left subtree upto index - 1
        root.right = constructBTPreorderInorder(inorder, preorder, inIndex + 1, inEnd);    // right subtree from index + 1
        return root;
    }
}
