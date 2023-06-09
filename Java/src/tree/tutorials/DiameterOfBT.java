package tree.tutorials;

/**
 * https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTQ0Mw%3D%3D
 *
 * @author padmanabhadas
 */

public class DiameterOfBT {

    int diameter = 0;

    static int height(Tree.TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // O(n²)
    static int diameter(Tree.TreeNode root) {
        if (root == null) return 0;
        int d1 = 1 + height(root.left) + height(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);
        return Math.max(d1, Math.max(d2, d3));
    }

    // TODO: ASKED IN GFG CHAT
    int calculateDiameter(Tree.TreeNode root) {
        if (root == null) return 0;
        int lh = calculateDiameter(root.left);
        int rh = calculateDiameter(root.right);
        diameter = Math.max(diameter, lh + rh + 1);
        return 1 + Math.max(lh, rh);
    }
}
