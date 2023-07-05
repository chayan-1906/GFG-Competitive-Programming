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
        int[] dia = new int[1];
        calculateDiameter(root, dia);
        return dia[0];
    }

    // TODO: ASKED IN GFG CHAT
    static int calculateDiameter(Tree.TreeNode root, int[] dia) {
        if (root == null) {
            return 0;
        }
        int lh = calculateDiameter(root.left, dia);
        int rh = calculateDiameter(root.right, dia);
        dia[0] = Math.max(dia[0], lh + rh + 1);
        return Math.max(lh, rh) + 1;
    }
}
