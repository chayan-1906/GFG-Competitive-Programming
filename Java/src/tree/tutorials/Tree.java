package tree.tutorials;

public class Tree {

    // https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI3Mg%3D%3D
    public static void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI3MQ%3D%3D
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    // https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI3Mw%3D%3D
    public static void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    // https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI3OQ%3D%3D
    public static int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // https://practice.geeksforgeeks.org/batch/cp-47/track/DSASP-Tree/video/MTI4MA%3D%3D
    public static void printNodesAtKDistance(TreeNode root, int k) {
        if (root == null) return;
        if (k == 0) System.out.print(root.data + " ");
        else {
            printNodesAtKDistance(root.left, k - 1);
            printNodesAtKDistance(root.right, k - 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        System.out.print("Preorder: ");
        preorderTraversal(root);
        System.out.println();

        System.out.print("Inorder: ");
        inorderTraversal(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorderTraversal(root);
        System.out.println();
    }

    public static class TreeNode {
        public int data;

        public TreeNode left;

        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int data) {
            this.data = data;
        }
    }
}
